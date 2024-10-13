# NginxReverse addon HomeAssistant

  Nginx reverse proxy into Home Assistant panel

  *Nginx reverse proxy container add-on for HomeAssistant*

  ## Installation

Add custom component remote repository:
"https://github.com/sdavides/NginxReverse-Homeassistant"


   ![immagine](https://github.com/user-attachments/assets/1f100850-d7db-40ca-a036-97254154b408)

 ## Setting

  * Upstream server ( example modem "192.168.1.1" )
  * Upstream port (example "80")
  * Upstream http ( "http" or "https" )
  * Upstream document root (not required default=blank)
  * basic_authentication (not required)
      * ( if backend require basic authentication (popup) ) 
  * SSL (not required)
      * certificate for NGiNX container
  * Internal port for NGiNX container


## Add panel
![immagine](https://github.com/user-attachments/assets/c37d7568-1921-47c2-b3e4-3b7fc9400987)

