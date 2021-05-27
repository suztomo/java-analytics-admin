// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/analytics/admin/v1alpha/resources.proto

package com.google.analytics.admin.v1alpha;

/**
 * <pre>
 * Status of the Google Signals settings (i.e., whether this feature has been
 * enabled for the property).
 * </pre>
 *
 * Protobuf enum {@code google.analytics.admin.v1alpha.GoogleSignalsState}
 */
public enum GoogleSignalsState
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * Google Signals status defaults to GOOGLE_SIGNALS_STATE_UNSPECIFIED to
   * represent that the user has not made an explicit choice.
   * </pre>
   *
   * <code>GOOGLE_SIGNALS_STATE_UNSPECIFIED = 0;</code>
   */
  GOOGLE_SIGNALS_STATE_UNSPECIFIED(0),
  /**
   * <pre>
   * Google Signals is enabled.
   * </pre>
   *
   * <code>GOOGLE_SIGNALS_ENABLED = 1;</code>
   */
  GOOGLE_SIGNALS_ENABLED(1),
  /**
   * <pre>
   * Google Signals is disabled.
   * </pre>
   *
   * <code>GOOGLE_SIGNALS_DISABLED = 2;</code>
   */
  GOOGLE_SIGNALS_DISABLED(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * Google Signals status defaults to GOOGLE_SIGNALS_STATE_UNSPECIFIED to
   * represent that the user has not made an explicit choice.
   * </pre>
   *
   * <code>GOOGLE_SIGNALS_STATE_UNSPECIFIED = 0;</code>
   */
  public static final int GOOGLE_SIGNALS_STATE_UNSPECIFIED_VALUE = 0;
  /**
   * <pre>
   * Google Signals is enabled.
   * </pre>
   *
   * <code>GOOGLE_SIGNALS_ENABLED = 1;</code>
   */
  public static final int GOOGLE_SIGNALS_ENABLED_VALUE = 1;
  /**
   * <pre>
   * Google Signals is disabled.
   * </pre>
   *
   * <code>GOOGLE_SIGNALS_DISABLED = 2;</code>
   */
  public static final int GOOGLE_SIGNALS_DISABLED_VALUE = 2;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static GoogleSignalsState valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static GoogleSignalsState forNumber(int value) {
    switch (value) {
      case 0: return GOOGLE_SIGNALS_STATE_UNSPECIFIED;
      case 1: return GOOGLE_SIGNALS_ENABLED;
      case 2: return GOOGLE_SIGNALS_DISABLED;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<GoogleSignalsState>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      GoogleSignalsState> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<GoogleSignalsState>() {
          public GoogleSignalsState findValueByNumber(int number) {
            return GoogleSignalsState.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalStateException(
          "Can't get the descriptor of an unrecognized enum value.");
    }
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return com.google.analytics.admin.v1alpha.ResourcesProto.getDescriptor().getEnumTypes().get(5);
  }

  private static final GoogleSignalsState[] VALUES = values();

  public static GoogleSignalsState valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private GoogleSignalsState(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.analytics.admin.v1alpha.GoogleSignalsState)
}

