package de.adesso.wickedforms.metadata;

import de.adesso.wickedforms.model.Section;
import de.adesso.wickedforms.model.Form;
import de.adesso.wickedforms.model.elements.Text;
import de.adesso.wickedforms.model.elements.fields.Checkbox;
import de.adesso.wickedforms.model.elements.fields.TextField;

public class LabelExample extends Form {

	public LabelExample() {
		super("Label Examples (this is the form label)");

		add(new Section("Label on an input field")
		    .add(
		        new Text(
		            "Each input field in a form should have a label. Otherwise the user won't know what to input. Most form elements accept a label String in the constructor."))
		    .add(new TextField<String>("This is a text field label", String.class))
		    .add(new Checkbox("This is a checkbox label")));

		add(new Section("This is a section label")
		    .add(
		        new Text(
		            "Not only input fields have labels. Each section also has a label.")));

	}

}
