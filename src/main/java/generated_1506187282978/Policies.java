
package generated_1506187282978;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Policy">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="accountingPeriod" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="addressSameGar" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="cancellationNoticeNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="cappingFactor" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="collectorscarinnb" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="commissionOverride" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="commissionRate" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *                   &lt;element name="commissionWaived" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="convExpCreditScore" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="convExpTierExposurePolMakeup" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="convExpTierIncidentFreeYears" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="convOrgnlEarlyShopEffDt" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="convOrgnlEarlyShopRateEffDt" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="convOriginalRateEffDt" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="countryCd" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="coverageType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="customerNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="earlyShopperDayDifference" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="effective" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="expiration" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="flagRenewalInd" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="inceptionDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="insuranceScore" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="insuranceScoreDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="insuredNameOnDoc" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="namedNonOwnedPolicyInd" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="nbmaxacoverage" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="nbnoncatclaims" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="paidInFull" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="pcginitialeffectivedate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="policyNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="policyTitle" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="prevRenewalCycleNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="primaryResidenceInd" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="priorPolicyPrem" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="priorToPriorTermPrem" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="producerCd" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="productCd" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="rateEffectiveDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="rateRequestDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="rateStabilizationFactor1" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="rateStabilizationFactor2" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="rateStabilizationFactor3" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="renewalLocked" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="riskStateCd" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="subProducerCd" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="tierOwner" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="underwriterCd" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="AccidentBenefitACCDEATHCoverage">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="limitAmount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                           &lt;/sequence>
 *                           &lt;attribute name="state" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="AdditionalPersonswithExtendedUMBIUAB">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="extendedUMBI" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                           &lt;/sequence>
 *                           &lt;attribute name="state" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Driver">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="age" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                             &lt;element name="ageFirstLicensed" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                             &lt;element name="annualIncome" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                             &lt;element name="birthDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="convOldDriverNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                             &lt;element name="driverRelToApplicantCd" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="driverTypeCd" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="genderCd" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="licensePermitNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="licenseStatusCd" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="maritalStatusCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="stateProvCd" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="surchargeOverride" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="suspendedInd" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="DriverRatingInfo">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="alcCourseDisc" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="collGraduateSchAchDisc" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="defensiveDriver" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="distantStudentInd" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="driverTraining" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="employeegarage" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="matureDriverImpInd" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="militaryService" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="suspensionRevocationInd" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                     &lt;/sequence>
 *                                     &lt;attribute name="state" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="DriverSR22Info">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="sr22FillingInd" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                     &lt;/sequence>
 *                                     &lt;attribute name="state" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="ChartisExtInterfacesReport">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="reportReceivedDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="reportStage" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="reportType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="sendingTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="statusMessage" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="success" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                           &lt;attribute name="oid" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                           &lt;attribute name="state" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="IncomeLossBenefitsLIBCoverage">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="applicable" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                           &lt;attribute name="state" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Insured">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="education" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="highProfile" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="incidentBusinessThreshold" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="nameTypeCd" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="occupationClassCd" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                             &lt;element name="other" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="ownEntity" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                             &lt;element name="personalOrDomesticStaff" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="primaryInsured" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="purposeOfEntity" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="typeOfOccupation" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                             &lt;element name="PrimaryInsuredMailingAddress">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="address.addressLine1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="address.city" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="address.countryCd" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="address.postalCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                                       &lt;element name="address.stateProvCd" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="updateBillingMailingInd" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                     &lt;/sequence>
 *                                     &lt;attribute name="state" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                           &lt;attribute name="state" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="InsuredMailingAddress">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="address.addressLine1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="address.countryCd" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="address.postalCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                             &lt;element name="address.stateProvCd" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="city2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="isDiaplayAddress" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                           &lt;attribute name="state" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="LiabilityLimitsCSLCoverage">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="limitAmount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                           &lt;/sequence>
 *                           &lt;attribute name="state" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="MedicalPaymentsMEDCoverage">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="limitAmount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                           &lt;/sequence>
 *                           &lt;attribute name="state" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="OtherProduct">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="aigLife" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                             &lt;element name="aigLifePolicyNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                             &lt;element name="pcgArticles" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="pcgExessLiab" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="pcgHome" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="premierArticles" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="premierExessLiab" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="premierHome" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                           &lt;attribute name="state" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="PersonalPropertyCPPCoverage">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="applicable" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                           &lt;attribute name="state" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="PETCoverage">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="applicable" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                           &lt;attribute name="state" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="PolicyAdditionalInfo">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="assignedRisk" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                             &lt;element name="bookTransferRemarket" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="cancelled" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="isPolReissueOrRewrite" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="otherCarrier" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="prioCarrierCd" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                             &lt;element name="priorCarrTenure" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                             &lt;element name="priorLiabLimit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                           &lt;/sequence>
 *                           &lt;attribute name="state" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="PolicyCredit">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="affinityCredit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                             &lt;element name="armedForces" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="seasonaldiscount" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                           &lt;attribute name="state" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="ReducedUMCoverage">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="reducedUm" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                           &lt;attribute name="state" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="RoadsideRDCCoverage">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="applicable" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                           &lt;attribute name="state" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="TotalDisabilityBenefitsTDECoverage">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="applicable" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                           &lt;attribute name="state" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="TotalDisabilityBenefitsTDNCoverage">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="applicable" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                           &lt;attribute name="state" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="TripInterruptionEmergencyLivingTELCoverage">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="applicable" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                           &lt;attribute name="state" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="UMCSLCoverage">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="limitAmount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                             &lt;element name="umtype" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                           &lt;attribute name="state" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="UninsuredMotoristsBICoverage">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="convertedCoverage" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                           &lt;attribute name="state" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Vehicle" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="abiCd" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                             &lt;element name="agreedValue" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                             &lt;element name="annualMilesOvrd" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="avrgAnnualMiles" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                             &lt;element name="classCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="convoldVehicleNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                             &lt;element name="ctyTaxMintAmt" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                             &lt;element name="ctyTaxPercAmt" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                             &lt;element name="engineSize" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                             &lt;element name="firstPotDamage" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="fullGlass" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="greyMarket" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="height" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *                             &lt;element name="isMedPayEffect" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="liability" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="manufacturer" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="marketValue" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                             &lt;element name="model" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="modelYear" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                             &lt;element name="ovrdFirstPotDamage" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="ovrdTitleTransNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="printIDcards" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="repAnnualMiles" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                             &lt;element name="titleTransNo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                             &lt;element name="titleTransVerNo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                             &lt;element name="vehBodyTypeCd" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="vehExtendedNonOwnerVeh" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="vehIdentificationNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="vehTypeCd" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="verAnnualMiles" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                             &lt;element name="verifiedFirstPotDamage" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="vinStyle" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                             &lt;element name="CashSettlementCoverage">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="cashSettlement" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                     &lt;/sequence>
 *                                     &lt;attribute name="state" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="ChartisPAutoVehicleCredits">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="antiLockBrakeCd" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="applyMultiCarDiscountInd" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="autoBrake" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="blindSpotMonitor" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="dayLights" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="driverAlertSys" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="guardGatedCom" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="hybrid" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="hybridOrElectric" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="laneDepartMonitor" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="overrideMultiCarDiscountInd" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="passiveRestraints" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                                       &lt;element name="securityOptionsCd" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                                     &lt;/sequence>
 *                                     &lt;attribute name="state" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="ChartisPAutoVehicleOwnership">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="additionalOwnersInd" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="addressLine1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="country" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="financedInd" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="location" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="ownedInd" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="ownerType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="regOwner" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                                       &lt;element name="regOwnerOther" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                                       &lt;element name="stateProvCd" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="zipCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                                     &lt;/sequence>
 *                                     &lt;attribute name="state" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="GaragingAddress">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="addressLine1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="city2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="countryCd" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="garaged" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="garagedSecondary" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="garagingLocation" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="postalCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                                       &lt;element name="ratingTerritory" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                                       &lt;element name="regionCd" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                                       &lt;element name="stateProvCd" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="storedInMasonry" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                     &lt;/sequence>
 *                                     &lt;attribute name="state" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="PAutoACCDEATHDomainCoverage">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="limitAmount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                                       &lt;element name="PremiumEntry" maxOccurs="unbounded">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="actualAmt" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                                                 &lt;element name="changeAmt" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                                                 &lt;element name="periodAmt" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                                                 &lt;element name="premiumType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                               &lt;/sequence>
 *                                               &lt;attribute name="premiumCd" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                     &lt;attribute name="state" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="PAutoBIDomainCoverage">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="state" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="PAutoCOLLCoverage">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="deductibleAmount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                                     &lt;/sequence>
 *                                     &lt;attribute name="state" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="PAutoCOLLDomainCoverage">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="deductibleAmount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                                       &lt;element name="PremiumEntry" maxOccurs="unbounded">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="actualAmt" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                                                 &lt;element name="changeAmt" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                                                 &lt;element name="periodAmt" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                                                 &lt;element name="premiumType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                               &lt;/sequence>
 *                                               &lt;attribute name="premiumCd" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                     &lt;attribute name="state" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="PAutoCOMPCoverage">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="deductibleAmount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                                     &lt;/sequence>
 *                                     &lt;attribute name="state" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="PAutoCOMPDomainCoverage">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="deductibleAmount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                                       &lt;element name="PremiumEntry" maxOccurs="unbounded">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="actualAmt" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                                                 &lt;element name="changeAmt" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                                                 &lt;element name="periodAmt" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                                                 &lt;element name="premiumType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                               &lt;/sequence>
 *                                               &lt;attribute name="premiumCd" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                     &lt;attribute name="state" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="PAutoCPDomainCoverage">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="limitAmount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                                     &lt;/sequence>
 *                                     &lt;attribute name="state" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="PAutoCSLDomainCoverage">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="limitAmount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                                       &lt;element name="PremiumEntry" maxOccurs="unbounded">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="actualAmt" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                                                 &lt;element name="changeAmt" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                                                 &lt;element name="periodAmt" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                                                 &lt;element name="premiumType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                               &lt;/sequence>
 *                                               &lt;attribute name="premiumCd" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                     &lt;attribute name="state" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="PAutoMEDDomainCoverage">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="limitAmount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                                       &lt;element name="PremiumEntry" maxOccurs="unbounded">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="actualAmt" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                                                 &lt;element name="changeAmt" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                                                 &lt;element name="periodAmt" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                                                 &lt;element name="premiumType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                               &lt;/sequence>
 *                                               &lt;attribute name="premiumCd" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                     &lt;attribute name="state" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="PAutoMEDPLCoverage">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="state" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="PAutoPDDomainCoverage">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="state" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="PAutoUMBIDomainCoverage">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="state" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="PAutoUMCSLDomainCoverage">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="limitAmount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                                       &lt;element name="PremiumEntry" maxOccurs="unbounded">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="actualAmt" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                                                 &lt;element name="changeAmt" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                                                 &lt;element name="periodAmt" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                                                 &lt;element name="premiumType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                               &lt;/sequence>
 *                                               &lt;attribute name="premiumCd" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                     &lt;attribute name="state" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="PAutoUMPDDomainCoverage">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="state" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="VehicleRatingInfo">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="collSymbol" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                                       &lt;element name="collSymbolRef" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                                       &lt;element name="compSymbol" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                                       &lt;element name="compSymbolRef" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                                       &lt;element name="distanceOneWay" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                                       &lt;element name="effectivedt" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="fromBlueBookInd" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="inspected" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="isVehRegularUse" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="liabilitySymbol" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                                       &lt;element name="numDaysDrivenPerWeek" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                                       &lt;element name="pipMedSymbol" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                                       &lt;element name="registrationStateCd" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="vehicleUsageCd" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                     &lt;/sequence>
 *                                     &lt;attribute name="state" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="PremiumEntry" maxOccurs="unbounded">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="actualAmt" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                                       &lt;element name="changeAmt" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                                       &lt;element name="periodAmt" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                                       &lt;element name="premiumType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                     &lt;/sequence>
 *                                     &lt;attribute name="premiumCd" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="ChartisExtInterfacesReport">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="documentName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="reportReceivedDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="reportStage" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="reportType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="sendingTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="statusMessage" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="success" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                           &lt;attribute name="oid" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                           &lt;attribute name="state" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="VehicleHomeAlterationVHACoverage">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="applicable" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                           &lt;attribute name="state" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="WorkLossWLC">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="applicable" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                           &lt;attribute name="state" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="PremiumEntry" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="actualAmt" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                             &lt;element name="changeAmt" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                             &lt;element name="periodAmt" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                             &lt;element name="premiumType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                           &lt;attribute name="premiumCd" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="ChartisTier">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="convPriorTier" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                             &lt;element name="systemGeneratedTier" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                             &lt;element name="tierOverrideInd" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="CForm" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="formCd" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="DriverVehicleRelationship">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="driver">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="oid" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="relationshipType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="seqNo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                             &lt;element name="vehicle">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="oid" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="state" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="personalBillingAccount">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="billingInfo">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="billType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="billingAccountName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="billingAddress">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="addressLine1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="countryCd" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="postalCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                                       &lt;element name="stateProvCd" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="billingNameInfo">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="nameTypeCd" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="currency" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="customerNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                             &lt;element name="dueDate" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                             &lt;element name="monthlyDueDayConfig">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="monthDays" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="producerCd" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                             &lt;element name="deliveryMethod" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="originalPaymentPlanCd" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="paymentPlanCd" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="recurringPayments" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="accountNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="enableRecurringPayments" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="version" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="rootEntityType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "policy",
    "personalBillingAccount"
})
@XmlRootElement(name = "Policies")
public class Policies {

    @XmlElement(name = "Policy", required = true)
    protected Policies.Policy policy;
    @XmlElement(required = true)
    protected Policies.PersonalBillingAccount personalBillingAccount;
    @XmlAttribute(name = "name")
    protected String name;
    @XmlAttribute(name = "version")
    protected Integer version;
    @XmlAttribute(name = "rootEntityType")
    protected String rootEntityType;

    /**
     * Gets the value of the policy property.
     * 
     * @return
     *     possible object is
     *     {@link Policies.Policy }
     *     
     */
    public Policies.Policy getPolicy() {
        return policy;
    }

    /**
     * Sets the value of the policy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Policies.Policy }
     *     
     */
    public void setPolicy(Policies.Policy value) {
        this.policy = value;
    }

    /**
     * Gets the value of the personalBillingAccount property.
     * 
     * @return
     *     possible object is
     *     {@link Policies.PersonalBillingAccount }
     *     
     */
    public Policies.PersonalBillingAccount getPersonalBillingAccount() {
        return personalBillingAccount;
    }

    /**
     * Sets the value of the personalBillingAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Policies.PersonalBillingAccount }
     *     
     */
    public void setPersonalBillingAccount(Policies.PersonalBillingAccount value) {
        this.personalBillingAccount = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setVersion(Integer value) {
        this.version = value;
    }

    /**
     * Gets the value of the rootEntityType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRootEntityType() {
        return rootEntityType;
    }

    /**
     * Sets the value of the rootEntityType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRootEntityType(String value) {
        this.rootEntityType = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="billingInfo">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="billType" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="billingAccountName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="billingAddress">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="addressLine1" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="countryCd" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="postalCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                             &lt;element name="stateProvCd" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="billingNameInfo">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="nameTypeCd" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="currency" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="customerNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                   &lt;element name="dueDate" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                   &lt;element name="monthlyDueDayConfig">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="monthDays" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="producerCd" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                   &lt;element name="deliveryMethod" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="originalPaymentPlanCd" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="paymentPlanCd" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="recurringPayments" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="accountNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="enableRecurringPayments" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "billingInfo",
        "accountNumber",
        "enableRecurringPayments"
    })
    public static class PersonalBillingAccount {

        @XmlElement(required = true)
        protected Policies.PersonalBillingAccount.BillingInfo billingInfo;
        protected int accountNumber;
        @XmlElement(required = true)
        protected String enableRecurringPayments;

        /**
         * Gets the value of the billingInfo property.
         * 
         * @return
         *     possible object is
         *     {@link Policies.PersonalBillingAccount.BillingInfo }
         *     
         */
        public Policies.PersonalBillingAccount.BillingInfo getBillingInfo() {
            return billingInfo;
        }

        /**
         * Sets the value of the billingInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link Policies.PersonalBillingAccount.BillingInfo }
         *     
         */
        public void setBillingInfo(Policies.PersonalBillingAccount.BillingInfo value) {
            this.billingInfo = value;
        }

        /**
         * Gets the value of the accountNumber property.
         * 
         */
        public int getAccountNumber() {
            return accountNumber;
        }

        /**
         * Sets the value of the accountNumber property.
         * 
         */
        public void setAccountNumber(int value) {
            this.accountNumber = value;
        }

        /**
         * Gets the value of the enableRecurringPayments property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEnableRecurringPayments() {
            return enableRecurringPayments;
        }

        /**
         * Sets the value of the enableRecurringPayments property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEnableRecurringPayments(String value) {
            this.enableRecurringPayments = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="billType" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="billingAccountName" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="billingAddress">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="addressLine1" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="countryCd" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="postalCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *                   &lt;element name="stateProvCd" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="billingNameInfo">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="nameTypeCd" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="currency" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="customerNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *         &lt;element name="dueDate" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *         &lt;element name="monthlyDueDayConfig">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="monthDays" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="producerCd" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *         &lt;element name="deliveryMethod" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="originalPaymentPlanCd" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="paymentPlanCd" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="recurringPayments" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "billType",
            "billingAccountName",
            "billingAddress",
            "billingNameInfo",
            "currency",
            "customerNumber",
            "dueDate",
            "monthlyDueDayConfig",
            "producerCd",
            "deliveryMethod",
            "originalPaymentPlanCd",
            "paymentPlanCd",
            "recurringPayments"
        })
        public static class BillingInfo {

            @XmlElement(required = true)
            protected String billType;
            @XmlElement(required = true)
            protected String billingAccountName;
            @XmlElement(required = true)
            protected Policies.PersonalBillingAccount.BillingInfo.BillingAddress billingAddress;
            @XmlElement(required = true)
            protected Policies.PersonalBillingAccount.BillingInfo.BillingNameInfo billingNameInfo;
            @XmlElement(required = true)
            protected String currency;
            protected int customerNumber;
            protected int dueDate;
            @XmlElement(required = true)
            protected Policies.PersonalBillingAccount.BillingInfo.MonthlyDueDayConfig monthlyDueDayConfig;
            protected int producerCd;
            @XmlElement(required = true)
            protected String deliveryMethod;
            @XmlElement(required = true)
            protected String originalPaymentPlanCd;
            @XmlElement(required = true)
            protected String paymentPlanCd;
            @XmlElement(required = true)
            protected String recurringPayments;

            /**
             * Gets the value of the billType property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBillType() {
                return billType;
            }

            /**
             * Sets the value of the billType property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBillType(String value) {
                this.billType = value;
            }

            /**
             * Gets the value of the billingAccountName property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBillingAccountName() {
                return billingAccountName;
            }

            /**
             * Sets the value of the billingAccountName property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBillingAccountName(String value) {
                this.billingAccountName = value;
            }

            /**
             * Gets the value of the billingAddress property.
             * 
             * @return
             *     possible object is
             *     {@link Policies.PersonalBillingAccount.BillingInfo.BillingAddress }
             *     
             */
            public Policies.PersonalBillingAccount.BillingInfo.BillingAddress getBillingAddress() {
                return billingAddress;
            }

            /**
             * Sets the value of the billingAddress property.
             * 
             * @param value
             *     allowed object is
             *     {@link Policies.PersonalBillingAccount.BillingInfo.BillingAddress }
             *     
             */
            public void setBillingAddress(Policies.PersonalBillingAccount.BillingInfo.BillingAddress value) {
                this.billingAddress = value;
            }

            /**
             * Gets the value of the billingNameInfo property.
             * 
             * @return
             *     possible object is
             *     {@link Policies.PersonalBillingAccount.BillingInfo.BillingNameInfo }
             *     
             */
            public Policies.PersonalBillingAccount.BillingInfo.BillingNameInfo getBillingNameInfo() {
                return billingNameInfo;
            }

            /**
             * Sets the value of the billingNameInfo property.
             * 
             * @param value
             *     allowed object is
             *     {@link Policies.PersonalBillingAccount.BillingInfo.BillingNameInfo }
             *     
             */
            public void setBillingNameInfo(Policies.PersonalBillingAccount.BillingInfo.BillingNameInfo value) {
                this.billingNameInfo = value;
            }

            /**
             * Gets the value of the currency property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCurrency() {
                return currency;
            }

            /**
             * Sets the value of the currency property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCurrency(String value) {
                this.currency = value;
            }

            /**
             * Gets the value of the customerNumber property.
             * 
             */
            public int getCustomerNumber() {
                return customerNumber;
            }

            /**
             * Sets the value of the customerNumber property.
             * 
             */
            public void setCustomerNumber(int value) {
                this.customerNumber = value;
            }

            /**
             * Gets the value of the dueDate property.
             * 
             */
            public int getDueDate() {
                return dueDate;
            }

            /**
             * Sets the value of the dueDate property.
             * 
             */
            public void setDueDate(int value) {
                this.dueDate = value;
            }

            /**
             * Gets the value of the monthlyDueDayConfig property.
             * 
             * @return
             *     possible object is
             *     {@link Policies.PersonalBillingAccount.BillingInfo.MonthlyDueDayConfig }
             *     
             */
            public Policies.PersonalBillingAccount.BillingInfo.MonthlyDueDayConfig getMonthlyDueDayConfig() {
                return monthlyDueDayConfig;
            }

            /**
             * Sets the value of the monthlyDueDayConfig property.
             * 
             * @param value
             *     allowed object is
             *     {@link Policies.PersonalBillingAccount.BillingInfo.MonthlyDueDayConfig }
             *     
             */
            public void setMonthlyDueDayConfig(Policies.PersonalBillingAccount.BillingInfo.MonthlyDueDayConfig value) {
                this.monthlyDueDayConfig = value;
            }

            /**
             * Gets the value of the producerCd property.
             * 
             */
            public int getProducerCd() {
                return producerCd;
            }

            /**
             * Sets the value of the producerCd property.
             * 
             */
            public void setProducerCd(int value) {
                this.producerCd = value;
            }

            /**
             * Gets the value of the deliveryMethod property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDeliveryMethod() {
                return deliveryMethod;
            }

            /**
             * Sets the value of the deliveryMethod property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDeliveryMethod(String value) {
                this.deliveryMethod = value;
            }

            /**
             * Gets the value of the originalPaymentPlanCd property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOriginalPaymentPlanCd() {
                return originalPaymentPlanCd;
            }

            /**
             * Sets the value of the originalPaymentPlanCd property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOriginalPaymentPlanCd(String value) {
                this.originalPaymentPlanCd = value;
            }

            /**
             * Gets the value of the paymentPlanCd property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPaymentPlanCd() {
                return paymentPlanCd;
            }

            /**
             * Sets the value of the paymentPlanCd property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPaymentPlanCd(String value) {
                this.paymentPlanCd = value;
            }

            /**
             * Gets the value of the recurringPayments property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRecurringPayments() {
                return recurringPayments;
            }

            /**
             * Sets the value of the recurringPayments property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRecurringPayments(String value) {
                this.recurringPayments = value;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="addressLine1" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="countryCd" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="postalCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
             *         &lt;element name="stateProvCd" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "addressLine1",
                "city",
                "countryCd",
                "postalCode",
                "stateProvCd"
            })
            public static class BillingAddress {

                @XmlElement(required = true)
                protected String addressLine1;
                @XmlElement(required = true)
                protected String city;
                @XmlElement(required = true)
                protected String countryCd;
                protected int postalCode;
                @XmlElement(required = true)
                protected String stateProvCd;

                /**
                 * Gets the value of the addressLine1 property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getAddressLine1() {
                    return addressLine1;
                }

                /**
                 * Sets the value of the addressLine1 property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setAddressLine1(String value) {
                    this.addressLine1 = value;
                }

                /**
                 * Gets the value of the city property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCity() {
                    return city;
                }

                /**
                 * Sets the value of the city property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCity(String value) {
                    this.city = value;
                }

                /**
                 * Gets the value of the countryCd property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCountryCd() {
                    return countryCd;
                }

                /**
                 * Sets the value of the countryCd property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCountryCd(String value) {
                    this.countryCd = value;
                }

                /**
                 * Gets the value of the postalCode property.
                 * 
                 */
                public int getPostalCode() {
                    return postalCode;
                }

                /**
                 * Sets the value of the postalCode property.
                 * 
                 */
                public void setPostalCode(int value) {
                    this.postalCode = value;
                }

                /**
                 * Gets the value of the stateProvCd property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getStateProvCd() {
                    return stateProvCd;
                }

                /**
                 * Sets the value of the stateProvCd property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setStateProvCd(String value) {
                    this.stateProvCd = value;
                }

            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="nameTypeCd" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "firstName",
                "lastName",
                "nameTypeCd"
            })
            public static class BillingNameInfo {

                @XmlElement(required = true)
                protected String firstName;
                @XmlElement(required = true)
                protected String lastName;
                @XmlElement(required = true)
                protected String nameTypeCd;

                /**
                 * Gets the value of the firstName property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getFirstName() {
                    return firstName;
                }

                /**
                 * Sets the value of the firstName property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setFirstName(String value) {
                    this.firstName = value;
                }

                /**
                 * Gets the value of the lastName property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getLastName() {
                    return lastName;
                }

                /**
                 * Sets the value of the lastName property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setLastName(String value) {
                    this.lastName = value;
                }

                /**
                 * Gets the value of the nameTypeCd property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNameTypeCd() {
                    return nameTypeCd;
                }

                /**
                 * Sets the value of the nameTypeCd property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNameTypeCd(String value) {
                    this.nameTypeCd = value;
                }

            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="monthDays" type="{http://www.w3.org/2001/XMLSchema}int"/>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "monthDays"
            })
            public static class MonthlyDueDayConfig {

                protected int monthDays;

                /**
                 * Gets the value of the monthDays property.
                 * 
                 */
                public int getMonthDays() {
                    return monthDays;
                }

                /**
                 * Sets the value of the monthDays property.
                 * 
                 */
                public void setMonthDays(int value) {
                    this.monthDays = value;
                }

            }

        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="accountingPeriod" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="addressSameGar" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="cancellationNoticeNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="cappingFactor" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="collectorscarinnb" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="commissionOverride" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="commissionRate" type="{http://www.w3.org/2001/XMLSchema}double"/>
     *         &lt;element name="commissionWaived" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="convExpCreditScore" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="convExpTierExposurePolMakeup" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="convExpTierIncidentFreeYears" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="convOrgnlEarlyShopEffDt" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="convOrgnlEarlyShopRateEffDt" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="convOriginalRateEffDt" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="countryCd" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="coverageType" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="customerNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="earlyShopperDayDifference" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="effective" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="expiration" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="flagRenewalInd" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="inceptionDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="insuranceScore" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="insuranceScoreDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="insuredNameOnDoc" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="namedNonOwnedPolicyInd" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="nbmaxacoverage" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="nbnoncatclaims" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="paidInFull" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="pcginitialeffectivedate" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="policyNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="policyTitle" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="prevRenewalCycleNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="primaryResidenceInd" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="priorPolicyPrem" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="priorToPriorTermPrem" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="producerCd" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="productCd" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="rateEffectiveDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="rateRequestDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="rateStabilizationFactor1" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="rateStabilizationFactor2" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="rateStabilizationFactor3" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="renewalLocked" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="riskStateCd" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="subProducerCd" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="tierOwner" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="underwriterCd" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="AccidentBenefitACCDEATHCoverage">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="limitAmount" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                 &lt;/sequence>
     *                 &lt;attribute name="state" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="AdditionalPersonswithExtendedUMBIUAB">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="extendedUMBI" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                 &lt;/sequence>
     *                 &lt;attribute name="state" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Driver">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="age" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                   &lt;element name="ageFirstLicensed" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                   &lt;element name="annualIncome" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                   &lt;element name="birthDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="convOldDriverNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                   &lt;element name="driverRelToApplicantCd" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="driverTypeCd" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="genderCd" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="licensePermitNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="licenseStatusCd" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="maritalStatusCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="stateProvCd" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="surchargeOverride" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="suspendedInd" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="DriverRatingInfo">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="alcCourseDisc" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="collGraduateSchAchDisc" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="defensiveDriver" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="distantStudentInd" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="driverTraining" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="employeegarage" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="matureDriverImpInd" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="militaryService" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="suspensionRevocationInd" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                           &lt;/sequence>
     *                           &lt;attribute name="state" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="DriverSR22Info">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="sr22FillingInd" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                           &lt;/sequence>
     *                           &lt;attribute name="state" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="ChartisExtInterfacesReport">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="reportReceivedDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="reportStage" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="reportType" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="sendingTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="statusMessage" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="success" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *                 &lt;attribute name="oid" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                 &lt;attribute name="state" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="IncomeLossBenefitsLIBCoverage">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="applicable" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/sequence>
     *                 &lt;attribute name="state" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Insured">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="education" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="highProfile" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="incidentBusinessThreshold" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="nameTypeCd" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="occupationClassCd" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                   &lt;element name="other" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="ownEntity" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                   &lt;element name="personalOrDomesticStaff" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="primaryInsured" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="purposeOfEntity" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="typeOfOccupation" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                   &lt;element name="PrimaryInsuredMailingAddress">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="address.addressLine1" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="address.city" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="address.countryCd" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="address.postalCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                             &lt;element name="address.stateProvCd" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="updateBillingMailingInd" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                           &lt;/sequence>
     *                           &lt;attribute name="state" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *                 &lt;attribute name="state" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="InsuredMailingAddress">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="address.addressLine1" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="address.countryCd" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="address.postalCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                   &lt;element name="address.stateProvCd" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="city2" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="isDiaplayAddress" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/sequence>
     *                 &lt;attribute name="state" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="LiabilityLimitsCSLCoverage">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="limitAmount" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                 &lt;/sequence>
     *                 &lt;attribute name="state" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="MedicalPaymentsMEDCoverage">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="limitAmount" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                 &lt;/sequence>
     *                 &lt;attribute name="state" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="OtherProduct">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="aigLife" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                   &lt;element name="aigLifePolicyNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                   &lt;element name="pcgArticles" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="pcgExessLiab" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="pcgHome" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="premierArticles" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="premierExessLiab" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="premierHome" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/sequence>
     *                 &lt;attribute name="state" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="PersonalPropertyCPPCoverage">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="applicable" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/sequence>
     *                 &lt;attribute name="state" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="PETCoverage">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="applicable" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/sequence>
     *                 &lt;attribute name="state" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="PolicyAdditionalInfo">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="assignedRisk" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                   &lt;element name="bookTransferRemarket" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="cancelled" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="isPolReissueOrRewrite" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="otherCarrier" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="prioCarrierCd" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                   &lt;element name="priorCarrTenure" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                   &lt;element name="priorLiabLimit" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                 &lt;/sequence>
     *                 &lt;attribute name="state" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="PolicyCredit">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="affinityCredit" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                   &lt;element name="armedForces" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="seasonaldiscount" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/sequence>
     *                 &lt;attribute name="state" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="ReducedUMCoverage">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="reducedUm" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/sequence>
     *                 &lt;attribute name="state" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="RoadsideRDCCoverage">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="applicable" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/sequence>
     *                 &lt;attribute name="state" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="TotalDisabilityBenefitsTDECoverage">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="applicable" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/sequence>
     *                 &lt;attribute name="state" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="TotalDisabilityBenefitsTDNCoverage">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="applicable" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/sequence>
     *                 &lt;attribute name="state" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="TripInterruptionEmergencyLivingTELCoverage">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="applicable" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/sequence>
     *                 &lt;attribute name="state" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="UMCSLCoverage">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="limitAmount" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                   &lt;element name="umtype" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/sequence>
     *                 &lt;attribute name="state" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="UninsuredMotoristsBICoverage">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="convertedCoverage" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/sequence>
     *                 &lt;attribute name="state" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Vehicle" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="abiCd" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                   &lt;element name="agreedValue" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                   &lt;element name="annualMilesOvrd" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="avrgAnnualMiles" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                   &lt;element name="classCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="convoldVehicleNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                   &lt;element name="ctyTaxMintAmt" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                   &lt;element name="ctyTaxPercAmt" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                   &lt;element name="engineSize" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                   &lt;element name="firstPotDamage" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="fullGlass" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="greyMarket" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="height" type="{http://www.w3.org/2001/XMLSchema}double"/>
     *                   &lt;element name="isMedPayEffect" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="liability" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="manufacturer" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="marketValue" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                   &lt;element name="model" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="modelYear" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                   &lt;element name="ovrdFirstPotDamage" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="ovrdTitleTransNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="printIDcards" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="repAnnualMiles" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                   &lt;element name="titleTransNo" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                   &lt;element name="titleTransVerNo" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                   &lt;element name="vehBodyTypeCd" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="vehExtendedNonOwnerVeh" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="vehIdentificationNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="vehTypeCd" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="verAnnualMiles" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                   &lt;element name="verifiedFirstPotDamage" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="vinStyle" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                   &lt;element name="CashSettlementCoverage">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="cashSettlement" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                           &lt;/sequence>
     *                           &lt;attribute name="state" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="ChartisPAutoVehicleCredits">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="antiLockBrakeCd" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="applyMultiCarDiscountInd" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="autoBrake" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="blindSpotMonitor" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="dayLights" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="driverAlertSys" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="guardGatedCom" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="hybrid" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="hybridOrElectric" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="laneDepartMonitor" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="overrideMultiCarDiscountInd" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="passiveRestraints" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                             &lt;element name="securityOptionsCd" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                           &lt;/sequence>
     *                           &lt;attribute name="state" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="ChartisPAutoVehicleOwnership">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="additionalOwnersInd" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="addressLine1" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="country" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="financedInd" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="location" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="ownedInd" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="ownerType" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="regOwner" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                             &lt;element name="regOwnerOther" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                             &lt;element name="stateProvCd" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="zipCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                           &lt;/sequence>
     *                           &lt;attribute name="state" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="GaragingAddress">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="addressLine1" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="city2" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="countryCd" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="garaged" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="garagedSecondary" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="garagingLocation" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="postalCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                             &lt;element name="ratingTerritory" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                             &lt;element name="regionCd" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                             &lt;element name="stateProvCd" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="storedInMasonry" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                           &lt;/sequence>
     *                           &lt;attribute name="state" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="PAutoACCDEATHDomainCoverage">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="limitAmount" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                             &lt;element name="PremiumEntry" maxOccurs="unbounded">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="actualAmt" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                                       &lt;element name="changeAmt" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                                       &lt;element name="periodAmt" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                                       &lt;element name="premiumType" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                     &lt;/sequence>
     *                                     &lt;attribute name="premiumCd" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                           &lt;attribute name="state" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="PAutoBIDomainCoverage">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="state" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="PAutoCOLLCoverage">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="deductibleAmount" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                           &lt;/sequence>
     *                           &lt;attribute name="state" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="PAutoCOLLDomainCoverage">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="deductibleAmount" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                             &lt;element name="PremiumEntry" maxOccurs="unbounded">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="actualAmt" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                                       &lt;element name="changeAmt" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                                       &lt;element name="periodAmt" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                                       &lt;element name="premiumType" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                     &lt;/sequence>
     *                                     &lt;attribute name="premiumCd" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                           &lt;attribute name="state" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="PAutoCOMPCoverage">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="deductibleAmount" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                           &lt;/sequence>
     *                           &lt;attribute name="state" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="PAutoCOMPDomainCoverage">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="deductibleAmount" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                             &lt;element name="PremiumEntry" maxOccurs="unbounded">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="actualAmt" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                                       &lt;element name="changeAmt" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                                       &lt;element name="periodAmt" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                                       &lt;element name="premiumType" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                     &lt;/sequence>
     *                                     &lt;attribute name="premiumCd" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                           &lt;attribute name="state" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="PAutoCPDomainCoverage">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="limitAmount" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                           &lt;/sequence>
     *                           &lt;attribute name="state" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="PAutoCSLDomainCoverage">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="limitAmount" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                             &lt;element name="PremiumEntry" maxOccurs="unbounded">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="actualAmt" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                                       &lt;element name="changeAmt" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                                       &lt;element name="periodAmt" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                                       &lt;element name="premiumType" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                     &lt;/sequence>
     *                                     &lt;attribute name="premiumCd" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                           &lt;attribute name="state" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="PAutoMEDDomainCoverage">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="limitAmount" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                             &lt;element name="PremiumEntry" maxOccurs="unbounded">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="actualAmt" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                                       &lt;element name="changeAmt" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                                       &lt;element name="periodAmt" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                                       &lt;element name="premiumType" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                     &lt;/sequence>
     *                                     &lt;attribute name="premiumCd" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                           &lt;attribute name="state" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="PAutoMEDPLCoverage">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="state" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="PAutoPDDomainCoverage">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="state" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="PAutoUMBIDomainCoverage">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="state" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="PAutoUMCSLDomainCoverage">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="limitAmount" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                             &lt;element name="PremiumEntry" maxOccurs="unbounded">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="actualAmt" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                                       &lt;element name="changeAmt" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                                       &lt;element name="periodAmt" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                                       &lt;element name="premiumType" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                     &lt;/sequence>
     *                                     &lt;attribute name="premiumCd" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                           &lt;attribute name="state" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="PAutoUMPDDomainCoverage">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="state" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="VehicleRatingInfo">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="collSymbol" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                             &lt;element name="collSymbolRef" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                             &lt;element name="compSymbol" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                             &lt;element name="compSymbolRef" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                             &lt;element name="distanceOneWay" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                             &lt;element name="effectivedt" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="fromBlueBookInd" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="inspected" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="isVehRegularUse" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="liabilitySymbol" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                             &lt;element name="numDaysDrivenPerWeek" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                             &lt;element name="pipMedSymbol" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                             &lt;element name="registrationStateCd" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="vehicleUsageCd" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                           &lt;/sequence>
     *                           &lt;attribute name="state" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="PremiumEntry" maxOccurs="unbounded">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="actualAmt" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                             &lt;element name="changeAmt" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                             &lt;element name="periodAmt" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                             &lt;element name="premiumType" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                           &lt;/sequence>
     *                           &lt;attribute name="premiumCd" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="ChartisExtInterfacesReport">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="documentName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="reportReceivedDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="reportStage" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="reportType" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="sendingTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="statusMessage" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="success" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *                 &lt;attribute name="oid" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                 &lt;attribute name="state" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="VehicleHomeAlterationVHACoverage">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="applicable" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/sequence>
     *                 &lt;attribute name="state" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="WorkLossWLC">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="applicable" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/sequence>
     *                 &lt;attribute name="state" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="PremiumEntry" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="actualAmt" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                   &lt;element name="changeAmt" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                   &lt;element name="periodAmt" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                   &lt;element name="premiumType" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/sequence>
     *                 &lt;attribute name="premiumCd" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="ChartisTier">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="convPriorTier" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                   &lt;element name="systemGeneratedTier" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                   &lt;element name="tierOverrideInd" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="CForm" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="formCd" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="DriverVehicleRelationship">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="driver">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="oid" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="relationshipType" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="seqNo" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                   &lt;element name="vehicle">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="oid" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="state" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "accountingPeriod",
        "addressSameGar",
        "cancellationNoticeNumber",
        "cappingFactor",
        "collectorscarinnb",
        "commissionOverride",
        "commissionRate",
        "commissionWaived",
        "convExpCreditScore",
        "convExpTierExposurePolMakeup",
        "convExpTierIncidentFreeYears",
        "convOrgnlEarlyShopEffDt",
        "convOrgnlEarlyShopRateEffDt",
        "convOriginalRateEffDt",
        "countryCd",
        "coverageType",
        "customerNumber",
        "earlyShopperDayDifference",
        "effective",
        "expiration",
        "flagRenewalInd",
        "inceptionDate",
        "insuranceScore",
        "insuranceScoreDate",
        "insuredNameOnDoc",
        "namedNonOwnedPolicyInd",
        "nbmaxacoverage",
        "nbnoncatclaims",
        "paidInFull",
        "pcginitialeffectivedate",
        "policyNumber",
        "policyTitle",
        "prevRenewalCycleNum",
        "primaryResidenceInd",
        "priorPolicyPrem",
        "priorToPriorTermPrem",
        "producerCd",
        "productCd",
        "rateEffectiveDate",
        "rateRequestDate",
        "rateStabilizationFactor1",
        "rateStabilizationFactor2",
        "rateStabilizationFactor3",
        "renewalLocked",
        "riskStateCd",
        "subProducerCd",
        "tierOwner",
        "underwriterCd",
        "accidentBenefitACCDEATHCoverage",
        "additionalPersonswithExtendedUMBIUAB",
        "driver",
        "incomeLossBenefitsLIBCoverage",
        "insured",
        "insuredMailingAddress",
        "liabilityLimitsCSLCoverage",
        "medicalPaymentsMEDCoverage",
        "otherProduct",
        "personalPropertyCPPCoverage",
        "petCoverage",
        "policyAdditionalInfo",
        "policyCredit",
        "reducedUMCoverage",
        "roadsideRDCCoverage",
        "totalDisabilityBenefitsTDECoverage",
        "totalDisabilityBenefitsTDNCoverage",
        "tripInterruptionEmergencyLivingTELCoverage",
        "umcslCoverage",
        "uninsuredMotoristsBICoverage",
        "vehicle",
        "vehicleHomeAlterationVHACoverage",
        "workLossWLC",
        "premiumEntry",
        "chartisTier",
        "cForm",
        "driverVehicleRelationship"
    })
    public static class Policy {

        @XmlElement(required = true)
        protected String accountingPeriod;
        @XmlElement(required = true)
        protected String addressSameGar;
        protected int cancellationNoticeNumber;
        protected int cappingFactor;
        protected int collectorscarinnb;
        @XmlElement(required = true)
        protected String commissionOverride;
        protected double commissionRate;
        @XmlElement(required = true)
        protected String commissionWaived;
        protected int convExpCreditScore;
        protected int convExpTierExposurePolMakeup;
        protected int convExpTierIncidentFreeYears;
        @XmlElement(required = true)
        protected String convOrgnlEarlyShopEffDt;
        @XmlElement(required = true)
        protected String convOrgnlEarlyShopRateEffDt;
        @XmlElement(required = true)
        protected String convOriginalRateEffDt;
        @XmlElement(required = true)
        protected String countryCd;
        @XmlElement(required = true)
        protected String coverageType;
        protected int customerNumber;
        protected int earlyShopperDayDifference;
        @XmlElement(required = true)
        protected String effective;
        @XmlElement(required = true)
        protected String expiration;
        @XmlElement(required = true)
        protected String flagRenewalInd;
        @XmlElement(required = true)
        protected String inceptionDate;
        protected int insuranceScore;
        @XmlElement(required = true)
        protected String insuranceScoreDate;
        @XmlElement(required = true)
        protected String insuredNameOnDoc;
        @XmlElement(required = true)
        protected String namedNonOwnedPolicyInd;
        protected int nbmaxacoverage;
        @XmlElement(required = true)
        protected String nbnoncatclaims;
        @XmlElement(required = true)
        protected String paidInFull;
        @XmlElement(required = true)
        protected String pcginitialeffectivedate;
        @XmlElement(required = true)
        protected String policyNumber;
        @XmlElement(required = true)
        protected String policyTitle;
        protected int prevRenewalCycleNum;
        @XmlElement(required = true)
        protected String primaryResidenceInd;
        protected int priorPolicyPrem;
        protected int priorToPriorTermPrem;
        protected int producerCd;
        @XmlElement(required = true)
        protected String productCd;
        @XmlElement(required = true)
        protected String rateEffectiveDate;
        @XmlElement(required = true)
        protected String rateRequestDate;
        protected int rateStabilizationFactor1;
        protected int rateStabilizationFactor2;
        protected int rateStabilizationFactor3;
        @XmlElement(required = true)
        protected String renewalLocked;
        @XmlElement(required = true)
        protected String riskStateCd;
        protected int subProducerCd;
        @XmlElement(required = true)
        protected String tierOwner;
        protected int underwriterCd;
        @XmlElement(name = "AccidentBenefitACCDEATHCoverage", required = true)
        protected Policies.Policy.AccidentBenefitACCDEATHCoverage accidentBenefitACCDEATHCoverage;
        @XmlElement(name = "AdditionalPersonswithExtendedUMBIUAB", required = true)
        protected Policies.Policy.AdditionalPersonswithExtendedUMBIUAB additionalPersonswithExtendedUMBIUAB;
        @XmlElement(name = "Driver", required = true)
        protected Policies.Policy.Driver driver;
        @XmlElement(name = "IncomeLossBenefitsLIBCoverage", required = true)
        protected Policies.Policy.IncomeLossBenefitsLIBCoverage incomeLossBenefitsLIBCoverage;
        @XmlElement(name = "Insured", required = true)
        protected Policies.Policy.Insured insured;
        @XmlElement(name = "InsuredMailingAddress", required = true)
        protected Policies.Policy.InsuredMailingAddress insuredMailingAddress;
        @XmlElement(name = "LiabilityLimitsCSLCoverage", required = true)
        protected Policies.Policy.LiabilityLimitsCSLCoverage liabilityLimitsCSLCoverage;
        @XmlElement(name = "MedicalPaymentsMEDCoverage", required = true)
        protected Policies.Policy.MedicalPaymentsMEDCoverage medicalPaymentsMEDCoverage;
        @XmlElement(name = "OtherProduct", required = true)
        protected Policies.Policy.OtherProduct otherProduct;
        @XmlElement(name = "PersonalPropertyCPPCoverage", required = true)
        protected Policies.Policy.PersonalPropertyCPPCoverage personalPropertyCPPCoverage;
        @XmlElement(name = "PETCoverage", required = true)
        protected Policies.Policy.PETCoverage petCoverage;
        @XmlElement(name = "PolicyAdditionalInfo", required = true)
        protected Policies.Policy.PolicyAdditionalInfo policyAdditionalInfo;
        @XmlElement(name = "PolicyCredit", required = true)
        protected Policies.Policy.PolicyCredit policyCredit;
        @XmlElement(name = "ReducedUMCoverage", required = true)
        protected Policies.Policy.ReducedUMCoverage reducedUMCoverage;
        @XmlElement(name = "RoadsideRDCCoverage", required = true)
        protected Policies.Policy.RoadsideRDCCoverage roadsideRDCCoverage;
        @XmlElement(name = "TotalDisabilityBenefitsTDECoverage", required = true)
        protected Policies.Policy.TotalDisabilityBenefitsTDECoverage totalDisabilityBenefitsTDECoverage;
        @XmlElement(name = "TotalDisabilityBenefitsTDNCoverage", required = true)
        protected Policies.Policy.TotalDisabilityBenefitsTDNCoverage totalDisabilityBenefitsTDNCoverage;
        @XmlElement(name = "TripInterruptionEmergencyLivingTELCoverage", required = true)
        protected Policies.Policy.TripInterruptionEmergencyLivingTELCoverage tripInterruptionEmergencyLivingTELCoverage;
        @XmlElement(name = "UMCSLCoverage", required = true)
        protected Policies.Policy.UMCSLCoverage umcslCoverage;
        @XmlElement(name = "UninsuredMotoristsBICoverage", required = true)
        protected Policies.Policy.UninsuredMotoristsBICoverage uninsuredMotoristsBICoverage;
        @XmlElement(name = "Vehicle", required = true)
        protected List<Policies.Policy.Vehicle> vehicle;
        @XmlElement(name = "VehicleHomeAlterationVHACoverage", required = true)
        protected Policies.Policy.VehicleHomeAlterationVHACoverage vehicleHomeAlterationVHACoverage;
        @XmlElement(name = "WorkLossWLC", required = true)
        protected Policies.Policy.WorkLossWLC workLossWLC;
        @XmlElement(name = "PremiumEntry", required = true)
        protected List<Policies.Policy.PremiumEntry> premiumEntry;
        @XmlElement(name = "ChartisTier", required = true)
        protected Policies.Policy.ChartisTier chartisTier;
        @XmlElement(name = "CForm", required = true)
        protected List<Policies.Policy.CForm> cForm;
        @XmlElement(name = "DriverVehicleRelationship", required = true)
        protected Policies.Policy.DriverVehicleRelationship driverVehicleRelationship;
        @XmlAttribute(name = "state")
        protected String state;

        /**
         * Gets the value of the accountingPeriod property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAccountingPeriod() {
            return accountingPeriod;
        }

        /**
         * Sets the value of the accountingPeriod property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAccountingPeriod(String value) {
            this.accountingPeriod = value;
        }

        /**
         * Gets the value of the addressSameGar property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAddressSameGar() {
            return addressSameGar;
        }

        /**
         * Sets the value of the addressSameGar property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAddressSameGar(String value) {
            this.addressSameGar = value;
        }

        /**
         * Gets the value of the cancellationNoticeNumber property.
         * 
         */
        public int getCancellationNoticeNumber() {
            return cancellationNoticeNumber;
        }

        /**
         * Sets the value of the cancellationNoticeNumber property.
         * 
         */
        public void setCancellationNoticeNumber(int value) {
            this.cancellationNoticeNumber = value;
        }

        /**
         * Gets the value of the cappingFactor property.
         * 
         */
        public int getCappingFactor() {
            return cappingFactor;
        }

        /**
         * Sets the value of the cappingFactor property.
         * 
         */
        public void setCappingFactor(int value) {
            this.cappingFactor = value;
        }

        /**
         * Gets the value of the collectorscarinnb property.
         * 
         */
        public int getCollectorscarinnb() {
            return collectorscarinnb;
        }

        /**
         * Sets the value of the collectorscarinnb property.
         * 
         */
        public void setCollectorscarinnb(int value) {
            this.collectorscarinnb = value;
        }

        /**
         * Gets the value of the commissionOverride property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCommissionOverride() {
            return commissionOverride;
        }

        /**
         * Sets the value of the commissionOverride property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCommissionOverride(String value) {
            this.commissionOverride = value;
        }

        /**
         * Gets the value of the commissionRate property.
         * 
         */
        public double getCommissionRate() {
            return commissionRate;
        }

        /**
         * Sets the value of the commissionRate property.
         * 
         */
        public void setCommissionRate(double value) {
            this.commissionRate = value;
        }

        /**
         * Gets the value of the commissionWaived property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCommissionWaived() {
            return commissionWaived;
        }

        /**
         * Sets the value of the commissionWaived property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCommissionWaived(String value) {
            this.commissionWaived = value;
        }

        /**
         * Gets the value of the convExpCreditScore property.
         * 
         */
        public int getConvExpCreditScore() {
            return convExpCreditScore;
        }

        /**
         * Sets the value of the convExpCreditScore property.
         * 
         */
        public void setConvExpCreditScore(int value) {
            this.convExpCreditScore = value;
        }

        /**
         * Gets the value of the convExpTierExposurePolMakeup property.
         * 
         */
        public int getConvExpTierExposurePolMakeup() {
            return convExpTierExposurePolMakeup;
        }

        /**
         * Sets the value of the convExpTierExposurePolMakeup property.
         * 
         */
        public void setConvExpTierExposurePolMakeup(int value) {
            this.convExpTierExposurePolMakeup = value;
        }

        /**
         * Gets the value of the convExpTierIncidentFreeYears property.
         * 
         */
        public int getConvExpTierIncidentFreeYears() {
            return convExpTierIncidentFreeYears;
        }

        /**
         * Sets the value of the convExpTierIncidentFreeYears property.
         * 
         */
        public void setConvExpTierIncidentFreeYears(int value) {
            this.convExpTierIncidentFreeYears = value;
        }

        /**
         * Gets the value of the convOrgnlEarlyShopEffDt property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getConvOrgnlEarlyShopEffDt() {
            return convOrgnlEarlyShopEffDt;
        }

        /**
         * Sets the value of the convOrgnlEarlyShopEffDt property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setConvOrgnlEarlyShopEffDt(String value) {
            this.convOrgnlEarlyShopEffDt = value;
        }

        /**
         * Gets the value of the convOrgnlEarlyShopRateEffDt property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getConvOrgnlEarlyShopRateEffDt() {
            return convOrgnlEarlyShopRateEffDt;
        }

        /**
         * Sets the value of the convOrgnlEarlyShopRateEffDt property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setConvOrgnlEarlyShopRateEffDt(String value) {
            this.convOrgnlEarlyShopRateEffDt = value;
        }

        /**
         * Gets the value of the convOriginalRateEffDt property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getConvOriginalRateEffDt() {
            return convOriginalRateEffDt;
        }

        /**
         * Sets the value of the convOriginalRateEffDt property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setConvOriginalRateEffDt(String value) {
            this.convOriginalRateEffDt = value;
        }

        /**
         * Gets the value of the countryCd property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCountryCd() {
            return countryCd;
        }

        /**
         * Sets the value of the countryCd property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCountryCd(String value) {
            this.countryCd = value;
        }

        /**
         * Gets the value of the coverageType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCoverageType() {
            return coverageType;
        }

        /**
         * Sets the value of the coverageType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCoverageType(String value) {
            this.coverageType = value;
        }

        /**
         * Gets the value of the customerNumber property.
         * 
         */
        public int getCustomerNumber() {
            return customerNumber;
        }

        /**
         * Sets the value of the customerNumber property.
         * 
         */
        public void setCustomerNumber(int value) {
            this.customerNumber = value;
        }

        /**
         * Gets the value of the earlyShopperDayDifference property.
         * 
         */
        public int getEarlyShopperDayDifference() {
            return earlyShopperDayDifference;
        }

        /**
         * Sets the value of the earlyShopperDayDifference property.
         * 
         */
        public void setEarlyShopperDayDifference(int value) {
            this.earlyShopperDayDifference = value;
        }

        /**
         * Gets the value of the effective property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEffective() {
            return effective;
        }

        /**
         * Sets the value of the effective property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEffective(String value) {
            this.effective = value;
        }

        /**
         * Gets the value of the expiration property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getExpiration() {
            return expiration;
        }

        /**
         * Sets the value of the expiration property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setExpiration(String value) {
            this.expiration = value;
        }

        /**
         * Gets the value of the flagRenewalInd property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFlagRenewalInd() {
            return flagRenewalInd;
        }

        /**
         * Sets the value of the flagRenewalInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFlagRenewalInd(String value) {
            this.flagRenewalInd = value;
        }

        /**
         * Gets the value of the inceptionDate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getInceptionDate() {
            return inceptionDate;
        }

        /**
         * Sets the value of the inceptionDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setInceptionDate(String value) {
            this.inceptionDate = value;
        }

        /**
         * Gets the value of the insuranceScore property.
         * 
         */
        public int getInsuranceScore() {
            return insuranceScore;
        }

        /**
         * Sets the value of the insuranceScore property.
         * 
         */
        public void setInsuranceScore(int value) {
            this.insuranceScore = value;
        }

        /**
         * Gets the value of the insuranceScoreDate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getInsuranceScoreDate() {
            return insuranceScoreDate;
        }

        /**
         * Sets the value of the insuranceScoreDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setInsuranceScoreDate(String value) {
            this.insuranceScoreDate = value;
        }

        /**
         * Gets the value of the insuredNameOnDoc property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getInsuredNameOnDoc() {
            return insuredNameOnDoc;
        }

        /**
         * Sets the value of the insuredNameOnDoc property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setInsuredNameOnDoc(String value) {
            this.insuredNameOnDoc = value;
        }

        /**
         * Gets the value of the namedNonOwnedPolicyInd property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNamedNonOwnedPolicyInd() {
            return namedNonOwnedPolicyInd;
        }

        /**
         * Sets the value of the namedNonOwnedPolicyInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNamedNonOwnedPolicyInd(String value) {
            this.namedNonOwnedPolicyInd = value;
        }

        /**
         * Gets the value of the nbmaxacoverage property.
         * 
         */
        public int getNbmaxacoverage() {
            return nbmaxacoverage;
        }

        /**
         * Sets the value of the nbmaxacoverage property.
         * 
         */
        public void setNbmaxacoverage(int value) {
            this.nbmaxacoverage = value;
        }

        /**
         * Gets the value of the nbnoncatclaims property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNbnoncatclaims() {
            return nbnoncatclaims;
        }

        /**
         * Sets the value of the nbnoncatclaims property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNbnoncatclaims(String value) {
            this.nbnoncatclaims = value;
        }

        /**
         * Gets the value of the paidInFull property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPaidInFull() {
            return paidInFull;
        }

        /**
         * Sets the value of the paidInFull property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPaidInFull(String value) {
            this.paidInFull = value;
        }

        /**
         * Gets the value of the pcginitialeffectivedate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPcginitialeffectivedate() {
            return pcginitialeffectivedate;
        }

        /**
         * Sets the value of the pcginitialeffectivedate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPcginitialeffectivedate(String value) {
            this.pcginitialeffectivedate = value;
        }

        /**
         * Gets the value of the policyNumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPolicyNumber() {
            return policyNumber;
        }

        /**
         * Sets the value of the policyNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPolicyNumber(String value) {
            this.policyNumber = value;
        }

        /**
         * Gets the value of the policyTitle property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPolicyTitle() {
            return policyTitle;
        }

        /**
         * Sets the value of the policyTitle property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPolicyTitle(String value) {
            this.policyTitle = value;
        }

        /**
         * Gets the value of the prevRenewalCycleNum property.
         * 
         */
        public int getPrevRenewalCycleNum() {
            return prevRenewalCycleNum;
        }

        /**
         * Sets the value of the prevRenewalCycleNum property.
         * 
         */
        public void setPrevRenewalCycleNum(int value) {
            this.prevRenewalCycleNum = value;
        }

        /**
         * Gets the value of the primaryResidenceInd property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPrimaryResidenceInd() {
            return primaryResidenceInd;
        }

        /**
         * Sets the value of the primaryResidenceInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPrimaryResidenceInd(String value) {
            this.primaryResidenceInd = value;
        }

        /**
         * Gets the value of the priorPolicyPrem property.
         * 
         */
        public int getPriorPolicyPrem() {
            return priorPolicyPrem;
        }

        /**
         * Sets the value of the priorPolicyPrem property.
         * 
         */
        public void setPriorPolicyPrem(int value) {
            this.priorPolicyPrem = value;
        }

        /**
         * Gets the value of the priorToPriorTermPrem property.
         * 
         */
        public int getPriorToPriorTermPrem() {
            return priorToPriorTermPrem;
        }

        /**
         * Sets the value of the priorToPriorTermPrem property.
         * 
         */
        public void setPriorToPriorTermPrem(int value) {
            this.priorToPriorTermPrem = value;
        }

        /**
         * Gets the value of the producerCd property.
         * 
         */
        public int getProducerCd() {
            return producerCd;
        }

        /**
         * Sets the value of the producerCd property.
         * 
         */
        public void setProducerCd(int value) {
            this.producerCd = value;
        }

        /**
         * Gets the value of the productCd property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProductCd() {
            return productCd;
        }

        /**
         * Sets the value of the productCd property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProductCd(String value) {
            this.productCd = value;
        }

        /**
         * Gets the value of the rateEffectiveDate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRateEffectiveDate() {
            return rateEffectiveDate;
        }

        /**
         * Sets the value of the rateEffectiveDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRateEffectiveDate(String value) {
            this.rateEffectiveDate = value;
        }

        /**
         * Gets the value of the rateRequestDate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRateRequestDate() {
            return rateRequestDate;
        }

        /**
         * Sets the value of the rateRequestDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRateRequestDate(String value) {
            this.rateRequestDate = value;
        }

        /**
         * Gets the value of the rateStabilizationFactor1 property.
         * 
         */
        public int getRateStabilizationFactor1() {
            return rateStabilizationFactor1;
        }

        /**
         * Sets the value of the rateStabilizationFactor1 property.
         * 
         */
        public void setRateStabilizationFactor1(int value) {
            this.rateStabilizationFactor1 = value;
        }

        /**
         * Gets the value of the rateStabilizationFactor2 property.
         * 
         */
        public int getRateStabilizationFactor2() {
            return rateStabilizationFactor2;
        }

        /**
         * Sets the value of the rateStabilizationFactor2 property.
         * 
         */
        public void setRateStabilizationFactor2(int value) {
            this.rateStabilizationFactor2 = value;
        }

        /**
         * Gets the value of the rateStabilizationFactor3 property.
         * 
         */
        public int getRateStabilizationFactor3() {
            return rateStabilizationFactor3;
        }

        /**
         * Sets the value of the rateStabilizationFactor3 property.
         * 
         */
        public void setRateStabilizationFactor3(int value) {
            this.rateStabilizationFactor3 = value;
        }

        /**
         * Gets the value of the renewalLocked property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRenewalLocked() {
            return renewalLocked;
        }

        /**
         * Sets the value of the renewalLocked property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRenewalLocked(String value) {
            this.renewalLocked = value;
        }

        /**
         * Gets the value of the riskStateCd property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRiskStateCd() {
            return riskStateCd;
        }

        /**
         * Sets the value of the riskStateCd property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRiskStateCd(String value) {
            this.riskStateCd = value;
        }

        /**
         * Gets the value of the subProducerCd property.
         * 
         */
        public int getSubProducerCd() {
            return subProducerCd;
        }

        /**
         * Sets the value of the subProducerCd property.
         * 
         */
        public void setSubProducerCd(int value) {
            this.subProducerCd = value;
        }

        /**
         * Gets the value of the tierOwner property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTierOwner() {
            return tierOwner;
        }

        /**
         * Sets the value of the tierOwner property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTierOwner(String value) {
            this.tierOwner = value;
        }

        /**
         * Gets the value of the underwriterCd property.
         * 
         */
        public int getUnderwriterCd() {
            return underwriterCd;
        }

        /**
         * Sets the value of the underwriterCd property.
         * 
         */
        public void setUnderwriterCd(int value) {
            this.underwriterCd = value;
        }

        /**
         * Gets the value of the accidentBenefitACCDEATHCoverage property.
         * 
         * @return
         *     possible object is
         *     {@link Policies.Policy.AccidentBenefitACCDEATHCoverage }
         *     
         */
        public Policies.Policy.AccidentBenefitACCDEATHCoverage getAccidentBenefitACCDEATHCoverage() {
            return accidentBenefitACCDEATHCoverage;
        }

        /**
         * Sets the value of the accidentBenefitACCDEATHCoverage property.
         * 
         * @param value
         *     allowed object is
         *     {@link Policies.Policy.AccidentBenefitACCDEATHCoverage }
         *     
         */
        public void setAccidentBenefitACCDEATHCoverage(Policies.Policy.AccidentBenefitACCDEATHCoverage value) {
            this.accidentBenefitACCDEATHCoverage = value;
        }

        /**
         * Gets the value of the additionalPersonswithExtendedUMBIUAB property.
         * 
         * @return
         *     possible object is
         *     {@link Policies.Policy.AdditionalPersonswithExtendedUMBIUAB }
         *     
         */
        public Policies.Policy.AdditionalPersonswithExtendedUMBIUAB getAdditionalPersonswithExtendedUMBIUAB() {
            return additionalPersonswithExtendedUMBIUAB;
        }

        /**
         * Sets the value of the additionalPersonswithExtendedUMBIUAB property.
         * 
         * @param value
         *     allowed object is
         *     {@link Policies.Policy.AdditionalPersonswithExtendedUMBIUAB }
         *     
         */
        public void setAdditionalPersonswithExtendedUMBIUAB(Policies.Policy.AdditionalPersonswithExtendedUMBIUAB value) {
            this.additionalPersonswithExtendedUMBIUAB = value;
        }

        /**
         * Gets the value of the driver property.
         * 
         * @return
         *     possible object is
         *     {@link Policies.Policy.Driver }
         *     
         */
        public Policies.Policy.Driver getDriver() {
            return driver;
        }

        /**
         * Sets the value of the driver property.
         * 
         * @param value
         *     allowed object is
         *     {@link Policies.Policy.Driver }
         *     
         */
        public void setDriver(Policies.Policy.Driver value) {
            this.driver = value;
        }

        /**
         * Gets the value of the incomeLossBenefitsLIBCoverage property.
         * 
         * @return
         *     possible object is
         *     {@link Policies.Policy.IncomeLossBenefitsLIBCoverage }
         *     
         */
        public Policies.Policy.IncomeLossBenefitsLIBCoverage getIncomeLossBenefitsLIBCoverage() {
            return incomeLossBenefitsLIBCoverage;
        }

        /**
         * Sets the value of the incomeLossBenefitsLIBCoverage property.
         * 
         * @param value
         *     allowed object is
         *     {@link Policies.Policy.IncomeLossBenefitsLIBCoverage }
         *     
         */
        public void setIncomeLossBenefitsLIBCoverage(Policies.Policy.IncomeLossBenefitsLIBCoverage value) {
            this.incomeLossBenefitsLIBCoverage = value;
        }

        /**
         * Gets the value of the insured property.
         * 
         * @return
         *     possible object is
         *     {@link Policies.Policy.Insured }
         *     
         */
        public Policies.Policy.Insured getInsured() {
            return insured;
        }

        /**
         * Sets the value of the insured property.
         * 
         * @param value
         *     allowed object is
         *     {@link Policies.Policy.Insured }
         *     
         */
        public void setInsured(Policies.Policy.Insured value) {
            this.insured = value;
        }

        /**
         * Gets the value of the insuredMailingAddress property.
         * 
         * @return
         *     possible object is
         *     {@link Policies.Policy.InsuredMailingAddress }
         *     
         */
        public Policies.Policy.InsuredMailingAddress getInsuredMailingAddress() {
            return insuredMailingAddress;
        }

        /**
         * Sets the value of the insuredMailingAddress property.
         * 
         * @param value
         *     allowed object is
         *     {@link Policies.Policy.InsuredMailingAddress }
         *     
         */
        public void setInsuredMailingAddress(Policies.Policy.InsuredMailingAddress value) {
            this.insuredMailingAddress = value;
        }

        /**
         * Gets the value of the liabilityLimitsCSLCoverage property.
         * 
         * @return
         *     possible object is
         *     {@link Policies.Policy.LiabilityLimitsCSLCoverage }
         *     
         */
        public Policies.Policy.LiabilityLimitsCSLCoverage getLiabilityLimitsCSLCoverage() {
            return liabilityLimitsCSLCoverage;
        }

        /**
         * Sets the value of the liabilityLimitsCSLCoverage property.
         * 
         * @param value
         *     allowed object is
         *     {@link Policies.Policy.LiabilityLimitsCSLCoverage }
         *     
         */
        public void setLiabilityLimitsCSLCoverage(Policies.Policy.LiabilityLimitsCSLCoverage value) {
            this.liabilityLimitsCSLCoverage = value;
        }

        /**
         * Gets the value of the medicalPaymentsMEDCoverage property.
         * 
         * @return
         *     possible object is
         *     {@link Policies.Policy.MedicalPaymentsMEDCoverage }
         *     
         */
        public Policies.Policy.MedicalPaymentsMEDCoverage getMedicalPaymentsMEDCoverage() {
            return medicalPaymentsMEDCoverage;
        }

        /**
         * Sets the value of the medicalPaymentsMEDCoverage property.
         * 
         * @param value
         *     allowed object is
         *     {@link Policies.Policy.MedicalPaymentsMEDCoverage }
         *     
         */
        public void setMedicalPaymentsMEDCoverage(Policies.Policy.MedicalPaymentsMEDCoverage value) {
            this.medicalPaymentsMEDCoverage = value;
        }

        /**
         * Gets the value of the otherProduct property.
         * 
         * @return
         *     possible object is
         *     {@link Policies.Policy.OtherProduct }
         *     
         */
        public Policies.Policy.OtherProduct getOtherProduct() {
            return otherProduct;
        }

        /**
         * Sets the value of the otherProduct property.
         * 
         * @param value
         *     allowed object is
         *     {@link Policies.Policy.OtherProduct }
         *     
         */
        public void setOtherProduct(Policies.Policy.OtherProduct value) {
            this.otherProduct = value;
        }

        /**
         * Gets the value of the personalPropertyCPPCoverage property.
         * 
         * @return
         *     possible object is
         *     {@link Policies.Policy.PersonalPropertyCPPCoverage }
         *     
         */
        public Policies.Policy.PersonalPropertyCPPCoverage getPersonalPropertyCPPCoverage() {
            return personalPropertyCPPCoverage;
        }

        /**
         * Sets the value of the personalPropertyCPPCoverage property.
         * 
         * @param value
         *     allowed object is
         *     {@link Policies.Policy.PersonalPropertyCPPCoverage }
         *     
         */
        public void setPersonalPropertyCPPCoverage(Policies.Policy.PersonalPropertyCPPCoverage value) {
            this.personalPropertyCPPCoverage = value;
        }

        /**
         * Gets the value of the petCoverage property.
         * 
         * @return
         *     possible object is
         *     {@link Policies.Policy.PETCoverage }
         *     
         */
        public Policies.Policy.PETCoverage getPETCoverage() {
            return petCoverage;
        }

        /**
         * Sets the value of the petCoverage property.
         * 
         * @param value
         *     allowed object is
         *     {@link Policies.Policy.PETCoverage }
         *     
         */
        public void setPETCoverage(Policies.Policy.PETCoverage value) {
            this.petCoverage = value;
        }

        /**
         * Gets the value of the policyAdditionalInfo property.
         * 
         * @return
         *     possible object is
         *     {@link Policies.Policy.PolicyAdditionalInfo }
         *     
         */
        public Policies.Policy.PolicyAdditionalInfo getPolicyAdditionalInfo() {
            return policyAdditionalInfo;
        }

        /**
         * Sets the value of the policyAdditionalInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link Policies.Policy.PolicyAdditionalInfo }
         *     
         */
        public void setPolicyAdditionalInfo(Policies.Policy.PolicyAdditionalInfo value) {
            this.policyAdditionalInfo = value;
        }

        /**
         * Gets the value of the policyCredit property.
         * 
         * @return
         *     possible object is
         *     {@link Policies.Policy.PolicyCredit }
         *     
         */
        public Policies.Policy.PolicyCredit getPolicyCredit() {
            return policyCredit;
        }

        /**
         * Sets the value of the policyCredit property.
         * 
         * @param value
         *     allowed object is
         *     {@link Policies.Policy.PolicyCredit }
         *     
         */
        public void setPolicyCredit(Policies.Policy.PolicyCredit value) {
            this.policyCredit = value;
        }

        /**
         * Gets the value of the reducedUMCoverage property.
         * 
         * @return
         *     possible object is
         *     {@link Policies.Policy.ReducedUMCoverage }
         *     
         */
        public Policies.Policy.ReducedUMCoverage getReducedUMCoverage() {
            return reducedUMCoverage;
        }

        /**
         * Sets the value of the reducedUMCoverage property.
         * 
         * @param value
         *     allowed object is
         *     {@link Policies.Policy.ReducedUMCoverage }
         *     
         */
        public void setReducedUMCoverage(Policies.Policy.ReducedUMCoverage value) {
            this.reducedUMCoverage = value;
        }

        /**
         * Gets the value of the roadsideRDCCoverage property.
         * 
         * @return
         *     possible object is
         *     {@link Policies.Policy.RoadsideRDCCoverage }
         *     
         */
        public Policies.Policy.RoadsideRDCCoverage getRoadsideRDCCoverage() {
            return roadsideRDCCoverage;
        }

        /**
         * Sets the value of the roadsideRDCCoverage property.
         * 
         * @param value
         *     allowed object is
         *     {@link Policies.Policy.RoadsideRDCCoverage }
         *     
         */
        public void setRoadsideRDCCoverage(Policies.Policy.RoadsideRDCCoverage value) {
            this.roadsideRDCCoverage = value;
        }

        /**
         * Gets the value of the totalDisabilityBenefitsTDECoverage property.
         * 
         * @return
         *     possible object is
         *     {@link Policies.Policy.TotalDisabilityBenefitsTDECoverage }
         *     
         */
        public Policies.Policy.TotalDisabilityBenefitsTDECoverage getTotalDisabilityBenefitsTDECoverage() {
            return totalDisabilityBenefitsTDECoverage;
        }

        /**
         * Sets the value of the totalDisabilityBenefitsTDECoverage property.
         * 
         * @param value
         *     allowed object is
         *     {@link Policies.Policy.TotalDisabilityBenefitsTDECoverage }
         *     
         */
        public void setTotalDisabilityBenefitsTDECoverage(Policies.Policy.TotalDisabilityBenefitsTDECoverage value) {
            this.totalDisabilityBenefitsTDECoverage = value;
        }

        /**
         * Gets the value of the totalDisabilityBenefitsTDNCoverage property.
         * 
         * @return
         *     possible object is
         *     {@link Policies.Policy.TotalDisabilityBenefitsTDNCoverage }
         *     
         */
        public Policies.Policy.TotalDisabilityBenefitsTDNCoverage getTotalDisabilityBenefitsTDNCoverage() {
            return totalDisabilityBenefitsTDNCoverage;
        }

        /**
         * Sets the value of the totalDisabilityBenefitsTDNCoverage property.
         * 
         * @param value
         *     allowed object is
         *     {@link Policies.Policy.TotalDisabilityBenefitsTDNCoverage }
         *     
         */
        public void setTotalDisabilityBenefitsTDNCoverage(Policies.Policy.TotalDisabilityBenefitsTDNCoverage value) {
            this.totalDisabilityBenefitsTDNCoverage = value;
        }

        /**
         * Gets the value of the tripInterruptionEmergencyLivingTELCoverage property.
         * 
         * @return
         *     possible object is
         *     {@link Policies.Policy.TripInterruptionEmergencyLivingTELCoverage }
         *     
         */
        public Policies.Policy.TripInterruptionEmergencyLivingTELCoverage getTripInterruptionEmergencyLivingTELCoverage() {
            return tripInterruptionEmergencyLivingTELCoverage;
        }

        /**
         * Sets the value of the tripInterruptionEmergencyLivingTELCoverage property.
         * 
         * @param value
         *     allowed object is
         *     {@link Policies.Policy.TripInterruptionEmergencyLivingTELCoverage }
         *     
         */
        public void setTripInterruptionEmergencyLivingTELCoverage(Policies.Policy.TripInterruptionEmergencyLivingTELCoverage value) {
            this.tripInterruptionEmergencyLivingTELCoverage = value;
        }

        /**
         * Gets the value of the umcslCoverage property.
         * 
         * @return
         *     possible object is
         *     {@link Policies.Policy.UMCSLCoverage }
         *     
         */
        public Policies.Policy.UMCSLCoverage getUMCSLCoverage() {
            return umcslCoverage;
        }

        /**
         * Sets the value of the umcslCoverage property.
         * 
         * @param value
         *     allowed object is
         *     {@link Policies.Policy.UMCSLCoverage }
         *     
         */
        public void setUMCSLCoverage(Policies.Policy.UMCSLCoverage value) {
            this.umcslCoverage = value;
        }

        /**
         * Gets the value of the uninsuredMotoristsBICoverage property.
         * 
         * @return
         *     possible object is
         *     {@link Policies.Policy.UninsuredMotoristsBICoverage }
         *     
         */
        public Policies.Policy.UninsuredMotoristsBICoverage getUninsuredMotoristsBICoverage() {
            return uninsuredMotoristsBICoverage;
        }

        /**
         * Sets the value of the uninsuredMotoristsBICoverage property.
         * 
         * @param value
         *     allowed object is
         *     {@link Policies.Policy.UninsuredMotoristsBICoverage }
         *     
         */
        public void setUninsuredMotoristsBICoverage(Policies.Policy.UninsuredMotoristsBICoverage value) {
            this.uninsuredMotoristsBICoverage = value;
        }

        /**
         * Gets the value of the vehicle property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the vehicle property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getVehicle().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Policies.Policy.Vehicle }
         * 
         * 
         */
        public List<Policies.Policy.Vehicle> getVehicle() {
            if (vehicle == null) {
                vehicle = new ArrayList<Policies.Policy.Vehicle>();
            }
            return this.vehicle;
        }

        /**
         * Gets the value of the vehicleHomeAlterationVHACoverage property.
         * 
         * @return
         *     possible object is
         *     {@link Policies.Policy.VehicleHomeAlterationVHACoverage }
         *     
         */
        public Policies.Policy.VehicleHomeAlterationVHACoverage getVehicleHomeAlterationVHACoverage() {
            return vehicleHomeAlterationVHACoverage;
        }

        /**
         * Sets the value of the vehicleHomeAlterationVHACoverage property.
         * 
         * @param value
         *     allowed object is
         *     {@link Policies.Policy.VehicleHomeAlterationVHACoverage }
         *     
         */
        public void setVehicleHomeAlterationVHACoverage(Policies.Policy.VehicleHomeAlterationVHACoverage value) {
            this.vehicleHomeAlterationVHACoverage = value;
        }

        /**
         * Gets the value of the workLossWLC property.
         * 
         * @return
         *     possible object is
         *     {@link Policies.Policy.WorkLossWLC }
         *     
         */
        public Policies.Policy.WorkLossWLC getWorkLossWLC() {
            return workLossWLC;
        }

        /**
         * Sets the value of the workLossWLC property.
         * 
         * @param value
         *     allowed object is
         *     {@link Policies.Policy.WorkLossWLC }
         *     
         */
        public void setWorkLossWLC(Policies.Policy.WorkLossWLC value) {
            this.workLossWLC = value;
        }

        /**
         * Gets the value of the premiumEntry property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the premiumEntry property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPremiumEntry().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Policies.Policy.PremiumEntry }
         * 
         * 
         */
        public List<Policies.Policy.PremiumEntry> getPremiumEntry() {
            if (premiumEntry == null) {
                premiumEntry = new ArrayList<Policies.Policy.PremiumEntry>();
            }
            return this.premiumEntry;
        }

        /**
         * Gets the value of the chartisTier property.
         * 
         * @return
         *     possible object is
         *     {@link Policies.Policy.ChartisTier }
         *     
         */
        public Policies.Policy.ChartisTier getChartisTier() {
            return chartisTier;
        }

        /**
         * Sets the value of the chartisTier property.
         * 
         * @param value
         *     allowed object is
         *     {@link Policies.Policy.ChartisTier }
         *     
         */
        public void setChartisTier(Policies.Policy.ChartisTier value) {
            this.chartisTier = value;
        }

        /**
         * Gets the value of the cForm property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the cForm property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCForm().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Policies.Policy.CForm }
         * 
         * 
         */
        public List<Policies.Policy.CForm> getCForm() {
            if (cForm == null) {
                cForm = new ArrayList<Policies.Policy.CForm>();
            }
            return this.cForm;
        }

        /**
         * Gets the value of the driverVehicleRelationship property.
         * 
         * @return
         *     possible object is
         *     {@link Policies.Policy.DriverVehicleRelationship }
         *     
         */
        public Policies.Policy.DriverVehicleRelationship getDriverVehicleRelationship() {
            return driverVehicleRelationship;
        }

        /**
         * Sets the value of the driverVehicleRelationship property.
         * 
         * @param value
         *     allowed object is
         *     {@link Policies.Policy.DriverVehicleRelationship }
         *     
         */
        public void setDriverVehicleRelationship(Policies.Policy.DriverVehicleRelationship value) {
            this.driverVehicleRelationship = value;
        }

        /**
         * Gets the value of the state property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getState() {
            return state;
        }

        /**
         * Sets the value of the state property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setState(String value) {
            this.state = value;
        }

        public void setPremiumEntry(List<Policies.Policy.PremiumEntry> premiumEntry) {
            this.premiumEntry = premiumEntry;
        }

        public void setCForm(List<Policies.Policy.CForm> cForm) {
            this.cForm = cForm;
        }

        public void setVehicle(List<Policies.Policy.Vehicle> vehicle) {
            this.vehicle = vehicle;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="limitAmount" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *       &lt;/sequence>
         *       &lt;attribute name="state" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "limitAmount"
        })
        public static class AccidentBenefitACCDEATHCoverage {

            protected int limitAmount;
            @XmlAttribute(name = "state")
            protected String state;

            /**
             * Gets the value of the limitAmount property.
             * 
             */
            public int getLimitAmount() {
                return limitAmount;
            }

            /**
             * Sets the value of the limitAmount property.
             * 
             */
            public void setLimitAmount(int value) {
                this.limitAmount = value;
            }

            /**
             * Gets the value of the state property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getState() {
                return state;
            }

            /**
             * Sets the value of the state property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setState(String value) {
                this.state = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="extendedUMBI" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *       &lt;/sequence>
         *       &lt;attribute name="state" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "extendedUMBI"
        })
        public static class AdditionalPersonswithExtendedUMBIUAB {

            protected int extendedUMBI;
            @XmlAttribute(name = "state")
            protected String state;

            /**
             * Gets the value of the extendedUMBI property.
             * 
             */
            public int getExtendedUMBI() {
                return extendedUMBI;
            }

            /**
             * Sets the value of the extendedUMBI property.
             * 
             */
            public void setExtendedUMBI(int value) {
                this.extendedUMBI = value;
            }

            /**
             * Gets the value of the state property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getState() {
                return state;
            }

            /**
             * Sets the value of the state property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setState(String value) {
                this.state = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;attribute name="formCd" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class CForm {

            @XmlAttribute(name = "formCd")
            protected String formCd;

            /**
             * Gets the value of the formCd property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFormCd() {
                return formCd;
            }

            /**
             * Sets the value of the formCd property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFormCd(String value) {
                this.formCd = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="convPriorTier" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *         &lt;element name="systemGeneratedTier" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *         &lt;element name="tierOverrideInd" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "convPriorTier",
            "systemGeneratedTier",
            "tierOverrideInd"
        })
        public static class ChartisTier {

            protected int convPriorTier;
            protected int systemGeneratedTier;
            @XmlElement(required = true)
            protected String tierOverrideInd;

            /**
             * Gets the value of the convPriorTier property.
             * 
             */
            public int getConvPriorTier() {
                return convPriorTier;
            }

            /**
             * Sets the value of the convPriorTier property.
             * 
             */
            public void setConvPriorTier(int value) {
                this.convPriorTier = value;
            }

            /**
             * Gets the value of the systemGeneratedTier property.
             * 
             */
            public int getSystemGeneratedTier() {
                return systemGeneratedTier;
            }

            /**
             * Sets the value of the systemGeneratedTier property.
             * 
             */
            public void setSystemGeneratedTier(int value) {
                this.systemGeneratedTier = value;
            }

            /**
             * Gets the value of the tierOverrideInd property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTierOverrideInd() {
                return tierOverrideInd;
            }

            /**
             * Sets the value of the tierOverrideInd property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTierOverrideInd(String value) {
                this.tierOverrideInd = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="age" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *         &lt;element name="ageFirstLicensed" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *         &lt;element name="annualIncome" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *         &lt;element name="birthDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="convOldDriverNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *         &lt;element name="driverRelToApplicantCd" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="driverTypeCd" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="genderCd" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="licensePermitNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="licenseStatusCd" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="maritalStatusCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="stateProvCd" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="surchargeOverride" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="suspendedInd" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="DriverRatingInfo">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="alcCourseDisc" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="collGraduateSchAchDisc" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="defensiveDriver" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="distantStudentInd" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="driverTraining" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="employeegarage" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="matureDriverImpInd" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="militaryService" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="suspensionRevocationInd" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                 &lt;/sequence>
         *                 &lt;attribute name="state" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="DriverSR22Info">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="sr22FillingInd" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                 &lt;/sequence>
         *                 &lt;attribute name="state" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="ChartisExtInterfacesReport">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="reportReceivedDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="reportStage" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="reportType" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="sendingTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="statusMessage" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="success" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *       &lt;attribute name="oid" type="{http://www.w3.org/2001/XMLSchema}int" />
         *       &lt;attribute name="state" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "age",
            "ageFirstLicensed",
            "annualIncome",
            "birthDate",
            "convOldDriverNumber",
            "driverRelToApplicantCd",
            "driverTypeCd",
            "firstName",
            "genderCd",
            "lastName",
            "licensePermitNumber",
            "licenseStatusCd",
            "maritalStatusCode",
            "stateProvCd",
            "surchargeOverride",
            "suspendedInd",
            "driverRatingInfo",
            "driverSR22Info",
            "chartisExtInterfacesReport"
        })
        public static class Driver {

            protected int age;
            protected int ageFirstLicensed;
            protected int annualIncome;
            @XmlElement(required = true)
            protected String birthDate;
            protected int convOldDriverNumber;
            @XmlElement(required = true)
            protected String driverRelToApplicantCd;
            @XmlElement(required = true)
            protected String driverTypeCd;
            @XmlElement(required = true)
            protected String firstName;
            @XmlElement(required = true)
            protected String genderCd;
            @XmlElement(required = true)
            protected String lastName;
            @XmlElement(required = true)
            protected String licensePermitNumber;
            @XmlElement(required = true)
            protected String licenseStatusCd;
            @XmlElement(required = true)
            protected String maritalStatusCode;
            @XmlElement(required = true)
            protected String stateProvCd;
            @XmlElement(required = true)
            protected String surchargeOverride;
            @XmlElement(required = true)
            protected String suspendedInd;
            @XmlElement(name = "DriverRatingInfo", required = true)
            protected Policies.Policy.Driver.DriverRatingInfo driverRatingInfo;
            @XmlElement(name = "DriverSR22Info", required = true)
            protected Policies.Policy.Driver.DriverSR22Info driverSR22Info;
            @XmlElement(name = "ChartisExtInterfacesReport", required = true)
            protected Policies.Policy.Driver.ChartisExtInterfacesReport chartisExtInterfacesReport;
            @XmlAttribute(name = "oid")
            protected Integer oid;
            @XmlAttribute(name = "state")
            protected String state;

            /**
             * Gets the value of the age property.
             * 
             */
            public int getAge() {
                return age;
            }

            /**
             * Sets the value of the age property.
             * 
             */
            public void setAge(int value) {
                this.age = value;
            }

            /**
             * Gets the value of the ageFirstLicensed property.
             * 
             */
            public int getAgeFirstLicensed() {
                return ageFirstLicensed;
            }

            /**
             * Sets the value of the ageFirstLicensed property.
             * 
             */
            public void setAgeFirstLicensed(int value) {
                this.ageFirstLicensed = value;
            }

            /**
             * Gets the value of the annualIncome property.
             * 
             */
            public int getAnnualIncome() {
                return annualIncome;
            }

            /**
             * Sets the value of the annualIncome property.
             * 
             */
            public void setAnnualIncome(int value) {
                this.annualIncome = value;
            }

            /**
             * Gets the value of the birthDate property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBirthDate() {
                return birthDate;
            }

            /**
             * Sets the value of the birthDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBirthDate(String value) {
                this.birthDate = value;
            }

            /**
             * Gets the value of the convOldDriverNumber property.
             * 
             */
            public int getConvOldDriverNumber() {
                return convOldDriverNumber;
            }

            /**
             * Sets the value of the convOldDriverNumber property.
             * 
             */
            public void setConvOldDriverNumber(int value) {
                this.convOldDriverNumber = value;
            }

            /**
             * Gets the value of the driverRelToApplicantCd property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDriverRelToApplicantCd() {
                return driverRelToApplicantCd;
            }

            /**
             * Sets the value of the driverRelToApplicantCd property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDriverRelToApplicantCd(String value) {
                this.driverRelToApplicantCd = value;
            }

            /**
             * Gets the value of the driverTypeCd property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDriverTypeCd() {
                return driverTypeCd;
            }

            /**
             * Sets the value of the driverTypeCd property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDriverTypeCd(String value) {
                this.driverTypeCd = value;
            }

            /**
             * Gets the value of the firstName property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFirstName() {
                return firstName;
            }

            /**
             * Sets the value of the firstName property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFirstName(String value) {
                this.firstName = value;
            }

            /**
             * Gets the value of the genderCd property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getGenderCd() {
                return genderCd;
            }

            /**
             * Sets the value of the genderCd property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setGenderCd(String value) {
                this.genderCd = value;
            }

            /**
             * Gets the value of the lastName property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLastName() {
                return lastName;
            }

            /**
             * Sets the value of the lastName property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLastName(String value) {
                this.lastName = value;
            }

            /**
             * Gets the value of the licensePermitNumber property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLicensePermitNumber() {
                return licensePermitNumber;
            }

            /**
             * Sets the value of the licensePermitNumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLicensePermitNumber(String value) {
                this.licensePermitNumber = value;
            }

            /**
             * Gets the value of the licenseStatusCd property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLicenseStatusCd() {
                return licenseStatusCd;
            }

            /**
             * Sets the value of the licenseStatusCd property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLicenseStatusCd(String value) {
                this.licenseStatusCd = value;
            }

            /**
             * Gets the value of the maritalStatusCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMaritalStatusCode() {
                return maritalStatusCode;
            }

            /**
             * Sets the value of the maritalStatusCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMaritalStatusCode(String value) {
                this.maritalStatusCode = value;
            }

            /**
             * Gets the value of the stateProvCd property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getStateProvCd() {
                return stateProvCd;
            }

            /**
             * Sets the value of the stateProvCd property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setStateProvCd(String value) {
                this.stateProvCd = value;
            }

            /**
             * Gets the value of the surchargeOverride property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSurchargeOverride() {
                return surchargeOverride;
            }

            /**
             * Sets the value of the surchargeOverride property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSurchargeOverride(String value) {
                this.surchargeOverride = value;
            }

            /**
             * Gets the value of the suspendedInd property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSuspendedInd() {
                return suspendedInd;
            }

            /**
             * Sets the value of the suspendedInd property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSuspendedInd(String value) {
                this.suspendedInd = value;
            }

            /**
             * Gets the value of the driverRatingInfo property.
             * 
             * @return
             *     possible object is
             *     {@link Policies.Policy.Driver.DriverRatingInfo }
             *     
             */
            public Policies.Policy.Driver.DriverRatingInfo getDriverRatingInfo() {
                return driverRatingInfo;
            }

            /**
             * Sets the value of the driverRatingInfo property.
             * 
             * @param value
             *     allowed object is
             *     {@link Policies.Policy.Driver.DriverRatingInfo }
             *     
             */
            public void setDriverRatingInfo(Policies.Policy.Driver.DriverRatingInfo value) {
                this.driverRatingInfo = value;
            }

            /**
             * Gets the value of the driverSR22Info property.
             * 
             * @return
             *     possible object is
             *     {@link Policies.Policy.Driver.DriverSR22Info }
             *     
             */
            public Policies.Policy.Driver.DriverSR22Info getDriverSR22Info() {
                return driverSR22Info;
            }

            /**
             * Sets the value of the driverSR22Info property.
             * 
             * @param value
             *     allowed object is
             *     {@link Policies.Policy.Driver.DriverSR22Info }
             *     
             */
            public void setDriverSR22Info(Policies.Policy.Driver.DriverSR22Info value) {
                this.driverSR22Info = value;
            }

            /**
             * Gets the value of the chartisExtInterfacesReport property.
             * 
             * @return
             *     possible object is
             *     {@link Policies.Policy.Driver.ChartisExtInterfacesReport }
             *     
             */
            public Policies.Policy.Driver.ChartisExtInterfacesReport getChartisExtInterfacesReport() {
                return chartisExtInterfacesReport;
            }

            /**
             * Sets the value of the chartisExtInterfacesReport property.
             * 
             * @param value
             *     allowed object is
             *     {@link Policies.Policy.Driver.ChartisExtInterfacesReport }
             *     
             */
            public void setChartisExtInterfacesReport(Policies.Policy.Driver.ChartisExtInterfacesReport value) {
                this.chartisExtInterfacesReport = value;
            }

            /**
             * Gets the value of the oid property.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getOid() {
                return oid;
            }

            /**
             * Sets the value of the oid property.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setOid(Integer value) {
                this.oid = value;
            }

            /**
             * Gets the value of the state property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getState() {
                return state;
            }

            /**
             * Sets the value of the state property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setState(String value) {
                this.state = value;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="reportReceivedDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="reportStage" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="reportType" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="sendingTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="statusMessage" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="success" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "reportReceivedDate",
                "reportStage",
                "reportType",
                "sendingTime",
                "statusMessage",
                "success"
            })
            public static class ChartisExtInterfacesReport {

                @XmlElement(required = true)
                protected String reportReceivedDate;
                @XmlElement(required = true)
                protected String reportStage;
                @XmlElement(required = true)
                protected String reportType;
                @XmlElement(required = true)
                protected String sendingTime;
                @XmlElement(required = true)
                protected String statusMessage;
                @XmlElement(required = true)
                protected String success;

                /**
                 * Gets the value of the reportReceivedDate property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getReportReceivedDate() {
                    return reportReceivedDate;
                }

                /**
                 * Sets the value of the reportReceivedDate property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setReportReceivedDate(String value) {
                    this.reportReceivedDate = value;
                }

                /**
                 * Gets the value of the reportStage property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getReportStage() {
                    return reportStage;
                }

                /**
                 * Sets the value of the reportStage property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setReportStage(String value) {
                    this.reportStage = value;
                }

                /**
                 * Gets the value of the reportType property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getReportType() {
                    return reportType;
                }

                /**
                 * Sets the value of the reportType property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setReportType(String value) {
                    this.reportType = value;
                }

                /**
                 * Gets the value of the sendingTime property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSendingTime() {
                    return sendingTime;
                }

                /**
                 * Sets the value of the sendingTime property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSendingTime(String value) {
                    this.sendingTime = value;
                }

                /**
                 * Gets the value of the statusMessage property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getStatusMessage() {
                    return statusMessage;
                }

                /**
                 * Sets the value of the statusMessage property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setStatusMessage(String value) {
                    this.statusMessage = value;
                }

                /**
                 * Gets the value of the success property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSuccess() {
                    return success;
                }

                /**
                 * Sets the value of the success property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSuccess(String value) {
                    this.success = value;
                }

            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="alcCourseDisc" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="collGraduateSchAchDisc" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="defensiveDriver" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="distantStudentInd" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="driverTraining" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="employeegarage" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="matureDriverImpInd" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="militaryService" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="suspensionRevocationInd" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *       &lt;/sequence>
             *       &lt;attribute name="state" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "alcCourseDisc",
                "collGraduateSchAchDisc",
                "defensiveDriver",
                "distantStudentInd",
                "driverTraining",
                "employeegarage",
                "matureDriverImpInd",
                "militaryService",
                "suspensionRevocationInd"
            })
            public static class DriverRatingInfo {

                @XmlElement(required = true)
                protected String alcCourseDisc;
                @XmlElement(required = true)
                protected String collGraduateSchAchDisc;
                @XmlElement(required = true)
                protected String defensiveDriver;
                @XmlElement(required = true)
                protected String distantStudentInd;
                @XmlElement(required = true)
                protected String driverTraining;
                @XmlElement(required = true)
                protected String employeegarage;
                @XmlElement(required = true)
                protected String matureDriverImpInd;
                @XmlElement(required = true)
                protected String militaryService;
                @XmlElement(required = true)
                protected String suspensionRevocationInd;
                @XmlAttribute(name = "state")
                protected String state;

                /**
                 * Gets the value of the alcCourseDisc property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getAlcCourseDisc() {
                    return alcCourseDisc;
                }

                /**
                 * Sets the value of the alcCourseDisc property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setAlcCourseDisc(String value) {
                    this.alcCourseDisc = value;
                }

                /**
                 * Gets the value of the collGraduateSchAchDisc property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCollGraduateSchAchDisc() {
                    return collGraduateSchAchDisc;
                }

                /**
                 * Sets the value of the collGraduateSchAchDisc property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCollGraduateSchAchDisc(String value) {
                    this.collGraduateSchAchDisc = value;
                }

                /**
                 * Gets the value of the defensiveDriver property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDefensiveDriver() {
                    return defensiveDriver;
                }

                /**
                 * Sets the value of the defensiveDriver property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDefensiveDriver(String value) {
                    this.defensiveDriver = value;
                }

                /**
                 * Gets the value of the distantStudentInd property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDistantStudentInd() {
                    return distantStudentInd;
                }

                /**
                 * Sets the value of the distantStudentInd property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDistantStudentInd(String value) {
                    this.distantStudentInd = value;
                }

                /**
                 * Gets the value of the driverTraining property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDriverTraining() {
                    return driverTraining;
                }

                /**
                 * Sets the value of the driverTraining property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDriverTraining(String value) {
                    this.driverTraining = value;
                }

                /**
                 * Gets the value of the employeegarage property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getEmployeegarage() {
                    return employeegarage;
                }

                /**
                 * Sets the value of the employeegarage property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setEmployeegarage(String value) {
                    this.employeegarage = value;
                }

                /**
                 * Gets the value of the matureDriverImpInd property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getMatureDriverImpInd() {
                    return matureDriverImpInd;
                }

                /**
                 * Sets the value of the matureDriverImpInd property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setMatureDriverImpInd(String value) {
                    this.matureDriverImpInd = value;
                }

                /**
                 * Gets the value of the militaryService property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getMilitaryService() {
                    return militaryService;
                }

                /**
                 * Sets the value of the militaryService property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setMilitaryService(String value) {
                    this.militaryService = value;
                }

                /**
                 * Gets the value of the suspensionRevocationInd property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSuspensionRevocationInd() {
                    return suspensionRevocationInd;
                }

                /**
                 * Sets the value of the suspensionRevocationInd property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSuspensionRevocationInd(String value) {
                    this.suspensionRevocationInd = value;
                }

                /**
                 * Gets the value of the state property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getState() {
                    return state;
                }

                /**
                 * Sets the value of the state property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setState(String value) {
                    this.state = value;
                }

            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="sr22FillingInd" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *       &lt;/sequence>
             *       &lt;attribute name="state" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "sr22FillingInd"
            })
            public static class DriverSR22Info {

                @XmlElement(required = true)
                protected String sr22FillingInd;
                @XmlAttribute(name = "state")
                protected String state;

                /**
                 * Gets the value of the sr22FillingInd property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSr22FillingInd() {
                    return sr22FillingInd;
                }

                /**
                 * Sets the value of the sr22FillingInd property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSr22FillingInd(String value) {
                    this.sr22FillingInd = value;
                }

                /**
                 * Gets the value of the state property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getState() {
                    return state;
                }

                /**
                 * Sets the value of the state property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setState(String value) {
                    this.state = value;
                }

            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="driver">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="oid" type="{http://www.w3.org/2001/XMLSchema}int" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="relationshipType" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="seqNo" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *         &lt;element name="vehicle">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="oid" type="{http://www.w3.org/2001/XMLSchema}int" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "driver",
            "relationshipType",
            "seqNo",
            "vehicle"
        })
        public static class DriverVehicleRelationship {

            @XmlElement(required = true)
            protected Policies.Policy.DriverVehicleRelationship.Driver driver;
            @XmlElement(required = true)
            protected String relationshipType;
            protected int seqNo;
            @XmlElement(required = true)
            protected Policies.Policy.DriverVehicleRelationship.Vehicle vehicle;

            /**
             * Gets the value of the driver property.
             * 
             * @return
             *     possible object is
             *     {@link Policies.Policy.DriverVehicleRelationship.Driver }
             *     
             */
            public Policies.Policy.DriverVehicleRelationship.Driver getDriver() {
                return driver;
            }

            /**
             * Sets the value of the driver property.
             * 
             * @param value
             *     allowed object is
             *     {@link Policies.Policy.DriverVehicleRelationship.Driver }
             *     
             */
            public void setDriver(Policies.Policy.DriverVehicleRelationship.Driver value) {
                this.driver = value;
            }

            /**
             * Gets the value of the relationshipType property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRelationshipType() {
                return relationshipType;
            }

            /**
             * Sets the value of the relationshipType property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRelationshipType(String value) {
                this.relationshipType = value;
            }

            /**
             * Gets the value of the seqNo property.
             * 
             */
            public int getSeqNo() {
                return seqNo;
            }

            /**
             * Sets the value of the seqNo property.
             * 
             */
            public void setSeqNo(int value) {
                this.seqNo = value;
            }

            /**
             * Gets the value of the vehicle property.
             * 
             * @return
             *     possible object is
             *     {@link Policies.Policy.DriverVehicleRelationship.Vehicle }
             *     
             */
            public Policies.Policy.DriverVehicleRelationship.Vehicle getVehicle() {
                return vehicle;
            }

            /**
             * Sets the value of the vehicle property.
             * 
             * @param value
             *     allowed object is
             *     {@link Policies.Policy.DriverVehicleRelationship.Vehicle }
             *     
             */
            public void setVehicle(Policies.Policy.DriverVehicleRelationship.Vehicle value) {
                this.vehicle = value;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;attribute name="oid" type="{http://www.w3.org/2001/XMLSchema}int" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class Driver {

                @XmlAttribute(name = "oid")
                protected Integer oid;

                /**
                 * Gets the value of the oid property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Integer }
                 *     
                 */
                public Integer getOid() {
                    return oid;
                }

                /**
                 * Sets the value of the oid property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Integer }
                 *     
                 */
                public void setOid(Integer value) {
                    this.oid = value;
                }

            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;attribute name="oid" type="{http://www.w3.org/2001/XMLSchema}int" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class Vehicle {

                @XmlAttribute(name = "oid")
                protected Integer oid;

                /**
                 * Gets the value of the oid property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Integer }
                 *     
                 */
                public Integer getOid() {
                    return oid;
                }

                /**
                 * Sets the value of the oid property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Integer }
                 *     
                 */
                public void setOid(Integer value) {
                    this.oid = value;
                }

            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="applicable" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *       &lt;/sequence>
         *       &lt;attribute name="state" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "applicable"
        })
        public static class IncomeLossBenefitsLIBCoverage {

            @XmlElement(required = true)
            protected String applicable;
            @XmlAttribute(name = "state")
            protected String state;

            /**
             * Gets the value of the applicable property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getApplicable() {
                return applicable;
            }

            /**
             * Sets the value of the applicable property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setApplicable(String value) {
                this.applicable = value;
            }

            /**
             * Gets the value of the state property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getState() {
                return state;
            }

            /**
             * Sets the value of the state property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setState(String value) {
                this.state = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="education" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="highProfile" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="incidentBusinessThreshold" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="nameTypeCd" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="occupationClassCd" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *         &lt;element name="other" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="ownEntity" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *         &lt;element name="personalOrDomesticStaff" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="primaryInsured" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="purposeOfEntity" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="typeOfOccupation" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *         &lt;element name="PrimaryInsuredMailingAddress">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="address.addressLine1" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="address.city" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="address.countryCd" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="address.postalCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *                   &lt;element name="address.stateProvCd" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="updateBillingMailingInd" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                 &lt;/sequence>
         *                 &lt;attribute name="state" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *       &lt;attribute name="state" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "education",
            "firstName",
            "highProfile",
            "incidentBusinessThreshold",
            "lastName",
            "nameTypeCd",
            "occupationClassCd",
            "other",
            "ownEntity",
            "personalOrDomesticStaff",
            "primaryInsured",
            "purposeOfEntity",
            "typeOfOccupation",
            "primaryInsuredMailingAddress"
        })
        public static class Insured {

            @XmlElement(required = true)
            protected String education;
            @XmlElement(required = true)
            protected String firstName;
            @XmlElement(required = true)
            protected String highProfile;
            @XmlElement(required = true)
            protected String incidentBusinessThreshold;
            @XmlElement(required = true)
            protected String lastName;
            @XmlElement(required = true)
            protected String nameTypeCd;
            protected int occupationClassCd;
            @XmlElement(required = true)
            protected String other;
            protected int ownEntity;
            @XmlElement(required = true)
            protected String personalOrDomesticStaff;
            @XmlElement(required = true)
            protected String primaryInsured;
            @XmlElement(required = true)
            protected String purposeOfEntity;
            protected int typeOfOccupation;
            @XmlElement(name = "PrimaryInsuredMailingAddress", required = true)
            protected Policies.Policy.Insured.PrimaryInsuredMailingAddress primaryInsuredMailingAddress;
            @XmlAttribute(name = "state")
            protected String state;

            /**
             * Gets the value of the education property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEducation() {
                return education;
            }

            /**
             * Sets the value of the education property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setEducation(String value) {
                this.education = value;
            }

            /**
             * Gets the value of the firstName property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFirstName() {
                return firstName;
            }

            /**
             * Sets the value of the firstName property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFirstName(String value) {
                this.firstName = value;
            }

            /**
             * Gets the value of the highProfile property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getHighProfile() {
                return highProfile;
            }

            /**
             * Sets the value of the highProfile property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setHighProfile(String value) {
                this.highProfile = value;
            }

            /**
             * Gets the value of the incidentBusinessThreshold property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getIncidentBusinessThreshold() {
                return incidentBusinessThreshold;
            }

            /**
             * Sets the value of the incidentBusinessThreshold property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setIncidentBusinessThreshold(String value) {
                this.incidentBusinessThreshold = value;
            }

            /**
             * Gets the value of the lastName property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLastName() {
                return lastName;
            }

            /**
             * Sets the value of the lastName property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLastName(String value) {
                this.lastName = value;
            }

            /**
             * Gets the value of the nameTypeCd property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNameTypeCd() {
                return nameTypeCd;
            }

            /**
             * Sets the value of the nameTypeCd property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNameTypeCd(String value) {
                this.nameTypeCd = value;
            }

            /**
             * Gets the value of the occupationClassCd property.
             * 
             */
            public int getOccupationClassCd() {
                return occupationClassCd;
            }

            /**
             * Sets the value of the occupationClassCd property.
             * 
             */
            public void setOccupationClassCd(int value) {
                this.occupationClassCd = value;
            }

            /**
             * Gets the value of the other property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOther() {
                return other;
            }

            /**
             * Sets the value of the other property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOther(String value) {
                this.other = value;
            }

            /**
             * Gets the value of the ownEntity property.
             * 
             */
            public int getOwnEntity() {
                return ownEntity;
            }

            /**
             * Sets the value of the ownEntity property.
             * 
             */
            public void setOwnEntity(int value) {
                this.ownEntity = value;
            }

            /**
             * Gets the value of the personalOrDomesticStaff property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPersonalOrDomesticStaff() {
                return personalOrDomesticStaff;
            }

            /**
             * Sets the value of the personalOrDomesticStaff property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPersonalOrDomesticStaff(String value) {
                this.personalOrDomesticStaff = value;
            }

            /**
             * Gets the value of the primaryInsured property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPrimaryInsured() {
                return primaryInsured;
            }

            /**
             * Sets the value of the primaryInsured property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPrimaryInsured(String value) {
                this.primaryInsured = value;
            }

            /**
             * Gets the value of the purposeOfEntity property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPurposeOfEntity() {
                return purposeOfEntity;
            }

            /**
             * Sets the value of the purposeOfEntity property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPurposeOfEntity(String value) {
                this.purposeOfEntity = value;
            }

            /**
             * Gets the value of the typeOfOccupation property.
             * 
             */
            public int getTypeOfOccupation() {
                return typeOfOccupation;
            }

            /**
             * Sets the value of the typeOfOccupation property.
             * 
             */
            public void setTypeOfOccupation(int value) {
                this.typeOfOccupation = value;
            }

            /**
             * Gets the value of the primaryInsuredMailingAddress property.
             * 
             * @return
             *     possible object is
             *     {@link Policies.Policy.Insured.PrimaryInsuredMailingAddress }
             *     
             */
            public Policies.Policy.Insured.PrimaryInsuredMailingAddress getPrimaryInsuredMailingAddress() {
                return primaryInsuredMailingAddress;
            }

            /**
             * Sets the value of the primaryInsuredMailingAddress property.
             * 
             * @param value
             *     allowed object is
             *     {@link Policies.Policy.Insured.PrimaryInsuredMailingAddress }
             *     
             */
            public void setPrimaryInsuredMailingAddress(Policies.Policy.Insured.PrimaryInsuredMailingAddress value) {
                this.primaryInsuredMailingAddress = value;
            }

            /**
             * Gets the value of the state property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getState() {
                return state;
            }

            /**
             * Sets the value of the state property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setState(String value) {
                this.state = value;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="address.addressLine1" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="address.city" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="address.countryCd" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="address.postalCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
             *         &lt;element name="address.stateProvCd" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="updateBillingMailingInd" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *       &lt;/sequence>
             *       &lt;attribute name="state" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "addressAddressLine1",
                "addressCity",
                "addressCountryCd",
                "addressPostalCode",
                "addressStateProvCd",
                "updateBillingMailingInd"
            })
            public static class PrimaryInsuredMailingAddress {

                @XmlElement(name = "address.addressLine1", required = true)
                protected String addressAddressLine1;
                @XmlElement(name = "address.city", required = true)
                protected String addressCity;
                @XmlElement(name = "address.countryCd", required = true)
                protected String addressCountryCd;
                @XmlElement(name = "address.postalCode")
                protected int addressPostalCode;
                @XmlElement(name = "address.stateProvCd", required = true)
                protected String addressStateProvCd;
                @XmlElement(required = true)
                protected String updateBillingMailingInd;
                @XmlAttribute(name = "state")
                protected String state;

                /**
                 * Gets the value of the addressAddressLine1 property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getAddressAddressLine1() {
                    return addressAddressLine1;
                }

                /**
                 * Sets the value of the addressAddressLine1 property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setAddressAddressLine1(String value) {
                    this.addressAddressLine1 = value;
                }

                /**
                 * Gets the value of the addressCity property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getAddressCity() {
                    return addressCity;
                }

                /**
                 * Sets the value of the addressCity property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setAddressCity(String value) {
                    this.addressCity = value;
                }

                /**
                 * Gets the value of the addressCountryCd property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getAddressCountryCd() {
                    return addressCountryCd;
                }

                /**
                 * Sets the value of the addressCountryCd property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setAddressCountryCd(String value) {
                    this.addressCountryCd = value;
                }

                /**
                 * Gets the value of the addressPostalCode property.
                 * 
                 */
                public int getAddressPostalCode() {
                    return addressPostalCode;
                }

                /**
                 * Sets the value of the addressPostalCode property.
                 * 
                 */
                public void setAddressPostalCode(int value) {
                    this.addressPostalCode = value;
                }

                /**
                 * Gets the value of the addressStateProvCd property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getAddressStateProvCd() {
                    return addressStateProvCd;
                }

                /**
                 * Sets the value of the addressStateProvCd property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setAddressStateProvCd(String value) {
                    this.addressStateProvCd = value;
                }

                /**
                 * Gets the value of the updateBillingMailingInd property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getUpdateBillingMailingInd() {
                    return updateBillingMailingInd;
                }

                /**
                 * Sets the value of the updateBillingMailingInd property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setUpdateBillingMailingInd(String value) {
                    this.updateBillingMailingInd = value;
                }

                /**
                 * Gets the value of the state property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getState() {
                    return state;
                }

                /**
                 * Sets the value of the state property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setState(String value) {
                    this.state = value;
                }

            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="address.addressLine1" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="address.countryCd" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="address.postalCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *         &lt;element name="address.stateProvCd" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="city2" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="isDiaplayAddress" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *       &lt;/sequence>
         *       &lt;attribute name="state" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "addressAddressLine1",
            "addressCountryCd",
            "addressPostalCode",
            "addressStateProvCd",
            "city",
            "city2",
            "isDiaplayAddress"
        })
        public static class InsuredMailingAddress {

            @XmlElement(name = "address.addressLine1", required = true)
            protected String addressAddressLine1;
            @XmlElement(name = "address.countryCd", required = true)
            protected String addressCountryCd;
            @XmlElement(name = "address.postalCode")
            protected int addressPostalCode;
            @XmlElement(name = "address.stateProvCd", required = true)
            protected String addressStateProvCd;
            @XmlElement(required = true)
            protected String city;
            @XmlElement(required = true)
            protected String city2;
            @XmlElement(required = true)
            protected String isDiaplayAddress;
            @XmlAttribute(name = "state")
            protected String state;

            /**
             * Gets the value of the addressAddressLine1 property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAddressAddressLine1() {
                return addressAddressLine1;
            }

            /**
             * Sets the value of the addressAddressLine1 property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAddressAddressLine1(String value) {
                this.addressAddressLine1 = value;
            }

            /**
             * Gets the value of the addressCountryCd property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAddressCountryCd() {
                return addressCountryCd;
            }

            /**
             * Sets the value of the addressCountryCd property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAddressCountryCd(String value) {
                this.addressCountryCd = value;
            }

            /**
             * Gets the value of the addressPostalCode property.
             * 
             */
            public int getAddressPostalCode() {
                return addressPostalCode;
            }

            /**
             * Sets the value of the addressPostalCode property.
             * 
             */
            public void setAddressPostalCode(int value) {
                this.addressPostalCode = value;
            }

            /**
             * Gets the value of the addressStateProvCd property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAddressStateProvCd() {
                return addressStateProvCd;
            }

            /**
             * Sets the value of the addressStateProvCd property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAddressStateProvCd(String value) {
                this.addressStateProvCd = value;
            }

            /**
             * Gets the value of the city property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCity() {
                return city;
            }

            /**
             * Sets the value of the city property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCity(String value) {
                this.city = value;
            }

            /**
             * Gets the value of the city2 property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCity2() {
                return city2;
            }

            /**
             * Sets the value of the city2 property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCity2(String value) {
                this.city2 = value;
            }

            /**
             * Gets the value of the isDiaplayAddress property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getIsDiaplayAddress() {
                return isDiaplayAddress;
            }

            /**
             * Sets the value of the isDiaplayAddress property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setIsDiaplayAddress(String value) {
                this.isDiaplayAddress = value;
            }

            /**
             * Gets the value of the state property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getState() {
                return state;
            }

            /**
             * Sets the value of the state property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setState(String value) {
                this.state = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="limitAmount" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *       &lt;/sequence>
         *       &lt;attribute name="state" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "limitAmount"
        })
        public static class LiabilityLimitsCSLCoverage {

            protected int limitAmount;
            @XmlAttribute(name = "state")
            protected String state;

            /**
             * Gets the value of the limitAmount property.
             * 
             */
            public int getLimitAmount() {
                return limitAmount;
            }

            /**
             * Sets the value of the limitAmount property.
             * 
             */
            public void setLimitAmount(int value) {
                this.limitAmount = value;
            }

            /**
             * Gets the value of the state property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getState() {
                return state;
            }

            /**
             * Sets the value of the state property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setState(String value) {
                this.state = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="limitAmount" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *       &lt;/sequence>
         *       &lt;attribute name="state" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "limitAmount"
        })
        public static class MedicalPaymentsMEDCoverage {

            protected int limitAmount;
            @XmlAttribute(name = "state")
            protected String state;

            /**
             * Gets the value of the limitAmount property.
             * 
             */
            public int getLimitAmount() {
                return limitAmount;
            }

            /**
             * Sets the value of the limitAmount property.
             * 
             */
            public void setLimitAmount(int value) {
                this.limitAmount = value;
            }

            /**
             * Gets the value of the state property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getState() {
                return state;
            }

            /**
             * Sets the value of the state property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setState(String value) {
                this.state = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="aigLife" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *         &lt;element name="aigLifePolicyNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *         &lt;element name="pcgArticles" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="pcgExessLiab" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="pcgHome" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="premierArticles" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="premierExessLiab" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="premierHome" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *       &lt;/sequence>
         *       &lt;attribute name="state" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "aigLife",
            "aigLifePolicyNum",
            "pcgArticles",
            "pcgExessLiab",
            "pcgHome",
            "premierArticles",
            "premierExessLiab",
            "premierHome"
        })
        public static class OtherProduct {

            protected int aigLife;
            protected int aigLifePolicyNum;
            @XmlElement(required = true)
            protected String pcgArticles;
            @XmlElement(required = true)
            protected String pcgExessLiab;
            @XmlElement(required = true)
            protected String pcgHome;
            @XmlElement(required = true)
            protected String premierArticles;
            @XmlElement(required = true)
            protected String premierExessLiab;
            @XmlElement(required = true)
            protected String premierHome;
            @XmlAttribute(name = "state")
            protected String state;

            /**
             * Gets the value of the aigLife property.
             * 
             */
            public int getAigLife() {
                return aigLife;
            }

            /**
             * Sets the value of the aigLife property.
             * 
             */
            public void setAigLife(int value) {
                this.aigLife = value;
            }

            /**
             * Gets the value of the aigLifePolicyNum property.
             * 
             */
            public int getAigLifePolicyNum() {
                return aigLifePolicyNum;
            }

            /**
             * Sets the value of the aigLifePolicyNum property.
             * 
             */
            public void setAigLifePolicyNum(int value) {
                this.aigLifePolicyNum = value;
            }

            /**
             * Gets the value of the pcgArticles property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPcgArticles() {
                return pcgArticles;
            }

            /**
             * Sets the value of the pcgArticles property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPcgArticles(String value) {
                this.pcgArticles = value;
            }

            /**
             * Gets the value of the pcgExessLiab property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPcgExessLiab() {
                return pcgExessLiab;
            }

            /**
             * Sets the value of the pcgExessLiab property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPcgExessLiab(String value) {
                this.pcgExessLiab = value;
            }

            /**
             * Gets the value of the pcgHome property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPcgHome() {
                return pcgHome;
            }

            /**
             * Sets the value of the pcgHome property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPcgHome(String value) {
                this.pcgHome = value;
            }

            /**
             * Gets the value of the premierArticles property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPremierArticles() {
                return premierArticles;
            }

            /**
             * Sets the value of the premierArticles property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPremierArticles(String value) {
                this.premierArticles = value;
            }

            /**
             * Gets the value of the premierExessLiab property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPremierExessLiab() {
                return premierExessLiab;
            }

            /**
             * Sets the value of the premierExessLiab property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPremierExessLiab(String value) {
                this.premierExessLiab = value;
            }

            /**
             * Gets the value of the premierHome property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPremierHome() {
                return premierHome;
            }

            /**
             * Sets the value of the premierHome property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPremierHome(String value) {
                this.premierHome = value;
            }

            /**
             * Gets the value of the state property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getState() {
                return state;
            }

            /**
             * Sets the value of the state property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setState(String value) {
                this.state = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="applicable" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *       &lt;/sequence>
         *       &lt;attribute name="state" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "applicable"
        })
        public static class PersonalPropertyCPPCoverage {

            @XmlElement(required = true)
            protected String applicable;
            @XmlAttribute(name = "state")
            protected String state;

            /**
             * Gets the value of the applicable property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getApplicable() {
                return applicable;
            }

            /**
             * Sets the value of the applicable property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setApplicable(String value) {
                this.applicable = value;
            }

            /**
             * Gets the value of the state property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getState() {
                return state;
            }

            /**
             * Sets the value of the state property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setState(String value) {
                this.state = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="applicable" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *       &lt;/sequence>
         *       &lt;attribute name="state" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "applicable"
        })
        public static class PETCoverage {

            @XmlElement(required = true)
            protected String applicable;
            @XmlAttribute(name = "state")
            protected String state;

            /**
             * Gets the value of the applicable property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getApplicable() {
                return applicable;
            }

            /**
             * Sets the value of the applicable property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setApplicable(String value) {
                this.applicable = value;
            }

            /**
             * Gets the value of the state property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getState() {
                return state;
            }

            /**
             * Sets the value of the state property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setState(String value) {
                this.state = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="assignedRisk" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *         &lt;element name="bookTransferRemarket" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="cancelled" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="isPolReissueOrRewrite" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="otherCarrier" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="prioCarrierCd" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *         &lt;element name="priorCarrTenure" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *         &lt;element name="priorLiabLimit" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *       &lt;/sequence>
         *       &lt;attribute name="state" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "assignedRisk",
            "bookTransferRemarket",
            "cancelled",
            "isPolReissueOrRewrite",
            "otherCarrier",
            "prioCarrierCd",
            "priorCarrTenure",
            "priorLiabLimit"
        })
        public static class PolicyAdditionalInfo {

            protected int assignedRisk;
            @XmlElement(required = true)
            protected String bookTransferRemarket;
            @XmlElement(required = true)
            protected String cancelled;
            @XmlElement(required = true)
            protected String isPolReissueOrRewrite;
            @XmlElement(required = true)
            protected String otherCarrier;
            protected int prioCarrierCd;
            protected int priorCarrTenure;
            protected int priorLiabLimit;
            @XmlAttribute(name = "state")
            protected String state;

            /**
             * Gets the value of the assignedRisk property.
             * 
             */
            public int getAssignedRisk() {
                return assignedRisk;
            }

            /**
             * Sets the value of the assignedRisk property.
             * 
             */
            public void setAssignedRisk(int value) {
                this.assignedRisk = value;
            }

            /**
             * Gets the value of the bookTransferRemarket property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBookTransferRemarket() {
                return bookTransferRemarket;
            }

            /**
             * Sets the value of the bookTransferRemarket property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBookTransferRemarket(String value) {
                this.bookTransferRemarket = value;
            }

            /**
             * Gets the value of the cancelled property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCancelled() {
                return cancelled;
            }

            /**
             * Sets the value of the cancelled property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCancelled(String value) {
                this.cancelled = value;
            }

            /**
             * Gets the value of the isPolReissueOrRewrite property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getIsPolReissueOrRewrite() {
                return isPolReissueOrRewrite;
            }

            /**
             * Sets the value of the isPolReissueOrRewrite property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setIsPolReissueOrRewrite(String value) {
                this.isPolReissueOrRewrite = value;
            }

            /**
             * Gets the value of the otherCarrier property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOtherCarrier() {
                return otherCarrier;
            }

            /**
             * Sets the value of the otherCarrier property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOtherCarrier(String value) {
                this.otherCarrier = value;
            }

            /**
             * Gets the value of the prioCarrierCd property.
             * 
             */
            public int getPrioCarrierCd() {
                return prioCarrierCd;
            }

            /**
             * Sets the value of the prioCarrierCd property.
             * 
             */
            public void setPrioCarrierCd(int value) {
                this.prioCarrierCd = value;
            }

            /**
             * Gets the value of the priorCarrTenure property.
             * 
             */
            public int getPriorCarrTenure() {
                return priorCarrTenure;
            }

            /**
             * Sets the value of the priorCarrTenure property.
             * 
             */
            public void setPriorCarrTenure(int value) {
                this.priorCarrTenure = value;
            }

            /**
             * Gets the value of the priorLiabLimit property.
             * 
             */
            public int getPriorLiabLimit() {
                return priorLiabLimit;
            }

            /**
             * Sets the value of the priorLiabLimit property.
             * 
             */
            public void setPriorLiabLimit(int value) {
                this.priorLiabLimit = value;
            }

            /**
             * Gets the value of the state property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getState() {
                return state;
            }

            /**
             * Sets the value of the state property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setState(String value) {
                this.state = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="affinityCredit" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *         &lt;element name="armedForces" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="seasonaldiscount" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *       &lt;/sequence>
         *       &lt;attribute name="state" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "affinityCredit",
            "armedForces",
            "seasonaldiscount"
        })
        public static class PolicyCredit {

            protected int affinityCredit;
            @XmlElement(required = true)
            protected String armedForces;
            @XmlElement(required = true)
            protected String seasonaldiscount;
            @XmlAttribute(name = "state")
            protected String state;

            /**
             * Gets the value of the affinityCredit property.
             * 
             */
            public int getAffinityCredit() {
                return affinityCredit;
            }

            /**
             * Sets the value of the affinityCredit property.
             * 
             */
            public void setAffinityCredit(int value) {
                this.affinityCredit = value;
            }

            /**
             * Gets the value of the armedForces property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getArmedForces() {
                return armedForces;
            }

            /**
             * Sets the value of the armedForces property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setArmedForces(String value) {
                this.armedForces = value;
            }

            /**
             * Gets the value of the seasonaldiscount property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSeasonaldiscount() {
                return seasonaldiscount;
            }

            /**
             * Sets the value of the seasonaldiscount property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSeasonaldiscount(String value) {
                this.seasonaldiscount = value;
            }

            /**
             * Gets the value of the state property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getState() {
                return state;
            }

            /**
             * Sets the value of the state property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setState(String value) {
                this.state = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="actualAmt" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *         &lt;element name="changeAmt" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *         &lt;element name="periodAmt" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *         &lt;element name="premiumType" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *       &lt;/sequence>
         *       &lt;attribute name="premiumCd" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "actualAmt",
            "changeAmt",
            "periodAmt",
            "premiumType"
        })
        public static class PremiumEntry {

            protected int actualAmt;
            protected int changeAmt;
            protected int periodAmt;
            @XmlElement(required = true)
            protected String premiumType;
            @XmlAttribute(name = "premiumCd")
            protected String premiumCd;

            /**
             * Gets the value of the actualAmt property.
             * 
             */
            public int getActualAmt() {
                return actualAmt;
            }

            /**
             * Sets the value of the actualAmt property.
             * 
             */
            public void setActualAmt(int value) {
                this.actualAmt = value;
            }

            /**
             * Gets the value of the changeAmt property.
             * 
             */
            public int getChangeAmt() {
                return changeAmt;
            }

            /**
             * Sets the value of the changeAmt property.
             * 
             */
            public void setChangeAmt(int value) {
                this.changeAmt = value;
            }

            /**
             * Gets the value of the periodAmt property.
             * 
             */
            public int getPeriodAmt() {
                return periodAmt;
            }

            /**
             * Sets the value of the periodAmt property.
             * 
             */
            public void setPeriodAmt(int value) {
                this.periodAmt = value;
            }

            /**
             * Gets the value of the premiumType property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPremiumType() {
                return premiumType;
            }

            /**
             * Sets the value of the premiumType property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPremiumType(String value) {
                this.premiumType = value;
            }

            /**
             * Gets the value of the premiumCd property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPremiumCd() {
                return premiumCd;
            }

            /**
             * Sets the value of the premiumCd property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPremiumCd(String value) {
                this.premiumCd = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="reducedUm" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *       &lt;/sequence>
         *       &lt;attribute name="state" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "reducedUm"
        })
        public static class ReducedUMCoverage {

            @XmlElement(required = true)
            protected String reducedUm;
            @XmlAttribute(name = "state")
            protected String state;

            /**
             * Gets the value of the reducedUm property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getReducedUm() {
                return reducedUm;
            }

            /**
             * Sets the value of the reducedUm property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setReducedUm(String value) {
                this.reducedUm = value;
            }

            /**
             * Gets the value of the state property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getState() {
                return state;
            }

            /**
             * Sets the value of the state property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setState(String value) {
                this.state = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="applicable" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *       &lt;/sequence>
         *       &lt;attribute name="state" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "applicable"
        })
        public static class RoadsideRDCCoverage {

            @XmlElement(required = true)
            protected String applicable;
            @XmlAttribute(name = "state")
            protected String state;

            /**
             * Gets the value of the applicable property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getApplicable() {
                return applicable;
            }

            /**
             * Sets the value of the applicable property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setApplicable(String value) {
                this.applicable = value;
            }

            /**
             * Gets the value of the state property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getState() {
                return state;
            }

            /**
             * Sets the value of the state property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setState(String value) {
                this.state = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="applicable" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *       &lt;/sequence>
         *       &lt;attribute name="state" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "applicable"
        })
        public static class TotalDisabilityBenefitsTDECoverage {

            @XmlElement(required = true)
            protected String applicable;
            @XmlAttribute(name = "state")
            protected String state;

            /**
             * Gets the value of the applicable property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getApplicable() {
                return applicable;
            }

            /**
             * Sets the value of the applicable property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setApplicable(String value) {
                this.applicable = value;
            }

            /**
             * Gets the value of the state property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getState() {
                return state;
            }

            /**
             * Sets the value of the state property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setState(String value) {
                this.state = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="applicable" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *       &lt;/sequence>
         *       &lt;attribute name="state" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "applicable"
        })
        public static class TotalDisabilityBenefitsTDNCoverage {

            @XmlElement(required = true)
            protected String applicable;
            @XmlAttribute(name = "state")
            protected String state;

            /**
             * Gets the value of the applicable property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getApplicable() {
                return applicable;
            }

            /**
             * Sets the value of the applicable property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setApplicable(String value) {
                this.applicable = value;
            }

            /**
             * Gets the value of the state property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getState() {
                return state;
            }

            /**
             * Sets the value of the state property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setState(String value) {
                this.state = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="applicable" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *       &lt;/sequence>
         *       &lt;attribute name="state" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "applicable"
        })
        public static class TripInterruptionEmergencyLivingTELCoverage {

            @XmlElement(required = true)
            protected String applicable;
            @XmlAttribute(name = "state")
            protected String state;

            /**
             * Gets the value of the applicable property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getApplicable() {
                return applicable;
            }

            /**
             * Sets the value of the applicable property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setApplicable(String value) {
                this.applicable = value;
            }

            /**
             * Gets the value of the state property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getState() {
                return state;
            }

            /**
             * Sets the value of the state property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setState(String value) {
                this.state = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="limitAmount" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *         &lt;element name="umtype" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *       &lt;/sequence>
         *       &lt;attribute name="state" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "limitAmount",
            "umtype"
        })
        public static class UMCSLCoverage {

            protected int limitAmount;
            @XmlElement(required = true)
            protected String umtype;
            @XmlAttribute(name = "state")
            protected String state;

            /**
             * Gets the value of the limitAmount property.
             * 
             */
            public int getLimitAmount() {
                return limitAmount;
            }

            /**
             * Sets the value of the limitAmount property.
             * 
             */
            public void setLimitAmount(int value) {
                this.limitAmount = value;
            }

            /**
             * Gets the value of the umtype property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getUmtype() {
                return umtype;
            }

            /**
             * Sets the value of the umtype property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setUmtype(String value) {
                this.umtype = value;
            }

            /**
             * Gets the value of the state property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getState() {
                return state;
            }

            /**
             * Sets the value of the state property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setState(String value) {
                this.state = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="convertedCoverage" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *       &lt;/sequence>
         *       &lt;attribute name="state" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "convertedCoverage"
        })
        public static class UninsuredMotoristsBICoverage {

            @XmlElement(required = true)
            protected String convertedCoverage;
            @XmlAttribute(name = "state")
            protected String state;

            /**
             * Gets the value of the convertedCoverage property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getConvertedCoverage() {
                return convertedCoverage;
            }

            /**
             * Sets the value of the convertedCoverage property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setConvertedCoverage(String value) {
                this.convertedCoverage = value;
            }

            /**
             * Gets the value of the state property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getState() {
                return state;
            }

            /**
             * Sets the value of the state property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setState(String value) {
                this.state = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="abiCd" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *         &lt;element name="agreedValue" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *         &lt;element name="annualMilesOvrd" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="avrgAnnualMiles" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *         &lt;element name="classCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="convoldVehicleNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *         &lt;element name="ctyTaxMintAmt" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *         &lt;element name="ctyTaxPercAmt" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *         &lt;element name="engineSize" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *         &lt;element name="firstPotDamage" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="fullGlass" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="greyMarket" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="height" type="{http://www.w3.org/2001/XMLSchema}double"/>
         *         &lt;element name="isMedPayEffect" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="liability" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="manufacturer" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="marketValue" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *         &lt;element name="model" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="modelYear" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *         &lt;element name="ovrdFirstPotDamage" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="ovrdTitleTransNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="printIDcards" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="repAnnualMiles" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *         &lt;element name="titleTransNo" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *         &lt;element name="titleTransVerNo" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *         &lt;element name="vehBodyTypeCd" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="vehExtendedNonOwnerVeh" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="vehIdentificationNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="vehTypeCd" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="verAnnualMiles" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *         &lt;element name="verifiedFirstPotDamage" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="vinStyle" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *         &lt;element name="CashSettlementCoverage">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="cashSettlement" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                 &lt;/sequence>
         *                 &lt;attribute name="state" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="ChartisPAutoVehicleCredits">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="antiLockBrakeCd" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="applyMultiCarDiscountInd" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="autoBrake" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="blindSpotMonitor" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="dayLights" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="driverAlertSys" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="guardGatedCom" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="hybrid" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="hybridOrElectric" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="laneDepartMonitor" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="overrideMultiCarDiscountInd" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="passiveRestraints" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *                   &lt;element name="securityOptionsCd" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *                 &lt;/sequence>
         *                 &lt;attribute name="state" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="ChartisPAutoVehicleOwnership">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="additionalOwnersInd" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="addressLine1" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="country" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="financedInd" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="location" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="ownedInd" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="ownerType" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="regOwner" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *                   &lt;element name="regOwnerOther" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *                   &lt;element name="stateProvCd" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="zipCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *                 &lt;/sequence>
         *                 &lt;attribute name="state" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="GaragingAddress">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="addressLine1" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="city2" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="countryCd" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="garaged" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="garagedSecondary" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="garagingLocation" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="postalCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *                   &lt;element name="ratingTerritory" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *                   &lt;element name="regionCd" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *                   &lt;element name="stateProvCd" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="storedInMasonry" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                 &lt;/sequence>
         *                 &lt;attribute name="state" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="PAutoACCDEATHDomainCoverage">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="limitAmount" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *                   &lt;element name="PremiumEntry" maxOccurs="unbounded">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="actualAmt" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *                             &lt;element name="changeAmt" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *                             &lt;element name="periodAmt" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *                             &lt;element name="premiumType" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                           &lt;/sequence>
         *                           &lt;attribute name="premiumCd" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *                 &lt;attribute name="state" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="PAutoBIDomainCoverage">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="state" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="PAutoCOLLCoverage">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="deductibleAmount" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *                 &lt;/sequence>
         *                 &lt;attribute name="state" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="PAutoCOLLDomainCoverage">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="deductibleAmount" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *                   &lt;element name="PremiumEntry" maxOccurs="unbounded">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="actualAmt" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *                             &lt;element name="changeAmt" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *                             &lt;element name="periodAmt" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *                             &lt;element name="premiumType" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                           &lt;/sequence>
         *                           &lt;attribute name="premiumCd" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *                 &lt;attribute name="state" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="PAutoCOMPCoverage">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="deductibleAmount" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *                 &lt;/sequence>
         *                 &lt;attribute name="state" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="PAutoCOMPDomainCoverage">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="deductibleAmount" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *                   &lt;element name="PremiumEntry" maxOccurs="unbounded">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="actualAmt" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *                             &lt;element name="changeAmt" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *                             &lt;element name="periodAmt" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *                             &lt;element name="premiumType" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                           &lt;/sequence>
         *                           &lt;attribute name="premiumCd" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *                 &lt;attribute name="state" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="PAutoCPDomainCoverage">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="limitAmount" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *                 &lt;/sequence>
         *                 &lt;attribute name="state" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="PAutoCSLDomainCoverage">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="limitAmount" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *                   &lt;element name="PremiumEntry" maxOccurs="unbounded">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="actualAmt" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *                             &lt;element name="changeAmt" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *                             &lt;element name="periodAmt" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *                             &lt;element name="premiumType" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                           &lt;/sequence>
         *                           &lt;attribute name="premiumCd" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *                 &lt;attribute name="state" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="PAutoMEDDomainCoverage">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="limitAmount" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *                   &lt;element name="PremiumEntry" maxOccurs="unbounded">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="actualAmt" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *                             &lt;element name="changeAmt" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *                             &lt;element name="periodAmt" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *                             &lt;element name="premiumType" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                           &lt;/sequence>
         *                           &lt;attribute name="premiumCd" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *                 &lt;attribute name="state" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="PAutoMEDPLCoverage">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="state" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="PAutoPDDomainCoverage">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="state" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="PAutoUMBIDomainCoverage">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="state" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="PAutoUMCSLDomainCoverage">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="limitAmount" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *                   &lt;element name="PremiumEntry" maxOccurs="unbounded">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="actualAmt" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *                             &lt;element name="changeAmt" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *                             &lt;element name="periodAmt" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *                             &lt;element name="premiumType" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                           &lt;/sequence>
         *                           &lt;attribute name="premiumCd" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *                 &lt;attribute name="state" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="PAutoUMPDDomainCoverage">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="state" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="VehicleRatingInfo">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="collSymbol" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *                   &lt;element name="collSymbolRef" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *                   &lt;element name="compSymbol" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *                   &lt;element name="compSymbolRef" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *                   &lt;element name="distanceOneWay" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *                   &lt;element name="effectivedt" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="fromBlueBookInd" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="inspected" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="isVehRegularUse" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="liabilitySymbol" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *                   &lt;element name="numDaysDrivenPerWeek" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *                   &lt;element name="pipMedSymbol" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *                   &lt;element name="registrationStateCd" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="vehicleUsageCd" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                 &lt;/sequence>
         *                 &lt;attribute name="state" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="PremiumEntry" maxOccurs="unbounded">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="actualAmt" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *                   &lt;element name="changeAmt" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *                   &lt;element name="periodAmt" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *                   &lt;element name="premiumType" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                 &lt;/sequence>
         *                 &lt;attribute name="premiumCd" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="ChartisExtInterfacesReport">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="documentName" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="reportReceivedDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="reportStage" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="reportType" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="sendingTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="statusMessage" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="success" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *       &lt;attribute name="oid" type="{http://www.w3.org/2001/XMLSchema}int" />
         *       &lt;attribute name="state" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "abiCd",
            "agreedValue",
            "annualMilesOvrd",
            "avrgAnnualMiles",
            "classCode",
            "convoldVehicleNumber",
            "ctyTaxMintAmt",
            "ctyTaxPercAmt",
            "engineSize",
            "firstPotDamage",
            "fullGlass",
            "greyMarket",
            "height",
            "isMedPayEffect",
            "liability",
            "manufacturer",
            "marketValue",
            "model",
            "modelYear",
            "ovrdFirstPotDamage",
            "ovrdTitleTransNo",
            "printIDcards",
            "repAnnualMiles",
            "titleTransNo",
            "titleTransVerNo",
            "vehBodyTypeCd",
            "vehExtendedNonOwnerVeh",
            "vehIdentificationNo",
            "vehTypeCd",
            "verAnnualMiles",
            "verifiedFirstPotDamage",
            "vinStyle",
            "cashSettlementCoverage",
            "chartisPAutoVehicleCredits",
            "chartisPAutoVehicleOwnership",
            "garagingAddress",
            "pAutoACCDEATHDomainCoverage",
            "pAutoBIDomainCoverage",
            "pAutoCOLLCoverage",
            "pAutoCOLLDomainCoverage",
            "pAutoCOMPCoverage",
            "pAutoCOMPDomainCoverage",
            "pAutoCPDomainCoverage",
            "pAutoCSLDomainCoverage",
            "pAutoMEDDomainCoverage",
            "pAutoMEDPLCoverage",
            "pAutoPDDomainCoverage",
            "pAutoUMBIDomainCoverage",
            "pAutoUMCSLDomainCoverage",
            "pAutoUMPDDomainCoverage",
            "vehicleRatingInfo",
            "premiumEntry",
            "chartisExtInterfacesReport"
        })
        public static class Vehicle {

            protected int abiCd;
            protected int agreedValue;
            @XmlElement(required = true)
            protected String annualMilesOvrd;
            protected int avrgAnnualMiles;
            @XmlElement(required = true)
            protected String classCode;
            protected int convoldVehicleNumber;
            protected int ctyTaxMintAmt;
            protected int ctyTaxPercAmt;
            protected int engineSize;
            @XmlElement(required = true)
            protected String firstPotDamage;
            @XmlElement(required = true)
            protected String fullGlass;
            @XmlElement(required = true)
            protected String greyMarket;
            protected double height;
            @XmlElement(required = true)
            protected String isMedPayEffect;
            @XmlElement(required = true)
            protected String liability;
            @XmlElement(required = true)
            protected String manufacturer;
            protected int marketValue;
            @XmlElement(required = true)
            protected String model;
            protected int modelYear;
            @XmlElement(required = true)
            protected String ovrdFirstPotDamage;
            @XmlElement(required = true)
            protected String ovrdTitleTransNo;
            @XmlElement(required = true)
            protected String printIDcards;
            protected int repAnnualMiles;
            protected int titleTransNo;
            protected int titleTransVerNo;
            @XmlElement(required = true)
            protected String vehBodyTypeCd;
            @XmlElement(required = true)
            protected String vehExtendedNonOwnerVeh;
            @XmlElement(required = true)
            protected String vehIdentificationNo;
            @XmlElement(required = true)
            protected String vehTypeCd;
            protected int verAnnualMiles;
            @XmlElement(required = true)
            protected String verifiedFirstPotDamage;
            protected int vinStyle;
            @XmlElement(name = "CashSettlementCoverage", required = true)
            protected Policies.Policy.Vehicle.CashSettlementCoverage cashSettlementCoverage;
            @XmlElement(name = "ChartisPAutoVehicleCredits", required = true)
            protected Policies.Policy.Vehicle.ChartisPAutoVehicleCredits chartisPAutoVehicleCredits;
            @XmlElement(name = "ChartisPAutoVehicleOwnership", required = true)
            protected Policies.Policy.Vehicle.ChartisPAutoVehicleOwnership chartisPAutoVehicleOwnership;
            @XmlElement(name = "GaragingAddress", required = true)
            protected Policies.Policy.Vehicle.GaragingAddress garagingAddress;
            @XmlElement(name = "PAutoACCDEATHDomainCoverage", required = true)
            protected Policies.Policy.Vehicle.PAutoACCDEATHDomainCoverage pAutoACCDEATHDomainCoverage;
            @XmlElement(name = "PAutoBIDomainCoverage", required = true)
            protected Policies.Policy.Vehicle.PAutoBIDomainCoverage pAutoBIDomainCoverage;
            @XmlElement(name = "PAutoCOLLCoverage", required = true)
            protected Policies.Policy.Vehicle.PAutoCOLLCoverage pAutoCOLLCoverage;
            @XmlElement(name = "PAutoCOLLDomainCoverage", required = true)
            protected Policies.Policy.Vehicle.PAutoCOLLDomainCoverage pAutoCOLLDomainCoverage;
            @XmlElement(name = "PAutoCOMPCoverage", required = true)
            protected Policies.Policy.Vehicle.PAutoCOMPCoverage pAutoCOMPCoverage;
            @XmlElement(name = "PAutoCOMPDomainCoverage", required = true)
            protected Policies.Policy.Vehicle.PAutoCOMPDomainCoverage pAutoCOMPDomainCoverage;
            @XmlElement(name = "PAutoCPDomainCoverage", required = true)
            protected Policies.Policy.Vehicle.PAutoCPDomainCoverage pAutoCPDomainCoverage;
            @XmlElement(name = "PAutoCSLDomainCoverage", required = true)
            protected Policies.Policy.Vehicle.PAutoCSLDomainCoverage pAutoCSLDomainCoverage;
            @XmlElement(name = "PAutoMEDDomainCoverage", required = true)
            protected Policies.Policy.Vehicle.PAutoMEDDomainCoverage pAutoMEDDomainCoverage;
            @XmlElement(name = "PAutoMEDPLCoverage", required = true)
            protected Policies.Policy.Vehicle.PAutoMEDPLCoverage pAutoMEDPLCoverage;
            @XmlElement(name = "PAutoPDDomainCoverage", required = true)
            protected Policies.Policy.Vehicle.PAutoPDDomainCoverage pAutoPDDomainCoverage;
            @XmlElement(name = "PAutoUMBIDomainCoverage", required = true)
            protected Policies.Policy.Vehicle.PAutoUMBIDomainCoverage pAutoUMBIDomainCoverage;
            @XmlElement(name = "PAutoUMCSLDomainCoverage", required = true)
            protected Policies.Policy.Vehicle.PAutoUMCSLDomainCoverage pAutoUMCSLDomainCoverage;
            @XmlElement(name = "PAutoUMPDDomainCoverage", required = true)
            protected Policies.Policy.Vehicle.PAutoUMPDDomainCoverage pAutoUMPDDomainCoverage;
            @XmlElement(name = "VehicleRatingInfo", required = true)
            protected Policies.Policy.Vehicle.VehicleRatingInfo vehicleRatingInfo;
            @XmlElement(name = "PremiumEntry", required = true)
            protected List<Policies.Policy.Vehicle.PremiumEntry> premiumEntry;
            @XmlElement(name = "ChartisExtInterfacesReport", required = true)
            protected Policies.Policy.Vehicle.ChartisExtInterfacesReport chartisExtInterfacesReport;
            @XmlAttribute(name = "oid")
            protected Integer oid;
            @XmlAttribute(name = "state")
            protected String state;

            /**
             * Gets the value of the abiCd property.
             * 
             */
            public int getAbiCd() {
                return abiCd;
            }

            /**
             * Sets the value of the abiCd property.
             * 
             */
            public void setAbiCd(int value) {
                this.abiCd = value;
            }

            /**
             * Gets the value of the agreedValue property.
             * 
             */
            public int getAgreedValue() {
                return agreedValue;
            }

            /**
             * Sets the value of the agreedValue property.
             * 
             */
            public void setAgreedValue(int value) {
                this.agreedValue = value;
            }

            /**
             * Gets the value of the annualMilesOvrd property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAnnualMilesOvrd() {
                return annualMilesOvrd;
            }

            /**
             * Sets the value of the annualMilesOvrd property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAnnualMilesOvrd(String value) {
                this.annualMilesOvrd = value;
            }

            /**
             * Gets the value of the avrgAnnualMiles property.
             * 
             */
            public int getAvrgAnnualMiles() {
                return avrgAnnualMiles;
            }

            /**
             * Sets the value of the avrgAnnualMiles property.
             * 
             */
            public void setAvrgAnnualMiles(int value) {
                this.avrgAnnualMiles = value;
            }

            /**
             * Gets the value of the classCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getClassCode() {
                return classCode;
            }

            /**
             * Sets the value of the classCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setClassCode(String value) {
                this.classCode = value;
            }

            /**
             * Gets the value of the convoldVehicleNumber property.
             * 
             */
            public int getConvoldVehicleNumber() {
                return convoldVehicleNumber;
            }

            /**
             * Sets the value of the convoldVehicleNumber property.
             * 
             */
            public void setConvoldVehicleNumber(int value) {
                this.convoldVehicleNumber = value;
            }

            /**
             * Gets the value of the ctyTaxMintAmt property.
             * 
             */
            public int getCtyTaxMintAmt() {
                return ctyTaxMintAmt;
            }

            /**
             * Sets the value of the ctyTaxMintAmt property.
             * 
             */
            public void setCtyTaxMintAmt(int value) {
                this.ctyTaxMintAmt = value;
            }

            /**
             * Gets the value of the ctyTaxPercAmt property.
             * 
             */
            public int getCtyTaxPercAmt() {
                return ctyTaxPercAmt;
            }

            /**
             * Sets the value of the ctyTaxPercAmt property.
             * 
             */
            public void setCtyTaxPercAmt(int value) {
                this.ctyTaxPercAmt = value;
            }

            /**
             * Gets the value of the engineSize property.
             * 
             */
            public int getEngineSize() {
                return engineSize;
            }

            /**
             * Sets the value of the engineSize property.
             * 
             */
            public void setEngineSize(int value) {
                this.engineSize = value;
            }

            /**
             * Gets the value of the firstPotDamage property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFirstPotDamage() {
                return firstPotDamage;
            }

            /**
             * Sets the value of the firstPotDamage property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFirstPotDamage(String value) {
                this.firstPotDamage = value;
            }

            /**
             * Gets the value of the fullGlass property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFullGlass() {
                return fullGlass;
            }

            /**
             * Sets the value of the fullGlass property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFullGlass(String value) {
                this.fullGlass = value;
            }

            /**
             * Gets the value of the greyMarket property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getGreyMarket() {
                return greyMarket;
            }

            /**
             * Sets the value of the greyMarket property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setGreyMarket(String value) {
                this.greyMarket = value;
            }

            /**
             * Gets the value of the height property.
             * 
             */
            public double getHeight() {
                return height;
            }

            /**
             * Sets the value of the height property.
             * 
             */
            public void setHeight(double value) {
                this.height = value;
            }

            /**
             * Gets the value of the isMedPayEffect property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getIsMedPayEffect() {
                return isMedPayEffect;
            }

            /**
             * Sets the value of the isMedPayEffect property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setIsMedPayEffect(String value) {
                this.isMedPayEffect = value;
            }

            /**
             * Gets the value of the liability property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLiability() {
                return liability;
            }

            /**
             * Sets the value of the liability property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLiability(String value) {
                this.liability = value;
            }

            /**
             * Gets the value of the manufacturer property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getManufacturer() {
                return manufacturer;
            }

            /**
             * Sets the value of the manufacturer property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setManufacturer(String value) {
                this.manufacturer = value;
            }

            /**
             * Gets the value of the marketValue property.
             * 
             */
            public int getMarketValue() {
                return marketValue;
            }

            /**
             * Sets the value of the marketValue property.
             * 
             */
            public void setMarketValue(int value) {
                this.marketValue = value;
            }

            /**
             * Gets the value of the model property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getModel() {
                return model;
            }

            /**
             * Sets the value of the model property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setModel(String value) {
                this.model = value;
            }

            /**
             * Gets the value of the modelYear property.
             * 
             */
            public int getModelYear() {
                return modelYear;
            }

            /**
             * Sets the value of the modelYear property.
             * 
             */
            public void setModelYear(int value) {
                this.modelYear = value;
            }

            /**
             * Gets the value of the ovrdFirstPotDamage property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOvrdFirstPotDamage() {
                return ovrdFirstPotDamage;
            }

            /**
             * Sets the value of the ovrdFirstPotDamage property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOvrdFirstPotDamage(String value) {
                this.ovrdFirstPotDamage = value;
            }

            /**
             * Gets the value of the ovrdTitleTransNo property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOvrdTitleTransNo() {
                return ovrdTitleTransNo;
            }

            /**
             * Sets the value of the ovrdTitleTransNo property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOvrdTitleTransNo(String value) {
                this.ovrdTitleTransNo = value;
            }

            /**
             * Gets the value of the printIDcards property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPrintIDcards() {
                return printIDcards;
            }

            /**
             * Sets the value of the printIDcards property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPrintIDcards(String value) {
                this.printIDcards = value;
            }

            /**
             * Gets the value of the repAnnualMiles property.
             * 
             */
            public int getRepAnnualMiles() {
                return repAnnualMiles;
            }

            /**
             * Sets the value of the repAnnualMiles property.
             * 
             */
            public void setRepAnnualMiles(int value) {
                this.repAnnualMiles = value;
            }

            /**
             * Gets the value of the titleTransNo property.
             * 
             */
            public int getTitleTransNo() {
                return titleTransNo;
            }

            /**
             * Sets the value of the titleTransNo property.
             * 
             */
            public void setTitleTransNo(int value) {
                this.titleTransNo = value;
            }

            /**
             * Gets the value of the titleTransVerNo property.
             * 
             */
            public int getTitleTransVerNo() {
                return titleTransVerNo;
            }

            /**
             * Sets the value of the titleTransVerNo property.
             * 
             */
            public void setTitleTransVerNo(int value) {
                this.titleTransVerNo = value;
            }

            /**
             * Gets the value of the vehBodyTypeCd property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getVehBodyTypeCd() {
                return vehBodyTypeCd;
            }

            /**
             * Sets the value of the vehBodyTypeCd property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setVehBodyTypeCd(String value) {
                this.vehBodyTypeCd = value;
            }

            /**
             * Gets the value of the vehExtendedNonOwnerVeh property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getVehExtendedNonOwnerVeh() {
                return vehExtendedNonOwnerVeh;
            }

            /**
             * Sets the value of the vehExtendedNonOwnerVeh property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setVehExtendedNonOwnerVeh(String value) {
                this.vehExtendedNonOwnerVeh = value;
            }

            /**
             * Gets the value of the vehIdentificationNo property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getVehIdentificationNo() {
                return vehIdentificationNo;
            }

            /**
             * Sets the value of the vehIdentificationNo property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setVehIdentificationNo(String value) {
                this.vehIdentificationNo = value;
            }

            /**
             * Gets the value of the vehTypeCd property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getVehTypeCd() {
                return vehTypeCd;
            }

            /**
             * Sets the value of the vehTypeCd property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setVehTypeCd(String value) {
                this.vehTypeCd = value;
            }

            /**
             * Gets the value of the verAnnualMiles property.
             * 
             */
            public int getVerAnnualMiles() {
                return verAnnualMiles;
            }

            /**
             * Sets the value of the verAnnualMiles property.
             * 
             */
            public void setVerAnnualMiles(int value) {
                this.verAnnualMiles = value;
            }

            /**
             * Gets the value of the verifiedFirstPotDamage property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getVerifiedFirstPotDamage() {
                return verifiedFirstPotDamage;
            }

            /**
             * Sets the value of the verifiedFirstPotDamage property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setVerifiedFirstPotDamage(String value) {
                this.verifiedFirstPotDamage = value;
            }

            /**
             * Gets the value of the vinStyle property.
             * 
             */
            public int getVinStyle() {
                return vinStyle;
            }

            /**
             * Sets the value of the vinStyle property.
             * 
             */
            public void setVinStyle(int value) {
                this.vinStyle = value;
            }

            /**
             * Gets the value of the cashSettlementCoverage property.
             * 
             * @return
             *     possible object is
             *     {@link Policies.Policy.Vehicle.CashSettlementCoverage }
             *     
             */
            public Policies.Policy.Vehicle.CashSettlementCoverage getCashSettlementCoverage() {
                return cashSettlementCoverage;
            }

            /**
             * Sets the value of the cashSettlementCoverage property.
             * 
             * @param value
             *     allowed object is
             *     {@link Policies.Policy.Vehicle.CashSettlementCoverage }
             *     
             */
            public void setCashSettlementCoverage(Policies.Policy.Vehicle.CashSettlementCoverage value) {
                this.cashSettlementCoverage = value;
            }

            /**
             * Gets the value of the chartisPAutoVehicleCredits property.
             * 
             * @return
             *     possible object is
             *     {@link Policies.Policy.Vehicle.ChartisPAutoVehicleCredits }
             *     
             */
            public Policies.Policy.Vehicle.ChartisPAutoVehicleCredits getChartisPAutoVehicleCredits() {
                return chartisPAutoVehicleCredits;
            }

            /**
             * Sets the value of the chartisPAutoVehicleCredits property.
             * 
             * @param value
             *     allowed object is
             *     {@link Policies.Policy.Vehicle.ChartisPAutoVehicleCredits }
             *     
             */
            public void setChartisPAutoVehicleCredits(Policies.Policy.Vehicle.ChartisPAutoVehicleCredits value) {
                this.chartisPAutoVehicleCredits = value;
            }

            /**
             * Gets the value of the chartisPAutoVehicleOwnership property.
             * 
             * @return
             *     possible object is
             *     {@link Policies.Policy.Vehicle.ChartisPAutoVehicleOwnership }
             *     
             */
            public Policies.Policy.Vehicle.ChartisPAutoVehicleOwnership getChartisPAutoVehicleOwnership() {
                return chartisPAutoVehicleOwnership;
            }

            /**
             * Sets the value of the chartisPAutoVehicleOwnership property.
             * 
             * @param value
             *     allowed object is
             *     {@link Policies.Policy.Vehicle.ChartisPAutoVehicleOwnership }
             *     
             */
            public void setChartisPAutoVehicleOwnership(Policies.Policy.Vehicle.ChartisPAutoVehicleOwnership value) {
                this.chartisPAutoVehicleOwnership = value;
            }

            /**
             * Gets the value of the garagingAddress property.
             * 
             * @return
             *     possible object is
             *     {@link Policies.Policy.Vehicle.GaragingAddress }
             *     
             */
            public Policies.Policy.Vehicle.GaragingAddress getGaragingAddress() {
                return garagingAddress;
            }

            /**
             * Sets the value of the garagingAddress property.
             * 
             * @param value
             *     allowed object is
             *     {@link Policies.Policy.Vehicle.GaragingAddress }
             *     
             */
            public void setGaragingAddress(Policies.Policy.Vehicle.GaragingAddress value) {
                this.garagingAddress = value;
            }

            /**
             * Gets the value of the pAutoACCDEATHDomainCoverage property.
             * 
             * @return
             *     possible object is
             *     {@link Policies.Policy.Vehicle.PAutoACCDEATHDomainCoverage }
             *     
             */
            public Policies.Policy.Vehicle.PAutoACCDEATHDomainCoverage getPAutoACCDEATHDomainCoverage() {
                return pAutoACCDEATHDomainCoverage;
            }

            /**
             * Sets the value of the pAutoACCDEATHDomainCoverage property.
             * 
             * @param value
             *     allowed object is
             *     {@link Policies.Policy.Vehicle.PAutoACCDEATHDomainCoverage }
             *     
             */
            public void setPAutoACCDEATHDomainCoverage(Policies.Policy.Vehicle.PAutoACCDEATHDomainCoverage value) {
                this.pAutoACCDEATHDomainCoverage = value;
            }

            /**
             * Gets the value of the pAutoBIDomainCoverage property.
             * 
             * @return
             *     possible object is
             *     {@link Policies.Policy.Vehicle.PAutoBIDomainCoverage }
             *     
             */
            public Policies.Policy.Vehicle.PAutoBIDomainCoverage getPAutoBIDomainCoverage() {
                return pAutoBIDomainCoverage;
            }

            /**
             * Sets the value of the pAutoBIDomainCoverage property.
             * 
             * @param value
             *     allowed object is
             *     {@link Policies.Policy.Vehicle.PAutoBIDomainCoverage }
             *     
             */
            public void setPAutoBIDomainCoverage(Policies.Policy.Vehicle.PAutoBIDomainCoverage value) {
                this.pAutoBIDomainCoverage = value;
            }

            /**
             * Gets the value of the pAutoCOLLCoverage property.
             * 
             * @return
             *     possible object is
             *     {@link Policies.Policy.Vehicle.PAutoCOLLCoverage }
             *     
             */
            public Policies.Policy.Vehicle.PAutoCOLLCoverage getPAutoCOLLCoverage() {
                return pAutoCOLLCoverage;
            }

            /**
             * Sets the value of the pAutoCOLLCoverage property.
             * 
             * @param value
             *     allowed object is
             *     {@link Policies.Policy.Vehicle.PAutoCOLLCoverage }
             *     
             */
            public void setPAutoCOLLCoverage(Policies.Policy.Vehicle.PAutoCOLLCoverage value) {
                this.pAutoCOLLCoverage = value;
            }

            /**
             * Gets the value of the pAutoCOLLDomainCoverage property.
             * 
             * @return
             *     possible object is
             *     {@link Policies.Policy.Vehicle.PAutoCOLLDomainCoverage }
             *     
             */
            public Policies.Policy.Vehicle.PAutoCOLLDomainCoverage getPAutoCOLLDomainCoverage() {
                return pAutoCOLLDomainCoverage;
            }

            /**
             * Sets the value of the pAutoCOLLDomainCoverage property.
             * 
             * @param value
             *     allowed object is
             *     {@link Policies.Policy.Vehicle.PAutoCOLLDomainCoverage }
             *     
             */
            public void setPAutoCOLLDomainCoverage(Policies.Policy.Vehicle.PAutoCOLLDomainCoverage value) {
                this.pAutoCOLLDomainCoverage = value;
            }

            /**
             * Gets the value of the pAutoCOMPCoverage property.
             * 
             * @return
             *     possible object is
             *     {@link Policies.Policy.Vehicle.PAutoCOMPCoverage }
             *     
             */
            public Policies.Policy.Vehicle.PAutoCOMPCoverage getPAutoCOMPCoverage() {
                return pAutoCOMPCoverage;
            }

            /**
             * Sets the value of the pAutoCOMPCoverage property.
             * 
             * @param value
             *     allowed object is
             *     {@link Policies.Policy.Vehicle.PAutoCOMPCoverage }
             *     
             */
            public void setPAutoCOMPCoverage(Policies.Policy.Vehicle.PAutoCOMPCoverage value) {
                this.pAutoCOMPCoverage = value;
            }

            /**
             * Gets the value of the pAutoCOMPDomainCoverage property.
             * 
             * @return
             *     possible object is
             *     {@link Policies.Policy.Vehicle.PAutoCOMPDomainCoverage }
             *     
             */
            public Policies.Policy.Vehicle.PAutoCOMPDomainCoverage getPAutoCOMPDomainCoverage() {
                return pAutoCOMPDomainCoverage;
            }

            /**
             * Sets the value of the pAutoCOMPDomainCoverage property.
             * 
             * @param value
             *     allowed object is
             *     {@link Policies.Policy.Vehicle.PAutoCOMPDomainCoverage }
             *     
             */
            public void setPAutoCOMPDomainCoverage(Policies.Policy.Vehicle.PAutoCOMPDomainCoverage value) {
                this.pAutoCOMPDomainCoverage = value;
            }

            /**
             * Gets the value of the pAutoCPDomainCoverage property.
             * 
             * @return
             *     possible object is
             *     {@link Policies.Policy.Vehicle.PAutoCPDomainCoverage }
             *     
             */
            public Policies.Policy.Vehicle.PAutoCPDomainCoverage getPAutoCPDomainCoverage() {
                return pAutoCPDomainCoverage;
            }

            /**
             * Sets the value of the pAutoCPDomainCoverage property.
             * 
             * @param value
             *     allowed object is
             *     {@link Policies.Policy.Vehicle.PAutoCPDomainCoverage }
             *     
             */
            public void setPAutoCPDomainCoverage(Policies.Policy.Vehicle.PAutoCPDomainCoverage value) {
                this.pAutoCPDomainCoverage = value;
            }

            /**
             * Gets the value of the pAutoCSLDomainCoverage property.
             * 
             * @return
             *     possible object is
             *     {@link Policies.Policy.Vehicle.PAutoCSLDomainCoverage }
             *     
             */
            public Policies.Policy.Vehicle.PAutoCSLDomainCoverage getPAutoCSLDomainCoverage() {
                return pAutoCSLDomainCoverage;
            }

            /**
             * Sets the value of the pAutoCSLDomainCoverage property.
             * 
             * @param value
             *     allowed object is
             *     {@link Policies.Policy.Vehicle.PAutoCSLDomainCoverage }
             *     
             */
            public void setPAutoCSLDomainCoverage(Policies.Policy.Vehicle.PAutoCSLDomainCoverage value) {
                this.pAutoCSLDomainCoverage = value;
            }

            /**
             * Gets the value of the pAutoMEDDomainCoverage property.
             * 
             * @return
             *     possible object is
             *     {@link Policies.Policy.Vehicle.PAutoMEDDomainCoverage }
             *     
             */
            public Policies.Policy.Vehicle.PAutoMEDDomainCoverage getPAutoMEDDomainCoverage() {
                return pAutoMEDDomainCoverage;
            }

            /**
             * Sets the value of the pAutoMEDDomainCoverage property.
             * 
             * @param value
             *     allowed object is
             *     {@link Policies.Policy.Vehicle.PAutoMEDDomainCoverage }
             *     
             */
            public void setPAutoMEDDomainCoverage(Policies.Policy.Vehicle.PAutoMEDDomainCoverage value) {
                this.pAutoMEDDomainCoverage = value;
            }

            /**
             * Gets the value of the pAutoMEDPLCoverage property.
             * 
             * @return
             *     possible object is
             *     {@link Policies.Policy.Vehicle.PAutoMEDPLCoverage }
             *     
             */
            public Policies.Policy.Vehicle.PAutoMEDPLCoverage getPAutoMEDPLCoverage() {
                return pAutoMEDPLCoverage;
            }

            /**
             * Sets the value of the pAutoMEDPLCoverage property.
             * 
             * @param value
             *     allowed object is
             *     {@link Policies.Policy.Vehicle.PAutoMEDPLCoverage }
             *     
             */
            public void setPAutoMEDPLCoverage(Policies.Policy.Vehicle.PAutoMEDPLCoverage value) {
                this.pAutoMEDPLCoverage = value;
            }

            /**
             * Gets the value of the pAutoPDDomainCoverage property.
             * 
             * @return
             *     possible object is
             *     {@link Policies.Policy.Vehicle.PAutoPDDomainCoverage }
             *     
             */
            public Policies.Policy.Vehicle.PAutoPDDomainCoverage getPAutoPDDomainCoverage() {
                return pAutoPDDomainCoverage;
            }

            /**
             * Sets the value of the pAutoPDDomainCoverage property.
             * 
             * @param value
             *     allowed object is
             *     {@link Policies.Policy.Vehicle.PAutoPDDomainCoverage }
             *     
             */
            public void setPAutoPDDomainCoverage(Policies.Policy.Vehicle.PAutoPDDomainCoverage value) {
                this.pAutoPDDomainCoverage = value;
            }

            /**
             * Gets the value of the pAutoUMBIDomainCoverage property.
             * 
             * @return
             *     possible object is
             *     {@link Policies.Policy.Vehicle.PAutoUMBIDomainCoverage }
             *     
             */
            public Policies.Policy.Vehicle.PAutoUMBIDomainCoverage getPAutoUMBIDomainCoverage() {
                return pAutoUMBIDomainCoverage;
            }

            /**
             * Sets the value of the pAutoUMBIDomainCoverage property.
             * 
             * @param value
             *     allowed object is
             *     {@link Policies.Policy.Vehicle.PAutoUMBIDomainCoverage }
             *     
             */
            public void setPAutoUMBIDomainCoverage(Policies.Policy.Vehicle.PAutoUMBIDomainCoverage value) {
                this.pAutoUMBIDomainCoverage = value;
            }

            /**
             * Gets the value of the pAutoUMCSLDomainCoverage property.
             * 
             * @return
             *     possible object is
             *     {@link Policies.Policy.Vehicle.PAutoUMCSLDomainCoverage }
             *     
             */
            public Policies.Policy.Vehicle.PAutoUMCSLDomainCoverage getPAutoUMCSLDomainCoverage() {
                return pAutoUMCSLDomainCoverage;
            }

            /**
             * Sets the value of the pAutoUMCSLDomainCoverage property.
             * 
             * @param value
             *     allowed object is
             *     {@link Policies.Policy.Vehicle.PAutoUMCSLDomainCoverage }
             *     
             */
            public void setPAutoUMCSLDomainCoverage(Policies.Policy.Vehicle.PAutoUMCSLDomainCoverage value) {
                this.pAutoUMCSLDomainCoverage = value;
            }

            /**
             * Gets the value of the pAutoUMPDDomainCoverage property.
             * 
             * @return
             *     possible object is
             *     {@link Policies.Policy.Vehicle.PAutoUMPDDomainCoverage }
             *     
             */
            public Policies.Policy.Vehicle.PAutoUMPDDomainCoverage getPAutoUMPDDomainCoverage() {
                return pAutoUMPDDomainCoverage;
            }

            /**
             * Sets the value of the pAutoUMPDDomainCoverage property.
             * 
             * @param value
             *     allowed object is
             *     {@link Policies.Policy.Vehicle.PAutoUMPDDomainCoverage }
             *     
             */
            public void setPAutoUMPDDomainCoverage(Policies.Policy.Vehicle.PAutoUMPDDomainCoverage value) {
                this.pAutoUMPDDomainCoverage = value;
            }

            /**
             * Gets the value of the vehicleRatingInfo property.
             * 
             * @return
             *     possible object is
             *     {@link Policies.Policy.Vehicle.VehicleRatingInfo }
             *     
             */
            public Policies.Policy.Vehicle.VehicleRatingInfo getVehicleRatingInfo() {
                return vehicleRatingInfo;
            }

            /**
             * Sets the value of the vehicleRatingInfo property.
             * 
             * @param value
             *     allowed object is
             *     {@link Policies.Policy.Vehicle.VehicleRatingInfo }
             *     
             */
            public void setVehicleRatingInfo(Policies.Policy.Vehicle.VehicleRatingInfo value) {
                this.vehicleRatingInfo = value;
            }

            /**
             * Gets the value of the premiumEntry property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the premiumEntry property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getPremiumEntry().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Policies.Policy.Vehicle.PremiumEntry }
             * 
             * 
             */
            public List<Policies.Policy.Vehicle.PremiumEntry> getPremiumEntry() {
                if (premiumEntry == null) {
                    premiumEntry = new ArrayList<Policies.Policy.Vehicle.PremiumEntry>();
                }
                return this.premiumEntry;
            }

            /**
             * Gets the value of the chartisExtInterfacesReport property.
             * 
             * @return
             *     possible object is
             *     {@link Policies.Policy.Vehicle.ChartisExtInterfacesReport }
             *     
             */
            public Policies.Policy.Vehicle.ChartisExtInterfacesReport getChartisExtInterfacesReport() {
                return chartisExtInterfacesReport;
            }

            /**
             * Sets the value of the chartisExtInterfacesReport property.
             * 
             * @param value
             *     allowed object is
             *     {@link Policies.Policy.Vehicle.ChartisExtInterfacesReport }
             *     
             */
            public void setChartisExtInterfacesReport(Policies.Policy.Vehicle.ChartisExtInterfacesReport value) {
                this.chartisExtInterfacesReport = value;
            }

            /**
             * Gets the value of the oid property.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getOid() {
                return oid;
            }

            /**
             * Sets the value of the oid property.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setOid(Integer value) {
                this.oid = value;
            }

            /**
             * Gets the value of the state property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getState() {
                return state;
            }

            /**
             * Sets the value of the state property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setState(String value) {
                this.state = value;
            }

            public void setPremiumEntry(List<Policies.Policy.Vehicle.PremiumEntry> premiumEntry) {
                this.premiumEntry = premiumEntry;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="cashSettlement" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *       &lt;/sequence>
             *       &lt;attribute name="state" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "cashSettlement"
            })
            public static class CashSettlementCoverage {

                @XmlElement(required = true)
                protected String cashSettlement;
                @XmlAttribute(name = "state")
                protected String state;

                /**
                 * Gets the value of the cashSettlement property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCashSettlement() {
                    return cashSettlement;
                }

                /**
                 * Sets the value of the cashSettlement property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCashSettlement(String value) {
                    this.cashSettlement = value;
                }

                /**
                 * Gets the value of the state property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getState() {
                    return state;
                }

                /**
                 * Sets the value of the state property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setState(String value) {
                    this.state = value;
                }

            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="documentName" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="reportReceivedDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="reportStage" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="reportType" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="sendingTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="statusMessage" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="success" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "documentName",
                "reportReceivedDate",
                "reportStage",
                "reportType",
                "sendingTime",
                "statusMessage",
                "success"
            })
            public static class ChartisExtInterfacesReport {

                @XmlElement(required = true)
                protected String documentName;
                @XmlElement(required = true)
                protected String reportReceivedDate;
                @XmlElement(required = true)
                protected String reportStage;
                @XmlElement(required = true)
                protected String reportType;
                @XmlElement(required = true)
                protected String sendingTime;
                @XmlElement(required = true)
                protected String statusMessage;
                @XmlElement(required = true)
                protected String success;

                /**
                 * Gets the value of the documentName property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDocumentName() {
                    return documentName;
                }

                /**
                 * Sets the value of the documentName property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDocumentName(String value) {
                    this.documentName = value;
                }

                /**
                 * Gets the value of the reportReceivedDate property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getReportReceivedDate() {
                    return reportReceivedDate;
                }

                /**
                 * Sets the value of the reportReceivedDate property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setReportReceivedDate(String value) {
                    this.reportReceivedDate = value;
                }

                /**
                 * Gets the value of the reportStage property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getReportStage() {
                    return reportStage;
                }

                /**
                 * Sets the value of the reportStage property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setReportStage(String value) {
                    this.reportStage = value;
                }

                /**
                 * Gets the value of the reportType property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getReportType() {
                    return reportType;
                }

                /**
                 * Sets the value of the reportType property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setReportType(String value) {
                    this.reportType = value;
                }

                /**
                 * Gets the value of the sendingTime property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSendingTime() {
                    return sendingTime;
                }

                /**
                 * Sets the value of the sendingTime property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSendingTime(String value) {
                    this.sendingTime = value;
                }

                /**
                 * Gets the value of the statusMessage property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getStatusMessage() {
                    return statusMessage;
                }

                /**
                 * Sets the value of the statusMessage property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setStatusMessage(String value) {
                    this.statusMessage = value;
                }

                /**
                 * Gets the value of the success property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSuccess() {
                    return success;
                }

                /**
                 * Sets the value of the success property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSuccess(String value) {
                    this.success = value;
                }

            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="antiLockBrakeCd" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="applyMultiCarDiscountInd" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="autoBrake" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="blindSpotMonitor" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="dayLights" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="driverAlertSys" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="guardGatedCom" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="hybrid" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="hybridOrElectric" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="laneDepartMonitor" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="overrideMultiCarDiscountInd" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="passiveRestraints" type="{http://www.w3.org/2001/XMLSchema}int"/>
             *         &lt;element name="securityOptionsCd" type="{http://www.w3.org/2001/XMLSchema}int"/>
             *       &lt;/sequence>
             *       &lt;attribute name="state" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "antiLockBrakeCd",
                "applyMultiCarDiscountInd",
                "autoBrake",
                "blindSpotMonitor",
                "dayLights",
                "driverAlertSys",
                "guardGatedCom",
                "hybrid",
                "hybridOrElectric",
                "laneDepartMonitor",
                "overrideMultiCarDiscountInd",
                "passiveRestraints",
                "securityOptionsCd"
            })
            public static class ChartisPAutoVehicleCredits {

                @XmlElement(required = true)
                protected String antiLockBrakeCd;
                @XmlElement(required = true)
                protected String applyMultiCarDiscountInd;
                @XmlElement(required = true)
                protected String autoBrake;
                @XmlElement(required = true)
                protected String blindSpotMonitor;
                @XmlElement(required = true)
                protected String dayLights;
                @XmlElement(required = true)
                protected String driverAlertSys;
                @XmlElement(required = true)
                protected String guardGatedCom;
                @XmlElement(required = true)
                protected String hybrid;
                @XmlElement(required = true)
                protected String hybridOrElectric;
                @XmlElement(required = true)
                protected String laneDepartMonitor;
                @XmlElement(required = true)
                protected String overrideMultiCarDiscountInd;
                protected int passiveRestraints;
                protected int securityOptionsCd;
                @XmlAttribute(name = "state")
                protected String state;

                /**
                 * Gets the value of the antiLockBrakeCd property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getAntiLockBrakeCd() {
                    return antiLockBrakeCd;
                }

                /**
                 * Sets the value of the antiLockBrakeCd property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setAntiLockBrakeCd(String value) {
                    this.antiLockBrakeCd = value;
                }

                /**
                 * Gets the value of the applyMultiCarDiscountInd property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getApplyMultiCarDiscountInd() {
                    return applyMultiCarDiscountInd;
                }

                /**
                 * Sets the value of the applyMultiCarDiscountInd property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setApplyMultiCarDiscountInd(String value) {
                    this.applyMultiCarDiscountInd = value;
                }

                /**
                 * Gets the value of the autoBrake property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getAutoBrake() {
                    return autoBrake;
                }

                /**
                 * Sets the value of the autoBrake property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setAutoBrake(String value) {
                    this.autoBrake = value;
                }

                /**
                 * Gets the value of the blindSpotMonitor property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getBlindSpotMonitor() {
                    return blindSpotMonitor;
                }

                /**
                 * Sets the value of the blindSpotMonitor property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setBlindSpotMonitor(String value) {
                    this.blindSpotMonitor = value;
                }

                /**
                 * Gets the value of the dayLights property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDayLights() {
                    return dayLights;
                }

                /**
                 * Sets the value of the dayLights property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDayLights(String value) {
                    this.dayLights = value;
                }

                /**
                 * Gets the value of the driverAlertSys property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDriverAlertSys() {
                    return driverAlertSys;
                }

                /**
                 * Sets the value of the driverAlertSys property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDriverAlertSys(String value) {
                    this.driverAlertSys = value;
                }

                /**
                 * Gets the value of the guardGatedCom property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getGuardGatedCom() {
                    return guardGatedCom;
                }

                /**
                 * Sets the value of the guardGatedCom property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setGuardGatedCom(String value) {
                    this.guardGatedCom = value;
                }

                /**
                 * Gets the value of the hybrid property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getHybrid() {
                    return hybrid;
                }

                /**
                 * Sets the value of the hybrid property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setHybrid(String value) {
                    this.hybrid = value;
                }

                /**
                 * Gets the value of the hybridOrElectric property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getHybridOrElectric() {
                    return hybridOrElectric;
                }

                /**
                 * Sets the value of the hybridOrElectric property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setHybridOrElectric(String value) {
                    this.hybridOrElectric = value;
                }

                /**
                 * Gets the value of the laneDepartMonitor property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getLaneDepartMonitor() {
                    return laneDepartMonitor;
                }

                /**
                 * Sets the value of the laneDepartMonitor property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setLaneDepartMonitor(String value) {
                    this.laneDepartMonitor = value;
                }

                /**
                 * Gets the value of the overrideMultiCarDiscountInd property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getOverrideMultiCarDiscountInd() {
                    return overrideMultiCarDiscountInd;
                }

                /**
                 * Sets the value of the overrideMultiCarDiscountInd property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setOverrideMultiCarDiscountInd(String value) {
                    this.overrideMultiCarDiscountInd = value;
                }

                /**
                 * Gets the value of the passiveRestraints property.
                 * 
                 */
                public int getPassiveRestraints() {
                    return passiveRestraints;
                }

                /**
                 * Sets the value of the passiveRestraints property.
                 * 
                 */
                public void setPassiveRestraints(int value) {
                    this.passiveRestraints = value;
                }

                /**
                 * Gets the value of the securityOptionsCd property.
                 * 
                 */
                public int getSecurityOptionsCd() {
                    return securityOptionsCd;
                }

                /**
                 * Sets the value of the securityOptionsCd property.
                 * 
                 */
                public void setSecurityOptionsCd(int value) {
                    this.securityOptionsCd = value;
                }

                /**
                 * Gets the value of the state property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getState() {
                    return state;
                }

                /**
                 * Sets the value of the state property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setState(String value) {
                    this.state = value;
                }

            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="additionalOwnersInd" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="addressLine1" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="country" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="financedInd" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="location" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="ownedInd" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="ownerType" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="regOwner" type="{http://www.w3.org/2001/XMLSchema}int"/>
             *         &lt;element name="regOwnerOther" type="{http://www.w3.org/2001/XMLSchema}int"/>
             *         &lt;element name="stateProvCd" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="zipCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
             *       &lt;/sequence>
             *       &lt;attribute name="state" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "additionalOwnersInd",
                "addressLine1",
                "city",
                "country",
                "financedInd",
                "firstName",
                "lastName",
                "location",
                "ownedInd",
                "ownerType",
                "regOwner",
                "regOwnerOther",
                "stateProvCd",
                "zipCode"
            })
            public static class ChartisPAutoVehicleOwnership {

                @XmlElement(required = true)
                protected String additionalOwnersInd;
                @XmlElement(required = true)
                protected String addressLine1;
                @XmlElement(required = true)
                protected String city;
                @XmlElement(required = true)
                protected String country;
                @XmlElement(required = true)
                protected String financedInd;
                @XmlElement(required = true)
                protected String firstName;
                @XmlElement(required = true)
                protected String lastName;
                @XmlElement(required = true)
                protected String location;
                @XmlElement(required = true)
                protected String ownedInd;
                @XmlElement(required = true)
                protected String ownerType;
                protected int regOwner;
                protected int regOwnerOther;
                @XmlElement(required = true)
                protected String stateProvCd;
                protected int zipCode;
                @XmlAttribute(name = "state")
                protected String state;

                /**
                 * Gets the value of the additionalOwnersInd property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getAdditionalOwnersInd() {
                    return additionalOwnersInd;
                }

                /**
                 * Sets the value of the additionalOwnersInd property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setAdditionalOwnersInd(String value) {
                    this.additionalOwnersInd = value;
                }

                /**
                 * Gets the value of the addressLine1 property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getAddressLine1() {
                    return addressLine1;
                }

                /**
                 * Sets the value of the addressLine1 property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setAddressLine1(String value) {
                    this.addressLine1 = value;
                }

                /**
                 * Gets the value of the city property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCity() {
                    return city;
                }

                /**
                 * Sets the value of the city property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCity(String value) {
                    this.city = value;
                }

                /**
                 * Gets the value of the country property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCountry() {
                    return country;
                }

                /**
                 * Sets the value of the country property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCountry(String value) {
                    this.country = value;
                }

                /**
                 * Gets the value of the financedInd property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getFinancedInd() {
                    return financedInd;
                }

                /**
                 * Sets the value of the financedInd property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setFinancedInd(String value) {
                    this.financedInd = value;
                }

                /**
                 * Gets the value of the firstName property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getFirstName() {
                    return firstName;
                }

                /**
                 * Sets the value of the firstName property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setFirstName(String value) {
                    this.firstName = value;
                }

                /**
                 * Gets the value of the lastName property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getLastName() {
                    return lastName;
                }

                /**
                 * Sets the value of the lastName property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setLastName(String value) {
                    this.lastName = value;
                }

                /**
                 * Gets the value of the location property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getLocation() {
                    return location;
                }

                /**
                 * Sets the value of the location property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setLocation(String value) {
                    this.location = value;
                }

                /**
                 * Gets the value of the ownedInd property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getOwnedInd() {
                    return ownedInd;
                }

                /**
                 * Sets the value of the ownedInd property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setOwnedInd(String value) {
                    this.ownedInd = value;
                }

                /**
                 * Gets the value of the ownerType property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getOwnerType() {
                    return ownerType;
                }

                /**
                 * Sets the value of the ownerType property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setOwnerType(String value) {
                    this.ownerType = value;
                }

                /**
                 * Gets the value of the regOwner property.
                 * 
                 */
                public int getRegOwner() {
                    return regOwner;
                }

                /**
                 * Sets the value of the regOwner property.
                 * 
                 */
                public void setRegOwner(int value) {
                    this.regOwner = value;
                }

                /**
                 * Gets the value of the regOwnerOther property.
                 * 
                 */
                public int getRegOwnerOther() {
                    return regOwnerOther;
                }

                /**
                 * Sets the value of the regOwnerOther property.
                 * 
                 */
                public void setRegOwnerOther(int value) {
                    this.regOwnerOther = value;
                }

                /**
                 * Gets the value of the stateProvCd property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getStateProvCd() {
                    return stateProvCd;
                }

                /**
                 * Sets the value of the stateProvCd property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setStateProvCd(String value) {
                    this.stateProvCd = value;
                }

                /**
                 * Gets the value of the zipCode property.
                 * 
                 */
                public int getZipCode() {
                    return zipCode;
                }

                /**
                 * Sets the value of the zipCode property.
                 * 
                 */
                public void setZipCode(int value) {
                    this.zipCode = value;
                }

                /**
                 * Gets the value of the state property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getState() {
                    return state;
                }

                /**
                 * Sets the value of the state property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setState(String value) {
                    this.state = value;
                }

            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="addressLine1" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="city2" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="countryCd" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="garaged" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="garagedSecondary" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="garagingLocation" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="postalCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
             *         &lt;element name="ratingTerritory" type="{http://www.w3.org/2001/XMLSchema}int"/>
             *         &lt;element name="regionCd" type="{http://www.w3.org/2001/XMLSchema}int"/>
             *         &lt;element name="stateProvCd" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="storedInMasonry" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *       &lt;/sequence>
             *       &lt;attribute name="state" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "addressLine1",
                "city",
                "city2",
                "countryCd",
                "garaged",
                "garagedSecondary",
                "garagingLocation",
                "postalCode",
                "ratingTerritory",
                "regionCd",
                "stateProvCd",
                "storedInMasonry"
            })
            public static class GaragingAddress {

                @XmlElement(required = true)
                protected String addressLine1;
                @XmlElement(required = true)
                protected String city;
                @XmlElement(required = true)
                protected String city2;
                @XmlElement(required = true)
                protected String countryCd;
                @XmlElement(required = true)
                protected String garaged;
                @XmlElement(required = true)
                protected String garagedSecondary;
                @XmlElement(required = true)
                protected String garagingLocation;
                protected int postalCode;
                protected int ratingTerritory;
                protected int regionCd;
                @XmlElement(required = true)
                protected String stateProvCd;
                @XmlElement(required = true)
                protected String storedInMasonry;
                @XmlAttribute(name = "state")
                protected String state;

                /**
                 * Gets the value of the addressLine1 property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getAddressLine1() {
                    return addressLine1;
                }

                /**
                 * Sets the value of the addressLine1 property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setAddressLine1(String value) {
                    this.addressLine1 = value;
                }

                /**
                 * Gets the value of the city property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCity() {
                    return city;
                }

                /**
                 * Sets the value of the city property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCity(String value) {
                    this.city = value;
                }

                /**
                 * Gets the value of the city2 property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCity2() {
                    return city2;
                }

                /**
                 * Sets the value of the city2 property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCity2(String value) {
                    this.city2 = value;
                }

                /**
                 * Gets the value of the countryCd property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCountryCd() {
                    return countryCd;
                }

                /**
                 * Sets the value of the countryCd property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCountryCd(String value) {
                    this.countryCd = value;
                }

                /**
                 * Gets the value of the garaged property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getGaraged() {
                    return garaged;
                }

                /**
                 * Sets the value of the garaged property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setGaraged(String value) {
                    this.garaged = value;
                }

                /**
                 * Gets the value of the garagedSecondary property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getGaragedSecondary() {
                    return garagedSecondary;
                }

                /**
                 * Sets the value of the garagedSecondary property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setGaragedSecondary(String value) {
                    this.garagedSecondary = value;
                }

                /**
                 * Gets the value of the garagingLocation property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getGaragingLocation() {
                    return garagingLocation;
                }

                /**
                 * Sets the value of the garagingLocation property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setGaragingLocation(String value) {
                    this.garagingLocation = value;
                }

                /**
                 * Gets the value of the postalCode property.
                 * 
                 */
                public int getPostalCode() {
                    return postalCode;
                }

                /**
                 * Sets the value of the postalCode property.
                 * 
                 */
                public void setPostalCode(int value) {
                    this.postalCode = value;
                }

                /**
                 * Gets the value of the ratingTerritory property.
                 * 
                 */
                public int getRatingTerritory() {
                    return ratingTerritory;
                }

                /**
                 * Sets the value of the ratingTerritory property.
                 * 
                 */
                public void setRatingTerritory(int value) {
                    this.ratingTerritory = value;
                }

                /**
                 * Gets the value of the regionCd property.
                 * 
                 */
                public int getRegionCd() {
                    return regionCd;
                }

                /**
                 * Sets the value of the regionCd property.
                 * 
                 */
                public void setRegionCd(int value) {
                    this.regionCd = value;
                }

                /**
                 * Gets the value of the stateProvCd property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getStateProvCd() {
                    return stateProvCd;
                }

                /**
                 * Sets the value of the stateProvCd property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setStateProvCd(String value) {
                    this.stateProvCd = value;
                }

                /**
                 * Gets the value of the storedInMasonry property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getStoredInMasonry() {
                    return storedInMasonry;
                }

                /**
                 * Sets the value of the storedInMasonry property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setStoredInMasonry(String value) {
                    this.storedInMasonry = value;
                }

                /**
                 * Gets the value of the state property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getState() {
                    return state;
                }

                /**
                 * Sets the value of the state property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setState(String value) {
                    this.state = value;
                }

            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="limitAmount" type="{http://www.w3.org/2001/XMLSchema}int"/>
             *         &lt;element name="PremiumEntry" maxOccurs="unbounded">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="actualAmt" type="{http://www.w3.org/2001/XMLSchema}int"/>
             *                   &lt;element name="changeAmt" type="{http://www.w3.org/2001/XMLSchema}int"/>
             *                   &lt;element name="periodAmt" type="{http://www.w3.org/2001/XMLSchema}int"/>
             *                   &lt;element name="premiumType" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                 &lt;/sequence>
             *                 &lt;attribute name="premiumCd" type="{http://www.w3.org/2001/XMLSchema}string" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/sequence>
             *       &lt;attribute name="state" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "limitAmount",
                "premiumEntry"
            })
            public static class PAutoACCDEATHDomainCoverage {

                protected int limitAmount;
                @XmlElement(name = "PremiumEntry", required = true)
                protected List<Policies.Policy.Vehicle.PAutoACCDEATHDomainCoverage.PremiumEntry> premiumEntry;
                @XmlAttribute(name = "state")
                protected String state;

                /**
                 * Gets the value of the limitAmount property.
                 * 
                 */
                public int getLimitAmount() {
                    return limitAmount;
                }

                /**
                 * Sets the value of the limitAmount property.
                 * 
                 */
                public void setLimitAmount(int value) {
                    this.limitAmount = value;
                }

                /**
                 * Gets the value of the premiumEntry property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the premiumEntry property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getPremiumEntry().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link Policies.Policy.Vehicle.PAutoACCDEATHDomainCoverage.PremiumEntry }
                 * 
                 * 
                 */
                public List<Policies.Policy.Vehicle.PAutoACCDEATHDomainCoverage.PremiumEntry> getPremiumEntry() {
                    if (premiumEntry == null) {
                        premiumEntry = new ArrayList<Policies.Policy.Vehicle.PAutoACCDEATHDomainCoverage.PremiumEntry>();
                    }
                    return this.premiumEntry;
                }

                /**
                 * Gets the value of the state property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getState() {
                    return state;
                }

                /**
                 * Sets the value of the state property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setState(String value) {
                    this.state = value;
                }

                public void setPremiumEntry(List<Policies.Policy.Vehicle.PAutoACCDEATHDomainCoverage.PremiumEntry> premiumEntry) {
                    this.premiumEntry = premiumEntry;
                }


                /**
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;sequence>
                 *         &lt;element name="actualAmt" type="{http://www.w3.org/2001/XMLSchema}int"/>
                 *         &lt;element name="changeAmt" type="{http://www.w3.org/2001/XMLSchema}int"/>
                 *         &lt;element name="periodAmt" type="{http://www.w3.org/2001/XMLSchema}int"/>
                 *         &lt;element name="premiumType" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *       &lt;/sequence>
                 *       &lt;attribute name="premiumCd" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "actualAmt",
                    "changeAmt",
                    "periodAmt",
                    "premiumType"
                })
                public static class PremiumEntry {

                    protected int actualAmt;
                    protected int changeAmt;
                    protected int periodAmt;
                    @XmlElement(required = true)
                    protected String premiumType;
                    @XmlAttribute(name = "premiumCd")
                    protected String premiumCd;

                    /**
                     * Gets the value of the actualAmt property.
                     * 
                     */
                    public int getActualAmt() {
                        return actualAmt;
                    }

                    /**
                     * Sets the value of the actualAmt property.
                     * 
                     */
                    public void setActualAmt(int value) {
                        this.actualAmt = value;
                    }

                    /**
                     * Gets the value of the changeAmt property.
                     * 
                     */
                    public int getChangeAmt() {
                        return changeAmt;
                    }

                    /**
                     * Sets the value of the changeAmt property.
                     * 
                     */
                    public void setChangeAmt(int value) {
                        this.changeAmt = value;
                    }

                    /**
                     * Gets the value of the periodAmt property.
                     * 
                     */
                    public int getPeriodAmt() {
                        return periodAmt;
                    }

                    /**
                     * Sets the value of the periodAmt property.
                     * 
                     */
                    public void setPeriodAmt(int value) {
                        this.periodAmt = value;
                    }

                    /**
                     * Gets the value of the premiumType property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getPremiumType() {
                        return premiumType;
                    }

                    /**
                     * Sets the value of the premiumType property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setPremiumType(String value) {
                        this.premiumType = value;
                    }

                    /**
                     * Gets the value of the premiumCd property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getPremiumCd() {
                        return premiumCd;
                    }

                    /**
                     * Sets the value of the premiumCd property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setPremiumCd(String value) {
                        this.premiumCd = value;
                    }

                }

            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;attribute name="state" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class PAutoBIDomainCoverage {

                @XmlAttribute(name = "state")
                protected String state;

                /**
                 * Gets the value of the state property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getState() {
                    return state;
                }

                /**
                 * Sets the value of the state property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setState(String value) {
                    this.state = value;
                }

            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="deductibleAmount" type="{http://www.w3.org/2001/XMLSchema}int"/>
             *       &lt;/sequence>
             *       &lt;attribute name="state" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "deductibleAmount"
            })
            public static class PAutoCOLLCoverage {

                protected int deductibleAmount;
                @XmlAttribute(name = "state")
                protected String state;

                /**
                 * Gets the value of the deductibleAmount property.
                 * 
                 */
                public int getDeductibleAmount() {
                    return deductibleAmount;
                }

                /**
                 * Sets the value of the deductibleAmount property.
                 * 
                 */
                public void setDeductibleAmount(int value) {
                    this.deductibleAmount = value;
                }

                /**
                 * Gets the value of the state property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getState() {
                    return state;
                }

                /**
                 * Sets the value of the state property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setState(String value) {
                    this.state = value;
                }

            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="deductibleAmount" type="{http://www.w3.org/2001/XMLSchema}int"/>
             *         &lt;element name="PremiumEntry" maxOccurs="unbounded">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="actualAmt" type="{http://www.w3.org/2001/XMLSchema}int"/>
             *                   &lt;element name="changeAmt" type="{http://www.w3.org/2001/XMLSchema}int"/>
             *                   &lt;element name="periodAmt" type="{http://www.w3.org/2001/XMLSchema}int"/>
             *                   &lt;element name="premiumType" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                 &lt;/sequence>
             *                 &lt;attribute name="premiumCd" type="{http://www.w3.org/2001/XMLSchema}string" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/sequence>
             *       &lt;attribute name="state" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "deductibleAmount",
                "premiumEntry"
            })
            public static class PAutoCOLLDomainCoverage {

                protected int deductibleAmount;
                @XmlElement(name = "PremiumEntry", required = true)
                protected List<Policies.Policy.Vehicle.PAutoCOLLDomainCoverage.PremiumEntry> premiumEntry;
                @XmlAttribute(name = "state")
                protected String state;

                /**
                 * Gets the value of the deductibleAmount property.
                 * 
                 */
                public int getDeductibleAmount() {
                    return deductibleAmount;
                }

                /**
                 * Sets the value of the deductibleAmount property.
                 * 
                 */
                public void setDeductibleAmount(int value) {
                    this.deductibleAmount = value;
                }

                /**
                 * Gets the value of the premiumEntry property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the premiumEntry property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getPremiumEntry().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link Policies.Policy.Vehicle.PAutoCOLLDomainCoverage.PremiumEntry }
                 * 
                 * 
                 */
                public List<Policies.Policy.Vehicle.PAutoCOLLDomainCoverage.PremiumEntry> getPremiumEntry() {
                    if (premiumEntry == null) {
                        premiumEntry = new ArrayList<Policies.Policy.Vehicle.PAutoCOLLDomainCoverage.PremiumEntry>();
                    }
                    return this.premiumEntry;
                }

                /**
                 * Gets the value of the state property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getState() {
                    return state;
                }

                /**
                 * Sets the value of the state property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setState(String value) {
                    this.state = value;
                }

                public void setPremiumEntry(List<Policies.Policy.Vehicle.PAutoCOLLDomainCoverage.PremiumEntry> premiumEntry) {
                    this.premiumEntry = premiumEntry;
                }


                /**
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;sequence>
                 *         &lt;element name="actualAmt" type="{http://www.w3.org/2001/XMLSchema}int"/>
                 *         &lt;element name="changeAmt" type="{http://www.w3.org/2001/XMLSchema}int"/>
                 *         &lt;element name="periodAmt" type="{http://www.w3.org/2001/XMLSchema}int"/>
                 *         &lt;element name="premiumType" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *       &lt;/sequence>
                 *       &lt;attribute name="premiumCd" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "actualAmt",
                    "changeAmt",
                    "periodAmt",
                    "premiumType"
                })
                public static class PremiumEntry {

                    protected int actualAmt;
                    protected int changeAmt;
                    protected int periodAmt;
                    @XmlElement(required = true)
                    protected String premiumType;
                    @XmlAttribute(name = "premiumCd")
                    protected String premiumCd;

                    /**
                     * Gets the value of the actualAmt property.
                     * 
                     */
                    public int getActualAmt() {
                        return actualAmt;
                    }

                    /**
                     * Sets the value of the actualAmt property.
                     * 
                     */
                    public void setActualAmt(int value) {
                        this.actualAmt = value;
                    }

                    /**
                     * Gets the value of the changeAmt property.
                     * 
                     */
                    public int getChangeAmt() {
                        return changeAmt;
                    }

                    /**
                     * Sets the value of the changeAmt property.
                     * 
                     */
                    public void setChangeAmt(int value) {
                        this.changeAmt = value;
                    }

                    /**
                     * Gets the value of the periodAmt property.
                     * 
                     */
                    public int getPeriodAmt() {
                        return periodAmt;
                    }

                    /**
                     * Sets the value of the periodAmt property.
                     * 
                     */
                    public void setPeriodAmt(int value) {
                        this.periodAmt = value;
                    }

                    /**
                     * Gets the value of the premiumType property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getPremiumType() {
                        return premiumType;
                    }

                    /**
                     * Sets the value of the premiumType property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setPremiumType(String value) {
                        this.premiumType = value;
                    }

                    /**
                     * Gets the value of the premiumCd property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getPremiumCd() {
                        return premiumCd;
                    }

                    /**
                     * Sets the value of the premiumCd property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setPremiumCd(String value) {
                        this.premiumCd = value;
                    }

                }

            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="deductibleAmount" type="{http://www.w3.org/2001/XMLSchema}int"/>
             *       &lt;/sequence>
             *       &lt;attribute name="state" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "deductibleAmount"
            })
            public static class PAutoCOMPCoverage {

                protected int deductibleAmount;
                @XmlAttribute(name = "state")
                protected String state;

                /**
                 * Gets the value of the deductibleAmount property.
                 * 
                 */
                public int getDeductibleAmount() {
                    return deductibleAmount;
                }

                /**
                 * Sets the value of the deductibleAmount property.
                 * 
                 */
                public void setDeductibleAmount(int value) {
                    this.deductibleAmount = value;
                }

                /**
                 * Gets the value of the state property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getState() {
                    return state;
                }

                /**
                 * Sets the value of the state property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setState(String value) {
                    this.state = value;
                }

            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="deductibleAmount" type="{http://www.w3.org/2001/XMLSchema}int"/>
             *         &lt;element name="PremiumEntry" maxOccurs="unbounded">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="actualAmt" type="{http://www.w3.org/2001/XMLSchema}int"/>
             *                   &lt;element name="changeAmt" type="{http://www.w3.org/2001/XMLSchema}int"/>
             *                   &lt;element name="periodAmt" type="{http://www.w3.org/2001/XMLSchema}int"/>
             *                   &lt;element name="premiumType" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                 &lt;/sequence>
             *                 &lt;attribute name="premiumCd" type="{http://www.w3.org/2001/XMLSchema}string" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/sequence>
             *       &lt;attribute name="state" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "deductibleAmount",
                "premiumEntry"
            })
            public static class PAutoCOMPDomainCoverage {

                protected int deductibleAmount;
                @XmlElement(name = "PremiumEntry", required = true)
                protected List<Policies.Policy.Vehicle.PAutoCOMPDomainCoverage.PremiumEntry> premiumEntry;
                @XmlAttribute(name = "state")
                protected String state;

                /**
                 * Gets the value of the deductibleAmount property.
                 * 
                 */
                public int getDeductibleAmount() {
                    return deductibleAmount;
                }

                /**
                 * Sets the value of the deductibleAmount property.
                 * 
                 */
                public void setDeductibleAmount(int value) {
                    this.deductibleAmount = value;
                }

                /**
                 * Gets the value of the premiumEntry property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the premiumEntry property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getPremiumEntry().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link Policies.Policy.Vehicle.PAutoCOMPDomainCoverage.PremiumEntry }
                 * 
                 * 
                 */
                public List<Policies.Policy.Vehicle.PAutoCOMPDomainCoverage.PremiumEntry> getPremiumEntry() {
                    if (premiumEntry == null) {
                        premiumEntry = new ArrayList<Policies.Policy.Vehicle.PAutoCOMPDomainCoverage.PremiumEntry>();
                    }
                    return this.premiumEntry;
                }

                /**
                 * Gets the value of the state property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getState() {
                    return state;
                }

                /**
                 * Sets the value of the state property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setState(String value) {
                    this.state = value;
                }

                public void setPremiumEntry(List<Policies.Policy.Vehicle.PAutoCOMPDomainCoverage.PremiumEntry> premiumEntry) {
                    this.premiumEntry = premiumEntry;
                }


                /**
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;sequence>
                 *         &lt;element name="actualAmt" type="{http://www.w3.org/2001/XMLSchema}int"/>
                 *         &lt;element name="changeAmt" type="{http://www.w3.org/2001/XMLSchema}int"/>
                 *         &lt;element name="periodAmt" type="{http://www.w3.org/2001/XMLSchema}int"/>
                 *         &lt;element name="premiumType" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *       &lt;/sequence>
                 *       &lt;attribute name="premiumCd" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "actualAmt",
                    "changeAmt",
                    "periodAmt",
                    "premiumType"
                })
                public static class PremiumEntry {

                    protected int actualAmt;
                    protected int changeAmt;
                    protected int periodAmt;
                    @XmlElement(required = true)
                    protected String premiumType;
                    @XmlAttribute(name = "premiumCd")
                    protected String premiumCd;

                    /**
                     * Gets the value of the actualAmt property.
                     * 
                     */
                    public int getActualAmt() {
                        return actualAmt;
                    }

                    /**
                     * Sets the value of the actualAmt property.
                     * 
                     */
                    public void setActualAmt(int value) {
                        this.actualAmt = value;
                    }

                    /**
                     * Gets the value of the changeAmt property.
                     * 
                     */
                    public int getChangeAmt() {
                        return changeAmt;
                    }

                    /**
                     * Sets the value of the changeAmt property.
                     * 
                     */
                    public void setChangeAmt(int value) {
                        this.changeAmt = value;
                    }

                    /**
                     * Gets the value of the periodAmt property.
                     * 
                     */
                    public int getPeriodAmt() {
                        return periodAmt;
                    }

                    /**
                     * Sets the value of the periodAmt property.
                     * 
                     */
                    public void setPeriodAmt(int value) {
                        this.periodAmt = value;
                    }

                    /**
                     * Gets the value of the premiumType property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getPremiumType() {
                        return premiumType;
                    }

                    /**
                     * Sets the value of the premiumType property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setPremiumType(String value) {
                        this.premiumType = value;
                    }

                    /**
                     * Gets the value of the premiumCd property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getPremiumCd() {
                        return premiumCd;
                    }

                    /**
                     * Sets the value of the premiumCd property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setPremiumCd(String value) {
                        this.premiumCd = value;
                    }

                }

            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="limitAmount" type="{http://www.w3.org/2001/XMLSchema}int"/>
             *       &lt;/sequence>
             *       &lt;attribute name="state" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "limitAmount"
            })
            public static class PAutoCPDomainCoverage {

                protected int limitAmount;
                @XmlAttribute(name = "state")
                protected String state;

                /**
                 * Gets the value of the limitAmount property.
                 * 
                 */
                public int getLimitAmount() {
                    return limitAmount;
                }

                /**
                 * Sets the value of the limitAmount property.
                 * 
                 */
                public void setLimitAmount(int value) {
                    this.limitAmount = value;
                }

                /**
                 * Gets the value of the state property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getState() {
                    return state;
                }

                /**
                 * Sets the value of the state property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setState(String value) {
                    this.state = value;
                }

            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="limitAmount" type="{http://www.w3.org/2001/XMLSchema}int"/>
             *         &lt;element name="PremiumEntry" maxOccurs="unbounded">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="actualAmt" type="{http://www.w3.org/2001/XMLSchema}int"/>
             *                   &lt;element name="changeAmt" type="{http://www.w3.org/2001/XMLSchema}int"/>
             *                   &lt;element name="periodAmt" type="{http://www.w3.org/2001/XMLSchema}int"/>
             *                   &lt;element name="premiumType" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                 &lt;/sequence>
             *                 &lt;attribute name="premiumCd" type="{http://www.w3.org/2001/XMLSchema}string" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/sequence>
             *       &lt;attribute name="state" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "limitAmount",
                "premiumEntry"
            })
            public static class PAutoCSLDomainCoverage {

                protected int limitAmount;
                @XmlElement(name = "PremiumEntry", required = true)
                protected List<Policies.Policy.Vehicle.PAutoCSLDomainCoverage.PremiumEntry> premiumEntry;
                @XmlAttribute(name = "state")
                protected String state;

                /**
                 * Gets the value of the limitAmount property.
                 * 
                 */
                public int getLimitAmount() {
                    return limitAmount;
                }

                /**
                 * Sets the value of the limitAmount property.
                 * 
                 */
                public void setLimitAmount(int value) {
                    this.limitAmount = value;
                }

                /**
                 * Gets the value of the premiumEntry property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the premiumEntry property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getPremiumEntry().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link Policies.Policy.Vehicle.PAutoCSLDomainCoverage.PremiumEntry }
                 * 
                 * 
                 */
                public List<Policies.Policy.Vehicle.PAutoCSLDomainCoverage.PremiumEntry> getPremiumEntry() {
                    if (premiumEntry == null) {
                        premiumEntry = new ArrayList<Policies.Policy.Vehicle.PAutoCSLDomainCoverage.PremiumEntry>();
                    }
                    return this.premiumEntry;
                }

                /**
                 * Gets the value of the state property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getState() {
                    return state;
                }

                /**
                 * Sets the value of the state property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setState(String value) {
                    this.state = value;
                }

                public void setPremiumEntry(List<Policies.Policy.Vehicle.PAutoCSLDomainCoverage.PremiumEntry> premiumEntry) {
                    this.premiumEntry = premiumEntry;
                }


                /**
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;sequence>
                 *         &lt;element name="actualAmt" type="{http://www.w3.org/2001/XMLSchema}int"/>
                 *         &lt;element name="changeAmt" type="{http://www.w3.org/2001/XMLSchema}int"/>
                 *         &lt;element name="periodAmt" type="{http://www.w3.org/2001/XMLSchema}int"/>
                 *         &lt;element name="premiumType" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *       &lt;/sequence>
                 *       &lt;attribute name="premiumCd" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "actualAmt",
                    "changeAmt",
                    "periodAmt",
                    "premiumType"
                })
                public static class PremiumEntry {

                    protected int actualAmt;
                    protected int changeAmt;
                    protected int periodAmt;
                    @XmlElement(required = true)
                    protected String premiumType;
                    @XmlAttribute(name = "premiumCd")
                    protected String premiumCd;

                    /**
                     * Gets the value of the actualAmt property.
                     * 
                     */
                    public int getActualAmt() {
                        return actualAmt;
                    }

                    /**
                     * Sets the value of the actualAmt property.
                     * 
                     */
                    public void setActualAmt(int value) {
                        this.actualAmt = value;
                    }

                    /**
                     * Gets the value of the changeAmt property.
                     * 
                     */
                    public int getChangeAmt() {
                        return changeAmt;
                    }

                    /**
                     * Sets the value of the changeAmt property.
                     * 
                     */
                    public void setChangeAmt(int value) {
                        this.changeAmt = value;
                    }

                    /**
                     * Gets the value of the periodAmt property.
                     * 
                     */
                    public int getPeriodAmt() {
                        return periodAmt;
                    }

                    /**
                     * Sets the value of the periodAmt property.
                     * 
                     */
                    public void setPeriodAmt(int value) {
                        this.periodAmt = value;
                    }

                    /**
                     * Gets the value of the premiumType property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getPremiumType() {
                        return premiumType;
                    }

                    /**
                     * Sets the value of the premiumType property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setPremiumType(String value) {
                        this.premiumType = value;
                    }

                    /**
                     * Gets the value of the premiumCd property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getPremiumCd() {
                        return premiumCd;
                    }

                    /**
                     * Sets the value of the premiumCd property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setPremiumCd(String value) {
                        this.premiumCd = value;
                    }

                }

            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="limitAmount" type="{http://www.w3.org/2001/XMLSchema}int"/>
             *         &lt;element name="PremiumEntry" maxOccurs="unbounded">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="actualAmt" type="{http://www.w3.org/2001/XMLSchema}int"/>
             *                   &lt;element name="changeAmt" type="{http://www.w3.org/2001/XMLSchema}int"/>
             *                   &lt;element name="periodAmt" type="{http://www.w3.org/2001/XMLSchema}int"/>
             *                   &lt;element name="premiumType" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                 &lt;/sequence>
             *                 &lt;attribute name="premiumCd" type="{http://www.w3.org/2001/XMLSchema}string" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/sequence>
             *       &lt;attribute name="state" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "limitAmount",
                "premiumEntry"
            })
            public static class PAutoMEDDomainCoverage {

                protected int limitAmount;
                @XmlElement(name = "PremiumEntry", required = true)
                protected List<Policies.Policy.Vehicle.PAutoMEDDomainCoverage.PremiumEntry> premiumEntry;
                @XmlAttribute(name = "state")
                protected String state;

                /**
                 * Gets the value of the limitAmount property.
                 * 
                 */
                public int getLimitAmount() {
                    return limitAmount;
                }

                /**
                 * Sets the value of the limitAmount property.
                 * 
                 */
                public void setLimitAmount(int value) {
                    this.limitAmount = value;
                }

                /**
                 * Gets the value of the premiumEntry property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the premiumEntry property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getPremiumEntry().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link Policies.Policy.Vehicle.PAutoMEDDomainCoverage.PremiumEntry }
                 * 
                 * 
                 */
                public List<Policies.Policy.Vehicle.PAutoMEDDomainCoverage.PremiumEntry> getPremiumEntry() {
                    if (premiumEntry == null) {
                        premiumEntry = new ArrayList<Policies.Policy.Vehicle.PAutoMEDDomainCoverage.PremiumEntry>();
                    }
                    return this.premiumEntry;
                }

                /**
                 * Gets the value of the state property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getState() {
                    return state;
                }

                /**
                 * Sets the value of the state property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setState(String value) {
                    this.state = value;
                }

                public void setPremiumEntry(List<Policies.Policy.Vehicle.PAutoMEDDomainCoverage.PremiumEntry> premiumEntry) {
                    this.premiumEntry = premiumEntry;
                }


                /**
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;sequence>
                 *         &lt;element name="actualAmt" type="{http://www.w3.org/2001/XMLSchema}int"/>
                 *         &lt;element name="changeAmt" type="{http://www.w3.org/2001/XMLSchema}int"/>
                 *         &lt;element name="periodAmt" type="{http://www.w3.org/2001/XMLSchema}int"/>
                 *         &lt;element name="premiumType" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *       &lt;/sequence>
                 *       &lt;attribute name="premiumCd" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "actualAmt",
                    "changeAmt",
                    "periodAmt",
                    "premiumType"
                })
                public static class PremiumEntry {

                    protected int actualAmt;
                    protected int changeAmt;
                    protected int periodAmt;
                    @XmlElement(required = true)
                    protected String premiumType;
                    @XmlAttribute(name = "premiumCd")
                    protected String premiumCd;

                    /**
                     * Gets the value of the actualAmt property.
                     * 
                     */
                    public int getActualAmt() {
                        return actualAmt;
                    }

                    /**
                     * Sets the value of the actualAmt property.
                     * 
                     */
                    public void setActualAmt(int value) {
                        this.actualAmt = value;
                    }

                    /**
                     * Gets the value of the changeAmt property.
                     * 
                     */
                    public int getChangeAmt() {
                        return changeAmt;
                    }

                    /**
                     * Sets the value of the changeAmt property.
                     * 
                     */
                    public void setChangeAmt(int value) {
                        this.changeAmt = value;
                    }

                    /**
                     * Gets the value of the periodAmt property.
                     * 
                     */
                    public int getPeriodAmt() {
                        return periodAmt;
                    }

                    /**
                     * Sets the value of the periodAmt property.
                     * 
                     */
                    public void setPeriodAmt(int value) {
                        this.periodAmt = value;
                    }

                    /**
                     * Gets the value of the premiumType property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getPremiumType() {
                        return premiumType;
                    }

                    /**
                     * Sets the value of the premiumType property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setPremiumType(String value) {
                        this.premiumType = value;
                    }

                    /**
                     * Gets the value of the premiumCd property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getPremiumCd() {
                        return premiumCd;
                    }

                    /**
                     * Sets the value of the premiumCd property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setPremiumCd(String value) {
                        this.premiumCd = value;
                    }

                }

            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;attribute name="state" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class PAutoMEDPLCoverage {

                @XmlAttribute(name = "state")
                protected String state;

                /**
                 * Gets the value of the state property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getState() {
                    return state;
                }

                /**
                 * Sets the value of the state property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setState(String value) {
                    this.state = value;
                }

            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;attribute name="state" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class PAutoPDDomainCoverage {

                @XmlAttribute(name = "state")
                protected String state;

                /**
                 * Gets the value of the state property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getState() {
                    return state;
                }

                /**
                 * Sets the value of the state property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setState(String value) {
                    this.state = value;
                }

            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;attribute name="state" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class PAutoUMBIDomainCoverage {

                @XmlAttribute(name = "state")
                protected String state;

                /**
                 * Gets the value of the state property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getState() {
                    return state;
                }

                /**
                 * Sets the value of the state property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setState(String value) {
                    this.state = value;
                }

            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="limitAmount" type="{http://www.w3.org/2001/XMLSchema}int"/>
             *         &lt;element name="PremiumEntry" maxOccurs="unbounded">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="actualAmt" type="{http://www.w3.org/2001/XMLSchema}int"/>
             *                   &lt;element name="changeAmt" type="{http://www.w3.org/2001/XMLSchema}int"/>
             *                   &lt;element name="periodAmt" type="{http://www.w3.org/2001/XMLSchema}int"/>
             *                   &lt;element name="premiumType" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                 &lt;/sequence>
             *                 &lt;attribute name="premiumCd" type="{http://www.w3.org/2001/XMLSchema}string" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/sequence>
             *       &lt;attribute name="state" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "limitAmount",
                "premiumEntry"
            })
            public static class PAutoUMCSLDomainCoverage {

                protected int limitAmount;
                @XmlElement(name = "PremiumEntry", required = true)
                protected List<Policies.Policy.Vehicle.PAutoUMCSLDomainCoverage.PremiumEntry> premiumEntry;
                @XmlAttribute(name = "state")
                protected String state;

                /**
                 * Gets the value of the limitAmount property.
                 * 
                 */
                public int getLimitAmount() {
                    return limitAmount;
                }

                /**
                 * Sets the value of the limitAmount property.
                 * 
                 */
                public void setLimitAmount(int value) {
                    this.limitAmount = value;
                }

                /**
                 * Gets the value of the premiumEntry property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the premiumEntry property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getPremiumEntry().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link Policies.Policy.Vehicle.PAutoUMCSLDomainCoverage.PremiumEntry }
                 * 
                 * 
                 */
                public List<Policies.Policy.Vehicle.PAutoUMCSLDomainCoverage.PremiumEntry> getPremiumEntry() {
                    if (premiumEntry == null) {
                        premiumEntry = new ArrayList<Policies.Policy.Vehicle.PAutoUMCSLDomainCoverage.PremiumEntry>();
                    }
                    return this.premiumEntry;
                }

                /**
                 * Gets the value of the state property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getState() {
                    return state;
                }

                /**
                 * Sets the value of the state property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setState(String value) {
                    this.state = value;
                }

                public void setPremiumEntry(List<Policies.Policy.Vehicle.PAutoUMCSLDomainCoverage.PremiumEntry> premiumEntry) {
                    this.premiumEntry = premiumEntry;
                }


                /**
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;sequence>
                 *         &lt;element name="actualAmt" type="{http://www.w3.org/2001/XMLSchema}int"/>
                 *         &lt;element name="changeAmt" type="{http://www.w3.org/2001/XMLSchema}int"/>
                 *         &lt;element name="periodAmt" type="{http://www.w3.org/2001/XMLSchema}int"/>
                 *         &lt;element name="premiumType" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *       &lt;/sequence>
                 *       &lt;attribute name="premiumCd" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "actualAmt",
                    "changeAmt",
                    "periodAmt",
                    "premiumType"
                })
                public static class PremiumEntry {

                    protected int actualAmt;
                    protected int changeAmt;
                    protected int periodAmt;
                    @XmlElement(required = true)
                    protected String premiumType;
                    @XmlAttribute(name = "premiumCd")
                    protected String premiumCd;

                    /**
                     * Gets the value of the actualAmt property.
                     * 
                     */
                    public int getActualAmt() {
                        return actualAmt;
                    }

                    /**
                     * Sets the value of the actualAmt property.
                     * 
                     */
                    public void setActualAmt(int value) {
                        this.actualAmt = value;
                    }

                    /**
                     * Gets the value of the changeAmt property.
                     * 
                     */
                    public int getChangeAmt() {
                        return changeAmt;
                    }

                    /**
                     * Sets the value of the changeAmt property.
                     * 
                     */
                    public void setChangeAmt(int value) {
                        this.changeAmt = value;
                    }

                    /**
                     * Gets the value of the periodAmt property.
                     * 
                     */
                    public int getPeriodAmt() {
                        return periodAmt;
                    }

                    /**
                     * Sets the value of the periodAmt property.
                     * 
                     */
                    public void setPeriodAmt(int value) {
                        this.periodAmt = value;
                    }

                    /**
                     * Gets the value of the premiumType property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getPremiumType() {
                        return premiumType;
                    }

                    /**
                     * Sets the value of the premiumType property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setPremiumType(String value) {
                        this.premiumType = value;
                    }

                    /**
                     * Gets the value of the premiumCd property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getPremiumCd() {
                        return premiumCd;
                    }

                    /**
                     * Sets the value of the premiumCd property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setPremiumCd(String value) {
                        this.premiumCd = value;
                    }

                }

            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;attribute name="state" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class PAutoUMPDDomainCoverage {

                @XmlAttribute(name = "state")
                protected String state;

                /**
                 * Gets the value of the state property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getState() {
                    return state;
                }

                /**
                 * Sets the value of the state property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setState(String value) {
                    this.state = value;
                }

            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="actualAmt" type="{http://www.w3.org/2001/XMLSchema}int"/>
             *         &lt;element name="changeAmt" type="{http://www.w3.org/2001/XMLSchema}int"/>
             *         &lt;element name="periodAmt" type="{http://www.w3.org/2001/XMLSchema}int"/>
             *         &lt;element name="premiumType" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *       &lt;/sequence>
             *       &lt;attribute name="premiumCd" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "actualAmt",
                "changeAmt",
                "periodAmt",
                "premiumType"
            })
            public static class PremiumEntry {

                protected int actualAmt;
                protected int changeAmt;
                protected int periodAmt;
                @XmlElement(required = true)
                protected String premiumType;
                @XmlAttribute(name = "premiumCd")
                protected String premiumCd;

                /**
                 * Gets the value of the actualAmt property.
                 * 
                 */
                public int getActualAmt() {
                    return actualAmt;
                }

                /**
                 * Sets the value of the actualAmt property.
                 * 
                 */
                public void setActualAmt(int value) {
                    this.actualAmt = value;
                }

                /**
                 * Gets the value of the changeAmt property.
                 * 
                 */
                public int getChangeAmt() {
                    return changeAmt;
                }

                /**
                 * Sets the value of the changeAmt property.
                 * 
                 */
                public void setChangeAmt(int value) {
                    this.changeAmt = value;
                }

                /**
                 * Gets the value of the periodAmt property.
                 * 
                 */
                public int getPeriodAmt() {
                    return periodAmt;
                }

                /**
                 * Sets the value of the periodAmt property.
                 * 
                 */
                public void setPeriodAmt(int value) {
                    this.periodAmt = value;
                }

                /**
                 * Gets the value of the premiumType property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPremiumType() {
                    return premiumType;
                }

                /**
                 * Sets the value of the premiumType property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPremiumType(String value) {
                    this.premiumType = value;
                }

                /**
                 * Gets the value of the premiumCd property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPremiumCd() {
                    return premiumCd;
                }

                /**
                 * Sets the value of the premiumCd property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPremiumCd(String value) {
                    this.premiumCd = value;
                }

            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="collSymbol" type="{http://www.w3.org/2001/XMLSchema}int"/>
             *         &lt;element name="collSymbolRef" type="{http://www.w3.org/2001/XMLSchema}int"/>
             *         &lt;element name="compSymbol" type="{http://www.w3.org/2001/XMLSchema}int"/>
             *         &lt;element name="compSymbolRef" type="{http://www.w3.org/2001/XMLSchema}int"/>
             *         &lt;element name="distanceOneWay" type="{http://www.w3.org/2001/XMLSchema}int"/>
             *         &lt;element name="effectivedt" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="fromBlueBookInd" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="inspected" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="isVehRegularUse" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="liabilitySymbol" type="{http://www.w3.org/2001/XMLSchema}int"/>
             *         &lt;element name="numDaysDrivenPerWeek" type="{http://www.w3.org/2001/XMLSchema}int"/>
             *         &lt;element name="pipMedSymbol" type="{http://www.w3.org/2001/XMLSchema}int"/>
             *         &lt;element name="registrationStateCd" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="vehicleUsageCd" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *       &lt;/sequence>
             *       &lt;attribute name="state" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "collSymbol",
                "collSymbolRef",
                "compSymbol",
                "compSymbolRef",
                "distanceOneWay",
                "effectivedt",
                "fromBlueBookInd",
                "inspected",
                "isVehRegularUse",
                "liabilitySymbol",
                "numDaysDrivenPerWeek",
                "pipMedSymbol",
                "registrationStateCd",
                "vehicleUsageCd"
            })
            public static class VehicleRatingInfo {

                protected int collSymbol;
                protected int collSymbolRef;
                protected int compSymbol;
                protected int compSymbolRef;
                protected int distanceOneWay;
                @XmlElement(required = true)
                protected String effectivedt;
                @XmlElement(required = true)
                protected String fromBlueBookInd;
                @XmlElement(required = true)
                protected String inspected;
                @XmlElement(required = true)
                protected String isVehRegularUse;
                protected int liabilitySymbol;
                protected int numDaysDrivenPerWeek;
                protected int pipMedSymbol;
                @XmlElement(required = true)
                protected String registrationStateCd;
                @XmlElement(required = true)
                protected String vehicleUsageCd;
                @XmlAttribute(name = "state")
                protected String state;

                /**
                 * Gets the value of the collSymbol property.
                 * 
                 */
                public int getCollSymbol() {
                    return collSymbol;
                }

                /**
                 * Sets the value of the collSymbol property.
                 * 
                 */
                public void setCollSymbol(int value) {
                    this.collSymbol = value;
                }

                /**
                 * Gets the value of the collSymbolRef property.
                 * 
                 */
                public int getCollSymbolRef() {
                    return collSymbolRef;
                }

                /**
                 * Sets the value of the collSymbolRef property.
                 * 
                 */
                public void setCollSymbolRef(int value) {
                    this.collSymbolRef = value;
                }

                /**
                 * Gets the value of the compSymbol property.
                 * 
                 */
                public int getCompSymbol() {
                    return compSymbol;
                }

                /**
                 * Sets the value of the compSymbol property.
                 * 
                 */
                public void setCompSymbol(int value) {
                    this.compSymbol = value;
                }

                /**
                 * Gets the value of the compSymbolRef property.
                 * 
                 */
                public int getCompSymbolRef() {
                    return compSymbolRef;
                }

                /**
                 * Sets the value of the compSymbolRef property.
                 * 
                 */
                public void setCompSymbolRef(int value) {
                    this.compSymbolRef = value;
                }

                /**
                 * Gets the value of the distanceOneWay property.
                 * 
                 */
                public int getDistanceOneWay() {
                    return distanceOneWay;
                }

                /**
                 * Sets the value of the distanceOneWay property.
                 * 
                 */
                public void setDistanceOneWay(int value) {
                    this.distanceOneWay = value;
                }

                /**
                 * Gets the value of the effectivedt property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getEffectivedt() {
                    return effectivedt;
                }

                /**
                 * Sets the value of the effectivedt property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setEffectivedt(String value) {
                    this.effectivedt = value;
                }

                /**
                 * Gets the value of the fromBlueBookInd property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getFromBlueBookInd() {
                    return fromBlueBookInd;
                }

                /**
                 * Sets the value of the fromBlueBookInd property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setFromBlueBookInd(String value) {
                    this.fromBlueBookInd = value;
                }

                /**
                 * Gets the value of the inspected property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getInspected() {
                    return inspected;
                }

                /**
                 * Sets the value of the inspected property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setInspected(String value) {
                    this.inspected = value;
                }

                /**
                 * Gets the value of the isVehRegularUse property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getIsVehRegularUse() {
                    return isVehRegularUse;
                }

                /**
                 * Sets the value of the isVehRegularUse property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setIsVehRegularUse(String value) {
                    this.isVehRegularUse = value;
                }

                /**
                 * Gets the value of the liabilitySymbol property.
                 * 
                 */
                public int getLiabilitySymbol() {
                    return liabilitySymbol;
                }

                /**
                 * Sets the value of the liabilitySymbol property.
                 * 
                 */
                public void setLiabilitySymbol(int value) {
                    this.liabilitySymbol = value;
                }

                /**
                 * Gets the value of the numDaysDrivenPerWeek property.
                 * 
                 */
                public int getNumDaysDrivenPerWeek() {
                    return numDaysDrivenPerWeek;
                }

                /**
                 * Sets the value of the numDaysDrivenPerWeek property.
                 * 
                 */
                public void setNumDaysDrivenPerWeek(int value) {
                    this.numDaysDrivenPerWeek = value;
                }

                /**
                 * Gets the value of the pipMedSymbol property.
                 * 
                 */
                public int getPipMedSymbol() {
                    return pipMedSymbol;
                }

                /**
                 * Sets the value of the pipMedSymbol property.
                 * 
                 */
                public void setPipMedSymbol(int value) {
                    this.pipMedSymbol = value;
                }

                /**
                 * Gets the value of the registrationStateCd property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getRegistrationStateCd() {
                    return registrationStateCd;
                }

                /**
                 * Sets the value of the registrationStateCd property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setRegistrationStateCd(String value) {
                    this.registrationStateCd = value;
                }

                /**
                 * Gets the value of the vehicleUsageCd property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getVehicleUsageCd() {
                    return vehicleUsageCd;
                }

                /**
                 * Sets the value of the vehicleUsageCd property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setVehicleUsageCd(String value) {
                    this.vehicleUsageCd = value;
                }

                /**
                 * Gets the value of the state property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getState() {
                    return state;
                }

                /**
                 * Sets the value of the state property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setState(String value) {
                    this.state = value;
                }

            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="applicable" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *       &lt;/sequence>
         *       &lt;attribute name="state" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "applicable"
        })
        public static class VehicleHomeAlterationVHACoverage {

            @XmlElement(required = true)
            protected String applicable;
            @XmlAttribute(name = "state")
            protected String state;

            /**
             * Gets the value of the applicable property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getApplicable() {
                return applicable;
            }

            /**
             * Sets the value of the applicable property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setApplicable(String value) {
                this.applicable = value;
            }

            /**
             * Gets the value of the state property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getState() {
                return state;
            }

            /**
             * Sets the value of the state property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setState(String value) {
                this.state = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="applicable" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *       &lt;/sequence>
         *       &lt;attribute name="state" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "applicable"
        })
        public static class WorkLossWLC {

            @XmlElement(required = true)
            protected String applicable;
            @XmlAttribute(name = "state")
            protected String state;

            /**
             * Gets the value of the applicable property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getApplicable() {
                return applicable;
            }

            /**
             * Sets the value of the applicable property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setApplicable(String value) {
                this.applicable = value;
            }

            /**
             * Gets the value of the state property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getState() {
                return state;
            }

            /**
             * Sets the value of the state property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setState(String value) {
                this.state = value;
            }

        }

    }

}
