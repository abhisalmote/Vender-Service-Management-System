package com.SpringBootEmail.Entity;

import com.app.entities.Order;

public interface EmailHelper {
	public static String generateEmailBody(Order o) {
		return "<!DOCTYPE html>\r\n"
				+ "<html lang=\"en\">\r\n"
				+ "<head>\r\n"
				+ "    <meta charset=\"UTF-8\">\r\n"
				+ "    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n"
				+ "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n"
				+ "    <title>Invoice</title>\r\n"
				+ "    <style>\r\n"
				+ "        \r\n"
				+ "@import url(https://fonts.googleapis.com/css?family=Roboto:100,300,400,900,700,500,300,100);\r\n"
				+ "*{\r\n"
				+ "  margin: 0;\r\n"
				+ "  box-sizing: border-box;\r\n"
				+ "\r\n"
				+ "}\r\n"
				+ "body{\r\n"
				+ "  background: #E0E0E0;\r\n"
				+ "  font-family: 'Roboto', sans-serif;\r\n"
				+ "  background-image: url('');\r\n"
				+ "  background-repeat: repeat-y;\r\n"
				+ "  background-size: 100%;\r\n"
				+ "}\r\n"
				+ "::selection {background: #f31544; color: #FFF;}\r\n"
				+ "::moz-selection {background: #f31544; color: #FFF;}\r\n"
				+ "h1{\r\n"
				+ "  font-size: 1.5em;\r\n"
				+ "  color: #222;\r\n"
				+ "}\r\n"
				+ "h2{font-size: .9em;}\r\n"
				+ "h3{\r\n"
				+ "  font-size: 1.2em;\r\n"
				+ "  font-weight: 300;\r\n"
				+ "  line-height: 2em;\r\n"
				+ "}\r\n"
				+ "p{\r\n"
				+ "  font-size: .7em;\r\n"
				+ "  color: #666;\r\n"
				+ "  line-height: 1.2em;\r\n"
				+ "}\r\n"
				+ "\r\n"
				+ "#invoiceholder{\r\n"
				+ "  width:100%;\r\n"
				+ "  hieght: 100%;\r\n"
				+ "  padding-top: 50px;\r\n"
				+ "}\r\n"
				+ "#headerimage{\r\n"
				+ "  z-index:-1;\r\n"
				+ "  position:relative;\r\n"
				+ "  top: -50px;\r\n"
				+ "  height: 350px;\r\n"
				+ "  background-image: url('http://michaeltruong.ca/images/invoicebg.jpg');\r\n"
				+ "\r\n"
				+ "  -webkit-box-shadow:inset 0 2px 4px rgba(0,0,0,.15), inset 0 -2px 4px rgba(0,0,0,.15);\r\n"
				+ "	-moz-box-shadow:inset 0 2px 4px rgba(0,0,0,.15), inset 0 -2px 4px rgba(0,0,0,.15);\r\n"
				+ "	box-shadow:inset 0 2px 4px rgba(0,0,0,.15), inset 0 -2px 4px rgba(0,0,0,.15);\r\n"
				+ "  overflow:hidden;\r\n"
				+ "  background-attachment: fixed;\r\n"
				+ "  background-size: 1920px 80%;\r\n"
				+ "  background-position: 50% -90%;\r\n"
				+ "}\r\n"
				+ "#invoice{\r\n"
				+ "  position: relative;\r\n"
				+ "  top: -290px;\r\n"
				+ "  margin: 0 auto;\r\n"
				+ "  width: 700px;\r\n"
				+ "  background: #FFF;\r\n"
				+ "}\r\n"
				+ "\r\n"
				+ "[id*='invoice-']{ /* Targets all id with 'col-' */\r\n"
				+ "  border-bottom: 1px solid #EEE;\r\n"
				+ "  padding: 30px;\r\n"
				+ "}\r\n"
				+ "\r\n"
				+ "#invoice-top{min-height: 120px;}\r\n"
				+ "#invoice-mid{min-height: 120px;}\r\n"
				+ "#invoice-bot{ min-height: 250px;}\r\n"
				+ "\r\n"
				+ ".logo{\r\n"
				+ "  float: left;\r\n"
				+ "	height: 100px;\r\n"
				+ "	width: 100px;\r\n"
				+ "	background: url(https://i.pinimg.com/originals/39/0e/e1/390ee120731934bf9d91de4f3ea67bbf.jpg) no-repeat;\r\n"
				+ "	background-size: 100px 100px;\r\n"
				+ "}\r\n"
				+ ".clientlogo{\r\n"
				+ "  float: left;\r\n"
				+ "	height: 60px;\r\n"
				+ "	width: 60px;\r\n"
				+ "	background: url(http://michaeltruong.ca/images/client.jpg) no-repeat;\r\n"
				+ "	background-size: 60px 60px;\r\n"
				+ "  border-radius: 50px;\r\n"
				+ "}\r\n"
				+ ".info{\r\n"
				+ "  display: block;\r\n"
				+ "  float:left;\r\n"
				+ "  margin-left: 20px;\r\n"
				+ "}\r\n"
				+ ".title{\r\n"
				+ "  float: right;\r\n"
				+ "}\r\n"
				+ ".title p{text-align: right;}\r\n"
				+ "#project{margin-left: 52%;}\r\n"
				+ "table{\r\n"
				+ "  width: 100%;\r\n"
				+ "  border-collapse: collapse;\r\n"
				+ "}\r\n"
				+ "td{\r\n"
				+ "  padding: 5px 0 5px 15px;\r\n"
				+ "  border: 1px solid #EEE\r\n"
				+ "}\r\n"
				+ ".tabletitle{\r\n"
				+ "  padding: 5px;\r\n"
				+ "  background: #EEE;\r\n"
				+ "}\r\n"
				+ ".service{border: 1px solid #EEE;}\r\n"
				+ ".item{width: 50%;}\r\n"
				+ ".itemtext{font-size: .9em;}\r\n"
				+ "\r\n"
				+ "#legalcopy{\r\n"
				+ "  margin-top: 30px;\r\n"
				+ "}\r\n"
				+ "form{\r\n"
				+ "  float:right;\r\n"
				+ "  margin-top: 30px;\r\n"
				+ "  text-align: right;\r\n"
				+ "}\r\n"
				+ "\r\n"
				+ "\r\n"
				+ ".effect2\r\n"
				+ "{\r\n"
				+ "  position: relative;\r\n"
				+ "}\r\n"
				+ ".effect2:before, .effect2:after\r\n"
				+ "{\r\n"
				+ "  z-index: -1;\r\n"
				+ "  position: absolute;\r\n"
				+ "  content: \"\";\r\n"
				+ "  bottom: 15px;\r\n"
				+ "  left: 10px;\r\n"
				+ "  width: 50%;\r\n"
				+ "  top: 80%;\r\n"
				+ "  max-width:300px;\r\n"
				+ "  background: #777;\r\n"
				+ "  -webkit-box-shadow: 0 15px 10px #777;\r\n"
				+ "  -moz-box-shadow: 0 15px 10px #777;\r\n"
				+ "  box-shadow: 0 15px 10px #777;\r\n"
				+ "  -webkit-transform: rotate(-3deg);\r\n"
				+ "  -moz-transform: rotate(-3deg);\r\n"
				+ "  -o-transform: rotate(-3deg);\r\n"
				+ "  -ms-transform: rotate(-3deg);\r\n"
				+ "  transform: rotate(-3deg);\r\n"
				+ "}\r\n"
				+ ".effect2:after\r\n"
				+ "{\r\n"
				+ "  -webkit-transform: rotate(3deg);\r\n"
				+ "  -moz-transform: rotate(3deg);\r\n"
				+ "  -o-transform: rotate(3deg);\r\n"
				+ "  -ms-transform: rotate(3deg);\r\n"
				+ "  transform: rotate(3deg);\r\n"
				+ "  right: 10px;\r\n"
				+ "  left: auto;\r\n"
				+ "}\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "\r\n"
				+ ".legal{\r\n"
				+ "  width:70%;\r\n"
				+ "}\r\n"
				+ "    </style>\r\n"
				+ "</head>\r\n"
				+ "<body>\r\n"
				+ "    <div id=\"invoiceholder\">\r\n"
				+ "\r\n"
				+ "        <div id=\"headerimage\"></div>\r\n"
				+ "        <div id=\"invoice\" class=\"effect2\">\r\n"
				+ "          \r\n"
				+ "          <div id=\"invoice-top\">\r\n"
				+ "            <div class=\"logo\"></div>\r\n"
				+ "            <div class=\"info\">\r\n"
				+ "              <h1><br>Konnect Team</h1>\r\n"
				+ "              <p> konnect035@gmail.com </br>\r\n"
				+ "              </p>\r\n"
				+ "            </div><!--End Info-->\r\n"
				+ "            <div class=\"title\">\r\n"
				+ "              <!-- penguin -->\r\n"
				+ "              <h1>Invoice #"+ o.getId() +"</h1>\r\n"
				+ "              <!-- penguin -->\r\n"
				+ "              <p>Issued: "+ o.getOrderFinalizedTime().toLocalDate().toString() + " | " + o.getOrderFinalizedTime().toLocalTime().toString() +"</br>\r\n"
				+ "              </p>\r\n"
				+ "            </div><!--End Title-->\r\n"
				+ "          </div><!--End InvoiceTop-->\r\n"
				+ "      \r\n"
				+ "      \r\n"
				+ "          \r\n"
				+ "          <div id=\"invoice-mid\">\r\n"
				+ "            \r\n"
				+ "            <div class=\"info\">\r\n"
				+ "              <!--penguin-->\r\n"
				+ "              <h2>Customer</h2>\r\n"
				+ "              <p>"+ o.getCustomer().getName() +"</br>\r\n"
				+ "                 "+ o.getCustomer().getContactNo() +"</br>\r\n"
				+ "            </div>\r\n"
				+ "            <div class=\"info\">\r\n"
				+ "              <!--penguin-->\r\n"
				+ "              <h2>Vendor</h2>\r\n"
				+ "              <p>"+ o.getFinalVendor().getName() +"</br>\r\n"
				+ "                 "+ o.getFinalVendor().getContactNo() +"</br>\r\n"
				+ "            </div>\r\n"
				+ "      \r\n"
				+ "            <!--penguin-->\r\n"
				+ "            <div id=\"project\">\r\n"
				+ "              <h2>Customer Comments</h2>\r\n"
				+ "              <p>"+ o.getCustomerComments() +"</p>\r\n"
				+ "            </div> \r\n"
				+ "            <br>\r\n"
				+ "            <!--penguin-->\r\n"
				+ "            <div id=\"project\">\r\n"
				+ "              <h2>Vendor Comments</h2>\r\n"
				+ "              <p>"+ o.getVendorComments() +"</p>\r\n"
				+ "            </div>   \r\n"
				+ "      \r\n"
				+ "          </div><!--End Invoice Mid-->\r\n"
				+ "          \r\n"
				+ "          <div id=\"invoice-bot\">\r\n"
				+ "            \r\n"
				+ "            <div id=\"table\">\r\n"
				+ "              <table>\r\n"
				+ "                <tr class=\"tabletitle\">\r\n"
				+ "                  <td class=\"item\"><h2>Item Description</h2></td>\r\n"
				+ "                  <td class=\"subtotal\"><h2>Sub-total</h2></td>\r\n"
				+ "                </tr>\r\n"
				+ "                <!--penguin-->\r\n"
				+ "                <tr class=\"service\">\r\n"
				+ "                  <td class=\"tableitem\"><p class=\"itemtext\">"+ o.getService().getServiceType() + " service" +"</p></td>\r\n"
				+ "                  <td class=\"tableitem\"><p class=\"itemtext\">"+ o.getFinalAmount() +"</p></td>\r\n"
				+ "                </tr>\r\n"
				+ "                \r\n"
				+ "                  \r\n"
				+ "                <tr class=\"tabletitle\">\r\n"
				+ "                  <td class=\"Rate\"><h2>Total</h2></td>\r\n"
				+ "                  <td class=\"payment\"><h2>"+ o.getFinalAmount() +"</h2></td>\r\n"
				+ "                </tr>\r\n"
				+ "                \r\n"
				+ "              </table>\r\n"
				+ "            </div><!--End Table-->\r\n"
				+ "            \r\n"
				+ "          <form action=\"https://www.paypal.com/cgi-bin/webscr\" method=\"post\" target=\"_top\">\r\n"
				+ "            <input type=\"hidden\" name=\"cmd\" value=\"_s-xclick\">\r\n"
				+ "            <input type=\"hidden\" name=\"hosted_button_id\" value=\"QRZ7QTM9XRPJ6\">\r\n"
				+ "            <input type=\"image\" src=\"http://michaeltruong.ca/images/paypal.png\" border=\"0\" name=\"submit\" alt=\"PayPal - The safer, easier way to pay online!\">\r\n"
				+ "          </form>\r\n"
				+ "      \r\n"
				+ "            \r\n"
				+ "            <div id=\"legalcopy\">\r\n"
				+ "              <p class=\"legal\"><strong>Thank you for your business!</strong>  Payment is expected within 31 days; please process this invoice within that time. There will be a 5% interest charge per month on late invoices. \r\n"
				+ "              </p>\r\n"
				+ "            </div>\r\n"
				+ "            \r\n"
				+ "          </div><!--End InvoiceBot-->\r\n"
				+ "        </div><!--End Invoice-->\r\n"
				+ "      </div><!-- End Invoice Holder-->\r\n"
				+ "</body>\r\n"
				+ "</html>";
	}
}
