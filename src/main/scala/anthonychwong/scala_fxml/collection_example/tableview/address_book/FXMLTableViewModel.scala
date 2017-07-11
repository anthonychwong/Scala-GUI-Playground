package anthonychwong.scala_fxml.collection_example.tableview.address_book

import javafx.collections.ObservableList

import scalafx.Includes.jfxParent2sfx
import scalafx.application.JFXApp
import scalafx.event.ActionEvent
import scalafx.scene.Scene

import scalafx.scene.control.TableView
import scalafx.scene.control.TableView.sfxTableView2jfx
import scalafx.scene.control.TextField
import scalafx.scene.control.TextField.sfxTextField2jfx

import scalafxml.core.{DependenciesByType, FXMLView}

import scalafxml.core.macros.sfxml

@sfxml
class FXMLTableViewModel(
    private val tableView: TableView[Person],
    private val firstNameField: TextField,
    private val lastNameField: TextField,
    private val emailField: TextField) {

  def addPerson(event: ActionEvent) {

    val data: ObservableList[Person] = tableView.getItems();
    data.add(new Person(firstNameField.getText(), lastNameField.getText(), emailField.getText()));

    firstNameField.setText("");
    lastNameField.setText("");
    emailField.setText("");

  }

}

object Main extends JFXApp {
  val root = FXMLView(getClass.getResource("fxml_tableview.fxml"), new DependenciesByType((Map())));

  stage = new JFXApp.PrimaryStage() {
    title = "FXML TableView Example"
    scene = new Scene(root)
  }
}