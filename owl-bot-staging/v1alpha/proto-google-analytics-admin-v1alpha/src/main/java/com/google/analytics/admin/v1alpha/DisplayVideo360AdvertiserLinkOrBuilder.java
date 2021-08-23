// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/analytics/admin/v1alpha/resources.proto

package com.google.analytics.admin.v1alpha;

public interface DisplayVideo360AdvertiserLinkOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.analytics.admin.v1alpha.DisplayVideo360AdvertiserLink)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Output only. The resource name for this DisplayVideo360AdvertiserLink resource.
   * Format: properties/{propertyId}/displayVideo360AdvertiserLinks/{linkId}
   * Note: linkId is not the Display &amp; Video 360 Advertiser ID
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Output only. The resource name for this DisplayVideo360AdvertiserLink resource.
   * Format: properties/{propertyId}/displayVideo360AdvertiserLinks/{linkId}
   * Note: linkId is not the Display &amp; Video 360 Advertiser ID
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Immutable. The Display &amp; Video 360 Advertiser's advertiser ID.
   * </pre>
   *
   * <code>string advertiser_id = 2 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The advertiserId.
   */
  java.lang.String getAdvertiserId();
  /**
   * <pre>
   * Immutable. The Display &amp; Video 360 Advertiser's advertiser ID.
   * </pre>
   *
   * <code>string advertiser_id = 2 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The bytes for advertiserId.
   */
  com.google.protobuf.ByteString
      getAdvertiserIdBytes();

  /**
   * <pre>
   * Output only. The display name of the Display &amp; Video 360 Advertiser.
   * </pre>
   *
   * <code>string advertiser_display_name = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The advertiserDisplayName.
   */
  java.lang.String getAdvertiserDisplayName();
  /**
   * <pre>
   * Output only. The display name of the Display &amp; Video 360 Advertiser.
   * </pre>
   *
   * <code>string advertiser_display_name = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for advertiserDisplayName.
   */
  com.google.protobuf.ByteString
      getAdvertiserDisplayNameBytes();

  /**
   * <pre>
   * Enables personalized advertising features with this integration.
   * If this field is not set on create/update, it will be defaulted to true.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue ads_personalization_enabled = 4;</code>
   * @return Whether the adsPersonalizationEnabled field is set.
   */
  boolean hasAdsPersonalizationEnabled();
  /**
   * <pre>
   * Enables personalized advertising features with this integration.
   * If this field is not set on create/update, it will be defaulted to true.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue ads_personalization_enabled = 4;</code>
   * @return The adsPersonalizationEnabled.
   */
  com.google.protobuf.BoolValue getAdsPersonalizationEnabled();
  /**
   * <pre>
   * Enables personalized advertising features with this integration.
   * If this field is not set on create/update, it will be defaulted to true.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue ads_personalization_enabled = 4;</code>
   */
  com.google.protobuf.BoolValueOrBuilder getAdsPersonalizationEnabledOrBuilder();

  /**
   * <pre>
   * Immutable. Enables the import of campaign data from Display &amp; Video 360 into the GA4
   * property. After link creation, this can only be updated from the Display &amp;
   * Video 360 product.
   * If this field is not set on create, it will be defaulted to true.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue campaign_data_sharing_enabled = 5 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return Whether the campaignDataSharingEnabled field is set.
   */
  boolean hasCampaignDataSharingEnabled();
  /**
   * <pre>
   * Immutable. Enables the import of campaign data from Display &amp; Video 360 into the GA4
   * property. After link creation, this can only be updated from the Display &amp;
   * Video 360 product.
   * If this field is not set on create, it will be defaulted to true.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue campaign_data_sharing_enabled = 5 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The campaignDataSharingEnabled.
   */
  com.google.protobuf.BoolValue getCampaignDataSharingEnabled();
  /**
   * <pre>
   * Immutable. Enables the import of campaign data from Display &amp; Video 360 into the GA4
   * property. After link creation, this can only be updated from the Display &amp;
   * Video 360 product.
   * If this field is not set on create, it will be defaulted to true.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue campaign_data_sharing_enabled = 5 [(.google.api.field_behavior) = IMMUTABLE];</code>
   */
  com.google.protobuf.BoolValueOrBuilder getCampaignDataSharingEnabledOrBuilder();

  /**
   * <pre>
   * Immutable. Enables the import of cost data from Display &amp; Video 360 into the GA4
   * property. This can only be enabled if campaign_data_import_enabled is
   * enabled. After link creation, this can only be updated from the Display &amp;
   * Video 360 product.
   * If this field is not set on create, it will be defaulted to true.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue cost_data_sharing_enabled = 6 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return Whether the costDataSharingEnabled field is set.
   */
  boolean hasCostDataSharingEnabled();
  /**
   * <pre>
   * Immutable. Enables the import of cost data from Display &amp; Video 360 into the GA4
   * property. This can only be enabled if campaign_data_import_enabled is
   * enabled. After link creation, this can only be updated from the Display &amp;
   * Video 360 product.
   * If this field is not set on create, it will be defaulted to true.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue cost_data_sharing_enabled = 6 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The costDataSharingEnabled.
   */
  com.google.protobuf.BoolValue getCostDataSharingEnabled();
  /**
   * <pre>
   * Immutable. Enables the import of cost data from Display &amp; Video 360 into the GA4
   * property. This can only be enabled if campaign_data_import_enabled is
   * enabled. After link creation, this can only be updated from the Display &amp;
   * Video 360 product.
   * If this field is not set on create, it will be defaulted to true.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue cost_data_sharing_enabled = 6 [(.google.api.field_behavior) = IMMUTABLE];</code>
   */
  com.google.protobuf.BoolValueOrBuilder getCostDataSharingEnabledOrBuilder();
}
