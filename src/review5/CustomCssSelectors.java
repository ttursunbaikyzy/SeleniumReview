package review5;

public class CustomCssSelectors {
    // ====================ID=====================================
    // https://naveenautomationlabs.com/opencart/index.php?route=account/register
    //1. Id in CSS ==> #id
    //   #input-firstname
    //2. tagName#id
    //   input#input-firstname

    // ====================Classes=====================================
    //1. Class in CSS => .classValues
    //   .form-control
    //2. tagName.classValue
    //   input.form-control

    // ====================Multiple Classes=====================================
    // https://app.hubspot.com/login
    // 1. c1.c2.c3.....cn
    // .form-control.private-form__control.login-email
    // input.form-control.private-form__control.login-email

    // Selected class values
    // .c1.c2.c3.....cn   ==>   c1.c3.c4
    // .form-control.private-form__control
    // .login-email

    // Manage order as per your choice
    //.c2.c4.c1
    // can be re-ordered  .login-email.form-control.private-form__control

    // ==========================================================================
    // Can we combine id and class together? - yes
    // 1. id.class
    // #username.form-control.private-form__control.login-email
    // #username.login-email
    // 2. tagName#id.class
    // input#username.login-email

    // .class#id
    // .login-email#username
    // tagName.class#id
    // input.login-email#username

    // Identify webElement using css without class or id  [ by using other available attributes]
    // tagName[attribute='valye']
    // input [type='email']

    // https://naveenautomationlabs.com/opencart/index.php?route=account/register
    // Multiple attributes
    // tagName[attribute1='value1'][attribute1='value2'][attribute1='value3'].........[attribute1='valueN']
    // input[name='firstname'][type='text'][id='input-firstname']

    // Can we use id or class with other attributes
    // #id[attribute='value']
        // #input-firstname[name='firstname']

    // .class[attribute='value']
        // .form-control[name='firstname']

    // tagName#id[attribute='value']
        // input#input-firstname[name='firstname']

    // tagName.class[attribute='value']
        // inout.form-control[name='firstname']

    // Can we use text in CSS to create CSS locator? - no
    // 1. Text is not supported in CSS

    // Contains in CSS
    // tagName[attribute*='attribute value']
    // input[name*='firstname']
    // input[name*='first']
    // input[name*='name']


    // Starts with in CSS
    // tagName[attribute^='attribute value']
    // input[name^='f']

    // Ends with in CSS
    // tagName[attribute$='attribute value']
    // input[name$='me']

    /*
    contains    - *
    Id          - #
    classname   - .
    starts with - ^
    ending value -$
     */

    // https://app.hubspot.com/login
    // parent child  (cannot traverse from child to parent)
    // parentTagName childTagName
    // div input
    // div.private-form__input-wrapper input#username
    // div[class'private-form__input-wrapper'] input[type='email']
    // select#Form_getForm_Country option

}
