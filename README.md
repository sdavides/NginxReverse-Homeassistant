# NginxReverse addon HomeAssistant

  Nginx reverse proxy into Home Assistant
  or external port
 
**Reverse Proxy NGINX from hassio**
      
**Reverse Proxy NGINX external port with authentication HA**
  

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


* External port nginx:
  
  * SSL (not required)
      * certificate for NGiNX container
	( https://%homeassistant%:1890/ )
  * Port for NGiNX container 
        ( example 1890 default=disable: "" )
  * leave_front_door_open 
	( disable authentication HA )

## Advanced Setting

  * edit files "/addon_configs/e0ed675c_nginx_reverse/"
  * restart add-on

restore config
  * delete file folder "/addon_configs/e0ed675c_nginx_reverse/", restart add-on 



## Add panel
![immagine](https://github.com/user-attachments/assets/c37d7568-1921-47c2-b3e4-3b7fc9400987)

## Example
![immagine](https://github.com/user-attachments/assets/16b00f62-9e0a-4461-8d2a-95f4acc93722)

