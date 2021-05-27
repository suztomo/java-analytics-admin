// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/analytics/admin/v1alpha/analytics_admin.proto

package com.google.analytics.admin.v1alpha;

public interface UpdateMeasurementProtocolSecretRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.analytics.admin.v1alpha.UpdateMeasurementProtocolSecretRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The measurement protocol secret to update.
   * </pre>
   *
   * <code>.google.analytics.admin.v1alpha.MeasurementProtocolSecret measurement_protocol_secret = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the measurementProtocolSecret field is set.
   */
  boolean hasMeasurementProtocolSecret();
  /**
   * <pre>
   * Required. The measurement protocol secret to update.
   * </pre>
   *
   * <code>.google.analytics.admin.v1alpha.MeasurementProtocolSecret measurement_protocol_secret = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The measurementProtocolSecret.
   */
  com.google.analytics.admin.v1alpha.MeasurementProtocolSecret getMeasurementProtocolSecret();
  /**
   * <pre>
   * Required. The measurement protocol secret to update.
   * </pre>
   *
   * <code>.google.analytics.admin.v1alpha.MeasurementProtocolSecret measurement_protocol_secret = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.analytics.admin.v1alpha.MeasurementProtocolSecretOrBuilder getMeasurementProtocolSecretOrBuilder();

  /**
   * <pre>
   * The list of fields to be updated. Omitted fields will not be updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();
  /**
   * <pre>
   * The list of fields to be updated. Omitted fields will not be updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   * <pre>
   * The list of fields to be updated. Omitted fields will not be updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();
}
