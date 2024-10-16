server {
    listen {{ .interface }}:{{ .port }} default_server;

    include /etc/nginx/includes/server_params.conf;
    include /etc/nginx/includes/proxy_params.conf;

    location / {
        allow   172.30.32.2;
        deny    all;

        proxy_pass http://backend;
	include /etc/nginx/includes/location_params.conf;
# fix resource path relative
sub_filter 'src="/' 'src="$http_referer';
sub_filter 'href="/' 'href="$http_referer';
sub_filter 'href="' 'href="$http_referer';

    }
}
