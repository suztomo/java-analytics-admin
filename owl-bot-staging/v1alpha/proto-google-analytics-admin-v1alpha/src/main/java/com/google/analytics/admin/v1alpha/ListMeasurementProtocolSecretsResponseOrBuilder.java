// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/analytics/admin/v1alpha/analytics_admin.proto

package com.google.analytics.admin.v1alpha;

public interface ListMeasurementProtocolSecretsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.analytics.admin.v1alpha.ListMeasurementProtocolSecretsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * A list of secrets for the parent stream specified in the request.
   * </pre>
   *
   * <code>repeated .google.analytics.admin.v1alpha.MeasurementProtocolSecret measurement_protocol_secrets = 1;</code>
   */
  java.util.List<com.google.analytics.admin.v1alpha.MeasurementProtocolSecret> 
      getMeasurementProtocolSecretsList();
  /**
   * <pre>
   * A list of secrets for the parent stream specified in the request.
   * </pre>
   *
   * <code>repeated .google.analytics.admin.v1alpha.MeasurementProtocolSecret measurement_protocol_secrets = 1;</code>
   */
  com.google.analytics.admin.v1alpha.MeasurementProtocolSecret getMeasurementProtocolSecrets(int index);
  /**
   * <pre>
   * A list of secrets for the parent stream specified in the request.
   * </pre>
   *
   * <code>repeated .google.analytics.admin.v1alpha.MeasurementProtocolSecret measurement_protocol_secrets = 1;</code>
   */
  int getMeasurementProtocolSecretsCount();
  /**
   * <pre>
   * A list of secrets for the parent stream specified in the request.
   * </pre>
   *
   * <code>repeated .google.analytics.admin.v1alpha.MeasurementProtocolSecret measurement_protocol_secrets = 1;</code>
   */
  java.util.List<? extends com.google.analytics.admin.v1alpha.MeasurementProtocolSecretOrBuilder> 
      getMeasurementProtocolSecretsOrBuilderList();
  /**
   * <pre>
   * A list of secrets for the parent stream specified in the request.
   * </pre>
   *
   * <code>repeated .google.analytics.admin.v1alpha.MeasurementProtocolSecret measurement_protocol_secrets = 1;</code>
   */
  com.google.analytics.admin.v1alpha.MeasurementProtocolSecretOrBuilder getMeasurementProtocolSecretsOrBuilder(
      int index);

  /**
   * <pre>
   * A token, which can be sent as `page_token` to retrieve the next page.
   * If this field is omitted, there are no subsequent pages.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   * <pre>
   * A token, which can be sent as `page_token` to retrieve the next page.
   * If this field is omitted, there are no subsequent pages.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString
      getNextPageTokenBytes();
}
