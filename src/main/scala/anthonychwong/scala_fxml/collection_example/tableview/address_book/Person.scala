package anthonychwong.scala_fxml.collection_example.tableview.address_book
 
import scalafx.beans.property.StringProperty;

class Person {
  
  def this(firstName: String, lastName: String, email: String){
    this();
    this.firstName.set(firstName);
    this.lastName.set(lastName);
    this.email.set(email);
  }
  
  private final val firstName = StringProperty("firstName");
  def setFirstName(fName:String):Unit = this.firstName.set(fName)
  def getFirstName:String = firstName.value;
  
  private final val lastName = StringProperty("lastName");
  def setLastName(lName:String):Unit = this.lastName.set(lName)
  def getLastName:String = lastName.value;
  
  private final val email = StringProperty("email");
  def setEmail(email:String):Unit = this.email.set(email)
  def getEmail:String = email.value;

}