
package generated_1506187282094;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="Batch_ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="File_ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Valid" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Entity_ID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Contract_ID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Line_Code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Sub_Line" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Contract_Num" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Contract_State" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Revision_Object_Code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Incept_Date" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Eff_Date" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Exp_Date" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Revision_Eff_Date" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Revision_Exp_Date" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Cancel_Date" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Reinstate_Date" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Created_On" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Prior_Contract_Num" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Original_Contract_Num" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Renewed_Ind" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Renewal_Term" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="New_To_Book_Ind" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="New_To_Supplier_Ind" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Non_Renew_Ind" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Revision_Num" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Endorse_Num" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Inst_Bill_Ind" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Written_Prem" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Full_Term_Prem" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Billed_Prem" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Written_Fee" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Full_Term_Fee" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Billed_Fee" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Written_Tax" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Full_Term_Tax" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Billed_Tax" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Net_Change_Prem" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Net_Change_Tax" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Net_Change_Fee" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Unbilled_Prem" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Unbilled_Tax" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Unbilled_Fee" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Booked_Prem" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Booked_Tax" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Booked_Fee" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Min_Earned_Amount" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Entity_Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Indv_First_Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Indv_Middle_Name" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="Indv_Last_Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Mail_Address_1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Mail_City" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Mail_County" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Mail_Zip" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Mail_State" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Accept_Limit_Usage" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="All_Adults_Gen_Use_Veh" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Enclosed_Private_Garage" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Any_Fire_Flood_Claims" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Any_Repairs_Done" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Active_Military" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="All_Veh_Cust_Control" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Inexperienced_Drivers" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="At_Fault_Accidents" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DUI_Reckless_Conviction" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Drivers">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Driver">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Contract_ID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                             &lt;element name="Article_ID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                             &lt;element name="Article_Desc" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="Article_Type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="Article_Class" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="Book_Driver_Num" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                             &lt;element name="Insured_Type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="Excluded_Ind" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="Relation_To_Applicant" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="Relation_To_Applicant_Desc" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="Defensive_Driver_Ind" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="Will_Drive_Insured_Vehicle" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="Assigned_Risk_Ind" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="Driving_Experience" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                             &lt;element name="Birth_Date" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="Occupation_Class" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="Occupation_Class_Desc" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="Drvr_Lic_Num" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="Drvr_Lic_State" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="Marital_Status" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="Marital_Status_Desc" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="mvr_clean_record_ind" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="Violations" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Vehicles">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Vehicle" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Contract_ID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                             &lt;element name="Article_ID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                             &lt;element name="Article_Desc" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="Article_Type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="Article_Class" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="Comp_Veh_Num" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                             &lt;element name="Book_Veh_Num" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                             &lt;element name="Veh_Year" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                             &lt;element name="Veh_Make" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="Veh_Model" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="Veh_Body_Type_Code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="Veh_Vody_Type_Desc" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="Veh_Type_Code" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                             &lt;element name="Veh_Type_Desc" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="VIN" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="Garaging_Code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="Garaging_Desc" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="Annual_Mileage" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                             &lt;element name="Stated_Amount" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *                             &lt;element name="Condition_Code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="Condition_Desc" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="Usage_Car_Shows_Ind" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="Usage_Visitors_Ind" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="Usage_Maintenance_Ind" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="Usage_Racing_Ind" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="Usage_Drivers_Ed_Events_Ind" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="Usage_General_Transport_Ind" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="Usage_Errands_Ind" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="Usage_Work_Ind" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="Usage_Vacation_Ind" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="Usage_Restaurants_Ind" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="Usage_Recreational_Ind" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="Usage_Off_Road_Ind" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="Usage_Other_Ind" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="Registration_Country" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="Locations">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Location">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="Contract_ID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                                                 &lt;element name="Article_ID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                                                 &lt;element name="book_veh_num" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                                                 &lt;element name="Loc_Num" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                                                 &lt;element name="Loc_Desc" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                 &lt;element name="Address_Line_1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                 &lt;element name="City" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                 &lt;element name="State" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                 &lt;element name="Zip" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                                                 &lt;element name="Country" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Vehicle_Products">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Vehicle_Product" maxOccurs="unbounded">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="Contract_ID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                                                 &lt;element name="Article_ID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                                                 &lt;element name="Product_Cost_Type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                 &lt;element name="Full_Term_Amount" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *                                                 &lt;element name="Written_Amount" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *                                                 &lt;element name="Unbilled_Amount" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *                                                 &lt;element name="Net_Change_Amount" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *                                                 &lt;element name="Fully_Earned_Ind" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                 &lt;element name="Product_Desc" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                 &lt;element name="Product_Code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                 &lt;element name="MPA_Or_Disc_Surcharge_Selection" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="Ded_1" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                                                 &lt;element name="Limit_1" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                                                 &lt;element name="Dollar_or_Percent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="Rejected_Ind" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
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
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Policy_Articles">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Policy_Article">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Contract_ID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                             &lt;element name="Article_ID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                             &lt;element name="Article_Desc" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="Article_Type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="Article_Class" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="Policy_Products">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Policy_Product" maxOccurs="unbounded">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="Contract_ID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                                                 &lt;element name="Article_ID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                                                 &lt;element name="Product_Cost_Type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                 &lt;element name="Full_Term_Amount" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *                                                 &lt;element name="Written_Amount" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *                                                 &lt;element name="Unbilled_Amount" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *                                                 &lt;element name="Net_Change_Amount" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *                                                 &lt;element name="Fully_Earned_Ind" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                 &lt;element name="Product_Desc" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                 &lt;element name="Product_Code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                 &lt;element name="Limit_1" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                                                 &lt;element name="Rejected_Ind" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
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
    "batchID",
    "fileID",
    "valid",
    "entityID",
    "contractID",
    "lineCode",
    "subLine",
    "contractNum",
    "contractState",
    "revisionObjectCode",
    "inceptDate",
    "effDate",
    "expDate",
    "revisionEffDate",
    "revisionExpDate",
    "cancelDate",
    "reinstateDate",
    "createdOn",
    "priorContractNum",
    "originalContractNum",
    "renewedInd",
    "renewalTerm",
    "newToBookInd",
    "newToSupplierInd",
    "nonRenewInd",
    "revisionNum",
    "endorseNum",
    "instBillInd",
    "writtenPrem",
    "fullTermPrem",
    "billedPrem",
    "writtenFee",
    "fullTermFee",
    "billedFee",
    "writtenTax",
    "fullTermTax",
    "billedTax",
    "netChangePrem",
    "netChangeTax",
    "netChangeFee",
    "unbilledPrem",
    "unbilledTax",
    "unbilledFee",
    "bookedPrem",
    "bookedTax",
    "bookedFee",
    "minEarnedAmount",
    "entityName",
    "indvFirstName",
    "indvMiddleName",
    "indvLastName",
    "mailAddress1",
    "mailCity",
    "mailCounty",
    "mailZip",
    "mailState",
    "acceptLimitUsage",
    "allAdultsGenUseVeh",
    "enclosedPrivateGarage",
    "anyFireFloodClaims",
    "anyRepairsDone",
    "activeMilitary",
    "allVehCustControl",
    "inexperiencedDrivers",
    "atFaultAccidents",
    "duiRecklessConviction",
    "drivers",
    "vehicles",
    "policyArticles"
})
@XmlRootElement(name = "Policy")
public class Policy {

    @XmlElement(name = "Batch_ID", required = true)
    protected String batchID;
    @XmlElement(name = "File_ID", required = true)
    protected String fileID;
    @XmlElement(name = "Valid", required = true)
    protected String valid;
    @XmlElement(name = "Entity_ID")
    protected int entityID;
    @XmlElement(name = "Contract_ID")
    protected int contractID;
    @XmlElement(name = "Line_Code", required = true)
    protected String lineCode;
    @XmlElement(name = "Sub_Line", required = true)
    protected String subLine;
    @XmlElement(name = "Contract_Num", required = true)
    protected String contractNum;
    @XmlElement(name = "Contract_State", required = true)
    protected String contractState;
    @XmlElement(name = "Revision_Object_Code", required = true)
    protected String revisionObjectCode;
    @XmlElement(name = "Incept_Date", required = true)
    protected String inceptDate;
    @XmlElement(name = "Eff_Date", required = true)
    protected String effDate;
    @XmlElement(name = "Exp_Date", required = true)
    protected String expDate;
    @XmlElement(name = "Revision_Eff_Date", required = true)
    protected String revisionEffDate;
    @XmlElement(name = "Revision_Exp_Date", required = true)
    protected String revisionExpDate;
    @XmlElement(name = "Cancel_Date", required = true)
    protected String cancelDate;
    @XmlElement(name = "Reinstate_Date", required = true)
    protected String reinstateDate;
    @XmlElement(name = "Created_On", required = true)
    protected String createdOn;
    @XmlElement(name = "Prior_Contract_Num", required = true)
    protected String priorContractNum;
    @XmlElement(name = "Original_Contract_Num", required = true)
    protected String originalContractNum;
    @XmlElement(name = "Renewed_Ind", required = true)
    protected String renewedInd;
    @XmlElement(name = "Renewal_Term")
    protected int renewalTerm;
    @XmlElement(name = "New_To_Book_Ind", required = true)
    protected String newToBookInd;
    @XmlElement(name = "New_To_Supplier_Ind", required = true)
    protected String newToSupplierInd;
    @XmlElement(name = "Non_Renew_Ind", required = true)
    protected String nonRenewInd;
    @XmlElement(name = "Revision_Num")
    protected int revisionNum;
    @XmlElement(name = "Endorse_Num")
    protected Integer endorseNum;
    @XmlElement(name = "Inst_Bill_Ind", required = true)
    protected String instBillInd;
    @XmlElement(name = "Written_Prem")
    protected double writtenPrem;
    @XmlElement(name = "Full_Term_Prem")
    protected double fullTermPrem;
    @XmlElement(name = "Billed_Prem")
    protected double billedPrem;
    @XmlElement(name = "Written_Fee")
    protected double writtenFee;
    @XmlElement(name = "Full_Term_Fee")
    protected double fullTermFee;
    @XmlElement(name = "Billed_Fee")
    protected double billedFee;
    @XmlElement(name = "Written_Tax")
    protected double writtenTax;
    @XmlElement(name = "Full_Term_Tax")
    protected double fullTermTax;
    @XmlElement(name = "Billed_Tax")
    protected double billedTax;
    @XmlElement(name = "Net_Change_Prem")
    protected double netChangePrem;
    @XmlElement(name = "Net_Change_Tax")
    protected double netChangeTax;
    @XmlElement(name = "Net_Change_Fee")
    protected double netChangeFee;
    @XmlElement(name = "Unbilled_Prem")
    protected double unbilledPrem;
    @XmlElement(name = "Unbilled_Tax")
    protected double unbilledTax;
    @XmlElement(name = "Unbilled_Fee")
    protected double unbilledFee;
    @XmlElement(name = "Booked_Prem")
    protected double bookedPrem;
    @XmlElement(name = "Booked_Tax")
    protected double bookedTax;
    @XmlElement(name = "Booked_Fee")
    protected double bookedFee;
    @XmlElement(name = "Min_Earned_Amount")
    protected double minEarnedAmount;
    @XmlElement(name = "Entity_Name", required = true)
    protected String entityName;
    @XmlElement(name = "Indv_First_Name", required = true)
    protected String indvFirstName;
    @XmlElement(name = "Indv_Middle_Name", required = true)
    protected Object indvMiddleName;
    @XmlElement(name = "Indv_Last_Name", required = true)
    protected String indvLastName;
    @XmlElement(name = "Mail_Address_1", required = true)
    protected String mailAddress1;
    @XmlElement(name = "Mail_City", required = true)
    protected String mailCity;
    @XmlElement(name = "Mail_County", required = true)
    protected String mailCounty;
    @XmlElement(name = "Mail_Zip")
    protected int mailZip;
    @XmlElement(name = "Mail_State", required = true)
    protected String mailState;
    @XmlElement(name = "Accept_Limit_Usage", required = true)
    protected String acceptLimitUsage;
    @XmlElement(name = "All_Adults_Gen_Use_Veh", required = true)
    protected String allAdultsGenUseVeh;
    @XmlElement(name = "Enclosed_Private_Garage", required = true)
    protected String enclosedPrivateGarage;
    @XmlElement(name = "Any_Fire_Flood_Claims", required = true)
    protected String anyFireFloodClaims;
    @XmlElement(name = "Any_Repairs_Done", required = true)
    protected String anyRepairsDone;
    @XmlElement(name = "Active_Military", required = true)
    protected String activeMilitary;
    @XmlElement(name = "All_Veh_Cust_Control", required = true)
    protected String allVehCustControl;
    @XmlElement(name = "Inexperienced_Drivers", required = true)
    protected String inexperiencedDrivers;
    @XmlElement(name = "At_Fault_Accidents", required = true)
    protected String atFaultAccidents;
    @XmlElement(name = "DUI_Reckless_Conviction", required = true)
    protected String duiRecklessConviction;
    @XmlElement(name = "Drivers", required = true)
    protected Policy.Drivers drivers;
    @XmlElement(name = "Vehicles", required = true)
    protected Policy.Vehicles vehicles;
    @XmlElement(name = "Policy_Articles", required = true)
    protected Policy.PolicyArticles policyArticles;

    /**
     * Gets the value of the batchID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBatchID() {
        return batchID;
    }

    /**
     * Sets the value of the batchID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBatchID(String value) {
        this.batchID = value;
    }

    /**
     * Gets the value of the fileID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileID() {
        return fileID;
    }

    /**
     * Sets the value of the fileID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileID(String value) {
        this.fileID = value;
    }

    /**
     * Gets the value of the valid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValid() {
        return valid;
    }

    /**
     * Sets the value of the valid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValid(String value) {
        this.valid = value;
    }

    /**
     * Gets the value of the entityID property.
     * 
     */
    public int getEntityID() {
        return entityID;
    }

    /**
     * Sets the value of the entityID property.
     * 
     */
    public void setEntityID(int value) {
        this.entityID = value;
    }

    /**
     * Gets the value of the contractID property.
     * 
     */
    public int getContractID() {
        return contractID;
    }

    /**
     * Sets the value of the contractID property.
     * 
     */
    public void setContractID(int value) {
        this.contractID = value;
    }

    /**
     * Gets the value of the lineCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLineCode() {
        return lineCode;
    }

    /**
     * Sets the value of the lineCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLineCode(String value) {
        this.lineCode = value;
    }

    /**
     * Gets the value of the subLine property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubLine() {
        return subLine;
    }

    /**
     * Sets the value of the subLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubLine(String value) {
        this.subLine = value;
    }

    /**
     * Gets the value of the contractNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractNum() {
        return contractNum;
    }

    /**
     * Sets the value of the contractNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContractNum(String value) {
        this.contractNum = value;
    }

    /**
     * Gets the value of the contractState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractState() {
        return contractState;
    }

    /**
     * Sets the value of the contractState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContractState(String value) {
        this.contractState = value;
    }

    /**
     * Gets the value of the revisionObjectCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRevisionObjectCode() {
        return revisionObjectCode;
    }

    /**
     * Sets the value of the revisionObjectCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRevisionObjectCode(String value) {
        this.revisionObjectCode = value;
    }

    /**
     * Gets the value of the inceptDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInceptDate() {
        return inceptDate;
    }

    /**
     * Sets the value of the inceptDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInceptDate(String value) {
        this.inceptDate = value;
    }

    /**
     * Gets the value of the effDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEffDate() {
        return effDate;
    }

    /**
     * Sets the value of the effDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEffDate(String value) {
        this.effDate = value;
    }

    /**
     * Gets the value of the expDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpDate() {
        return expDate;
    }

    /**
     * Sets the value of the expDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpDate(String value) {
        this.expDate = value;
    }

    /**
     * Gets the value of the revisionEffDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRevisionEffDate() {
        return revisionEffDate;
    }

    /**
     * Sets the value of the revisionEffDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRevisionEffDate(String value) {
        this.revisionEffDate = value;
    }

    /**
     * Gets the value of the revisionExpDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRevisionExpDate() {
        return revisionExpDate;
    }

    /**
     * Sets the value of the revisionExpDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRevisionExpDate(String value) {
        this.revisionExpDate = value;
    }

    /**
     * Gets the value of the cancelDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCancelDate() {
        return cancelDate;
    }

    /**
     * Sets the value of the cancelDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCancelDate(String value) {
        this.cancelDate = value;
    }

    /**
     * Gets the value of the reinstateDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReinstateDate() {
        return reinstateDate;
    }

    /**
     * Sets the value of the reinstateDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReinstateDate(String value) {
        this.reinstateDate = value;
    }

    /**
     * Gets the value of the createdOn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreatedOn() {
        return createdOn;
    }

    /**
     * Sets the value of the createdOn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreatedOn(String value) {
        this.createdOn = value;
    }

    /**
     * Gets the value of the priorContractNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriorContractNum() {
        return priorContractNum;
    }

    /**
     * Sets the value of the priorContractNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriorContractNum(String value) {
        this.priorContractNum = value;
    }

    /**
     * Gets the value of the originalContractNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginalContractNum() {
        return originalContractNum;
    }

    /**
     * Sets the value of the originalContractNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginalContractNum(String value) {
        this.originalContractNum = value;
    }

    /**
     * Gets the value of the renewedInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRenewedInd() {
        return renewedInd;
    }

    /**
     * Sets the value of the renewedInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRenewedInd(String value) {
        this.renewedInd = value;
    }

    /**
     * Gets the value of the renewalTerm property.
     * 
     */
    public int getRenewalTerm() {
        return renewalTerm;
    }

    /**
     * Sets the value of the renewalTerm property.
     * 
     */
    public void setRenewalTerm(int value) {
        this.renewalTerm = value;
    }

    /**
     * Gets the value of the newToBookInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewToBookInd() {
        return newToBookInd;
    }

    /**
     * Sets the value of the newToBookInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewToBookInd(String value) {
        this.newToBookInd = value;
    }

    /**
     * Gets the value of the newToSupplierInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewToSupplierInd() {
        return newToSupplierInd;
    }

    /**
     * Sets the value of the newToSupplierInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewToSupplierInd(String value) {
        this.newToSupplierInd = value;
    }

    /**
     * Gets the value of the nonRenewInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNonRenewInd() {
        return nonRenewInd;
    }

    /**
     * Sets the value of the nonRenewInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNonRenewInd(String value) {
        this.nonRenewInd = value;
    }

    /**
     * Gets the value of the revisionNum property.
     * 
     */
    public int getRevisionNum() {
        return revisionNum;
    }

    /**
     * Sets the value of the revisionNum property.
     * 
     */
    public void setRevisionNum(int value) {
        this.revisionNum = value;
    }

    /**
     * Gets the value of the endorseNum property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEndorseNum() {
        return endorseNum;
    }

    /**
     * Sets the value of the endorseNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEndorseNum(Integer value) {
        this.endorseNum = value;
    }

    /**
     * Gets the value of the instBillInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstBillInd() {
        return instBillInd;
    }

    /**
     * Sets the value of the instBillInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstBillInd(String value) {
        this.instBillInd = value;
    }

    /**
     * Gets the value of the writtenPrem property.
     * 
     */
    public double getWrittenPrem() {
        return writtenPrem;
    }

    /**
     * Sets the value of the writtenPrem property.
     * 
     */
    public void setWrittenPrem(double value) {
        this.writtenPrem = value;
    }

    /**
     * Gets the value of the fullTermPrem property.
     * 
     */
    public double getFullTermPrem() {
        return fullTermPrem;
    }

    /**
     * Sets the value of the fullTermPrem property.
     * 
     */
    public void setFullTermPrem(double value) {
        this.fullTermPrem = value;
    }

    /**
     * Gets the value of the billedPrem property.
     * 
     */
    public double getBilledPrem() {
        return billedPrem;
    }

    /**
     * Sets the value of the billedPrem property.
     * 
     */
    public void setBilledPrem(double value) {
        this.billedPrem = value;
    }

    /**
     * Gets the value of the writtenFee property.
     * 
     */
    public double getWrittenFee() {
        return writtenFee;
    }

    /**
     * Sets the value of the writtenFee property.
     * 
     */
    public void setWrittenFee(double value) {
        this.writtenFee = value;
    }

    /**
     * Gets the value of the fullTermFee property.
     * 
     */
    public double getFullTermFee() {
        return fullTermFee;
    }

    /**
     * Sets the value of the fullTermFee property.
     * 
     */
    public void setFullTermFee(double value) {
        this.fullTermFee = value;
    }

    /**
     * Gets the value of the billedFee property.
     * 
     */
    public double getBilledFee() {
        return billedFee;
    }

    /**
     * Sets the value of the billedFee property.
     * 
     */
    public void setBilledFee(double value) {
        this.billedFee = value;
    }

    /**
     * Gets the value of the writtenTax property.
     * 
     */
    public double getWrittenTax() {
        return writtenTax;
    }

    /**
     * Sets the value of the writtenTax property.
     * 
     */
    public void setWrittenTax(double value) {
        this.writtenTax = value;
    }

    /**
     * Gets the value of the fullTermTax property.
     * 
     */
    public double getFullTermTax() {
        return fullTermTax;
    }

    /**
     * Sets the value of the fullTermTax property.
     * 
     */
    public void setFullTermTax(double value) {
        this.fullTermTax = value;
    }

    /**
     * Gets the value of the billedTax property.
     * 
     */
    public double getBilledTax() {
        return billedTax;
    }

    /**
     * Sets the value of the billedTax property.
     * 
     */
    public void setBilledTax(double value) {
        this.billedTax = value;
    }

    /**
     * Gets the value of the netChangePrem property.
     * 
     */
    public double getNetChangePrem() {
        return netChangePrem;
    }

    /**
     * Sets the value of the netChangePrem property.
     * 
     */
    public void setNetChangePrem(double value) {
        this.netChangePrem = value;
    }

    /**
     * Gets the value of the netChangeTax property.
     * 
     */
    public double getNetChangeTax() {
        return netChangeTax;
    }

    /**
     * Sets the value of the netChangeTax property.
     * 
     */
    public void setNetChangeTax(double value) {
        this.netChangeTax = value;
    }

    /**
     * Gets the value of the netChangeFee property.
     * 
     */
    public double getNetChangeFee() {
        return netChangeFee;
    }

    /**
     * Sets the value of the netChangeFee property.
     * 
     */
    public void setNetChangeFee(double value) {
        this.netChangeFee = value;
    }

    /**
     * Gets the value of the unbilledPrem property.
     * 
     */
    public double getUnbilledPrem() {
        return unbilledPrem;
    }

    /**
     * Sets the value of the unbilledPrem property.
     * 
     */
    public void setUnbilledPrem(double value) {
        this.unbilledPrem = value;
    }

    /**
     * Gets the value of the unbilledTax property.
     * 
     */
    public double getUnbilledTax() {
        return unbilledTax;
    }

    /**
     * Sets the value of the unbilledTax property.
     * 
     */
    public void setUnbilledTax(double value) {
        this.unbilledTax = value;
    }

    /**
     * Gets the value of the unbilledFee property.
     * 
     */
    public double getUnbilledFee() {
        return unbilledFee;
    }

    /**
     * Sets the value of the unbilledFee property.
     * 
     */
    public void setUnbilledFee(double value) {
        this.unbilledFee = value;
    }

    /**
     * Gets the value of the bookedPrem property.
     * 
     */
    public double getBookedPrem() {
        return bookedPrem;
    }

    /**
     * Sets the value of the bookedPrem property.
     * 
     */
    public void setBookedPrem(double value) {
        this.bookedPrem = value;
    }

    /**
     * Gets the value of the bookedTax property.
     * 
     */
    public double getBookedTax() {
        return bookedTax;
    }

    /**
     * Sets the value of the bookedTax property.
     * 
     */
    public void setBookedTax(double value) {
        this.bookedTax = value;
    }

    /**
     * Gets the value of the bookedFee property.
     * 
     */
    public double getBookedFee() {
        return bookedFee;
    }

    /**
     * Sets the value of the bookedFee property.
     * 
     */
    public void setBookedFee(double value) {
        this.bookedFee = value;
    }

    /**
     * Gets the value of the minEarnedAmount property.
     * 
     */
    public double getMinEarnedAmount() {
        return minEarnedAmount;
    }

    /**
     * Sets the value of the minEarnedAmount property.
     * 
     */
    public void setMinEarnedAmount(double value) {
        this.minEarnedAmount = value;
    }

    /**
     * Gets the value of the entityName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntityName() {
        return entityName;
    }

    /**
     * Sets the value of the entityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntityName(String value) {
        this.entityName = value;
    }

    /**
     * Gets the value of the indvFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndvFirstName() {
        return indvFirstName;
    }

    /**
     * Sets the value of the indvFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndvFirstName(String value) {
        this.indvFirstName = value;
    }

    /**
     * Gets the value of the indvMiddleName property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getIndvMiddleName() {
        return indvMiddleName;
    }

    /**
     * Sets the value of the indvMiddleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setIndvMiddleName(Object value) {
        this.indvMiddleName = value;
    }

    /**
     * Gets the value of the indvLastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndvLastName() {
        return indvLastName;
    }

    /**
     * Sets the value of the indvLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndvLastName(String value) {
        this.indvLastName = value;
    }

    /**
     * Gets the value of the mailAddress1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMailAddress1() {
        return mailAddress1;
    }

    /**
     * Sets the value of the mailAddress1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMailAddress1(String value) {
        this.mailAddress1 = value;
    }

    /**
     * Gets the value of the mailCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMailCity() {
        return mailCity;
    }

    /**
     * Sets the value of the mailCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMailCity(String value) {
        this.mailCity = value;
    }

    /**
     * Gets the value of the mailCounty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMailCounty() {
        return mailCounty;
    }

    /**
     * Sets the value of the mailCounty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMailCounty(String value) {
        this.mailCounty = value;
    }

    /**
     * Gets the value of the mailZip property.
     * 
     */
    public int getMailZip() {
        return mailZip;
    }

    /**
     * Sets the value of the mailZip property.
     * 
     */
    public void setMailZip(int value) {
        this.mailZip = value;
    }

    /**
     * Gets the value of the mailState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMailState() {
        return mailState;
    }

    /**
     * Sets the value of the mailState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMailState(String value) {
        this.mailState = value;
    }

    /**
     * Gets the value of the acceptLimitUsage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcceptLimitUsage() {
        return acceptLimitUsage;
    }

    /**
     * Sets the value of the acceptLimitUsage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcceptLimitUsage(String value) {
        this.acceptLimitUsage = value;
    }

    /**
     * Gets the value of the allAdultsGenUseVeh property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAllAdultsGenUseVeh() {
        return allAdultsGenUseVeh;
    }

    /**
     * Sets the value of the allAdultsGenUseVeh property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAllAdultsGenUseVeh(String value) {
        this.allAdultsGenUseVeh = value;
    }

    /**
     * Gets the value of the enclosedPrivateGarage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnclosedPrivateGarage() {
        return enclosedPrivateGarage;
    }

    /**
     * Sets the value of the enclosedPrivateGarage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnclosedPrivateGarage(String value) {
        this.enclosedPrivateGarage = value;
    }

    /**
     * Gets the value of the anyFireFloodClaims property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnyFireFloodClaims() {
        return anyFireFloodClaims;
    }

    /**
     * Sets the value of the anyFireFloodClaims property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnyFireFloodClaims(String value) {
        this.anyFireFloodClaims = value;
    }

    /**
     * Gets the value of the anyRepairsDone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnyRepairsDone() {
        return anyRepairsDone;
    }

    /**
     * Sets the value of the anyRepairsDone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnyRepairsDone(String value) {
        this.anyRepairsDone = value;
    }

    /**
     * Gets the value of the activeMilitary property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActiveMilitary() {
        return activeMilitary;
    }

    /**
     * Sets the value of the activeMilitary property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActiveMilitary(String value) {
        this.activeMilitary = value;
    }

    /**
     * Gets the value of the allVehCustControl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAllVehCustControl() {
        return allVehCustControl;
    }

    /**
     * Sets the value of the allVehCustControl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAllVehCustControl(String value) {
        this.allVehCustControl = value;
    }

    /**
     * Gets the value of the inexperiencedDrivers property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInexperiencedDrivers() {
        return inexperiencedDrivers;
    }

    /**
     * Sets the value of the inexperiencedDrivers property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInexperiencedDrivers(String value) {
        this.inexperiencedDrivers = value;
    }

    /**
     * Gets the value of the atFaultAccidents property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAtFaultAccidents() {
        return atFaultAccidents;
    }

    /**
     * Sets the value of the atFaultAccidents property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAtFaultAccidents(String value) {
        this.atFaultAccidents = value;
    }

    /**
     * Gets the value of the duiRecklessConviction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDUIRecklessConviction() {
        return duiRecklessConviction;
    }

    /**
     * Sets the value of the duiRecklessConviction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDUIRecklessConviction(String value) {
        this.duiRecklessConviction = value;
    }

    /**
     * Gets the value of the drivers property.
     * 
     * @return
     *     possible object is
     *     {@link Policy.Drivers }
     *     
     */
    public Policy.Drivers getDrivers() {
        return drivers;
    }

    /**
     * Sets the value of the drivers property.
     * 
     * @param value
     *     allowed object is
     *     {@link Policy.Drivers }
     *     
     */
    public void setDrivers(Policy.Drivers value) {
        this.drivers = value;
    }

    /**
     * Gets the value of the vehicles property.
     * 
     * @return
     *     possible object is
     *     {@link Policy.Vehicles }
     *     
     */
    public Policy.Vehicles getVehicles() {
        return vehicles;
    }

    /**
     * Sets the value of the vehicles property.
     * 
     * @param value
     *     allowed object is
     *     {@link Policy.Vehicles }
     *     
     */
    public void setVehicles(Policy.Vehicles value) {
        this.vehicles = value;
    }

    /**
     * Gets the value of the policyArticles property.
     * 
     * @return
     *     possible object is
     *     {@link Policy.PolicyArticles }
     *     
     */
    public Policy.PolicyArticles getPolicyArticles() {
        return policyArticles;
    }

    /**
     * Sets the value of the policyArticles property.
     * 
     * @param value
     *     allowed object is
     *     {@link Policy.PolicyArticles }
     *     
     */
    public void setPolicyArticles(Policy.PolicyArticles value) {
        this.policyArticles = value;
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
     *         &lt;element name="Driver">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Contract_ID" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                   &lt;element name="Article_ID" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                   &lt;element name="Article_Desc" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="Article_Type" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="Article_Class" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="Book_Driver_Num" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                   &lt;element name="Insured_Type" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="Excluded_Ind" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="Relation_To_Applicant" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="Relation_To_Applicant_Desc" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="Defensive_Driver_Ind" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="Will_Drive_Insured_Vehicle" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="Assigned_Risk_Ind" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="Driving_Experience" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                   &lt;element name="Birth_Date" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="Occupation_Class" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="Occupation_Class_Desc" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="Drvr_Lic_Num" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="Drvr_Lic_State" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="Marital_Status" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="Marital_Status_Desc" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="mvr_clean_record_ind" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="Violations" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
     *                 &lt;/sequence>
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
        "driver"
    })
    public static class Drivers {

        @XmlElement(name = "Driver", required = true)
        protected Policy.Drivers.Driver driver;

        /**
         * Gets the value of the driver property.
         * 
         * @return
         *     possible object is
         *     {@link Policy.Drivers.Driver }
         *     
         */
        public Policy.Drivers.Driver getDriver() {
            return driver;
        }

        /**
         * Sets the value of the driver property.
         * 
         * @param value
         *     allowed object is
         *     {@link Policy.Drivers.Driver }
         *     
         */
        public void setDriver(Policy.Drivers.Driver value) {
            this.driver = value;
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
         *         &lt;element name="Contract_ID" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *         &lt;element name="Article_ID" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *         &lt;element name="Article_Desc" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="Article_Type" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="Article_Class" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="Book_Driver_Num" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *         &lt;element name="Insured_Type" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="Excluded_Ind" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="Relation_To_Applicant" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="Relation_To_Applicant_Desc" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="Defensive_Driver_Ind" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="Will_Drive_Insured_Vehicle" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="Assigned_Risk_Ind" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="Driving_Experience" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *         &lt;element name="Birth_Date" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="Occupation_Class" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="Occupation_Class_Desc" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="Drvr_Lic_Num" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="Drvr_Lic_State" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="Marital_Status" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="Marital_Status_Desc" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="mvr_clean_record_ind" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="Violations" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
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
            "contractID",
            "articleID",
            "articleDesc",
            "articleType",
            "articleClass",
            "status",
            "bookDriverNum",
            "insuredType",
            "excludedInd",
            "relationToApplicant",
            "relationToApplicantDesc",
            "defensiveDriverInd",
            "willDriveInsuredVehicle",
            "assignedRiskInd",
            "drivingExperience",
            "birthDate",
            "occupationClass",
            "occupationClassDesc",
            "drvrLicNum",
            "drvrLicState",
            "maritalStatus",
            "maritalStatusDesc",
            "mvrCleanRecordInd",
            "violations"
        })
        public static class Driver {

            @XmlElement(name = "Contract_ID")
            protected int contractID;
            @XmlElement(name = "Article_ID")
            protected int articleID;
            @XmlElement(name = "Article_Desc", required = true)
            protected String articleDesc;
            @XmlElement(name = "Article_Type", required = true)
            protected String articleType;
            @XmlElement(name = "Article_Class", required = true)
            protected String articleClass;
            @XmlElement(name = "Status", required = true)
            protected String status;
            @XmlElement(name = "Book_Driver_Num")
            protected int bookDriverNum;
            @XmlElement(name = "Insured_Type", required = true)
            protected String insuredType;
            @XmlElement(name = "Excluded_Ind", required = true)
            protected String excludedInd;
            @XmlElement(name = "Relation_To_Applicant", required = true)
            protected String relationToApplicant;
            @XmlElement(name = "Relation_To_Applicant_Desc", required = true)
            protected String relationToApplicantDesc;
            @XmlElement(name = "Defensive_Driver_Ind", required = true)
            protected String defensiveDriverInd;
            @XmlElement(name = "Will_Drive_Insured_Vehicle", required = true)
            protected String willDriveInsuredVehicle;
            @XmlElement(name = "Assigned_Risk_Ind", required = true)
            protected String assignedRiskInd;
            @XmlElement(name = "Driving_Experience")
            protected int drivingExperience;
            @XmlElement(name = "Birth_Date", required = true)
            protected String birthDate;
            @XmlElement(name = "Occupation_Class", required = true)
            protected String occupationClass;
            @XmlElement(name = "Occupation_Class_Desc", required = true)
            protected String occupationClassDesc;
            @XmlElement(name = "Drvr_Lic_Num", required = true)
            protected String drvrLicNum;
            @XmlElement(name = "Drvr_Lic_State", required = true)
            protected String drvrLicState;
            @XmlElement(name = "Marital_Status", required = true)
            protected String maritalStatus;
            @XmlElement(name = "Marital_Status_Desc", required = true)
            protected String maritalStatusDesc;
            @XmlElement(name = "mvr_clean_record_ind", required = true)
            protected String mvrCleanRecordInd;
            @XmlElement(name = "Violations", required = true)
            protected Object violations;

            /**
             * Gets the value of the contractID property.
             * 
             */
            public int getContractID() {
                return contractID;
            }

            /**
             * Sets the value of the contractID property.
             * 
             */
            public void setContractID(int value) {
                this.contractID = value;
            }

            /**
             * Gets the value of the articleID property.
             * 
             */
            public int getArticleID() {
                return articleID;
            }

            /**
             * Sets the value of the articleID property.
             * 
             */
            public void setArticleID(int value) {
                this.articleID = value;
            }

            /**
             * Gets the value of the articleDesc property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getArticleDesc() {
                return articleDesc;
            }

            /**
             * Sets the value of the articleDesc property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setArticleDesc(String value) {
                this.articleDesc = value;
            }

            /**
             * Gets the value of the articleType property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getArticleType() {
                return articleType;
            }

            /**
             * Sets the value of the articleType property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setArticleType(String value) {
                this.articleType = value;
            }

            /**
             * Gets the value of the articleClass property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getArticleClass() {
                return articleClass;
            }

            /**
             * Sets the value of the articleClass property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setArticleClass(String value) {
                this.articleClass = value;
            }

            /**
             * Gets the value of the status property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getStatus() {
                return status;
            }

            /**
             * Sets the value of the status property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setStatus(String value) {
                this.status = value;
            }

            /**
             * Gets the value of the bookDriverNum property.
             * 
             */
            public int getBookDriverNum() {
                return bookDriverNum;
            }

            /**
             * Sets the value of the bookDriverNum property.
             * 
             */
            public void setBookDriverNum(int value) {
                this.bookDriverNum = value;
            }

            /**
             * Gets the value of the insuredType property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getInsuredType() {
                return insuredType;
            }

            /**
             * Sets the value of the insuredType property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setInsuredType(String value) {
                this.insuredType = value;
            }

            /**
             * Gets the value of the excludedInd property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getExcludedInd() {
                return excludedInd;
            }

            /**
             * Sets the value of the excludedInd property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setExcludedInd(String value) {
                this.excludedInd = value;
            }

            /**
             * Gets the value of the relationToApplicant property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRelationToApplicant() {
                return relationToApplicant;
            }

            /**
             * Sets the value of the relationToApplicant property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRelationToApplicant(String value) {
                this.relationToApplicant = value;
            }

            /**
             * Gets the value of the relationToApplicantDesc property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRelationToApplicantDesc() {
                return relationToApplicantDesc;
            }

            /**
             * Sets the value of the relationToApplicantDesc property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRelationToApplicantDesc(String value) {
                this.relationToApplicantDesc = value;
            }

            /**
             * Gets the value of the defensiveDriverInd property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDefensiveDriverInd() {
                return defensiveDriverInd;
            }

            /**
             * Sets the value of the defensiveDriverInd property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDefensiveDriverInd(String value) {
                this.defensiveDriverInd = value;
            }

            /**
             * Gets the value of the willDriveInsuredVehicle property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getWillDriveInsuredVehicle() {
                return willDriveInsuredVehicle;
            }

            /**
             * Sets the value of the willDriveInsuredVehicle property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setWillDriveInsuredVehicle(String value) {
                this.willDriveInsuredVehicle = value;
            }

            /**
             * Gets the value of the assignedRiskInd property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAssignedRiskInd() {
                return assignedRiskInd;
            }

            /**
             * Sets the value of the assignedRiskInd property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAssignedRiskInd(String value) {
                this.assignedRiskInd = value;
            }

            /**
             * Gets the value of the drivingExperience property.
             * 
             */
            public int getDrivingExperience() {
                return drivingExperience;
            }

            /**
             * Sets the value of the drivingExperience property.
             * 
             */
            public void setDrivingExperience(int value) {
                this.drivingExperience = value;
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
             * Gets the value of the occupationClass property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOccupationClass() {
                return occupationClass;
            }

            /**
             * Sets the value of the occupationClass property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOccupationClass(String value) {
                this.occupationClass = value;
            }

            /**
             * Gets the value of the occupationClassDesc property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOccupationClassDesc() {
                return occupationClassDesc;
            }

            /**
             * Sets the value of the occupationClassDesc property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOccupationClassDesc(String value) {
                this.occupationClassDesc = value;
            }

            /**
             * Gets the value of the drvrLicNum property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDrvrLicNum() {
                return drvrLicNum;
            }

            /**
             * Sets the value of the drvrLicNum property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDrvrLicNum(String value) {
                this.drvrLicNum = value;
            }

            /**
             * Gets the value of the drvrLicState property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDrvrLicState() {
                return drvrLicState;
            }

            /**
             * Sets the value of the drvrLicState property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDrvrLicState(String value) {
                this.drvrLicState = value;
            }

            /**
             * Gets the value of the maritalStatus property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMaritalStatus() {
                return maritalStatus;
            }

            /**
             * Sets the value of the maritalStatus property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMaritalStatus(String value) {
                this.maritalStatus = value;
            }

            /**
             * Gets the value of the maritalStatusDesc property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMaritalStatusDesc() {
                return maritalStatusDesc;
            }

            /**
             * Sets the value of the maritalStatusDesc property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMaritalStatusDesc(String value) {
                this.maritalStatusDesc = value;
            }

            /**
             * Gets the value of the mvrCleanRecordInd property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMvrCleanRecordInd() {
                return mvrCleanRecordInd;
            }

            /**
             * Sets the value of the mvrCleanRecordInd property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMvrCleanRecordInd(String value) {
                this.mvrCleanRecordInd = value;
            }

            /**
             * Gets the value of the violations property.
             * 
             * @return
             *     possible object is
             *     {@link Object }
             *     
             */
            public Object getViolations() {
                return violations;
            }

            /**
             * Sets the value of the violations property.
             * 
             * @param value
             *     allowed object is
             *     {@link Object }
             *     
             */
            public void setViolations(Object value) {
                this.violations = value;
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
     *         &lt;element name="Policy_Article">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Contract_ID" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                   &lt;element name="Article_ID" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                   &lt;element name="Article_Desc" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="Article_Type" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="Article_Class" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="Policy_Products">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Policy_Product" maxOccurs="unbounded">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="Contract_ID" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                                       &lt;element name="Article_ID" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                                       &lt;element name="Product_Cost_Type" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                       &lt;element name="Full_Term_Amount" type="{http://www.w3.org/2001/XMLSchema}double"/>
     *                                       &lt;element name="Written_Amount" type="{http://www.w3.org/2001/XMLSchema}double"/>
     *                                       &lt;element name="Unbilled_Amount" type="{http://www.w3.org/2001/XMLSchema}double"/>
     *                                       &lt;element name="Net_Change_Amount" type="{http://www.w3.org/2001/XMLSchema}double"/>
     *                                       &lt;element name="Fully_Earned_Ind" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                       &lt;element name="Product_Desc" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                       &lt;element name="Product_Code" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                       &lt;element name="Limit_1" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *                                       &lt;element name="Rejected_Ind" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                     &lt;/sequence>
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
        "policyArticle"
    })
    public static class PolicyArticles {

        @XmlElement(name = "Policy_Article", required = true)
        protected Policy.PolicyArticles.PolicyArticle policyArticle;

        /**
         * Gets the value of the policyArticle property.
         * 
         * @return
         *     possible object is
         *     {@link Policy.PolicyArticles.PolicyArticle }
         *     
         */
        public Policy.PolicyArticles.PolicyArticle getPolicyArticle() {
            return policyArticle;
        }

        /**
         * Sets the value of the policyArticle property.
         * 
         * @param value
         *     allowed object is
         *     {@link Policy.PolicyArticles.PolicyArticle }
         *     
         */
        public void setPolicyArticle(Policy.PolicyArticles.PolicyArticle value) {
            this.policyArticle = value;
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
         *         &lt;element name="Contract_ID" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *         &lt;element name="Article_ID" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *         &lt;element name="Article_Desc" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="Article_Type" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="Article_Class" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="Policy_Products">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="Policy_Product" maxOccurs="unbounded">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="Contract_ID" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *                             &lt;element name="Article_ID" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *                             &lt;element name="Product_Cost_Type" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                             &lt;element name="Full_Term_Amount" type="{http://www.w3.org/2001/XMLSchema}double"/>
         *                             &lt;element name="Written_Amount" type="{http://www.w3.org/2001/XMLSchema}double"/>
         *                             &lt;element name="Unbilled_Amount" type="{http://www.w3.org/2001/XMLSchema}double"/>
         *                             &lt;element name="Net_Change_Amount" type="{http://www.w3.org/2001/XMLSchema}double"/>
         *                             &lt;element name="Fully_Earned_Ind" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                             &lt;element name="Product_Desc" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                             &lt;element name="Product_Code" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                             &lt;element name="Limit_1" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
         *                             &lt;element name="Rejected_Ind" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                           &lt;/sequence>
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
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "contractID",
            "articleID",
            "articleDesc",
            "articleType",
            "articleClass",
            "status",
            "policyProducts"
        })
        public static class PolicyArticle {

            @XmlElement(name = "Contract_ID")
            protected int contractID;
            @XmlElement(name = "Article_ID")
            protected int articleID;
            @XmlElement(name = "Article_Desc", required = true)
            protected String articleDesc;
            @XmlElement(name = "Article_Type", required = true)
            protected String articleType;
            @XmlElement(name = "Article_Class", required = true)
            protected String articleClass;
            @XmlElement(name = "Status", required = true)
            protected String status;
            @XmlElement(name = "Policy_Products", required = true)
            protected Policy.PolicyArticles.PolicyArticle.PolicyProducts policyProducts;

            /**
             * Gets the value of the contractID property.
             * 
             */
            public int getContractID() {
                return contractID;
            }

            /**
             * Sets the value of the contractID property.
             * 
             */
            public void setContractID(int value) {
                this.contractID = value;
            }

            /**
             * Gets the value of the articleID property.
             * 
             */
            public int getArticleID() {
                return articleID;
            }

            /**
             * Sets the value of the articleID property.
             * 
             */
            public void setArticleID(int value) {
                this.articleID = value;
            }

            /**
             * Gets the value of the articleDesc property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getArticleDesc() {
                return articleDesc;
            }

            /**
             * Sets the value of the articleDesc property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setArticleDesc(String value) {
                this.articleDesc = value;
            }

            /**
             * Gets the value of the articleType property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getArticleType() {
                return articleType;
            }

            /**
             * Sets the value of the articleType property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setArticleType(String value) {
                this.articleType = value;
            }

            /**
             * Gets the value of the articleClass property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getArticleClass() {
                return articleClass;
            }

            /**
             * Sets the value of the articleClass property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setArticleClass(String value) {
                this.articleClass = value;
            }

            /**
             * Gets the value of the status property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getStatus() {
                return status;
            }

            /**
             * Sets the value of the status property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setStatus(String value) {
                this.status = value;
            }

            /**
             * Gets the value of the policyProducts property.
             * 
             * @return
             *     possible object is
             *     {@link Policy.PolicyArticles.PolicyArticle.PolicyProducts }
             *     
             */
            public Policy.PolicyArticles.PolicyArticle.PolicyProducts getPolicyProducts() {
                return policyProducts;
            }

            /**
             * Sets the value of the policyProducts property.
             * 
             * @param value
             *     allowed object is
             *     {@link Policy.PolicyArticles.PolicyArticle.PolicyProducts }
             *     
             */
            public void setPolicyProducts(Policy.PolicyArticles.PolicyArticle.PolicyProducts value) {
                this.policyProducts = value;
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
             *         &lt;element name="Policy_Product" maxOccurs="unbounded">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="Contract_ID" type="{http://www.w3.org/2001/XMLSchema}int"/>
             *                   &lt;element name="Article_ID" type="{http://www.w3.org/2001/XMLSchema}int"/>
             *                   &lt;element name="Product_Cost_Type" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                   &lt;element name="Full_Term_Amount" type="{http://www.w3.org/2001/XMLSchema}double"/>
             *                   &lt;element name="Written_Amount" type="{http://www.w3.org/2001/XMLSchema}double"/>
             *                   &lt;element name="Unbilled_Amount" type="{http://www.w3.org/2001/XMLSchema}double"/>
             *                   &lt;element name="Net_Change_Amount" type="{http://www.w3.org/2001/XMLSchema}double"/>
             *                   &lt;element name="Fully_Earned_Ind" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                   &lt;element name="Product_Desc" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                   &lt;element name="Product_Code" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                   &lt;element name="Limit_1" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
             *                   &lt;element name="Rejected_Ind" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                 &lt;/sequence>
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
                "policyProduct"
            })
            public static class PolicyProducts {

                @XmlElement(name = "Policy_Product", required = true)
                protected List<Policy.PolicyArticles.PolicyArticle.PolicyProducts.PolicyProduct> policyProduct;

                /**
                 * Gets the value of the policyProduct property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the policyProduct property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getPolicyProduct().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link Policy.PolicyArticles.PolicyArticle.PolicyProducts.PolicyProduct }
                 * 
                 * 
                 */
                public List<Policy.PolicyArticles.PolicyArticle.PolicyProducts.PolicyProduct> getPolicyProduct() {
                    if (policyProduct == null) {
                        policyProduct = new ArrayList<Policy.PolicyArticles.PolicyArticle.PolicyProducts.PolicyProduct>();
                    }
                    return this.policyProduct;
                }

                public void setPolicyProduct(List<Policy.PolicyArticles.PolicyArticle.PolicyProducts.PolicyProduct> policyProduct) {
                    this.policyProduct = policyProduct;
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
                 *         &lt;element name="Contract_ID" type="{http://www.w3.org/2001/XMLSchema}int"/>
                 *         &lt;element name="Article_ID" type="{http://www.w3.org/2001/XMLSchema}int"/>
                 *         &lt;element name="Product_Cost_Type" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *         &lt;element name="Full_Term_Amount" type="{http://www.w3.org/2001/XMLSchema}double"/>
                 *         &lt;element name="Written_Amount" type="{http://www.w3.org/2001/XMLSchema}double"/>
                 *         &lt;element name="Unbilled_Amount" type="{http://www.w3.org/2001/XMLSchema}double"/>
                 *         &lt;element name="Net_Change_Amount" type="{http://www.w3.org/2001/XMLSchema}double"/>
                 *         &lt;element name="Fully_Earned_Ind" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *         &lt;element name="Product_Desc" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *         &lt;element name="Product_Code" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *         &lt;element name="Limit_1" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
                 *         &lt;element name="Rejected_Ind" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
                    "contractID",
                    "articleID",
                    "productCostType",
                    "fullTermAmount",
                    "writtenAmount",
                    "unbilledAmount",
                    "netChangeAmount",
                    "fullyEarnedInd",
                    "productDesc",
                    "productCode",
                    "limit1",
                    "rejectedInd"
                })
                public static class PolicyProduct {

                    @XmlElement(name = "Contract_ID")
                    protected int contractID;
                    @XmlElement(name = "Article_ID")
                    protected int articleID;
                    @XmlElement(name = "Product_Cost_Type", required = true)
                    protected String productCostType;
                    @XmlElement(name = "Full_Term_Amount")
                    protected double fullTermAmount;
                    @XmlElement(name = "Written_Amount")
                    protected double writtenAmount;
                    @XmlElement(name = "Unbilled_Amount")
                    protected double unbilledAmount;
                    @XmlElement(name = "Net_Change_Amount")
                    protected double netChangeAmount;
                    @XmlElement(name = "Fully_Earned_Ind", required = true)
                    protected String fullyEarnedInd;
                    @XmlElement(name = "Product_Desc", required = true)
                    protected String productDesc;
                    @XmlElement(name = "Product_Code", required = true)
                    protected String productCode;
                    @XmlElement(name = "Limit_1")
                    protected Integer limit1;
                    @XmlElement(name = "Rejected_Ind", required = true)
                    protected String rejectedInd;

                    /**
                     * Gets the value of the contractID property.
                     * 
                     */
                    public int getContractID() {
                        return contractID;
                    }

                    /**
                     * Sets the value of the contractID property.
                     * 
                     */
                    public void setContractID(int value) {
                        this.contractID = value;
                    }

                    /**
                     * Gets the value of the articleID property.
                     * 
                     */
                    public int getArticleID() {
                        return articleID;
                    }

                    /**
                     * Sets the value of the articleID property.
                     * 
                     */
                    public void setArticleID(int value) {
                        this.articleID = value;
                    }

                    /**
                     * Gets the value of the productCostType property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getProductCostType() {
                        return productCostType;
                    }

                    /**
                     * Sets the value of the productCostType property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setProductCostType(String value) {
                        this.productCostType = value;
                    }

                    /**
                     * Gets the value of the fullTermAmount property.
                     * 
                     */
                    public double getFullTermAmount() {
                        return fullTermAmount;
                    }

                    /**
                     * Sets the value of the fullTermAmount property.
                     * 
                     */
                    public void setFullTermAmount(double value) {
                        this.fullTermAmount = value;
                    }

                    /**
                     * Gets the value of the writtenAmount property.
                     * 
                     */
                    public double getWrittenAmount() {
                        return writtenAmount;
                    }

                    /**
                     * Sets the value of the writtenAmount property.
                     * 
                     */
                    public void setWrittenAmount(double value) {
                        this.writtenAmount = value;
                    }

                    /**
                     * Gets the value of the unbilledAmount property.
                     * 
                     */
                    public double getUnbilledAmount() {
                        return unbilledAmount;
                    }

                    /**
                     * Sets the value of the unbilledAmount property.
                     * 
                     */
                    public void setUnbilledAmount(double value) {
                        this.unbilledAmount = value;
                    }

                    /**
                     * Gets the value of the netChangeAmount property.
                     * 
                     */
                    public double getNetChangeAmount() {
                        return netChangeAmount;
                    }

                    /**
                     * Sets the value of the netChangeAmount property.
                     * 
                     */
                    public void setNetChangeAmount(double value) {
                        this.netChangeAmount = value;
                    }

                    /**
                     * Gets the value of the fullyEarnedInd property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getFullyEarnedInd() {
                        return fullyEarnedInd;
                    }

                    /**
                     * Sets the value of the fullyEarnedInd property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setFullyEarnedInd(String value) {
                        this.fullyEarnedInd = value;
                    }

                    /**
                     * Gets the value of the productDesc property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getProductDesc() {
                        return productDesc;
                    }

                    /**
                     * Sets the value of the productDesc property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setProductDesc(String value) {
                        this.productDesc = value;
                    }

                    /**
                     * Gets the value of the productCode property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getProductCode() {
                        return productCode;
                    }

                    /**
                     * Sets the value of the productCode property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setProductCode(String value) {
                        this.productCode = value;
                    }

                    /**
                     * Gets the value of the limit1 property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Integer }
                     *     
                     */
                    public Integer getLimit1() {
                        return limit1;
                    }

                    /**
                     * Sets the value of the limit1 property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Integer }
                     *     
                     */
                    public void setLimit1(Integer value) {
                        this.limit1 = value;
                    }

                    /**
                     * Gets the value of the rejectedInd property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getRejectedInd() {
                        return rejectedInd;
                    }

                    /**
                     * Sets the value of the rejectedInd property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setRejectedInd(String value) {
                        this.rejectedInd = value;
                    }

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
     *         &lt;element name="Vehicle" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Contract_ID" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                   &lt;element name="Article_ID" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                   &lt;element name="Article_Desc" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="Article_Type" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="Article_Class" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="Comp_Veh_Num" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                   &lt;element name="Book_Veh_Num" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                   &lt;element name="Veh_Year" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                   &lt;element name="Veh_Make" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="Veh_Model" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="Veh_Body_Type_Code" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="Veh_Vody_Type_Desc" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="Veh_Type_Code" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                   &lt;element name="Veh_Type_Desc" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="VIN" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="Garaging_Code" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="Garaging_Desc" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="Annual_Mileage" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                   &lt;element name="Stated_Amount" type="{http://www.w3.org/2001/XMLSchema}double"/>
     *                   &lt;element name="Condition_Code" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="Condition_Desc" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="Usage_Car_Shows_Ind" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="Usage_Visitors_Ind" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="Usage_Maintenance_Ind" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="Usage_Racing_Ind" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="Usage_Drivers_Ed_Events_Ind" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="Usage_General_Transport_Ind" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="Usage_Errands_Ind" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="Usage_Work_Ind" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="Usage_Vacation_Ind" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="Usage_Restaurants_Ind" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="Usage_Recreational_Ind" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="Usage_Off_Road_Ind" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="Usage_Other_Ind" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="Registration_Country" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="Locations">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Location">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="Contract_ID" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                                       &lt;element name="Article_ID" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                                       &lt;element name="book_veh_num" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                                       &lt;element name="Loc_Num" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                                       &lt;element name="Loc_Desc" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                       &lt;element name="Address_Line_1" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                       &lt;element name="City" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                       &lt;element name="State" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                       &lt;element name="Zip" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                                       &lt;element name="Country" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="Vehicle_Products">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Vehicle_Product" maxOccurs="unbounded">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="Contract_ID" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                                       &lt;element name="Article_ID" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                                       &lt;element name="Product_Cost_Type" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                       &lt;element name="Full_Term_Amount" type="{http://www.w3.org/2001/XMLSchema}double"/>
     *                                       &lt;element name="Written_Amount" type="{http://www.w3.org/2001/XMLSchema}double"/>
     *                                       &lt;element name="Unbilled_Amount" type="{http://www.w3.org/2001/XMLSchema}double"/>
     *                                       &lt;element name="Net_Change_Amount" type="{http://www.w3.org/2001/XMLSchema}double"/>
     *                                       &lt;element name="Fully_Earned_Ind" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                       &lt;element name="Product_Desc" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                       &lt;element name="Product_Code" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                       &lt;element name="MPA_Or_Disc_Surcharge_Selection" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="Ded_1" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *                                       &lt;element name="Limit_1" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *                                       &lt;element name="Dollar_or_Percent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="Rejected_Ind" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                     &lt;/sequence>
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
        "vehicle"
    })
    public static class Vehicles {

        @XmlElement(name = "Vehicle", required = true)
        protected List<Policy.Vehicles.Vehicle> vehicle;

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
         * {@link Policy.Vehicles.Vehicle }
         * 
         * 
         */
        public List<Policy.Vehicles.Vehicle> getVehicle() {
            if (vehicle == null) {
                vehicle = new ArrayList<Policy.Vehicles.Vehicle>();
            }
            return this.vehicle;
        }

        public void setVehicle(List<Policy.Vehicles.Vehicle> vehicle) {
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
         *         &lt;element name="Contract_ID" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *         &lt;element name="Article_ID" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *         &lt;element name="Article_Desc" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="Article_Type" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="Article_Class" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="Comp_Veh_Num" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *         &lt;element name="Book_Veh_Num" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *         &lt;element name="Veh_Year" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *         &lt;element name="Veh_Make" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="Veh_Model" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="Veh_Body_Type_Code" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="Veh_Vody_Type_Desc" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="Veh_Type_Code" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *         &lt;element name="Veh_Type_Desc" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="VIN" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="Garaging_Code" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="Garaging_Desc" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="Annual_Mileage" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *         &lt;element name="Stated_Amount" type="{http://www.w3.org/2001/XMLSchema}double"/>
         *         &lt;element name="Condition_Code" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="Condition_Desc" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="Usage_Car_Shows_Ind" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="Usage_Visitors_Ind" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="Usage_Maintenance_Ind" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="Usage_Racing_Ind" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="Usage_Drivers_Ed_Events_Ind" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="Usage_General_Transport_Ind" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="Usage_Errands_Ind" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="Usage_Work_Ind" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="Usage_Vacation_Ind" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="Usage_Restaurants_Ind" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="Usage_Recreational_Ind" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="Usage_Off_Road_Ind" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="Usage_Other_Ind" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="Registration_Country" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="Locations">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="Location">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="Contract_ID" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *                             &lt;element name="Article_ID" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *                             &lt;element name="book_veh_num" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *                             &lt;element name="Loc_Num" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *                             &lt;element name="Loc_Desc" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                             &lt;element name="Address_Line_1" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                             &lt;element name="City" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                             &lt;element name="State" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                             &lt;element name="Zip" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *                             &lt;element name="Country" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="Vehicle_Products">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="Vehicle_Product" maxOccurs="unbounded">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="Contract_ID" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *                             &lt;element name="Article_ID" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *                             &lt;element name="Product_Cost_Type" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                             &lt;element name="Full_Term_Amount" type="{http://www.w3.org/2001/XMLSchema}double"/>
         *                             &lt;element name="Written_Amount" type="{http://www.w3.org/2001/XMLSchema}double"/>
         *                             &lt;element name="Unbilled_Amount" type="{http://www.w3.org/2001/XMLSchema}double"/>
         *                             &lt;element name="Net_Change_Amount" type="{http://www.w3.org/2001/XMLSchema}double"/>
         *                             &lt;element name="Fully_Earned_Ind" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                             &lt;element name="Product_Desc" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                             &lt;element name="Product_Code" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                             &lt;element name="MPA_Or_Disc_Surcharge_Selection" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="Ded_1" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
         *                             &lt;element name="Limit_1" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
         *                             &lt;element name="Dollar_or_Percent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="Rejected_Ind" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                           &lt;/sequence>
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
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "contractID",
            "articleID",
            "articleDesc",
            "articleType",
            "articleClass",
            "status",
            "compVehNum",
            "bookVehNum",
            "vehYear",
            "vehMake",
            "vehModel",
            "vehBodyTypeCode",
            "vehVodyTypeDesc",
            "vehTypeCode",
            "vehTypeDesc",
            "vin",
            "garagingCode",
            "garagingDesc",
            "annualMileage",
            "statedAmount",
            "conditionCode",
            "conditionDesc",
            "usageCarShowsInd",
            "usageVisitorsInd",
            "usageMaintenanceInd",
            "usageRacingInd",
            "usageDriversEdEventsInd",
            "usageGeneralTransportInd",
            "usageErrandsInd",
            "usageWorkInd",
            "usageVacationInd",
            "usageRestaurantsInd",
            "usageRecreationalInd",
            "usageOffRoadInd",
            "usageOtherInd",
            "registrationCountry",
            "locations",
            "vehicleProducts"
        })
        public static class Vehicle {

            @XmlElement(name = "Contract_ID")
            protected int contractID;
            @XmlElement(name = "Article_ID")
            protected int articleID;
            @XmlElement(name = "Article_Desc", required = true)
            protected String articleDesc;
            @XmlElement(name = "Article_Type", required = true)
            protected String articleType;
            @XmlElement(name = "Article_Class", required = true)
            protected String articleClass;
            @XmlElement(name = "Status", required = true)
            protected String status;
            @XmlElement(name = "Comp_Veh_Num")
            protected int compVehNum;
            @XmlElement(name = "Book_Veh_Num")
            protected int bookVehNum;
            @XmlElement(name = "Veh_Year")
            protected int vehYear;
            @XmlElement(name = "Veh_Make", required = true)
            protected String vehMake;
            @XmlElement(name = "Veh_Model", required = true)
            protected String vehModel;
            @XmlElement(name = "Veh_Body_Type_Code", required = true)
            protected String vehBodyTypeCode;
            @XmlElement(name = "Veh_Vody_Type_Desc", required = true)
            protected String vehVodyTypeDesc;
            @XmlElement(name = "Veh_Type_Code")
            protected int vehTypeCode;
            @XmlElement(name = "Veh_Type_Desc", required = true)
            protected String vehTypeDesc;
            @XmlElement(name = "VIN", required = true)
            protected String vin;
            @XmlElement(name = "Garaging_Code", required = true)
            protected String garagingCode;
            @XmlElement(name = "Garaging_Desc", required = true)
            protected String garagingDesc;
            @XmlElement(name = "Annual_Mileage")
            protected int annualMileage;
            @XmlElement(name = "Stated_Amount")
            protected double statedAmount;
            @XmlElement(name = "Condition_Code", required = true)
            protected String conditionCode;
            @XmlElement(name = "Condition_Desc", required = true)
            protected String conditionDesc;
            @XmlElement(name = "Usage_Car_Shows_Ind", required = true)
            protected String usageCarShowsInd;
            @XmlElement(name = "Usage_Visitors_Ind", required = true)
            protected String usageVisitorsInd;
            @XmlElement(name = "Usage_Maintenance_Ind", required = true)
            protected String usageMaintenanceInd;
            @XmlElement(name = "Usage_Racing_Ind", required = true)
            protected String usageRacingInd;
            @XmlElement(name = "Usage_Drivers_Ed_Events_Ind", required = true)
            protected String usageDriversEdEventsInd;
            @XmlElement(name = "Usage_General_Transport_Ind", required = true)
            protected String usageGeneralTransportInd;
            @XmlElement(name = "Usage_Errands_Ind", required = true)
            protected String usageErrandsInd;
            @XmlElement(name = "Usage_Work_Ind", required = true)
            protected String usageWorkInd;
            @XmlElement(name = "Usage_Vacation_Ind", required = true)
            protected String usageVacationInd;
            @XmlElement(name = "Usage_Restaurants_Ind", required = true)
            protected String usageRestaurantsInd;
            @XmlElement(name = "Usage_Recreational_Ind", required = true)
            protected String usageRecreationalInd;
            @XmlElement(name = "Usage_Off_Road_Ind", required = true)
            protected String usageOffRoadInd;
            @XmlElement(name = "Usage_Other_Ind", required = true)
            protected String usageOtherInd;
            @XmlElement(name = "Registration_Country", required = true)
            protected String registrationCountry;
            @XmlElement(name = "Locations", required = true)
            protected Policy.Vehicles.Vehicle.Locations locations;
            @XmlElement(name = "Vehicle_Products", required = true)
            protected Policy.Vehicles.Vehicle.VehicleProducts vehicleProducts;

            /**
             * Gets the value of the contractID property.
             * 
             */
            public int getContractID() {
                return contractID;
            }

            /**
             * Sets the value of the contractID property.
             * 
             */
            public void setContractID(int value) {
                this.contractID = value;
            }

            /**
             * Gets the value of the articleID property.
             * 
             */
            public int getArticleID() {
                return articleID;
            }

            /**
             * Sets the value of the articleID property.
             * 
             */
            public void setArticleID(int value) {
                this.articleID = value;
            }

            /**
             * Gets the value of the articleDesc property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getArticleDesc() {
                return articleDesc;
            }

            /**
             * Sets the value of the articleDesc property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setArticleDesc(String value) {
                this.articleDesc = value;
            }

            /**
             * Gets the value of the articleType property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getArticleType() {
                return articleType;
            }

            /**
             * Sets the value of the articleType property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setArticleType(String value) {
                this.articleType = value;
            }

            /**
             * Gets the value of the articleClass property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getArticleClass() {
                return articleClass;
            }

            /**
             * Sets the value of the articleClass property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setArticleClass(String value) {
                this.articleClass = value;
            }

            /**
             * Gets the value of the status property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getStatus() {
                return status;
            }

            /**
             * Sets the value of the status property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setStatus(String value) {
                this.status = value;
            }

            /**
             * Gets the value of the compVehNum property.
             * 
             */
            public int getCompVehNum() {
                return compVehNum;
            }

            /**
             * Sets the value of the compVehNum property.
             * 
             */
            public void setCompVehNum(int value) {
                this.compVehNum = value;
            }

            /**
             * Gets the value of the bookVehNum property.
             * 
             */
            public int getBookVehNum() {
                return bookVehNum;
            }

            /**
             * Sets the value of the bookVehNum property.
             * 
             */
            public void setBookVehNum(int value) {
                this.bookVehNum = value;
            }

            /**
             * Gets the value of the vehYear property.
             * 
             */
            public int getVehYear() {
                return vehYear;
            }

            /**
             * Sets the value of the vehYear property.
             * 
             */
            public void setVehYear(int value) {
                this.vehYear = value;
            }

            /**
             * Gets the value of the vehMake property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getVehMake() {
                return vehMake;
            }

            /**
             * Sets the value of the vehMake property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setVehMake(String value) {
                this.vehMake = value;
            }

            /**
             * Gets the value of the vehModel property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getVehModel() {
                return vehModel;
            }

            /**
             * Sets the value of the vehModel property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setVehModel(String value) {
                this.vehModel = value;
            }

            /**
             * Gets the value of the vehBodyTypeCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getVehBodyTypeCode() {
                return vehBodyTypeCode;
            }

            /**
             * Sets the value of the vehBodyTypeCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setVehBodyTypeCode(String value) {
                this.vehBodyTypeCode = value;
            }

            /**
             * Gets the value of the vehVodyTypeDesc property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getVehVodyTypeDesc() {
                return vehVodyTypeDesc;
            }

            /**
             * Sets the value of the vehVodyTypeDesc property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setVehVodyTypeDesc(String value) {
                this.vehVodyTypeDesc = value;
            }

            /**
             * Gets the value of the vehTypeCode property.
             * 
             */
            public int getVehTypeCode() {
                return vehTypeCode;
            }

            /**
             * Sets the value of the vehTypeCode property.
             * 
             */
            public void setVehTypeCode(int value) {
                this.vehTypeCode = value;
            }

            /**
             * Gets the value of the vehTypeDesc property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getVehTypeDesc() {
                return vehTypeDesc;
            }

            /**
             * Sets the value of the vehTypeDesc property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setVehTypeDesc(String value) {
                this.vehTypeDesc = value;
            }

            /**
             * Gets the value of the vin property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getVIN() {
                return vin;
            }

            /**
             * Sets the value of the vin property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setVIN(String value) {
                this.vin = value;
            }

            /**
             * Gets the value of the garagingCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getGaragingCode() {
                return garagingCode;
            }

            /**
             * Sets the value of the garagingCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setGaragingCode(String value) {
                this.garagingCode = value;
            }

            /**
             * Gets the value of the garagingDesc property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getGaragingDesc() {
                return garagingDesc;
            }

            /**
             * Sets the value of the garagingDesc property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setGaragingDesc(String value) {
                this.garagingDesc = value;
            }

            /**
             * Gets the value of the annualMileage property.
             * 
             */
            public int getAnnualMileage() {
                return annualMileage;
            }

            /**
             * Sets the value of the annualMileage property.
             * 
             */
            public void setAnnualMileage(int value) {
                this.annualMileage = value;
            }

            /**
             * Gets the value of the statedAmount property.
             * 
             */
            public double getStatedAmount() {
                return statedAmount;
            }

            /**
             * Sets the value of the statedAmount property.
             * 
             */
            public void setStatedAmount(double value) {
                this.statedAmount = value;
            }

            /**
             * Gets the value of the conditionCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getConditionCode() {
                return conditionCode;
            }

            /**
             * Sets the value of the conditionCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setConditionCode(String value) {
                this.conditionCode = value;
            }

            /**
             * Gets the value of the conditionDesc property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getConditionDesc() {
                return conditionDesc;
            }

            /**
             * Sets the value of the conditionDesc property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setConditionDesc(String value) {
                this.conditionDesc = value;
            }

            /**
             * Gets the value of the usageCarShowsInd property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getUsageCarShowsInd() {
                return usageCarShowsInd;
            }

            /**
             * Sets the value of the usageCarShowsInd property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setUsageCarShowsInd(String value) {
                this.usageCarShowsInd = value;
            }

            /**
             * Gets the value of the usageVisitorsInd property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getUsageVisitorsInd() {
                return usageVisitorsInd;
            }

            /**
             * Sets the value of the usageVisitorsInd property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setUsageVisitorsInd(String value) {
                this.usageVisitorsInd = value;
            }

            /**
             * Gets the value of the usageMaintenanceInd property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getUsageMaintenanceInd() {
                return usageMaintenanceInd;
            }

            /**
             * Sets the value of the usageMaintenanceInd property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setUsageMaintenanceInd(String value) {
                this.usageMaintenanceInd = value;
            }

            /**
             * Gets the value of the usageRacingInd property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getUsageRacingInd() {
                return usageRacingInd;
            }

            /**
             * Sets the value of the usageRacingInd property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setUsageRacingInd(String value) {
                this.usageRacingInd = value;
            }

            /**
             * Gets the value of the usageDriversEdEventsInd property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getUsageDriversEdEventsInd() {
                return usageDriversEdEventsInd;
            }

            /**
             * Sets the value of the usageDriversEdEventsInd property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setUsageDriversEdEventsInd(String value) {
                this.usageDriversEdEventsInd = value;
            }

            /**
             * Gets the value of the usageGeneralTransportInd property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getUsageGeneralTransportInd() {
                return usageGeneralTransportInd;
            }

            /**
             * Sets the value of the usageGeneralTransportInd property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setUsageGeneralTransportInd(String value) {
                this.usageGeneralTransportInd = value;
            }

            /**
             * Gets the value of the usageErrandsInd property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getUsageErrandsInd() {
                return usageErrandsInd;
            }

            /**
             * Sets the value of the usageErrandsInd property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setUsageErrandsInd(String value) {
                this.usageErrandsInd = value;
            }

            /**
             * Gets the value of the usageWorkInd property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getUsageWorkInd() {
                return usageWorkInd;
            }

            /**
             * Sets the value of the usageWorkInd property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setUsageWorkInd(String value) {
                this.usageWorkInd = value;
            }

            /**
             * Gets the value of the usageVacationInd property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getUsageVacationInd() {
                return usageVacationInd;
            }

            /**
             * Sets the value of the usageVacationInd property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setUsageVacationInd(String value) {
                this.usageVacationInd = value;
            }

            /**
             * Gets the value of the usageRestaurantsInd property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getUsageRestaurantsInd() {
                return usageRestaurantsInd;
            }

            /**
             * Sets the value of the usageRestaurantsInd property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setUsageRestaurantsInd(String value) {
                this.usageRestaurantsInd = value;
            }

            /**
             * Gets the value of the usageRecreationalInd property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getUsageRecreationalInd() {
                return usageRecreationalInd;
            }

            /**
             * Sets the value of the usageRecreationalInd property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setUsageRecreationalInd(String value) {
                this.usageRecreationalInd = value;
            }

            /**
             * Gets the value of the usageOffRoadInd property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getUsageOffRoadInd() {
                return usageOffRoadInd;
            }

            /**
             * Sets the value of the usageOffRoadInd property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setUsageOffRoadInd(String value) {
                this.usageOffRoadInd = value;
            }

            /**
             * Gets the value of the usageOtherInd property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getUsageOtherInd() {
                return usageOtherInd;
            }

            /**
             * Sets the value of the usageOtherInd property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setUsageOtherInd(String value) {
                this.usageOtherInd = value;
            }

            /**
             * Gets the value of the registrationCountry property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRegistrationCountry() {
                return registrationCountry;
            }

            /**
             * Sets the value of the registrationCountry property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRegistrationCountry(String value) {
                this.registrationCountry = value;
            }

            /**
             * Gets the value of the locations property.
             * 
             * @return
             *     possible object is
             *     {@link Policy.Vehicles.Vehicle.Locations }
             *     
             */
            public Policy.Vehicles.Vehicle.Locations getLocations() {
                return locations;
            }

            /**
             * Sets the value of the locations property.
             * 
             * @param value
             *     allowed object is
             *     {@link Policy.Vehicles.Vehicle.Locations }
             *     
             */
            public void setLocations(Policy.Vehicles.Vehicle.Locations value) {
                this.locations = value;
            }

            /**
             * Gets the value of the vehicleProducts property.
             * 
             * @return
             *     possible object is
             *     {@link Policy.Vehicles.Vehicle.VehicleProducts }
             *     
             */
            public Policy.Vehicles.Vehicle.VehicleProducts getVehicleProducts() {
                return vehicleProducts;
            }

            /**
             * Sets the value of the vehicleProducts property.
             * 
             * @param value
             *     allowed object is
             *     {@link Policy.Vehicles.Vehicle.VehicleProducts }
             *     
             */
            public void setVehicleProducts(Policy.Vehicles.Vehicle.VehicleProducts value) {
                this.vehicleProducts = value;
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
             *         &lt;element name="Location">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="Contract_ID" type="{http://www.w3.org/2001/XMLSchema}int"/>
             *                   &lt;element name="Article_ID" type="{http://www.w3.org/2001/XMLSchema}int"/>
             *                   &lt;element name="book_veh_num" type="{http://www.w3.org/2001/XMLSchema}int"/>
             *                   &lt;element name="Loc_Num" type="{http://www.w3.org/2001/XMLSchema}int"/>
             *                   &lt;element name="Loc_Desc" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                   &lt;element name="Address_Line_1" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                   &lt;element name="City" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                   &lt;element name="State" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                   &lt;element name="Zip" type="{http://www.w3.org/2001/XMLSchema}int"/>
             *                   &lt;element name="Country" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                 &lt;/sequence>
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
                "location"
            })
            public static class Locations {

                @XmlElement(name = "Location", required = true)
                protected Policy.Vehicles.Vehicle.Locations.Location location;

                /**
                 * Gets the value of the location property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Policy.Vehicles.Vehicle.Locations.Location }
                 *     
                 */
                public Policy.Vehicles.Vehicle.Locations.Location getLocation() {
                    return location;
                }

                /**
                 * Sets the value of the location property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Policy.Vehicles.Vehicle.Locations.Location }
                 *     
                 */
                public void setLocation(Policy.Vehicles.Vehicle.Locations.Location value) {
                    this.location = value;
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
                 *         &lt;element name="Contract_ID" type="{http://www.w3.org/2001/XMLSchema}int"/>
                 *         &lt;element name="Article_ID" type="{http://www.w3.org/2001/XMLSchema}int"/>
                 *         &lt;element name="book_veh_num" type="{http://www.w3.org/2001/XMLSchema}int"/>
                 *         &lt;element name="Loc_Num" type="{http://www.w3.org/2001/XMLSchema}int"/>
                 *         &lt;element name="Loc_Desc" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *         &lt;element name="Address_Line_1" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *         &lt;element name="City" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *         &lt;element name="State" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *         &lt;element name="Zip" type="{http://www.w3.org/2001/XMLSchema}int"/>
                 *         &lt;element name="Country" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
                    "contractID",
                    "articleID",
                    "bookVehNum",
                    "locNum",
                    "locDesc",
                    "addressLine1",
                    "city",
                    "state",
                    "zip",
                    "country"
                })
                public static class Location {

                    @XmlElement(name = "Contract_ID")
                    protected int contractID;
                    @XmlElement(name = "Article_ID")
                    protected int articleID;
                    @XmlElement(name = "book_veh_num")
                    protected int bookVehNum;
                    @XmlElement(name = "Loc_Num")
                    protected int locNum;
                    @XmlElement(name = "Loc_Desc", required = true)
                    protected String locDesc;
                    @XmlElement(name = "Address_Line_1", required = true)
                    protected String addressLine1;
                    @XmlElement(name = "City", required = true)
                    protected String city;
                    @XmlElement(name = "State", required = true)
                    protected String state;
                    @XmlElement(name = "Zip")
                    protected int zip;
                    @XmlElement(name = "Country", required = true)
                    protected String country;

                    /**
                     * Gets the value of the contractID property.
                     * 
                     */
                    public int getContractID() {
                        return contractID;
                    }

                    /**
                     * Sets the value of the contractID property.
                     * 
                     */
                    public void setContractID(int value) {
                        this.contractID = value;
                    }

                    /**
                     * Gets the value of the articleID property.
                     * 
                     */
                    public int getArticleID() {
                        return articleID;
                    }

                    /**
                     * Sets the value of the articleID property.
                     * 
                     */
                    public void setArticleID(int value) {
                        this.articleID = value;
                    }

                    /**
                     * Gets the value of the bookVehNum property.
                     * 
                     */
                    public int getBookVehNum() {
                        return bookVehNum;
                    }

                    /**
                     * Sets the value of the bookVehNum property.
                     * 
                     */
                    public void setBookVehNum(int value) {
                        this.bookVehNum = value;
                    }

                    /**
                     * Gets the value of the locNum property.
                     * 
                     */
                    public int getLocNum() {
                        return locNum;
                    }

                    /**
                     * Sets the value of the locNum property.
                     * 
                     */
                    public void setLocNum(int value) {
                        this.locNum = value;
                    }

                    /**
                     * Gets the value of the locDesc property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getLocDesc() {
                        return locDesc;
                    }

                    /**
                     * Sets the value of the locDesc property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setLocDesc(String value) {
                        this.locDesc = value;
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
                     * Gets the value of the zip property.
                     * 
                     */
                    public int getZip() {
                        return zip;
                    }

                    /**
                     * Sets the value of the zip property.
                     * 
                     */
                    public void setZip(int value) {
                        this.zip = value;
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
             *         &lt;element name="Vehicle_Product" maxOccurs="unbounded">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="Contract_ID" type="{http://www.w3.org/2001/XMLSchema}int"/>
             *                   &lt;element name="Article_ID" type="{http://www.w3.org/2001/XMLSchema}int"/>
             *                   &lt;element name="Product_Cost_Type" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                   &lt;element name="Full_Term_Amount" type="{http://www.w3.org/2001/XMLSchema}double"/>
             *                   &lt;element name="Written_Amount" type="{http://www.w3.org/2001/XMLSchema}double"/>
             *                   &lt;element name="Unbilled_Amount" type="{http://www.w3.org/2001/XMLSchema}double"/>
             *                   &lt;element name="Net_Change_Amount" type="{http://www.w3.org/2001/XMLSchema}double"/>
             *                   &lt;element name="Fully_Earned_Ind" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                   &lt;element name="Product_Desc" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                   &lt;element name="Product_Code" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                   &lt;element name="MPA_Or_Disc_Surcharge_Selection" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="Ded_1" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
             *                   &lt;element name="Limit_1" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
             *                   &lt;element name="Dollar_or_Percent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="Rejected_Ind" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                 &lt;/sequence>
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
                "vehicleProduct"
            })
            public static class VehicleProducts {

                @XmlElement(name = "Vehicle_Product", required = true)
                protected List<Policy.Vehicles.Vehicle.VehicleProducts.VehicleProduct> vehicleProduct;

                /**
                 * Gets the value of the vehicleProduct property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the vehicleProduct property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getVehicleProduct().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link Policy.Vehicles.Vehicle.VehicleProducts.VehicleProduct }
                 * 
                 * 
                 */
                public List<Policy.Vehicles.Vehicle.VehicleProducts.VehicleProduct> getVehicleProduct() {
                    if (vehicleProduct == null) {
                        vehicleProduct = new ArrayList<Policy.Vehicles.Vehicle.VehicleProducts.VehicleProduct>();
                    }
                    return this.vehicleProduct;
                }

                public void setVehicleProduct(List<Policy.Vehicles.Vehicle.VehicleProducts.VehicleProduct> vehicleProduct) {
                    this.vehicleProduct = vehicleProduct;
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
                 *         &lt;element name="Contract_ID" type="{http://www.w3.org/2001/XMLSchema}int"/>
                 *         &lt;element name="Article_ID" type="{http://www.w3.org/2001/XMLSchema}int"/>
                 *         &lt;element name="Product_Cost_Type" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *         &lt;element name="Full_Term_Amount" type="{http://www.w3.org/2001/XMLSchema}double"/>
                 *         &lt;element name="Written_Amount" type="{http://www.w3.org/2001/XMLSchema}double"/>
                 *         &lt;element name="Unbilled_Amount" type="{http://www.w3.org/2001/XMLSchema}double"/>
                 *         &lt;element name="Net_Change_Amount" type="{http://www.w3.org/2001/XMLSchema}double"/>
                 *         &lt;element name="Fully_Earned_Ind" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *         &lt;element name="Product_Desc" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *         &lt;element name="Product_Code" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *         &lt;element name="MPA_Or_Disc_Surcharge_Selection" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="Ded_1" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
                 *         &lt;element name="Limit_1" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
                 *         &lt;element name="Dollar_or_Percent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="Rejected_Ind" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
                    "contractID",
                    "articleID",
                    "productCostType",
                    "fullTermAmount",
                    "writtenAmount",
                    "unbilledAmount",
                    "netChangeAmount",
                    "fullyEarnedInd",
                    "productDesc",
                    "productCode",
                    "mpaOrDiscSurchargeSelection",
                    "ded1",
                    "limit1",
                    "dollarOrPercent",
                    "rejectedInd"
                })
                public static class VehicleProduct {

                    @XmlElement(name = "Contract_ID")
                    protected int contractID;
                    @XmlElement(name = "Article_ID")
                    protected int articleID;
                    @XmlElement(name = "Product_Cost_Type", required = true)
                    protected String productCostType;
                    @XmlElement(name = "Full_Term_Amount")
                    protected double fullTermAmount;
                    @XmlElement(name = "Written_Amount")
                    protected double writtenAmount;
                    @XmlElement(name = "Unbilled_Amount")
                    protected double unbilledAmount;
                    @XmlElement(name = "Net_Change_Amount")
                    protected double netChangeAmount;
                    @XmlElement(name = "Fully_Earned_Ind", required = true)
                    protected String fullyEarnedInd;
                    @XmlElement(name = "Product_Desc", required = true)
                    protected String productDesc;
                    @XmlElement(name = "Product_Code", required = true)
                    protected String productCode;
                    @XmlElement(name = "MPA_Or_Disc_Surcharge_Selection")
                    protected String mpaOrDiscSurchargeSelection;
                    @XmlElement(name = "Ded_1")
                    protected Integer ded1;
                    @XmlElement(name = "Limit_1")
                    protected Integer limit1;
                    @XmlElement(name = "Dollar_or_Percent")
                    protected String dollarOrPercent;
                    @XmlElement(name = "Rejected_Ind", required = true)
                    protected String rejectedInd;

                    /**
                     * Gets the value of the contractID property.
                     * 
                     */
                    public int getContractID() {
                        return contractID;
                    }

                    /**
                     * Sets the value of the contractID property.
                     * 
                     */
                    public void setContractID(int value) {
                        this.contractID = value;
                    }

                    /**
                     * Gets the value of the articleID property.
                     * 
                     */
                    public int getArticleID() {
                        return articleID;
                    }

                    /**
                     * Sets the value of the articleID property.
                     * 
                     */
                    public void setArticleID(int value) {
                        this.articleID = value;
                    }

                    /**
                     * Gets the value of the productCostType property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getProductCostType() {
                        return productCostType;
                    }

                    /**
                     * Sets the value of the productCostType property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setProductCostType(String value) {
                        this.productCostType = value;
                    }

                    /**
                     * Gets the value of the fullTermAmount property.
                     * 
                     */
                    public double getFullTermAmount() {
                        return fullTermAmount;
                    }

                    /**
                     * Sets the value of the fullTermAmount property.
                     * 
                     */
                    public void setFullTermAmount(double value) {
                        this.fullTermAmount = value;
                    }

                    /**
                     * Gets the value of the writtenAmount property.
                     * 
                     */
                    public double getWrittenAmount() {
                        return writtenAmount;
                    }

                    /**
                     * Sets the value of the writtenAmount property.
                     * 
                     */
                    public void setWrittenAmount(double value) {
                        this.writtenAmount = value;
                    }

                    /**
                     * Gets the value of the unbilledAmount property.
                     * 
                     */
                    public double getUnbilledAmount() {
                        return unbilledAmount;
                    }

                    /**
                     * Sets the value of the unbilledAmount property.
                     * 
                     */
                    public void setUnbilledAmount(double value) {
                        this.unbilledAmount = value;
                    }

                    /**
                     * Gets the value of the netChangeAmount property.
                     * 
                     */
                    public double getNetChangeAmount() {
                        return netChangeAmount;
                    }

                    /**
                     * Sets the value of the netChangeAmount property.
                     * 
                     */
                    public void setNetChangeAmount(double value) {
                        this.netChangeAmount = value;
                    }

                    /**
                     * Gets the value of the fullyEarnedInd property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getFullyEarnedInd() {
                        return fullyEarnedInd;
                    }

                    /**
                     * Sets the value of the fullyEarnedInd property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setFullyEarnedInd(String value) {
                        this.fullyEarnedInd = value;
                    }

                    /**
                     * Gets the value of the productDesc property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getProductDesc() {
                        return productDesc;
                    }

                    /**
                     * Sets the value of the productDesc property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setProductDesc(String value) {
                        this.productDesc = value;
                    }

                    /**
                     * Gets the value of the productCode property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getProductCode() {
                        return productCode;
                    }

                    /**
                     * Sets the value of the productCode property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setProductCode(String value) {
                        this.productCode = value;
                    }

                    /**
                     * Gets the value of the mpaOrDiscSurchargeSelection property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getMPAOrDiscSurchargeSelection() {
                        return mpaOrDiscSurchargeSelection;
                    }

                    /**
                     * Sets the value of the mpaOrDiscSurchargeSelection property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setMPAOrDiscSurchargeSelection(String value) {
                        this.mpaOrDiscSurchargeSelection = value;
                    }

                    /**
                     * Gets the value of the ded1 property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Integer }
                     *     
                     */
                    public Integer getDed1() {
                        return ded1;
                    }

                    /**
                     * Sets the value of the ded1 property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Integer }
                     *     
                     */
                    public void setDed1(Integer value) {
                        this.ded1 = value;
                    }

                    /**
                     * Gets the value of the limit1 property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Integer }
                     *     
                     */
                    public Integer getLimit1() {
                        return limit1;
                    }

                    /**
                     * Sets the value of the limit1 property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Integer }
                     *     
                     */
                    public void setLimit1(Integer value) {
                        this.limit1 = value;
                    }

                    /**
                     * Gets the value of the dollarOrPercent property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getDollarOrPercent() {
                        return dollarOrPercent;
                    }

                    /**
                     * Sets the value of the dollarOrPercent property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setDollarOrPercent(String value) {
                        this.dollarOrPercent = value;
                    }

                    /**
                     * Gets the value of the rejectedInd property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getRejectedInd() {
                        return rejectedInd;
                    }

                    /**
                     * Sets the value of the rejectedInd property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setRejectedInd(String value) {
                        this.rejectedInd = value;
                    }

                }

            }

        }

    }

}
