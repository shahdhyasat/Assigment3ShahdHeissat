package apiObjects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonNode;

public class promotionsResponseObject {

    @JsonProperty("id")
    private  JsonNode id;
    @JsonProperty("title")
    private JsonNode title;
    @JsonProperty("cta_label")
    private JsonNode ctaLabel;
    @JsonProperty("image_url")
    private JsonNode imageURL;
    @JsonProperty("foreground_url")
    private  JsonNode foregroundURL;
    @JsonProperty("description")
    private JsonNode description;
    @JsonProperty("promotion_target")
    private JsonNode promotionTarget;
    @JsonProperty("analytics_key")
    private JsonNode analyticsKey;
    @JsonProperty("cobrand_tile")
    private  JsonNode cobrandTile;
    @JsonProperty("send_to_bank")
    private JsonNode sendToBank;
    @JsonProperty("navigation_style")
    private JsonNode navigationStyle;
    @JsonProperty("target_destination")
    private JsonNode targetDestination;
    @JsonProperty("sort_order")
    private JsonNode sortOrder;

    public JsonNode getId() {
        return id;
    }

    public JsonNode getTitle() {
        return title;
    }

    public JsonNode getCtaLabel() {
        return ctaLabel;
    }

    public JsonNode getImageURL() {
        return imageURL;
    }

    public  JsonNode getForegroundURL() {
        return foregroundURL;
    }

    public JsonNode getDescription() {
        return description;
    }

    public JsonNode getPromotionTarget() {
        return promotionTarget;
    }

    public JsonNode getAnalyticsKey() {
        return analyticsKey;
    }

    public  JsonNode getCobrandTile() {
        return cobrandTile;
    }

    public JsonNode getSendToBank() {
        return sendToBank;
    }

    public JsonNode getNavigationStyle() {
        return navigationStyle;
    }

    public JsonNode getTargetDestination() {
        return targetDestination;
    }

    public JsonNode getSortOrder() {
        return sortOrder;
    }
}
