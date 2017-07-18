package gov.samhsa.c2s.pls.domain.provider;

import gov.samhsa.c2s.pls.domain.reference.EntityType;
import lombok.Data;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Data
@Entity
public class Provider {
    @Id
    @NotNull
    @Size(max = 10)
    private String npi;

    @ManyToOne(cascade = CascadeType.ALL)
    private EntityType entityType;

    @Pattern(regexp = "^[a-zA-ZÀ-ÿ]+[-]?[a-zA-ZÀ-ÿ']*[a-zA-ZÀ-ÿ]$")
    private String lastName;

    @Pattern(regexp = "^[a-zA-ZÀ-ÿ]+[-]?[a-zA-ZÀ-ÿ']*[a-zA-ZÀ-ÿ]$")
    private String firstName;


    @Pattern(regexp = "^[a-zA-ZÀ-ÿ]+[-]?[a-zA-ZÀ-ÿ']*[a-zA-ZÀ-ÿ]$")
    private String middleName;

    @Pattern(regexp = "^[a-zA-ZÀ-ÿ]+[-]?[a-zA-ZÀ-ÿ']*[a-zA-ZÀ-ÿ]$")
    private String organizationName;

    private String genderCode;

    private String firstLineBusinessMailingAddress;

    private String secondLineBusinessMailingAddress;

    private String businessMailingAddressCityName;

    private String businessMailingAddressStateName;

    private String businessMailingAddressPostalCode;

    private String businessMailingAddressCountryCode;

    private String businessMailingAddressTelephoneNumber;

    private String businessMailingAddressFaxNumber;

    private String firstLineBusinessPracticeLocationAddress;

    private String secondLineBusinessPracticeLocationAddress;

    private String businessPracticeLocationAddressCityName;

    private String businessPracticeLocationAddressStateName;

    private String businessPracticeLocationAddressPostalCode;

    private String businessPracticeLocationAddressCountryCode;

    private String businessPracticeLocationAddressTelephoneNumber;

    private String businessPracticeLocationAddressFaxNumber;

    private String enumerationDate;

    private String lastUpdateDate;


}