package converter;

import entity.BirthDate;



import javax.persistence.AttributeConverter;
import javax.persistence.Converter;
import java.sql.Date;
import java.util.Optional;
@Converter(autoApply = true)
public class BirthdayConverter implements AttributeConverter<BirthDate, Date> {

    @Override
    public Date convertToDatabaseColumn(BirthDate attribute) {
        return Optional.ofNullable(attribute)
                .map(BirthDate::birthDate)
                .map(Date::valueOf)
                .orElse(null);
    }

    @Override
    public BirthDate convertToEntityAttribute(Date dbData) {
        return Optional.ofNullable(dbData)
                .map(Date::toLocalDate)
                .map(BirthDate::new)
                .orElse(null);
    }
}
