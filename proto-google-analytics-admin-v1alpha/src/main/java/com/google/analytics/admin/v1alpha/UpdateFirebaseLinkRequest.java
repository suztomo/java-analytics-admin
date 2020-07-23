/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/analytics/admin/v1alpha/analytics_admin.proto

package com.google.analytics.admin.v1alpha;

/**
 *
 *
 * <pre>
 * Request message for UpdateFirebaseLink RPC
 * </pre>
 *
 * Protobuf type {@code google.analytics.admin.v1alpha.UpdateFirebaseLinkRequest}
 */
public final class UpdateFirebaseLinkRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.analytics.admin.v1alpha.UpdateFirebaseLinkRequest)
    UpdateFirebaseLinkRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use UpdateFirebaseLinkRequest.newBuilder() to construct.
  private UpdateFirebaseLinkRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private UpdateFirebaseLinkRequest() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new UpdateFirebaseLinkRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private UpdateFirebaseLinkRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10:
            {
              com.google.analytics.admin.v1alpha.FirebaseLink.Builder subBuilder = null;
              if (firebaseLink_ != null) {
                subBuilder = firebaseLink_.toBuilder();
              }
              firebaseLink_ =
                  input.readMessage(
                      com.google.analytics.admin.v1alpha.FirebaseLink.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(firebaseLink_);
                firebaseLink_ = subBuilder.buildPartial();
              }

              break;
            }
          case 18:
            {
              com.google.protobuf.FieldMask.Builder subBuilder = null;
              if (updateMask_ != null) {
                subBuilder = updateMask_.toBuilder();
              }
              updateMask_ =
                  input.readMessage(com.google.protobuf.FieldMask.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(updateMask_);
                updateMask_ = subBuilder.buildPartial();
              }

              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.analytics.admin.v1alpha.AnalyticsAdminProto
        .internal_static_google_analytics_admin_v1alpha_UpdateFirebaseLinkRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.analytics.admin.v1alpha.AnalyticsAdminProto
        .internal_static_google_analytics_admin_v1alpha_UpdateFirebaseLinkRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.analytics.admin.v1alpha.UpdateFirebaseLinkRequest.class,
            com.google.analytics.admin.v1alpha.UpdateFirebaseLinkRequest.Builder.class);
  }

  public static final int FIREBASE_LINK_FIELD_NUMBER = 1;
  private com.google.analytics.admin.v1alpha.FirebaseLink firebaseLink_;
  /**
   *
   *
   * <pre>
   * Required. The Firebase link to update.
   * </pre>
   *
   * <code>
   * .google.analytics.admin.v1alpha.FirebaseLink firebase_link = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the firebaseLink field is set.
   */
  @java.lang.Override
  public boolean hasFirebaseLink() {
    return firebaseLink_ != null;
  }
  /**
   *
   *
   * <pre>
   * Required. The Firebase link to update.
   * </pre>
   *
   * <code>
   * .google.analytics.admin.v1alpha.FirebaseLink firebase_link = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The firebaseLink.
   */
  @java.lang.Override
  public com.google.analytics.admin.v1alpha.FirebaseLink getFirebaseLink() {
    return firebaseLink_ == null
        ? com.google.analytics.admin.v1alpha.FirebaseLink.getDefaultInstance()
        : firebaseLink_;
  }
  /**
   *
   *
   * <pre>
   * Required. The Firebase link to update.
   * </pre>
   *
   * <code>
   * .google.analytics.admin.v1alpha.FirebaseLink firebase_link = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.analytics.admin.v1alpha.FirebaseLinkOrBuilder getFirebaseLinkOrBuilder() {
    return getFirebaseLink();
  }

  public static final int UPDATE_MASK_FIELD_NUMBER = 2;
  private com.google.protobuf.FieldMask updateMask_;
  /**
   *
   *
   * <pre>
   * The list of fields to be updated. Omitted fields will not be updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   *
   * @return Whether the updateMask field is set.
   */
  @java.lang.Override
  public boolean hasUpdateMask() {
    return updateMask_ != null;
  }
  /**
   *
   *
   * <pre>
   * The list of fields to be updated. Omitted fields will not be updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   *
   * @return The updateMask.
   */
  @java.lang.Override
  public com.google.protobuf.FieldMask getUpdateMask() {
    return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
  }
  /**
   *
   *
   * <pre>
   * The list of fields to be updated. Omitted fields will not be updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  @java.lang.Override
  public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
    return getUpdateMask();
  }

  private byte memoizedIsInitialized = -1;

  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (firebaseLink_ != null) {
      output.writeMessage(1, getFirebaseLink());
    }
    if (updateMask_ != null) {
      output.writeMessage(2, getUpdateMask());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (firebaseLink_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getFirebaseLink());
    }
    if (updateMask_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getUpdateMask());
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.analytics.admin.v1alpha.UpdateFirebaseLinkRequest)) {
      return super.equals(obj);
    }
    com.google.analytics.admin.v1alpha.UpdateFirebaseLinkRequest other =
        (com.google.analytics.admin.v1alpha.UpdateFirebaseLinkRequest) obj;

    if (hasFirebaseLink() != other.hasFirebaseLink()) return false;
    if (hasFirebaseLink()) {
      if (!getFirebaseLink().equals(other.getFirebaseLink())) return false;
    }
    if (hasUpdateMask() != other.hasUpdateMask()) return false;
    if (hasUpdateMask()) {
      if (!getUpdateMask().equals(other.getUpdateMask())) return false;
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasFirebaseLink()) {
      hash = (37 * hash) + FIREBASE_LINK_FIELD_NUMBER;
      hash = (53 * hash) + getFirebaseLink().hashCode();
    }
    if (hasUpdateMask()) {
      hash = (37 * hash) + UPDATE_MASK_FIELD_NUMBER;
      hash = (53 * hash) + getUpdateMask().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.analytics.admin.v1alpha.UpdateFirebaseLinkRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.admin.v1alpha.UpdateFirebaseLinkRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.admin.v1alpha.UpdateFirebaseLinkRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.admin.v1alpha.UpdateFirebaseLinkRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.admin.v1alpha.UpdateFirebaseLinkRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.admin.v1alpha.UpdateFirebaseLinkRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.admin.v1alpha.UpdateFirebaseLinkRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.analytics.admin.v1alpha.UpdateFirebaseLinkRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.analytics.admin.v1alpha.UpdateFirebaseLinkRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.analytics.admin.v1alpha.UpdateFirebaseLinkRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.analytics.admin.v1alpha.UpdateFirebaseLinkRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.analytics.admin.v1alpha.UpdateFirebaseLinkRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(
      com.google.analytics.admin.v1alpha.UpdateFirebaseLinkRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * Request message for UpdateFirebaseLink RPC
   * </pre>
   *
   * Protobuf type {@code google.analytics.admin.v1alpha.UpdateFirebaseLinkRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.analytics.admin.v1alpha.UpdateFirebaseLinkRequest)
      com.google.analytics.admin.v1alpha.UpdateFirebaseLinkRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.analytics.admin.v1alpha.AnalyticsAdminProto
          .internal_static_google_analytics_admin_v1alpha_UpdateFirebaseLinkRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.analytics.admin.v1alpha.AnalyticsAdminProto
          .internal_static_google_analytics_admin_v1alpha_UpdateFirebaseLinkRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.analytics.admin.v1alpha.UpdateFirebaseLinkRequest.class,
              com.google.analytics.admin.v1alpha.UpdateFirebaseLinkRequest.Builder.class);
    }

    // Construct using com.google.analytics.admin.v1alpha.UpdateFirebaseLinkRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (firebaseLinkBuilder_ == null) {
        firebaseLink_ = null;
      } else {
        firebaseLink_ = null;
        firebaseLinkBuilder_ = null;
      }
      if (updateMaskBuilder_ == null) {
        updateMask_ = null;
      } else {
        updateMask_ = null;
        updateMaskBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.analytics.admin.v1alpha.AnalyticsAdminProto
          .internal_static_google_analytics_admin_v1alpha_UpdateFirebaseLinkRequest_descriptor;
    }

    @java.lang.Override
    public com.google.analytics.admin.v1alpha.UpdateFirebaseLinkRequest
        getDefaultInstanceForType() {
      return com.google.analytics.admin.v1alpha.UpdateFirebaseLinkRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.analytics.admin.v1alpha.UpdateFirebaseLinkRequest build() {
      com.google.analytics.admin.v1alpha.UpdateFirebaseLinkRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.analytics.admin.v1alpha.UpdateFirebaseLinkRequest buildPartial() {
      com.google.analytics.admin.v1alpha.UpdateFirebaseLinkRequest result =
          new com.google.analytics.admin.v1alpha.UpdateFirebaseLinkRequest(this);
      if (firebaseLinkBuilder_ == null) {
        result.firebaseLink_ = firebaseLink_;
      } else {
        result.firebaseLink_ = firebaseLinkBuilder_.build();
      }
      if (updateMaskBuilder_ == null) {
        result.updateMask_ = updateMask_;
      } else {
        result.updateMask_ = updateMaskBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.analytics.admin.v1alpha.UpdateFirebaseLinkRequest) {
        return mergeFrom((com.google.analytics.admin.v1alpha.UpdateFirebaseLinkRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.analytics.admin.v1alpha.UpdateFirebaseLinkRequest other) {
      if (other
          == com.google.analytics.admin.v1alpha.UpdateFirebaseLinkRequest.getDefaultInstance())
        return this;
      if (other.hasFirebaseLink()) {
        mergeFirebaseLink(other.getFirebaseLink());
      }
      if (other.hasUpdateMask()) {
        mergeUpdateMask(other.getUpdateMask());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.analytics.admin.v1alpha.UpdateFirebaseLinkRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.analytics.admin.v1alpha.UpdateFirebaseLinkRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.analytics.admin.v1alpha.FirebaseLink firebaseLink_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.analytics.admin.v1alpha.FirebaseLink,
            com.google.analytics.admin.v1alpha.FirebaseLink.Builder,
            com.google.analytics.admin.v1alpha.FirebaseLinkOrBuilder>
        firebaseLinkBuilder_;
    /**
     *
     *
     * <pre>
     * Required. The Firebase link to update.
     * </pre>
     *
     * <code>
     * .google.analytics.admin.v1alpha.FirebaseLink firebase_link = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the firebaseLink field is set.
     */
    public boolean hasFirebaseLink() {
      return firebaseLinkBuilder_ != null || firebaseLink_ != null;
    }
    /**
     *
     *
     * <pre>
     * Required. The Firebase link to update.
     * </pre>
     *
     * <code>
     * .google.analytics.admin.v1alpha.FirebaseLink firebase_link = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The firebaseLink.
     */
    public com.google.analytics.admin.v1alpha.FirebaseLink getFirebaseLink() {
      if (firebaseLinkBuilder_ == null) {
        return firebaseLink_ == null
            ? com.google.analytics.admin.v1alpha.FirebaseLink.getDefaultInstance()
            : firebaseLink_;
      } else {
        return firebaseLinkBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The Firebase link to update.
     * </pre>
     *
     * <code>
     * .google.analytics.admin.v1alpha.FirebaseLink firebase_link = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setFirebaseLink(com.google.analytics.admin.v1alpha.FirebaseLink value) {
      if (firebaseLinkBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        firebaseLink_ = value;
        onChanged();
      } else {
        firebaseLinkBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The Firebase link to update.
     * </pre>
     *
     * <code>
     * .google.analytics.admin.v1alpha.FirebaseLink firebase_link = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setFirebaseLink(
        com.google.analytics.admin.v1alpha.FirebaseLink.Builder builderForValue) {
      if (firebaseLinkBuilder_ == null) {
        firebaseLink_ = builderForValue.build();
        onChanged();
      } else {
        firebaseLinkBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The Firebase link to update.
     * </pre>
     *
     * <code>
     * .google.analytics.admin.v1alpha.FirebaseLink firebase_link = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeFirebaseLink(com.google.analytics.admin.v1alpha.FirebaseLink value) {
      if (firebaseLinkBuilder_ == null) {
        if (firebaseLink_ != null) {
          firebaseLink_ =
              com.google.analytics.admin.v1alpha.FirebaseLink.newBuilder(firebaseLink_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          firebaseLink_ = value;
        }
        onChanged();
      } else {
        firebaseLinkBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The Firebase link to update.
     * </pre>
     *
     * <code>
     * .google.analytics.admin.v1alpha.FirebaseLink firebase_link = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearFirebaseLink() {
      if (firebaseLinkBuilder_ == null) {
        firebaseLink_ = null;
        onChanged();
      } else {
        firebaseLink_ = null;
        firebaseLinkBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The Firebase link to update.
     * </pre>
     *
     * <code>
     * .google.analytics.admin.v1alpha.FirebaseLink firebase_link = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.analytics.admin.v1alpha.FirebaseLink.Builder getFirebaseLinkBuilder() {

      onChanged();
      return getFirebaseLinkFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. The Firebase link to update.
     * </pre>
     *
     * <code>
     * .google.analytics.admin.v1alpha.FirebaseLink firebase_link = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.analytics.admin.v1alpha.FirebaseLinkOrBuilder getFirebaseLinkOrBuilder() {
      if (firebaseLinkBuilder_ != null) {
        return firebaseLinkBuilder_.getMessageOrBuilder();
      } else {
        return firebaseLink_ == null
            ? com.google.analytics.admin.v1alpha.FirebaseLink.getDefaultInstance()
            : firebaseLink_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The Firebase link to update.
     * </pre>
     *
     * <code>
     * .google.analytics.admin.v1alpha.FirebaseLink firebase_link = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.analytics.admin.v1alpha.FirebaseLink,
            com.google.analytics.admin.v1alpha.FirebaseLink.Builder,
            com.google.analytics.admin.v1alpha.FirebaseLinkOrBuilder>
        getFirebaseLinkFieldBuilder() {
      if (firebaseLinkBuilder_ == null) {
        firebaseLinkBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.analytics.admin.v1alpha.FirebaseLink,
                com.google.analytics.admin.v1alpha.FirebaseLink.Builder,
                com.google.analytics.admin.v1alpha.FirebaseLinkOrBuilder>(
                getFirebaseLink(), getParentForChildren(), isClean());
        firebaseLink_ = null;
      }
      return firebaseLinkBuilder_;
    }

    private com.google.protobuf.FieldMask updateMask_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.FieldMask,
            com.google.protobuf.FieldMask.Builder,
            com.google.protobuf.FieldMaskOrBuilder>
        updateMaskBuilder_;
    /**
     *
     *
     * <pre>
     * The list of fields to be updated. Omitted fields will not be updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     *
     * @return Whether the updateMask field is set.
     */
    public boolean hasUpdateMask() {
      return updateMaskBuilder_ != null || updateMask_ != null;
    }
    /**
     *
     *
     * <pre>
     * The list of fields to be updated. Omitted fields will not be updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     *
     * @return The updateMask.
     */
    public com.google.protobuf.FieldMask getUpdateMask() {
      if (updateMaskBuilder_ == null) {
        return updateMask_ == null
            ? com.google.protobuf.FieldMask.getDefaultInstance()
            : updateMask_;
      } else {
        return updateMaskBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * The list of fields to be updated. Omitted fields will not be updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public Builder setUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        updateMask_ = value;
        onChanged();
      } else {
        updateMaskBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of fields to be updated. Omitted fields will not be updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public Builder setUpdateMask(com.google.protobuf.FieldMask.Builder builderForValue) {
      if (updateMaskBuilder_ == null) {
        updateMask_ = builderForValue.build();
        onChanged();
      } else {
        updateMaskBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of fields to be updated. Omitted fields will not be updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public Builder mergeUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (updateMask_ != null) {
          updateMask_ =
              com.google.protobuf.FieldMask.newBuilder(updateMask_).mergeFrom(value).buildPartial();
        } else {
          updateMask_ = value;
        }
        onChanged();
      } else {
        updateMaskBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of fields to be updated. Omitted fields will not be updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public Builder clearUpdateMask() {
      if (updateMaskBuilder_ == null) {
        updateMask_ = null;
        onChanged();
      } else {
        updateMask_ = null;
        updateMaskBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of fields to be updated. Omitted fields will not be updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public com.google.protobuf.FieldMask.Builder getUpdateMaskBuilder() {

      onChanged();
      return getUpdateMaskFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * The list of fields to be updated. Omitted fields will not be updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
      if (updateMaskBuilder_ != null) {
        return updateMaskBuilder_.getMessageOrBuilder();
      } else {
        return updateMask_ == null
            ? com.google.protobuf.FieldMask.getDefaultInstance()
            : updateMask_;
      }
    }
    /**
     *
     *
     * <pre>
     * The list of fields to be updated. Omitted fields will not be updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.FieldMask,
            com.google.protobuf.FieldMask.Builder,
            com.google.protobuf.FieldMaskOrBuilder>
        getUpdateMaskFieldBuilder() {
      if (updateMaskBuilder_ == null) {
        updateMaskBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.protobuf.FieldMask,
                com.google.protobuf.FieldMask.Builder,
                com.google.protobuf.FieldMaskOrBuilder>(
                getUpdateMask(), getParentForChildren(), isClean());
        updateMask_ = null;
      }
      return updateMaskBuilder_;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.analytics.admin.v1alpha.UpdateFirebaseLinkRequest)
  }

  // @@protoc_insertion_point(class_scope:google.analytics.admin.v1alpha.UpdateFirebaseLinkRequest)
  private static final com.google.analytics.admin.v1alpha.UpdateFirebaseLinkRequest
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.analytics.admin.v1alpha.UpdateFirebaseLinkRequest();
  }

  public static com.google.analytics.admin.v1alpha.UpdateFirebaseLinkRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateFirebaseLinkRequest> PARSER =
      new com.google.protobuf.AbstractParser<UpdateFirebaseLinkRequest>() {
        @java.lang.Override
        public UpdateFirebaseLinkRequest parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new UpdateFirebaseLinkRequest(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<UpdateFirebaseLinkRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateFirebaseLinkRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.analytics.admin.v1alpha.UpdateFirebaseLinkRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}