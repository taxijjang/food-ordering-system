
rootProject.name = "food-ordering-system"

include("common")
include("common:common-domain")
include("order-service")
include("order-service:order-application")
include("order-service:order-container")
include("order-service:order-dataaccess")
include("order-service:order-domain")
include("order-service:order-messaging")
include("order-service:order-application")
include("order-service:order-domain:order-application-service")
include("order-service:order-domain:order-domain-core")
