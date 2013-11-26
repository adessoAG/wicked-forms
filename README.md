Wicked Forms
============
[![Build Status](https://travis-ci.org/thombergs/wicked-forms.png)](https://travis-ci.org/thombergs/wicked-forms)
[![Coverage Status](https://coveralls.io/repos/thombergs/wicked-forms/badge.png)](https://coveralls.io/r/thombergs/wicked-forms)

Showcase
========
http://www.wicked-forms.org/wicked-forms-showcase-wicket6/

Why dynamic forms?
==================
Wicked Forms is a Java library you can use to create dynamic forms in your Java web applications. A static form is a form that is defined once and cannot change it's structure whereas a dynamic form is a form that can be defined at runtime.

Use cases for dynamic forms include the following:

* **Rapid Prototyping:** if you use Java Persistence API (JPA) for your database-driven web application you could process the JPA
annotations
and create dynamic forms for each of your entities to rapidly create CRUD functionality (Create, Update, Delete). As a bonus,
you may want to add Bean Validation support to these forms. A JPA annotation processor is part of the roadmap of Wicked Forms (see issue 1 and issue 2).
* **User-Defined Forms:** any use case that requires a user to define a form to be filled out by other users is a use case for dynamic
forms.
An application where a user may create questionnaires or surveys to be filled out by other users is an example. Wicked Forms provides all form input components you might need to create questionnaires.
* **Wizards:** some forms may not need to be wholly user-defined but need to be configurable to a certain extent nonetheless. Such forms
include wizards in which the second form changes it's input fields depending on the input the user has entered in the first form.
* **Form-Based Communication Protocols:** if two applications need to exchange form-based data (i.e. structured data that has been entered
 by
a user, for example in XML), dynamic forms are needed to display this data in a form to another user in the target application. An example of this has already been implemented as a showcase for the German XVergabe standard. See http://www.wicked-forms.org/wicked-forms-showcase-xvergabe.
* **Laziness:** software developers are lazy by profession. Thus, you can let Wicked Forms create your forms for you without the hassle of
programming client-side validation, accessibility features, HTML5 input fields and CSS classes.

Planned Features of Wicked Forms
================================
* modelling of dynamic forms with pure Java
* all default input components available (text fields, radio buttons, checkboxes, ...)
* custom input components can be added
* HTML5 form elements and thus automatic client-side validation
* accessible forms
* reasonably nice default design
* overridable design (CSS, HTML)

Architecture of Wicked Forms
============================
Wicked Forms consists of the following components

* wicked-forms-model: a library with which you can model forms without dependency to any web framework
* wicked-forms-wicket6: a Wicket 6 component which can be used to display a form model in a Wicket 6 web application

Current Status
==============
Wicked forms is currently in ALPHA stadium. However, the architecture is defined and the concept has been proven by the XVergabe showcase: http://www.wicked-forms.org/wicked-forms-showcase-xvergabe. Work on version 1.0 will begin shortly. Get in touch with us if you have any feature requests or ideas.
