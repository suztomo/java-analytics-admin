/*
 * Copyright 2021 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.analytics.admin.v1alpha.stub;

import static com.google.analytics.admin.v1alpha.AnalyticsAdminServiceClient.AuditUserLinksPagedResponse;
import static com.google.analytics.admin.v1alpha.AnalyticsAdminServiceClient.ListAccountSummariesPagedResponse;
import static com.google.analytics.admin.v1alpha.AnalyticsAdminServiceClient.ListAccountsPagedResponse;
import static com.google.analytics.admin.v1alpha.AnalyticsAdminServiceClient.ListAndroidAppDataStreamsPagedResponse;
import static com.google.analytics.admin.v1alpha.AnalyticsAdminServiceClient.ListConversionEventsPagedResponse;
import static com.google.analytics.admin.v1alpha.AnalyticsAdminServiceClient.ListCustomDimensionsPagedResponse;
import static com.google.analytics.admin.v1alpha.AnalyticsAdminServiceClient.ListCustomMetricsPagedResponse;
import static com.google.analytics.admin.v1alpha.AnalyticsAdminServiceClient.ListFirebaseLinksPagedResponse;
import static com.google.analytics.admin.v1alpha.AnalyticsAdminServiceClient.ListGoogleAdsLinksPagedResponse;
import static com.google.analytics.admin.v1alpha.AnalyticsAdminServiceClient.ListIosAppDataStreamsPagedResponse;
import static com.google.analytics.admin.v1alpha.AnalyticsAdminServiceClient.ListMeasurementProtocolSecretsPagedResponse;
import static com.google.analytics.admin.v1alpha.AnalyticsAdminServiceClient.ListPropertiesPagedResponse;
import static com.google.analytics.admin.v1alpha.AnalyticsAdminServiceClient.ListUserLinksPagedResponse;
import static com.google.analytics.admin.v1alpha.AnalyticsAdminServiceClient.ListWebDataStreamsPagedResponse;
import static com.google.analytics.admin.v1alpha.AnalyticsAdminServiceClient.SearchChangeHistoryEventsPagedResponse;

import com.google.analytics.admin.v1alpha.Account;
import com.google.analytics.admin.v1alpha.AndroidAppDataStream;
import com.google.analytics.admin.v1alpha.ArchiveCustomDimensionRequest;
import com.google.analytics.admin.v1alpha.ArchiveCustomMetricRequest;
import com.google.analytics.admin.v1alpha.AuditUserLinksRequest;
import com.google.analytics.admin.v1alpha.AuditUserLinksResponse;
import com.google.analytics.admin.v1alpha.BatchCreateUserLinksRequest;
import com.google.analytics.admin.v1alpha.BatchCreateUserLinksResponse;
import com.google.analytics.admin.v1alpha.BatchDeleteUserLinksRequest;
import com.google.analytics.admin.v1alpha.BatchGetUserLinksRequest;
import com.google.analytics.admin.v1alpha.BatchGetUserLinksResponse;
import com.google.analytics.admin.v1alpha.BatchUpdateUserLinksRequest;
import com.google.analytics.admin.v1alpha.BatchUpdateUserLinksResponse;
import com.google.analytics.admin.v1alpha.ConversionEvent;
import com.google.analytics.admin.v1alpha.CreateConversionEventRequest;
import com.google.analytics.admin.v1alpha.CreateCustomDimensionRequest;
import com.google.analytics.admin.v1alpha.CreateCustomMetricRequest;
import com.google.analytics.admin.v1alpha.CreateFirebaseLinkRequest;
import com.google.analytics.admin.v1alpha.CreateGoogleAdsLinkRequest;
import com.google.analytics.admin.v1alpha.CreateMeasurementProtocolSecretRequest;
import com.google.analytics.admin.v1alpha.CreatePropertyRequest;
import com.google.analytics.admin.v1alpha.CreateUserLinkRequest;
import com.google.analytics.admin.v1alpha.CreateWebDataStreamRequest;
import com.google.analytics.admin.v1alpha.CustomDimension;
import com.google.analytics.admin.v1alpha.CustomMetric;
import com.google.analytics.admin.v1alpha.DataSharingSettings;
import com.google.analytics.admin.v1alpha.DeleteAccountRequest;
import com.google.analytics.admin.v1alpha.DeleteAndroidAppDataStreamRequest;
import com.google.analytics.admin.v1alpha.DeleteConversionEventRequest;
import com.google.analytics.admin.v1alpha.DeleteFirebaseLinkRequest;
import com.google.analytics.admin.v1alpha.DeleteGoogleAdsLinkRequest;
import com.google.analytics.admin.v1alpha.DeleteIosAppDataStreamRequest;
import com.google.analytics.admin.v1alpha.DeleteMeasurementProtocolSecretRequest;
import com.google.analytics.admin.v1alpha.DeletePropertyRequest;
import com.google.analytics.admin.v1alpha.DeleteUserLinkRequest;
import com.google.analytics.admin.v1alpha.DeleteWebDataStreamRequest;
import com.google.analytics.admin.v1alpha.EnhancedMeasurementSettings;
import com.google.analytics.admin.v1alpha.FirebaseLink;
import com.google.analytics.admin.v1alpha.GetAccountRequest;
import com.google.analytics.admin.v1alpha.GetAndroidAppDataStreamRequest;
import com.google.analytics.admin.v1alpha.GetConversionEventRequest;
import com.google.analytics.admin.v1alpha.GetCustomDimensionRequest;
import com.google.analytics.admin.v1alpha.GetCustomMetricRequest;
import com.google.analytics.admin.v1alpha.GetDataSharingSettingsRequest;
import com.google.analytics.admin.v1alpha.GetEnhancedMeasurementSettingsRequest;
import com.google.analytics.admin.v1alpha.GetGlobalSiteTagRequest;
import com.google.analytics.admin.v1alpha.GetGoogleSignalsSettingsRequest;
import com.google.analytics.admin.v1alpha.GetIosAppDataStreamRequest;
import com.google.analytics.admin.v1alpha.GetMeasurementProtocolSecretRequest;
import com.google.analytics.admin.v1alpha.GetPropertyRequest;
import com.google.analytics.admin.v1alpha.GetUserLinkRequest;
import com.google.analytics.admin.v1alpha.GetWebDataStreamRequest;
import com.google.analytics.admin.v1alpha.GlobalSiteTag;
import com.google.analytics.admin.v1alpha.GoogleAdsLink;
import com.google.analytics.admin.v1alpha.GoogleSignalsSettings;
import com.google.analytics.admin.v1alpha.IosAppDataStream;
import com.google.analytics.admin.v1alpha.ListAccountSummariesRequest;
import com.google.analytics.admin.v1alpha.ListAccountSummariesResponse;
import com.google.analytics.admin.v1alpha.ListAccountsRequest;
import com.google.analytics.admin.v1alpha.ListAccountsResponse;
import com.google.analytics.admin.v1alpha.ListAndroidAppDataStreamsRequest;
import com.google.analytics.admin.v1alpha.ListAndroidAppDataStreamsResponse;
import com.google.analytics.admin.v1alpha.ListConversionEventsRequest;
import com.google.analytics.admin.v1alpha.ListConversionEventsResponse;
import com.google.analytics.admin.v1alpha.ListCustomDimensionsRequest;
import com.google.analytics.admin.v1alpha.ListCustomDimensionsResponse;
import com.google.analytics.admin.v1alpha.ListCustomMetricsRequest;
import com.google.analytics.admin.v1alpha.ListCustomMetricsResponse;
import com.google.analytics.admin.v1alpha.ListFirebaseLinksRequest;
import com.google.analytics.admin.v1alpha.ListFirebaseLinksResponse;
import com.google.analytics.admin.v1alpha.ListGoogleAdsLinksRequest;
import com.google.analytics.admin.v1alpha.ListGoogleAdsLinksResponse;
import com.google.analytics.admin.v1alpha.ListIosAppDataStreamsRequest;
import com.google.analytics.admin.v1alpha.ListIosAppDataStreamsResponse;
import com.google.analytics.admin.v1alpha.ListMeasurementProtocolSecretsRequest;
import com.google.analytics.admin.v1alpha.ListMeasurementProtocolSecretsResponse;
import com.google.analytics.admin.v1alpha.ListPropertiesRequest;
import com.google.analytics.admin.v1alpha.ListPropertiesResponse;
import com.google.analytics.admin.v1alpha.ListUserLinksRequest;
import com.google.analytics.admin.v1alpha.ListUserLinksResponse;
import com.google.analytics.admin.v1alpha.ListWebDataStreamsRequest;
import com.google.analytics.admin.v1alpha.ListWebDataStreamsResponse;
import com.google.analytics.admin.v1alpha.MeasurementProtocolSecret;
import com.google.analytics.admin.v1alpha.Property;
import com.google.analytics.admin.v1alpha.ProvisionAccountTicketRequest;
import com.google.analytics.admin.v1alpha.ProvisionAccountTicketResponse;
import com.google.analytics.admin.v1alpha.SearchChangeHistoryEventsRequest;
import com.google.analytics.admin.v1alpha.SearchChangeHistoryEventsResponse;
import com.google.analytics.admin.v1alpha.UpdateAccountRequest;
import com.google.analytics.admin.v1alpha.UpdateAndroidAppDataStreamRequest;
import com.google.analytics.admin.v1alpha.UpdateCustomDimensionRequest;
import com.google.analytics.admin.v1alpha.UpdateCustomMetricRequest;
import com.google.analytics.admin.v1alpha.UpdateEnhancedMeasurementSettingsRequest;
import com.google.analytics.admin.v1alpha.UpdateFirebaseLinkRequest;
import com.google.analytics.admin.v1alpha.UpdateGoogleAdsLinkRequest;
import com.google.analytics.admin.v1alpha.UpdateGoogleSignalsSettingsRequest;
import com.google.analytics.admin.v1alpha.UpdateIosAppDataStreamRequest;
import com.google.analytics.admin.v1alpha.UpdateMeasurementProtocolSecretRequest;
import com.google.analytics.admin.v1alpha.UpdatePropertyRequest;
import com.google.analytics.admin.v1alpha.UpdateUserLinkRequest;
import com.google.analytics.admin.v1alpha.UpdateWebDataStreamRequest;
import com.google.analytics.admin.v1alpha.UserLink;
import com.google.analytics.admin.v1alpha.WebDataStream;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.core.BackgroundResourceAggregation;
import com.google.api.gax.grpc.GrpcCallSettings;
import com.google.api.gax.grpc.GrpcStubCallableFactory;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.common.collect.ImmutableMap;
import com.google.longrunning.stub.GrpcOperationsStub;
import com.google.protobuf.Empty;
import io.grpc.MethodDescriptor;
import io.grpc.protobuf.ProtoUtils;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * gRPC stub implementation for the AnalyticsAdminService service API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@BetaApi
@Generated("by gapic-generator-java")
public class GrpcAnalyticsAdminServiceStub extends AnalyticsAdminServiceStub {
  private static final MethodDescriptor<GetAccountRequest, Account> getAccountMethodDescriptor =
      MethodDescriptor.<GetAccountRequest, Account>newBuilder()
          .setType(MethodDescriptor.MethodType.UNARY)
          .setFullMethodName("google.analytics.admin.v1alpha.AnalyticsAdminService/GetAccount")
          .setRequestMarshaller(ProtoUtils.marshaller(GetAccountRequest.getDefaultInstance()))
          .setResponseMarshaller(ProtoUtils.marshaller(Account.getDefaultInstance()))
          .build();

  private static final MethodDescriptor<ListAccountsRequest, ListAccountsResponse>
      listAccountsMethodDescriptor =
          MethodDescriptor.<ListAccountsRequest, ListAccountsResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.analytics.admin.v1alpha.AnalyticsAdminService/ListAccounts")
              .setRequestMarshaller(ProtoUtils.marshaller(ListAccountsRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(ListAccountsResponse.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<DeleteAccountRequest, Empty> deleteAccountMethodDescriptor =
      MethodDescriptor.<DeleteAccountRequest, Empty>newBuilder()
          .setType(MethodDescriptor.MethodType.UNARY)
          .setFullMethodName("google.analytics.admin.v1alpha.AnalyticsAdminService/DeleteAccount")
          .setRequestMarshaller(ProtoUtils.marshaller(DeleteAccountRequest.getDefaultInstance()))
          .setResponseMarshaller(ProtoUtils.marshaller(Empty.getDefaultInstance()))
          .build();

  private static final MethodDescriptor<UpdateAccountRequest, Account>
      updateAccountMethodDescriptor =
          MethodDescriptor.<UpdateAccountRequest, Account>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.analytics.admin.v1alpha.AnalyticsAdminService/UpdateAccount")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(UpdateAccountRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(Account.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<
          ProvisionAccountTicketRequest, ProvisionAccountTicketResponse>
      provisionAccountTicketMethodDescriptor =
          MethodDescriptor
              .<ProvisionAccountTicketRequest, ProvisionAccountTicketResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.analytics.admin.v1alpha.AnalyticsAdminService/ProvisionAccountTicket")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(ProvisionAccountTicketRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(ProvisionAccountTicketResponse.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<ListAccountSummariesRequest, ListAccountSummariesResponse>
      listAccountSummariesMethodDescriptor =
          MethodDescriptor.<ListAccountSummariesRequest, ListAccountSummariesResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.analytics.admin.v1alpha.AnalyticsAdminService/ListAccountSummaries")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(ListAccountSummariesRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(ListAccountSummariesResponse.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<GetPropertyRequest, Property> getPropertyMethodDescriptor =
      MethodDescriptor.<GetPropertyRequest, Property>newBuilder()
          .setType(MethodDescriptor.MethodType.UNARY)
          .setFullMethodName("google.analytics.admin.v1alpha.AnalyticsAdminService/GetProperty")
          .setRequestMarshaller(ProtoUtils.marshaller(GetPropertyRequest.getDefaultInstance()))
          .setResponseMarshaller(ProtoUtils.marshaller(Property.getDefaultInstance()))
          .build();

  private static final MethodDescriptor<ListPropertiesRequest, ListPropertiesResponse>
      listPropertiesMethodDescriptor =
          MethodDescriptor.<ListPropertiesRequest, ListPropertiesResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.analytics.admin.v1alpha.AnalyticsAdminService/ListProperties")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(ListPropertiesRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(ListPropertiesResponse.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<CreatePropertyRequest, Property>
      createPropertyMethodDescriptor =
          MethodDescriptor.<CreatePropertyRequest, Property>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.analytics.admin.v1alpha.AnalyticsAdminService/CreateProperty")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(CreatePropertyRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(Property.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<DeletePropertyRequest, Property>
      deletePropertyMethodDescriptor =
          MethodDescriptor.<DeletePropertyRequest, Property>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.analytics.admin.v1alpha.AnalyticsAdminService/DeleteProperty")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(DeletePropertyRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(Property.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<UpdatePropertyRequest, Property>
      updatePropertyMethodDescriptor =
          MethodDescriptor.<UpdatePropertyRequest, Property>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.analytics.admin.v1alpha.AnalyticsAdminService/UpdateProperty")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(UpdatePropertyRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(Property.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<GetUserLinkRequest, UserLink> getUserLinkMethodDescriptor =
      MethodDescriptor.<GetUserLinkRequest, UserLink>newBuilder()
          .setType(MethodDescriptor.MethodType.UNARY)
          .setFullMethodName("google.analytics.admin.v1alpha.AnalyticsAdminService/GetUserLink")
          .setRequestMarshaller(ProtoUtils.marshaller(GetUserLinkRequest.getDefaultInstance()))
          .setResponseMarshaller(ProtoUtils.marshaller(UserLink.getDefaultInstance()))
          .build();

  private static final MethodDescriptor<BatchGetUserLinksRequest, BatchGetUserLinksResponse>
      batchGetUserLinksMethodDescriptor =
          MethodDescriptor.<BatchGetUserLinksRequest, BatchGetUserLinksResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.analytics.admin.v1alpha.AnalyticsAdminService/BatchGetUserLinks")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(BatchGetUserLinksRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(BatchGetUserLinksResponse.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<ListUserLinksRequest, ListUserLinksResponse>
      listUserLinksMethodDescriptor =
          MethodDescriptor.<ListUserLinksRequest, ListUserLinksResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.analytics.admin.v1alpha.AnalyticsAdminService/ListUserLinks")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(ListUserLinksRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(ListUserLinksResponse.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<AuditUserLinksRequest, AuditUserLinksResponse>
      auditUserLinksMethodDescriptor =
          MethodDescriptor.<AuditUserLinksRequest, AuditUserLinksResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.analytics.admin.v1alpha.AnalyticsAdminService/AuditUserLinks")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(AuditUserLinksRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(AuditUserLinksResponse.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<CreateUserLinkRequest, UserLink>
      createUserLinkMethodDescriptor =
          MethodDescriptor.<CreateUserLinkRequest, UserLink>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.analytics.admin.v1alpha.AnalyticsAdminService/CreateUserLink")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(CreateUserLinkRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(UserLink.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<BatchCreateUserLinksRequest, BatchCreateUserLinksResponse>
      batchCreateUserLinksMethodDescriptor =
          MethodDescriptor.<BatchCreateUserLinksRequest, BatchCreateUserLinksResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.analytics.admin.v1alpha.AnalyticsAdminService/BatchCreateUserLinks")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(BatchCreateUserLinksRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(BatchCreateUserLinksResponse.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<UpdateUserLinkRequest, UserLink>
      updateUserLinkMethodDescriptor =
          MethodDescriptor.<UpdateUserLinkRequest, UserLink>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.analytics.admin.v1alpha.AnalyticsAdminService/UpdateUserLink")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(UpdateUserLinkRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(UserLink.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<BatchUpdateUserLinksRequest, BatchUpdateUserLinksResponse>
      batchUpdateUserLinksMethodDescriptor =
          MethodDescriptor.<BatchUpdateUserLinksRequest, BatchUpdateUserLinksResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.analytics.admin.v1alpha.AnalyticsAdminService/BatchUpdateUserLinks")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(BatchUpdateUserLinksRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(BatchUpdateUserLinksResponse.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<DeleteUserLinkRequest, Empty>
      deleteUserLinkMethodDescriptor =
          MethodDescriptor.<DeleteUserLinkRequest, Empty>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.analytics.admin.v1alpha.AnalyticsAdminService/DeleteUserLink")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(DeleteUserLinkRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(Empty.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<BatchDeleteUserLinksRequest, Empty>
      batchDeleteUserLinksMethodDescriptor =
          MethodDescriptor.<BatchDeleteUserLinksRequest, Empty>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.analytics.admin.v1alpha.AnalyticsAdminService/BatchDeleteUserLinks")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(BatchDeleteUserLinksRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(Empty.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<GetWebDataStreamRequest, WebDataStream>
      getWebDataStreamMethodDescriptor =
          MethodDescriptor.<GetWebDataStreamRequest, WebDataStream>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.analytics.admin.v1alpha.AnalyticsAdminService/GetWebDataStream")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(GetWebDataStreamRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(WebDataStream.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<DeleteWebDataStreamRequest, Empty>
      deleteWebDataStreamMethodDescriptor =
          MethodDescriptor.<DeleteWebDataStreamRequest, Empty>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.analytics.admin.v1alpha.AnalyticsAdminService/DeleteWebDataStream")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(DeleteWebDataStreamRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(Empty.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<UpdateWebDataStreamRequest, WebDataStream>
      updateWebDataStreamMethodDescriptor =
          MethodDescriptor.<UpdateWebDataStreamRequest, WebDataStream>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.analytics.admin.v1alpha.AnalyticsAdminService/UpdateWebDataStream")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(UpdateWebDataStreamRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(WebDataStream.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<CreateWebDataStreamRequest, WebDataStream>
      createWebDataStreamMethodDescriptor =
          MethodDescriptor.<CreateWebDataStreamRequest, WebDataStream>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.analytics.admin.v1alpha.AnalyticsAdminService/CreateWebDataStream")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(CreateWebDataStreamRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(WebDataStream.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<ListWebDataStreamsRequest, ListWebDataStreamsResponse>
      listWebDataStreamsMethodDescriptor =
          MethodDescriptor.<ListWebDataStreamsRequest, ListWebDataStreamsResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.analytics.admin.v1alpha.AnalyticsAdminService/ListWebDataStreams")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(ListWebDataStreamsRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(ListWebDataStreamsResponse.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<GetIosAppDataStreamRequest, IosAppDataStream>
      getIosAppDataStreamMethodDescriptor =
          MethodDescriptor.<GetIosAppDataStreamRequest, IosAppDataStream>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.analytics.admin.v1alpha.AnalyticsAdminService/GetIosAppDataStream")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(GetIosAppDataStreamRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(IosAppDataStream.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<DeleteIosAppDataStreamRequest, Empty>
      deleteIosAppDataStreamMethodDescriptor =
          MethodDescriptor.<DeleteIosAppDataStreamRequest, Empty>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.analytics.admin.v1alpha.AnalyticsAdminService/DeleteIosAppDataStream")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(DeleteIosAppDataStreamRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(Empty.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<UpdateIosAppDataStreamRequest, IosAppDataStream>
      updateIosAppDataStreamMethodDescriptor =
          MethodDescriptor.<UpdateIosAppDataStreamRequest, IosAppDataStream>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.analytics.admin.v1alpha.AnalyticsAdminService/UpdateIosAppDataStream")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(UpdateIosAppDataStreamRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(IosAppDataStream.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<ListIosAppDataStreamsRequest, ListIosAppDataStreamsResponse>
      listIosAppDataStreamsMethodDescriptor =
          MethodDescriptor.<ListIosAppDataStreamsRequest, ListIosAppDataStreamsResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.analytics.admin.v1alpha.AnalyticsAdminService/ListIosAppDataStreams")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(ListIosAppDataStreamsRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(ListIosAppDataStreamsResponse.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<GetAndroidAppDataStreamRequest, AndroidAppDataStream>
      getAndroidAppDataStreamMethodDescriptor =
          MethodDescriptor.<GetAndroidAppDataStreamRequest, AndroidAppDataStream>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.analytics.admin.v1alpha.AnalyticsAdminService/GetAndroidAppDataStream")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(GetAndroidAppDataStreamRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(AndroidAppDataStream.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<DeleteAndroidAppDataStreamRequest, Empty>
      deleteAndroidAppDataStreamMethodDescriptor =
          MethodDescriptor.<DeleteAndroidAppDataStreamRequest, Empty>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.analytics.admin.v1alpha.AnalyticsAdminService/DeleteAndroidAppDataStream")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(DeleteAndroidAppDataStreamRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(Empty.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<UpdateAndroidAppDataStreamRequest, AndroidAppDataStream>
      updateAndroidAppDataStreamMethodDescriptor =
          MethodDescriptor.<UpdateAndroidAppDataStreamRequest, AndroidAppDataStream>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.analytics.admin.v1alpha.AnalyticsAdminService/UpdateAndroidAppDataStream")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(UpdateAndroidAppDataStreamRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(AndroidAppDataStream.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<
          ListAndroidAppDataStreamsRequest, ListAndroidAppDataStreamsResponse>
      listAndroidAppDataStreamsMethodDescriptor =
          MethodDescriptor
              .<ListAndroidAppDataStreamsRequest, ListAndroidAppDataStreamsResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.analytics.admin.v1alpha.AnalyticsAdminService/ListAndroidAppDataStreams")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(ListAndroidAppDataStreamsRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(ListAndroidAppDataStreamsResponse.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<
          GetEnhancedMeasurementSettingsRequest, EnhancedMeasurementSettings>
      getEnhancedMeasurementSettingsMethodDescriptor =
          MethodDescriptor
              .<GetEnhancedMeasurementSettingsRequest, EnhancedMeasurementSettings>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.analytics.admin.v1alpha.AnalyticsAdminService/GetEnhancedMeasurementSettings")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(GetEnhancedMeasurementSettingsRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(EnhancedMeasurementSettings.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<
          UpdateEnhancedMeasurementSettingsRequest, EnhancedMeasurementSettings>
      updateEnhancedMeasurementSettingsMethodDescriptor =
          MethodDescriptor
              .<UpdateEnhancedMeasurementSettingsRequest, EnhancedMeasurementSettings>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.analytics.admin.v1alpha.AnalyticsAdminService/UpdateEnhancedMeasurementSettings")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(
                      UpdateEnhancedMeasurementSettingsRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(EnhancedMeasurementSettings.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<CreateFirebaseLinkRequest, FirebaseLink>
      createFirebaseLinkMethodDescriptor =
          MethodDescriptor.<CreateFirebaseLinkRequest, FirebaseLink>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.analytics.admin.v1alpha.AnalyticsAdminService/CreateFirebaseLink")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(CreateFirebaseLinkRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(FirebaseLink.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<UpdateFirebaseLinkRequest, FirebaseLink>
      updateFirebaseLinkMethodDescriptor =
          MethodDescriptor.<UpdateFirebaseLinkRequest, FirebaseLink>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.analytics.admin.v1alpha.AnalyticsAdminService/UpdateFirebaseLink")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(UpdateFirebaseLinkRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(FirebaseLink.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<DeleteFirebaseLinkRequest, Empty>
      deleteFirebaseLinkMethodDescriptor =
          MethodDescriptor.<DeleteFirebaseLinkRequest, Empty>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.analytics.admin.v1alpha.AnalyticsAdminService/DeleteFirebaseLink")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(DeleteFirebaseLinkRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(Empty.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<ListFirebaseLinksRequest, ListFirebaseLinksResponse>
      listFirebaseLinksMethodDescriptor =
          MethodDescriptor.<ListFirebaseLinksRequest, ListFirebaseLinksResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.analytics.admin.v1alpha.AnalyticsAdminService/ListFirebaseLinks")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(ListFirebaseLinksRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(ListFirebaseLinksResponse.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<GetGlobalSiteTagRequest, GlobalSiteTag>
      getGlobalSiteTagMethodDescriptor =
          MethodDescriptor.<GetGlobalSiteTagRequest, GlobalSiteTag>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.analytics.admin.v1alpha.AnalyticsAdminService/GetGlobalSiteTag")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(GetGlobalSiteTagRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(GlobalSiteTag.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<CreateGoogleAdsLinkRequest, GoogleAdsLink>
      createGoogleAdsLinkMethodDescriptor =
          MethodDescriptor.<CreateGoogleAdsLinkRequest, GoogleAdsLink>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.analytics.admin.v1alpha.AnalyticsAdminService/CreateGoogleAdsLink")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(CreateGoogleAdsLinkRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(GoogleAdsLink.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<UpdateGoogleAdsLinkRequest, GoogleAdsLink>
      updateGoogleAdsLinkMethodDescriptor =
          MethodDescriptor.<UpdateGoogleAdsLinkRequest, GoogleAdsLink>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.analytics.admin.v1alpha.AnalyticsAdminService/UpdateGoogleAdsLink")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(UpdateGoogleAdsLinkRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(GoogleAdsLink.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<DeleteGoogleAdsLinkRequest, Empty>
      deleteGoogleAdsLinkMethodDescriptor =
          MethodDescriptor.<DeleteGoogleAdsLinkRequest, Empty>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.analytics.admin.v1alpha.AnalyticsAdminService/DeleteGoogleAdsLink")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(DeleteGoogleAdsLinkRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(Empty.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<ListGoogleAdsLinksRequest, ListGoogleAdsLinksResponse>
      listGoogleAdsLinksMethodDescriptor =
          MethodDescriptor.<ListGoogleAdsLinksRequest, ListGoogleAdsLinksResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.analytics.admin.v1alpha.AnalyticsAdminService/ListGoogleAdsLinks")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(ListGoogleAdsLinksRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(ListGoogleAdsLinksResponse.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<GetDataSharingSettingsRequest, DataSharingSettings>
      getDataSharingSettingsMethodDescriptor =
          MethodDescriptor.<GetDataSharingSettingsRequest, DataSharingSettings>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.analytics.admin.v1alpha.AnalyticsAdminService/GetDataSharingSettings")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(GetDataSharingSettingsRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(DataSharingSettings.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<
          GetMeasurementProtocolSecretRequest, MeasurementProtocolSecret>
      getMeasurementProtocolSecretMethodDescriptor =
          MethodDescriptor
              .<GetMeasurementProtocolSecretRequest, MeasurementProtocolSecret>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.analytics.admin.v1alpha.AnalyticsAdminService/GetMeasurementProtocolSecret")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(GetMeasurementProtocolSecretRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(MeasurementProtocolSecret.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<
          ListMeasurementProtocolSecretsRequest, ListMeasurementProtocolSecretsResponse>
      listMeasurementProtocolSecretsMethodDescriptor =
          MethodDescriptor
              .<ListMeasurementProtocolSecretsRequest, ListMeasurementProtocolSecretsResponse>
                  newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.analytics.admin.v1alpha.AnalyticsAdminService/ListMeasurementProtocolSecrets")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(ListMeasurementProtocolSecretsRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(
                      ListMeasurementProtocolSecretsResponse.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<
          CreateMeasurementProtocolSecretRequest, MeasurementProtocolSecret>
      createMeasurementProtocolSecretMethodDescriptor =
          MethodDescriptor
              .<CreateMeasurementProtocolSecretRequest, MeasurementProtocolSecret>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.analytics.admin.v1alpha.AnalyticsAdminService/CreateMeasurementProtocolSecret")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(
                      CreateMeasurementProtocolSecretRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(MeasurementProtocolSecret.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<DeleteMeasurementProtocolSecretRequest, Empty>
      deleteMeasurementProtocolSecretMethodDescriptor =
          MethodDescriptor.<DeleteMeasurementProtocolSecretRequest, Empty>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.analytics.admin.v1alpha.AnalyticsAdminService/DeleteMeasurementProtocolSecret")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(
                      DeleteMeasurementProtocolSecretRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(Empty.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<
          UpdateMeasurementProtocolSecretRequest, MeasurementProtocolSecret>
      updateMeasurementProtocolSecretMethodDescriptor =
          MethodDescriptor
              .<UpdateMeasurementProtocolSecretRequest, MeasurementProtocolSecret>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.analytics.admin.v1alpha.AnalyticsAdminService/UpdateMeasurementProtocolSecret")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(
                      UpdateMeasurementProtocolSecretRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(MeasurementProtocolSecret.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<
          SearchChangeHistoryEventsRequest, SearchChangeHistoryEventsResponse>
      searchChangeHistoryEventsMethodDescriptor =
          MethodDescriptor
              .<SearchChangeHistoryEventsRequest, SearchChangeHistoryEventsResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.analytics.admin.v1alpha.AnalyticsAdminService/SearchChangeHistoryEvents")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(SearchChangeHistoryEventsRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(SearchChangeHistoryEventsResponse.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<GetGoogleSignalsSettingsRequest, GoogleSignalsSettings>
      getGoogleSignalsSettingsMethodDescriptor =
          MethodDescriptor.<GetGoogleSignalsSettingsRequest, GoogleSignalsSettings>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.analytics.admin.v1alpha.AnalyticsAdminService/GetGoogleSignalsSettings")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(GetGoogleSignalsSettingsRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(GoogleSignalsSettings.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<UpdateGoogleSignalsSettingsRequest, GoogleSignalsSettings>
      updateGoogleSignalsSettingsMethodDescriptor =
          MethodDescriptor.<UpdateGoogleSignalsSettingsRequest, GoogleSignalsSettings>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.analytics.admin.v1alpha.AnalyticsAdminService/UpdateGoogleSignalsSettings")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(UpdateGoogleSignalsSettingsRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(GoogleSignalsSettings.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<CreateConversionEventRequest, ConversionEvent>
      createConversionEventMethodDescriptor =
          MethodDescriptor.<CreateConversionEventRequest, ConversionEvent>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.analytics.admin.v1alpha.AnalyticsAdminService/CreateConversionEvent")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(CreateConversionEventRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(ConversionEvent.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<GetConversionEventRequest, ConversionEvent>
      getConversionEventMethodDescriptor =
          MethodDescriptor.<GetConversionEventRequest, ConversionEvent>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.analytics.admin.v1alpha.AnalyticsAdminService/GetConversionEvent")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(GetConversionEventRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(ConversionEvent.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<DeleteConversionEventRequest, Empty>
      deleteConversionEventMethodDescriptor =
          MethodDescriptor.<DeleteConversionEventRequest, Empty>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.analytics.admin.v1alpha.AnalyticsAdminService/DeleteConversionEvent")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(DeleteConversionEventRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(Empty.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<ListConversionEventsRequest, ListConversionEventsResponse>
      listConversionEventsMethodDescriptor =
          MethodDescriptor.<ListConversionEventsRequest, ListConversionEventsResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.analytics.admin.v1alpha.AnalyticsAdminService/ListConversionEvents")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(ListConversionEventsRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(ListConversionEventsResponse.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<CreateCustomDimensionRequest, CustomDimension>
      createCustomDimensionMethodDescriptor =
          MethodDescriptor.<CreateCustomDimensionRequest, CustomDimension>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.analytics.admin.v1alpha.AnalyticsAdminService/CreateCustomDimension")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(CreateCustomDimensionRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(CustomDimension.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<UpdateCustomDimensionRequest, CustomDimension>
      updateCustomDimensionMethodDescriptor =
          MethodDescriptor.<UpdateCustomDimensionRequest, CustomDimension>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.analytics.admin.v1alpha.AnalyticsAdminService/UpdateCustomDimension")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(UpdateCustomDimensionRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(CustomDimension.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<ListCustomDimensionsRequest, ListCustomDimensionsResponse>
      listCustomDimensionsMethodDescriptor =
          MethodDescriptor.<ListCustomDimensionsRequest, ListCustomDimensionsResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.analytics.admin.v1alpha.AnalyticsAdminService/ListCustomDimensions")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(ListCustomDimensionsRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(ListCustomDimensionsResponse.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<ArchiveCustomDimensionRequest, Empty>
      archiveCustomDimensionMethodDescriptor =
          MethodDescriptor.<ArchiveCustomDimensionRequest, Empty>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.analytics.admin.v1alpha.AnalyticsAdminService/ArchiveCustomDimension")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(ArchiveCustomDimensionRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(Empty.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<GetCustomDimensionRequest, CustomDimension>
      getCustomDimensionMethodDescriptor =
          MethodDescriptor.<GetCustomDimensionRequest, CustomDimension>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.analytics.admin.v1alpha.AnalyticsAdminService/GetCustomDimension")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(GetCustomDimensionRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(CustomDimension.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<CreateCustomMetricRequest, CustomMetric>
      createCustomMetricMethodDescriptor =
          MethodDescriptor.<CreateCustomMetricRequest, CustomMetric>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.analytics.admin.v1alpha.AnalyticsAdminService/CreateCustomMetric")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(CreateCustomMetricRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(CustomMetric.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<UpdateCustomMetricRequest, CustomMetric>
      updateCustomMetricMethodDescriptor =
          MethodDescriptor.<UpdateCustomMetricRequest, CustomMetric>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.analytics.admin.v1alpha.AnalyticsAdminService/UpdateCustomMetric")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(UpdateCustomMetricRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(CustomMetric.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<ListCustomMetricsRequest, ListCustomMetricsResponse>
      listCustomMetricsMethodDescriptor =
          MethodDescriptor.<ListCustomMetricsRequest, ListCustomMetricsResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.analytics.admin.v1alpha.AnalyticsAdminService/ListCustomMetrics")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(ListCustomMetricsRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(ListCustomMetricsResponse.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<ArchiveCustomMetricRequest, Empty>
      archiveCustomMetricMethodDescriptor =
          MethodDescriptor.<ArchiveCustomMetricRequest, Empty>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.analytics.admin.v1alpha.AnalyticsAdminService/ArchiveCustomMetric")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(ArchiveCustomMetricRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(Empty.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<GetCustomMetricRequest, CustomMetric>
      getCustomMetricMethodDescriptor =
          MethodDescriptor.<GetCustomMetricRequest, CustomMetric>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.analytics.admin.v1alpha.AnalyticsAdminService/GetCustomMetric")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(GetCustomMetricRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(CustomMetric.getDefaultInstance()))
              .build();

  private final UnaryCallable<GetAccountRequest, Account> getAccountCallable;
  private final UnaryCallable<ListAccountsRequest, ListAccountsResponse> listAccountsCallable;
  private final UnaryCallable<ListAccountsRequest, ListAccountsPagedResponse>
      listAccountsPagedCallable;
  private final UnaryCallable<DeleteAccountRequest, Empty> deleteAccountCallable;
  private final UnaryCallable<UpdateAccountRequest, Account> updateAccountCallable;
  private final UnaryCallable<ProvisionAccountTicketRequest, ProvisionAccountTicketResponse>
      provisionAccountTicketCallable;
  private final UnaryCallable<ListAccountSummariesRequest, ListAccountSummariesResponse>
      listAccountSummariesCallable;
  private final UnaryCallable<ListAccountSummariesRequest, ListAccountSummariesPagedResponse>
      listAccountSummariesPagedCallable;
  private final UnaryCallable<GetPropertyRequest, Property> getPropertyCallable;
  private final UnaryCallable<ListPropertiesRequest, ListPropertiesResponse> listPropertiesCallable;
  private final UnaryCallable<ListPropertiesRequest, ListPropertiesPagedResponse>
      listPropertiesPagedCallable;
  private final UnaryCallable<CreatePropertyRequest, Property> createPropertyCallable;
  private final UnaryCallable<DeletePropertyRequest, Property> deletePropertyCallable;
  private final UnaryCallable<UpdatePropertyRequest, Property> updatePropertyCallable;
  private final UnaryCallable<GetUserLinkRequest, UserLink> getUserLinkCallable;
  private final UnaryCallable<BatchGetUserLinksRequest, BatchGetUserLinksResponse>
      batchGetUserLinksCallable;
  private final UnaryCallable<ListUserLinksRequest, ListUserLinksResponse> listUserLinksCallable;
  private final UnaryCallable<ListUserLinksRequest, ListUserLinksPagedResponse>
      listUserLinksPagedCallable;
  private final UnaryCallable<AuditUserLinksRequest, AuditUserLinksResponse> auditUserLinksCallable;
  private final UnaryCallable<AuditUserLinksRequest, AuditUserLinksPagedResponse>
      auditUserLinksPagedCallable;
  private final UnaryCallable<CreateUserLinkRequest, UserLink> createUserLinkCallable;
  private final UnaryCallable<BatchCreateUserLinksRequest, BatchCreateUserLinksResponse>
      batchCreateUserLinksCallable;
  private final UnaryCallable<UpdateUserLinkRequest, UserLink> updateUserLinkCallable;
  private final UnaryCallable<BatchUpdateUserLinksRequest, BatchUpdateUserLinksResponse>
      batchUpdateUserLinksCallable;
  private final UnaryCallable<DeleteUserLinkRequest, Empty> deleteUserLinkCallable;
  private final UnaryCallable<BatchDeleteUserLinksRequest, Empty> batchDeleteUserLinksCallable;
  private final UnaryCallable<GetWebDataStreamRequest, WebDataStream> getWebDataStreamCallable;
  private final UnaryCallable<DeleteWebDataStreamRequest, Empty> deleteWebDataStreamCallable;
  private final UnaryCallable<UpdateWebDataStreamRequest, WebDataStream>
      updateWebDataStreamCallable;
  private final UnaryCallable<CreateWebDataStreamRequest, WebDataStream>
      createWebDataStreamCallable;
  private final UnaryCallable<ListWebDataStreamsRequest, ListWebDataStreamsResponse>
      listWebDataStreamsCallable;
  private final UnaryCallable<ListWebDataStreamsRequest, ListWebDataStreamsPagedResponse>
      listWebDataStreamsPagedCallable;
  private final UnaryCallable<GetIosAppDataStreamRequest, IosAppDataStream>
      getIosAppDataStreamCallable;
  private final UnaryCallable<DeleteIosAppDataStreamRequest, Empty> deleteIosAppDataStreamCallable;
  private final UnaryCallable<UpdateIosAppDataStreamRequest, IosAppDataStream>
      updateIosAppDataStreamCallable;
  private final UnaryCallable<ListIosAppDataStreamsRequest, ListIosAppDataStreamsResponse>
      listIosAppDataStreamsCallable;
  private final UnaryCallable<ListIosAppDataStreamsRequest, ListIosAppDataStreamsPagedResponse>
      listIosAppDataStreamsPagedCallable;
  private final UnaryCallable<GetAndroidAppDataStreamRequest, AndroidAppDataStream>
      getAndroidAppDataStreamCallable;
  private final UnaryCallable<DeleteAndroidAppDataStreamRequest, Empty>
      deleteAndroidAppDataStreamCallable;
  private final UnaryCallable<UpdateAndroidAppDataStreamRequest, AndroidAppDataStream>
      updateAndroidAppDataStreamCallable;
  private final UnaryCallable<ListAndroidAppDataStreamsRequest, ListAndroidAppDataStreamsResponse>
      listAndroidAppDataStreamsCallable;
  private final UnaryCallable<
          ListAndroidAppDataStreamsRequest, ListAndroidAppDataStreamsPagedResponse>
      listAndroidAppDataStreamsPagedCallable;
  private final UnaryCallable<GetEnhancedMeasurementSettingsRequest, EnhancedMeasurementSettings>
      getEnhancedMeasurementSettingsCallable;
  private final UnaryCallable<UpdateEnhancedMeasurementSettingsRequest, EnhancedMeasurementSettings>
      updateEnhancedMeasurementSettingsCallable;
  private final UnaryCallable<CreateFirebaseLinkRequest, FirebaseLink> createFirebaseLinkCallable;
  private final UnaryCallable<UpdateFirebaseLinkRequest, FirebaseLink> updateFirebaseLinkCallable;
  private final UnaryCallable<DeleteFirebaseLinkRequest, Empty> deleteFirebaseLinkCallable;
  private final UnaryCallable<ListFirebaseLinksRequest, ListFirebaseLinksResponse>
      listFirebaseLinksCallable;
  private final UnaryCallable<ListFirebaseLinksRequest, ListFirebaseLinksPagedResponse>
      listFirebaseLinksPagedCallable;
  private final UnaryCallable<GetGlobalSiteTagRequest, GlobalSiteTag> getGlobalSiteTagCallable;
  private final UnaryCallable<CreateGoogleAdsLinkRequest, GoogleAdsLink>
      createGoogleAdsLinkCallable;
  private final UnaryCallable<UpdateGoogleAdsLinkRequest, GoogleAdsLink>
      updateGoogleAdsLinkCallable;
  private final UnaryCallable<DeleteGoogleAdsLinkRequest, Empty> deleteGoogleAdsLinkCallable;
  private final UnaryCallable<ListGoogleAdsLinksRequest, ListGoogleAdsLinksResponse>
      listGoogleAdsLinksCallable;
  private final UnaryCallable<ListGoogleAdsLinksRequest, ListGoogleAdsLinksPagedResponse>
      listGoogleAdsLinksPagedCallable;
  private final UnaryCallable<GetDataSharingSettingsRequest, DataSharingSettings>
      getDataSharingSettingsCallable;
  private final UnaryCallable<GetMeasurementProtocolSecretRequest, MeasurementProtocolSecret>
      getMeasurementProtocolSecretCallable;
  private final UnaryCallable<
          ListMeasurementProtocolSecretsRequest, ListMeasurementProtocolSecretsResponse>
      listMeasurementProtocolSecretsCallable;
  private final UnaryCallable<
          ListMeasurementProtocolSecretsRequest, ListMeasurementProtocolSecretsPagedResponse>
      listMeasurementProtocolSecretsPagedCallable;
  private final UnaryCallable<CreateMeasurementProtocolSecretRequest, MeasurementProtocolSecret>
      createMeasurementProtocolSecretCallable;
  private final UnaryCallable<DeleteMeasurementProtocolSecretRequest, Empty>
      deleteMeasurementProtocolSecretCallable;
  private final UnaryCallable<UpdateMeasurementProtocolSecretRequest, MeasurementProtocolSecret>
      updateMeasurementProtocolSecretCallable;
  private final UnaryCallable<SearchChangeHistoryEventsRequest, SearchChangeHistoryEventsResponse>
      searchChangeHistoryEventsCallable;
  private final UnaryCallable<
          SearchChangeHistoryEventsRequest, SearchChangeHistoryEventsPagedResponse>
      searchChangeHistoryEventsPagedCallable;
  private final UnaryCallable<GetGoogleSignalsSettingsRequest, GoogleSignalsSettings>
      getGoogleSignalsSettingsCallable;
  private final UnaryCallable<UpdateGoogleSignalsSettingsRequest, GoogleSignalsSettings>
      updateGoogleSignalsSettingsCallable;
  private final UnaryCallable<CreateConversionEventRequest, ConversionEvent>
      createConversionEventCallable;
  private final UnaryCallable<GetConversionEventRequest, ConversionEvent>
      getConversionEventCallable;
  private final UnaryCallable<DeleteConversionEventRequest, Empty> deleteConversionEventCallable;
  private final UnaryCallable<ListConversionEventsRequest, ListConversionEventsResponse>
      listConversionEventsCallable;
  private final UnaryCallable<ListConversionEventsRequest, ListConversionEventsPagedResponse>
      listConversionEventsPagedCallable;
  private final UnaryCallable<CreateCustomDimensionRequest, CustomDimension>
      createCustomDimensionCallable;
  private final UnaryCallable<UpdateCustomDimensionRequest, CustomDimension>
      updateCustomDimensionCallable;
  private final UnaryCallable<ListCustomDimensionsRequest, ListCustomDimensionsResponse>
      listCustomDimensionsCallable;
  private final UnaryCallable<ListCustomDimensionsRequest, ListCustomDimensionsPagedResponse>
      listCustomDimensionsPagedCallable;
  private final UnaryCallable<ArchiveCustomDimensionRequest, Empty> archiveCustomDimensionCallable;
  private final UnaryCallable<GetCustomDimensionRequest, CustomDimension>
      getCustomDimensionCallable;
  private final UnaryCallable<CreateCustomMetricRequest, CustomMetric> createCustomMetricCallable;
  private final UnaryCallable<UpdateCustomMetricRequest, CustomMetric> updateCustomMetricCallable;
  private final UnaryCallable<ListCustomMetricsRequest, ListCustomMetricsResponse>
      listCustomMetricsCallable;
  private final UnaryCallable<ListCustomMetricsRequest, ListCustomMetricsPagedResponse>
      listCustomMetricsPagedCallable;
  private final UnaryCallable<ArchiveCustomMetricRequest, Empty> archiveCustomMetricCallable;
  private final UnaryCallable<GetCustomMetricRequest, CustomMetric> getCustomMetricCallable;

  private final BackgroundResource backgroundResources;
  private final GrpcOperationsStub operationsStub;
  private final GrpcStubCallableFactory callableFactory;

  public static final GrpcAnalyticsAdminServiceStub create(
      AnalyticsAdminServiceStubSettings settings) throws IOException {
    return new GrpcAnalyticsAdminServiceStub(settings, ClientContext.create(settings));
  }

  public static final GrpcAnalyticsAdminServiceStub create(ClientContext clientContext)
      throws IOException {
    return new GrpcAnalyticsAdminServiceStub(
        AnalyticsAdminServiceStubSettings.newBuilder().build(), clientContext);
  }

  public static final GrpcAnalyticsAdminServiceStub create(
      ClientContext clientContext, GrpcStubCallableFactory callableFactory) throws IOException {
    return new GrpcAnalyticsAdminServiceStub(
        AnalyticsAdminServiceStubSettings.newBuilder().build(), clientContext, callableFactory);
  }

  /**
   * Constructs an instance of GrpcAnalyticsAdminServiceStub, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected GrpcAnalyticsAdminServiceStub(
      AnalyticsAdminServiceStubSettings settings, ClientContext clientContext) throws IOException {
    this(settings, clientContext, new GrpcAnalyticsAdminServiceCallableFactory());
  }

  /**
   * Constructs an instance of GrpcAnalyticsAdminServiceStub, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected GrpcAnalyticsAdminServiceStub(
      AnalyticsAdminServiceStubSettings settings,
      ClientContext clientContext,
      GrpcStubCallableFactory callableFactory)
      throws IOException {
    this.callableFactory = callableFactory;
    this.operationsStub = GrpcOperationsStub.create(clientContext, callableFactory);

    GrpcCallSettings<GetAccountRequest, Account> getAccountTransportSettings =
        GrpcCallSettings.<GetAccountRequest, Account>newBuilder()
            .setMethodDescriptor(getAccountMethodDescriptor)
            .setParamsExtractor(
                request -> {
                  ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                  params.put("name", String.valueOf(request.getName()));
                  return params.build();
                })
            .build();
    GrpcCallSettings<ListAccountsRequest, ListAccountsResponse> listAccountsTransportSettings =
        GrpcCallSettings.<ListAccountsRequest, ListAccountsResponse>newBuilder()
            .setMethodDescriptor(listAccountsMethodDescriptor)
            .build();
    GrpcCallSettings<DeleteAccountRequest, Empty> deleteAccountTransportSettings =
        GrpcCallSettings.<DeleteAccountRequest, Empty>newBuilder()
            .setMethodDescriptor(deleteAccountMethodDescriptor)
            .setParamsExtractor(
                request -> {
                  ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                  params.put("name", String.valueOf(request.getName()));
                  return params.build();
                })
            .build();
    GrpcCallSettings<UpdateAccountRequest, Account> updateAccountTransportSettings =
        GrpcCallSettings.<UpdateAccountRequest, Account>newBuilder()
            .setMethodDescriptor(updateAccountMethodDescriptor)
            .setParamsExtractor(
                request -> {
                  ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                  params.put("account.name", String.valueOf(request.getAccount().getName()));
                  return params.build();
                })
            .build();
    GrpcCallSettings<ProvisionAccountTicketRequest, ProvisionAccountTicketResponse>
        provisionAccountTicketTransportSettings =
            GrpcCallSettings
                .<ProvisionAccountTicketRequest, ProvisionAccountTicketResponse>newBuilder()
                .setMethodDescriptor(provisionAccountTicketMethodDescriptor)
                .build();
    GrpcCallSettings<ListAccountSummariesRequest, ListAccountSummariesResponse>
        listAccountSummariesTransportSettings =
            GrpcCallSettings.<ListAccountSummariesRequest, ListAccountSummariesResponse>newBuilder()
                .setMethodDescriptor(listAccountSummariesMethodDescriptor)
                .build();
    GrpcCallSettings<GetPropertyRequest, Property> getPropertyTransportSettings =
        GrpcCallSettings.<GetPropertyRequest, Property>newBuilder()
            .setMethodDescriptor(getPropertyMethodDescriptor)
            .setParamsExtractor(
                request -> {
                  ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                  params.put("name", String.valueOf(request.getName()));
                  return params.build();
                })
            .build();
    GrpcCallSettings<ListPropertiesRequest, ListPropertiesResponse>
        listPropertiesTransportSettings =
            GrpcCallSettings.<ListPropertiesRequest, ListPropertiesResponse>newBuilder()
                .setMethodDescriptor(listPropertiesMethodDescriptor)
                .build();
    GrpcCallSettings<CreatePropertyRequest, Property> createPropertyTransportSettings =
        GrpcCallSettings.<CreatePropertyRequest, Property>newBuilder()
            .setMethodDescriptor(createPropertyMethodDescriptor)
            .build();
    GrpcCallSettings<DeletePropertyRequest, Property> deletePropertyTransportSettings =
        GrpcCallSettings.<DeletePropertyRequest, Property>newBuilder()
            .setMethodDescriptor(deletePropertyMethodDescriptor)
            .setParamsExtractor(
                request -> {
                  ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                  params.put("name", String.valueOf(request.getName()));
                  return params.build();
                })
            .build();
    GrpcCallSettings<UpdatePropertyRequest, Property> updatePropertyTransportSettings =
        GrpcCallSettings.<UpdatePropertyRequest, Property>newBuilder()
            .setMethodDescriptor(updatePropertyMethodDescriptor)
            .setParamsExtractor(
                request -> {
                  ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                  params.put("property.name", String.valueOf(request.getProperty().getName()));
                  return params.build();
                })
            .build();
    GrpcCallSettings<GetUserLinkRequest, UserLink> getUserLinkTransportSettings =
        GrpcCallSettings.<GetUserLinkRequest, UserLink>newBuilder()
            .setMethodDescriptor(getUserLinkMethodDescriptor)
            .setParamsExtractor(
                request -> {
                  ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                  params.put("name", String.valueOf(request.getName()));
                  return params.build();
                })
            .build();
    GrpcCallSettings<BatchGetUserLinksRequest, BatchGetUserLinksResponse>
        batchGetUserLinksTransportSettings =
            GrpcCallSettings.<BatchGetUserLinksRequest, BatchGetUserLinksResponse>newBuilder()
                .setMethodDescriptor(batchGetUserLinksMethodDescriptor)
                .setParamsExtractor(
                    request -> {
                      ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                      params.put("parent", String.valueOf(request.getParent()));
                      return params.build();
                    })
                .build();
    GrpcCallSettings<ListUserLinksRequest, ListUserLinksResponse> listUserLinksTransportSettings =
        GrpcCallSettings.<ListUserLinksRequest, ListUserLinksResponse>newBuilder()
            .setMethodDescriptor(listUserLinksMethodDescriptor)
            .setParamsExtractor(
                request -> {
                  ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                  params.put("parent", String.valueOf(request.getParent()));
                  return params.build();
                })
            .build();
    GrpcCallSettings<AuditUserLinksRequest, AuditUserLinksResponse>
        auditUserLinksTransportSettings =
            GrpcCallSettings.<AuditUserLinksRequest, AuditUserLinksResponse>newBuilder()
                .setMethodDescriptor(auditUserLinksMethodDescriptor)
                .setParamsExtractor(
                    request -> {
                      ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                      params.put("parent", String.valueOf(request.getParent()));
                      return params.build();
                    })
                .build();
    GrpcCallSettings<CreateUserLinkRequest, UserLink> createUserLinkTransportSettings =
        GrpcCallSettings.<CreateUserLinkRequest, UserLink>newBuilder()
            .setMethodDescriptor(createUserLinkMethodDescriptor)
            .setParamsExtractor(
                request -> {
                  ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                  params.put("parent", String.valueOf(request.getParent()));
                  return params.build();
                })
            .build();
    GrpcCallSettings<BatchCreateUserLinksRequest, BatchCreateUserLinksResponse>
        batchCreateUserLinksTransportSettings =
            GrpcCallSettings.<BatchCreateUserLinksRequest, BatchCreateUserLinksResponse>newBuilder()
                .setMethodDescriptor(batchCreateUserLinksMethodDescriptor)
                .setParamsExtractor(
                    request -> {
                      ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                      params.put("parent", String.valueOf(request.getParent()));
                      return params.build();
                    })
                .build();
    GrpcCallSettings<UpdateUserLinkRequest, UserLink> updateUserLinkTransportSettings =
        GrpcCallSettings.<UpdateUserLinkRequest, UserLink>newBuilder()
            .setMethodDescriptor(updateUserLinkMethodDescriptor)
            .setParamsExtractor(
                request -> {
                  ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                  params.put("user_link.name", String.valueOf(request.getUserLink().getName()));
                  return params.build();
                })
            .build();
    GrpcCallSettings<BatchUpdateUserLinksRequest, BatchUpdateUserLinksResponse>
        batchUpdateUserLinksTransportSettings =
            GrpcCallSettings.<BatchUpdateUserLinksRequest, BatchUpdateUserLinksResponse>newBuilder()
                .setMethodDescriptor(batchUpdateUserLinksMethodDescriptor)
                .setParamsExtractor(
                    request -> {
                      ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                      params.put("parent", String.valueOf(request.getParent()));
                      return params.build();
                    })
                .build();
    GrpcCallSettings<DeleteUserLinkRequest, Empty> deleteUserLinkTransportSettings =
        GrpcCallSettings.<DeleteUserLinkRequest, Empty>newBuilder()
            .setMethodDescriptor(deleteUserLinkMethodDescriptor)
            .setParamsExtractor(
                request -> {
                  ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                  params.put("name", String.valueOf(request.getName()));
                  return params.build();
                })
            .build();
    GrpcCallSettings<BatchDeleteUserLinksRequest, Empty> batchDeleteUserLinksTransportSettings =
        GrpcCallSettings.<BatchDeleteUserLinksRequest, Empty>newBuilder()
            .setMethodDescriptor(batchDeleteUserLinksMethodDescriptor)
            .setParamsExtractor(
                request -> {
                  ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                  params.put("parent", String.valueOf(request.getParent()));
                  return params.build();
                })
            .build();
    GrpcCallSettings<GetWebDataStreamRequest, WebDataStream> getWebDataStreamTransportSettings =
        GrpcCallSettings.<GetWebDataStreamRequest, WebDataStream>newBuilder()
            .setMethodDescriptor(getWebDataStreamMethodDescriptor)
            .setParamsExtractor(
                request -> {
                  ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                  params.put("name", String.valueOf(request.getName()));
                  return params.build();
                })
            .build();
    GrpcCallSettings<DeleteWebDataStreamRequest, Empty> deleteWebDataStreamTransportSettings =
        GrpcCallSettings.<DeleteWebDataStreamRequest, Empty>newBuilder()
            .setMethodDescriptor(deleteWebDataStreamMethodDescriptor)
            .setParamsExtractor(
                request -> {
                  ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                  params.put("name", String.valueOf(request.getName()));
                  return params.build();
                })
            .build();
    GrpcCallSettings<UpdateWebDataStreamRequest, WebDataStream>
        updateWebDataStreamTransportSettings =
            GrpcCallSettings.<UpdateWebDataStreamRequest, WebDataStream>newBuilder()
                .setMethodDescriptor(updateWebDataStreamMethodDescriptor)
                .setParamsExtractor(
                    request -> {
                      ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                      params.put(
                          "web_data_stream.name",
                          String.valueOf(request.getWebDataStream().getName()));
                      return params.build();
                    })
                .build();
    GrpcCallSettings<CreateWebDataStreamRequest, WebDataStream>
        createWebDataStreamTransportSettings =
            GrpcCallSettings.<CreateWebDataStreamRequest, WebDataStream>newBuilder()
                .setMethodDescriptor(createWebDataStreamMethodDescriptor)
                .setParamsExtractor(
                    request -> {
                      ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                      params.put("parent", String.valueOf(request.getParent()));
                      return params.build();
                    })
                .build();
    GrpcCallSettings<ListWebDataStreamsRequest, ListWebDataStreamsResponse>
        listWebDataStreamsTransportSettings =
            GrpcCallSettings.<ListWebDataStreamsRequest, ListWebDataStreamsResponse>newBuilder()
                .setMethodDescriptor(listWebDataStreamsMethodDescriptor)
                .setParamsExtractor(
                    request -> {
                      ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                      params.put("parent", String.valueOf(request.getParent()));
                      return params.build();
                    })
                .build();
    GrpcCallSettings<GetIosAppDataStreamRequest, IosAppDataStream>
        getIosAppDataStreamTransportSettings =
            GrpcCallSettings.<GetIosAppDataStreamRequest, IosAppDataStream>newBuilder()
                .setMethodDescriptor(getIosAppDataStreamMethodDescriptor)
                .setParamsExtractor(
                    request -> {
                      ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                      params.put("name", String.valueOf(request.getName()));
                      return params.build();
                    })
                .build();
    GrpcCallSettings<DeleteIosAppDataStreamRequest, Empty> deleteIosAppDataStreamTransportSettings =
        GrpcCallSettings.<DeleteIosAppDataStreamRequest, Empty>newBuilder()
            .setMethodDescriptor(deleteIosAppDataStreamMethodDescriptor)
            .setParamsExtractor(
                request -> {
                  ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                  params.put("name", String.valueOf(request.getName()));
                  return params.build();
                })
            .build();
    GrpcCallSettings<UpdateIosAppDataStreamRequest, IosAppDataStream>
        updateIosAppDataStreamTransportSettings =
            GrpcCallSettings.<UpdateIosAppDataStreamRequest, IosAppDataStream>newBuilder()
                .setMethodDescriptor(updateIosAppDataStreamMethodDescriptor)
                .setParamsExtractor(
                    request -> {
                      ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                      params.put(
                          "ios_app_data_stream.name",
                          String.valueOf(request.getIosAppDataStream().getName()));
                      return params.build();
                    })
                .build();
    GrpcCallSettings<ListIosAppDataStreamsRequest, ListIosAppDataStreamsResponse>
        listIosAppDataStreamsTransportSettings =
            GrpcCallSettings
                .<ListIosAppDataStreamsRequest, ListIosAppDataStreamsResponse>newBuilder()
                .setMethodDescriptor(listIosAppDataStreamsMethodDescriptor)
                .setParamsExtractor(
                    request -> {
                      ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                      params.put("parent", String.valueOf(request.getParent()));
                      return params.build();
                    })
                .build();
    GrpcCallSettings<GetAndroidAppDataStreamRequest, AndroidAppDataStream>
        getAndroidAppDataStreamTransportSettings =
            GrpcCallSettings.<GetAndroidAppDataStreamRequest, AndroidAppDataStream>newBuilder()
                .setMethodDescriptor(getAndroidAppDataStreamMethodDescriptor)
                .setParamsExtractor(
                    request -> {
                      ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                      params.put("name", String.valueOf(request.getName()));
                      return params.build();
                    })
                .build();
    GrpcCallSettings<DeleteAndroidAppDataStreamRequest, Empty>
        deleteAndroidAppDataStreamTransportSettings =
            GrpcCallSettings.<DeleteAndroidAppDataStreamRequest, Empty>newBuilder()
                .setMethodDescriptor(deleteAndroidAppDataStreamMethodDescriptor)
                .setParamsExtractor(
                    request -> {
                      ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                      params.put("name", String.valueOf(request.getName()));
                      return params.build();
                    })
                .build();
    GrpcCallSettings<UpdateAndroidAppDataStreamRequest, AndroidAppDataStream>
        updateAndroidAppDataStreamTransportSettings =
            GrpcCallSettings.<UpdateAndroidAppDataStreamRequest, AndroidAppDataStream>newBuilder()
                .setMethodDescriptor(updateAndroidAppDataStreamMethodDescriptor)
                .setParamsExtractor(
                    request -> {
                      ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                      params.put(
                          "android_app_data_stream.name",
                          String.valueOf(request.getAndroidAppDataStream().getName()));
                      return params.build();
                    })
                .build();
    GrpcCallSettings<ListAndroidAppDataStreamsRequest, ListAndroidAppDataStreamsResponse>
        listAndroidAppDataStreamsTransportSettings =
            GrpcCallSettings
                .<ListAndroidAppDataStreamsRequest, ListAndroidAppDataStreamsResponse>newBuilder()
                .setMethodDescriptor(listAndroidAppDataStreamsMethodDescriptor)
                .setParamsExtractor(
                    request -> {
                      ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                      params.put("parent", String.valueOf(request.getParent()));
                      return params.build();
                    })
                .build();
    GrpcCallSettings<GetEnhancedMeasurementSettingsRequest, EnhancedMeasurementSettings>
        getEnhancedMeasurementSettingsTransportSettings =
            GrpcCallSettings
                .<GetEnhancedMeasurementSettingsRequest, EnhancedMeasurementSettings>newBuilder()
                .setMethodDescriptor(getEnhancedMeasurementSettingsMethodDescriptor)
                .setParamsExtractor(
                    request -> {
                      ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                      params.put("name", String.valueOf(request.getName()));
                      return params.build();
                    })
                .build();
    GrpcCallSettings<UpdateEnhancedMeasurementSettingsRequest, EnhancedMeasurementSettings>
        updateEnhancedMeasurementSettingsTransportSettings =
            GrpcCallSettings
                .<UpdateEnhancedMeasurementSettingsRequest, EnhancedMeasurementSettings>newBuilder()
                .setMethodDescriptor(updateEnhancedMeasurementSettingsMethodDescriptor)
                .setParamsExtractor(
                    request -> {
                      ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                      params.put(
                          "enhanced_measurement_settings.name",
                          String.valueOf(request.getEnhancedMeasurementSettings().getName()));
                      return params.build();
                    })
                .build();
    GrpcCallSettings<CreateFirebaseLinkRequest, FirebaseLink> createFirebaseLinkTransportSettings =
        GrpcCallSettings.<CreateFirebaseLinkRequest, FirebaseLink>newBuilder()
            .setMethodDescriptor(createFirebaseLinkMethodDescriptor)
            .setParamsExtractor(
                request -> {
                  ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                  params.put("parent", String.valueOf(request.getParent()));
                  return params.build();
                })
            .build();
    GrpcCallSettings<UpdateFirebaseLinkRequest, FirebaseLink> updateFirebaseLinkTransportSettings =
        GrpcCallSettings.<UpdateFirebaseLinkRequest, FirebaseLink>newBuilder()
            .setMethodDescriptor(updateFirebaseLinkMethodDescriptor)
            .setParamsExtractor(
                request -> {
                  ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                  params.put(
                      "firebase_link.name", String.valueOf(request.getFirebaseLink().getName()));
                  return params.build();
                })
            .build();
    GrpcCallSettings<DeleteFirebaseLinkRequest, Empty> deleteFirebaseLinkTransportSettings =
        GrpcCallSettings.<DeleteFirebaseLinkRequest, Empty>newBuilder()
            .setMethodDescriptor(deleteFirebaseLinkMethodDescriptor)
            .setParamsExtractor(
                request -> {
                  ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                  params.put("name", String.valueOf(request.getName()));
                  return params.build();
                })
            .build();
    GrpcCallSettings<ListFirebaseLinksRequest, ListFirebaseLinksResponse>
        listFirebaseLinksTransportSettings =
            GrpcCallSettings.<ListFirebaseLinksRequest, ListFirebaseLinksResponse>newBuilder()
                .setMethodDescriptor(listFirebaseLinksMethodDescriptor)
                .setParamsExtractor(
                    request -> {
                      ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                      params.put("parent", String.valueOf(request.getParent()));
                      return params.build();
                    })
                .build();
    GrpcCallSettings<GetGlobalSiteTagRequest, GlobalSiteTag> getGlobalSiteTagTransportSettings =
        GrpcCallSettings.<GetGlobalSiteTagRequest, GlobalSiteTag>newBuilder()
            .setMethodDescriptor(getGlobalSiteTagMethodDescriptor)
            .setParamsExtractor(
                request -> {
                  ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                  params.put("name", String.valueOf(request.getName()));
                  return params.build();
                })
            .build();
    GrpcCallSettings<CreateGoogleAdsLinkRequest, GoogleAdsLink>
        createGoogleAdsLinkTransportSettings =
            GrpcCallSettings.<CreateGoogleAdsLinkRequest, GoogleAdsLink>newBuilder()
                .setMethodDescriptor(createGoogleAdsLinkMethodDescriptor)
                .setParamsExtractor(
                    request -> {
                      ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                      params.put("parent", String.valueOf(request.getParent()));
                      return params.build();
                    })
                .build();
    GrpcCallSettings<UpdateGoogleAdsLinkRequest, GoogleAdsLink>
        updateGoogleAdsLinkTransportSettings =
            GrpcCallSettings.<UpdateGoogleAdsLinkRequest, GoogleAdsLink>newBuilder()
                .setMethodDescriptor(updateGoogleAdsLinkMethodDescriptor)
                .setParamsExtractor(
                    request -> {
                      ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                      params.put(
                          "google_ads_link.name",
                          String.valueOf(request.getGoogleAdsLink().getName()));
                      return params.build();
                    })
                .build();
    GrpcCallSettings<DeleteGoogleAdsLinkRequest, Empty> deleteGoogleAdsLinkTransportSettings =
        GrpcCallSettings.<DeleteGoogleAdsLinkRequest, Empty>newBuilder()
            .setMethodDescriptor(deleteGoogleAdsLinkMethodDescriptor)
            .setParamsExtractor(
                request -> {
                  ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                  params.put("name", String.valueOf(request.getName()));
                  return params.build();
                })
            .build();
    GrpcCallSettings<ListGoogleAdsLinksRequest, ListGoogleAdsLinksResponse>
        listGoogleAdsLinksTransportSettings =
            GrpcCallSettings.<ListGoogleAdsLinksRequest, ListGoogleAdsLinksResponse>newBuilder()
                .setMethodDescriptor(listGoogleAdsLinksMethodDescriptor)
                .setParamsExtractor(
                    request -> {
                      ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                      params.put("parent", String.valueOf(request.getParent()));
                      return params.build();
                    })
                .build();
    GrpcCallSettings<GetDataSharingSettingsRequest, DataSharingSettings>
        getDataSharingSettingsTransportSettings =
            GrpcCallSettings.<GetDataSharingSettingsRequest, DataSharingSettings>newBuilder()
                .setMethodDescriptor(getDataSharingSettingsMethodDescriptor)
                .setParamsExtractor(
                    request -> {
                      ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                      params.put("name", String.valueOf(request.getName()));
                      return params.build();
                    })
                .build();
    GrpcCallSettings<GetMeasurementProtocolSecretRequest, MeasurementProtocolSecret>
        getMeasurementProtocolSecretTransportSettings =
            GrpcCallSettings
                .<GetMeasurementProtocolSecretRequest, MeasurementProtocolSecret>newBuilder()
                .setMethodDescriptor(getMeasurementProtocolSecretMethodDescriptor)
                .setParamsExtractor(
                    request -> {
                      ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                      params.put("name", String.valueOf(request.getName()));
                      return params.build();
                    })
                .build();
    GrpcCallSettings<ListMeasurementProtocolSecretsRequest, ListMeasurementProtocolSecretsResponse>
        listMeasurementProtocolSecretsTransportSettings =
            GrpcCallSettings
                .<ListMeasurementProtocolSecretsRequest, ListMeasurementProtocolSecretsResponse>
                    newBuilder()
                .setMethodDescriptor(listMeasurementProtocolSecretsMethodDescriptor)
                .setParamsExtractor(
                    request -> {
                      ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                      params.put("parent", String.valueOf(request.getParent()));
                      return params.build();
                    })
                .build();
    GrpcCallSettings<CreateMeasurementProtocolSecretRequest, MeasurementProtocolSecret>
        createMeasurementProtocolSecretTransportSettings =
            GrpcCallSettings
                .<CreateMeasurementProtocolSecretRequest, MeasurementProtocolSecret>newBuilder()
                .setMethodDescriptor(createMeasurementProtocolSecretMethodDescriptor)
                .setParamsExtractor(
                    request -> {
                      ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                      params.put("parent", String.valueOf(request.getParent()));
                      return params.build();
                    })
                .build();
    GrpcCallSettings<DeleteMeasurementProtocolSecretRequest, Empty>
        deleteMeasurementProtocolSecretTransportSettings =
            GrpcCallSettings.<DeleteMeasurementProtocolSecretRequest, Empty>newBuilder()
                .setMethodDescriptor(deleteMeasurementProtocolSecretMethodDescriptor)
                .setParamsExtractor(
                    request -> {
                      ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                      params.put("name", String.valueOf(request.getName()));
                      return params.build();
                    })
                .build();
    GrpcCallSettings<UpdateMeasurementProtocolSecretRequest, MeasurementProtocolSecret>
        updateMeasurementProtocolSecretTransportSettings =
            GrpcCallSettings
                .<UpdateMeasurementProtocolSecretRequest, MeasurementProtocolSecret>newBuilder()
                .setMethodDescriptor(updateMeasurementProtocolSecretMethodDescriptor)
                .setParamsExtractor(
                    request -> {
                      ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                      params.put(
                          "measurement_protocol_secret.name",
                          String.valueOf(request.getMeasurementProtocolSecret().getName()));
                      return params.build();
                    })
                .build();
    GrpcCallSettings<SearchChangeHistoryEventsRequest, SearchChangeHistoryEventsResponse>
        searchChangeHistoryEventsTransportSettings =
            GrpcCallSettings
                .<SearchChangeHistoryEventsRequest, SearchChangeHistoryEventsResponse>newBuilder()
                .setMethodDescriptor(searchChangeHistoryEventsMethodDescriptor)
                .setParamsExtractor(
                    request -> {
                      ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                      params.put("account", String.valueOf(request.getAccount()));
                      return params.build();
                    })
                .build();
    GrpcCallSettings<GetGoogleSignalsSettingsRequest, GoogleSignalsSettings>
        getGoogleSignalsSettingsTransportSettings =
            GrpcCallSettings.<GetGoogleSignalsSettingsRequest, GoogleSignalsSettings>newBuilder()
                .setMethodDescriptor(getGoogleSignalsSettingsMethodDescriptor)
                .setParamsExtractor(
                    request -> {
                      ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                      params.put("name", String.valueOf(request.getName()));
                      return params.build();
                    })
                .build();
    GrpcCallSettings<UpdateGoogleSignalsSettingsRequest, GoogleSignalsSettings>
        updateGoogleSignalsSettingsTransportSettings =
            GrpcCallSettings.<UpdateGoogleSignalsSettingsRequest, GoogleSignalsSettings>newBuilder()
                .setMethodDescriptor(updateGoogleSignalsSettingsMethodDescriptor)
                .setParamsExtractor(
                    request -> {
                      ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                      params.put(
                          "google_signals_settings.name",
                          String.valueOf(request.getGoogleSignalsSettings().getName()));
                      return params.build();
                    })
                .build();
    GrpcCallSettings<CreateConversionEventRequest, ConversionEvent>
        createConversionEventTransportSettings =
            GrpcCallSettings.<CreateConversionEventRequest, ConversionEvent>newBuilder()
                .setMethodDescriptor(createConversionEventMethodDescriptor)
                .setParamsExtractor(
                    request -> {
                      ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                      params.put("parent", String.valueOf(request.getParent()));
                      return params.build();
                    })
                .build();
    GrpcCallSettings<GetConversionEventRequest, ConversionEvent>
        getConversionEventTransportSettings =
            GrpcCallSettings.<GetConversionEventRequest, ConversionEvent>newBuilder()
                .setMethodDescriptor(getConversionEventMethodDescriptor)
                .setParamsExtractor(
                    request -> {
                      ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                      params.put("name", String.valueOf(request.getName()));
                      return params.build();
                    })
                .build();
    GrpcCallSettings<DeleteConversionEventRequest, Empty> deleteConversionEventTransportSettings =
        GrpcCallSettings.<DeleteConversionEventRequest, Empty>newBuilder()
            .setMethodDescriptor(deleteConversionEventMethodDescriptor)
            .setParamsExtractor(
                request -> {
                  ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                  params.put("name", String.valueOf(request.getName()));
                  return params.build();
                })
            .build();
    GrpcCallSettings<ListConversionEventsRequest, ListConversionEventsResponse>
        listConversionEventsTransportSettings =
            GrpcCallSettings.<ListConversionEventsRequest, ListConversionEventsResponse>newBuilder()
                .setMethodDescriptor(listConversionEventsMethodDescriptor)
                .setParamsExtractor(
                    request -> {
                      ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                      params.put("parent", String.valueOf(request.getParent()));
                      return params.build();
                    })
                .build();
    GrpcCallSettings<CreateCustomDimensionRequest, CustomDimension>
        createCustomDimensionTransportSettings =
            GrpcCallSettings.<CreateCustomDimensionRequest, CustomDimension>newBuilder()
                .setMethodDescriptor(createCustomDimensionMethodDescriptor)
                .setParamsExtractor(
                    request -> {
                      ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                      params.put("parent", String.valueOf(request.getParent()));
                      return params.build();
                    })
                .build();
    GrpcCallSettings<UpdateCustomDimensionRequest, CustomDimension>
        updateCustomDimensionTransportSettings =
            GrpcCallSettings.<UpdateCustomDimensionRequest, CustomDimension>newBuilder()
                .setMethodDescriptor(updateCustomDimensionMethodDescriptor)
                .setParamsExtractor(
                    request -> {
                      ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                      params.put(
                          "custom_dimension.name",
                          String.valueOf(request.getCustomDimension().getName()));
                      return params.build();
                    })
                .build();
    GrpcCallSettings<ListCustomDimensionsRequest, ListCustomDimensionsResponse>
        listCustomDimensionsTransportSettings =
            GrpcCallSettings.<ListCustomDimensionsRequest, ListCustomDimensionsResponse>newBuilder()
                .setMethodDescriptor(listCustomDimensionsMethodDescriptor)
                .setParamsExtractor(
                    request -> {
                      ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                      params.put("parent", String.valueOf(request.getParent()));
                      return params.build();
                    })
                .build();
    GrpcCallSettings<ArchiveCustomDimensionRequest, Empty> archiveCustomDimensionTransportSettings =
        GrpcCallSettings.<ArchiveCustomDimensionRequest, Empty>newBuilder()
            .setMethodDescriptor(archiveCustomDimensionMethodDescriptor)
            .setParamsExtractor(
                request -> {
                  ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                  params.put("name", String.valueOf(request.getName()));
                  return params.build();
                })
            .build();
    GrpcCallSettings<GetCustomDimensionRequest, CustomDimension>
        getCustomDimensionTransportSettings =
            GrpcCallSettings.<GetCustomDimensionRequest, CustomDimension>newBuilder()
                .setMethodDescriptor(getCustomDimensionMethodDescriptor)
                .setParamsExtractor(
                    request -> {
                      ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                      params.put("name", String.valueOf(request.getName()));
                      return params.build();
                    })
                .build();
    GrpcCallSettings<CreateCustomMetricRequest, CustomMetric> createCustomMetricTransportSettings =
        GrpcCallSettings.<CreateCustomMetricRequest, CustomMetric>newBuilder()
            .setMethodDescriptor(createCustomMetricMethodDescriptor)
            .setParamsExtractor(
                request -> {
                  ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                  params.put("parent", String.valueOf(request.getParent()));
                  return params.build();
                })
            .build();
    GrpcCallSettings<UpdateCustomMetricRequest, CustomMetric> updateCustomMetricTransportSettings =
        GrpcCallSettings.<UpdateCustomMetricRequest, CustomMetric>newBuilder()
            .setMethodDescriptor(updateCustomMetricMethodDescriptor)
            .setParamsExtractor(
                request -> {
                  ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                  params.put(
                      "custom_metric.name", String.valueOf(request.getCustomMetric().getName()));
                  return params.build();
                })
            .build();
    GrpcCallSettings<ListCustomMetricsRequest, ListCustomMetricsResponse>
        listCustomMetricsTransportSettings =
            GrpcCallSettings.<ListCustomMetricsRequest, ListCustomMetricsResponse>newBuilder()
                .setMethodDescriptor(listCustomMetricsMethodDescriptor)
                .setParamsExtractor(
                    request -> {
                      ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                      params.put("parent", String.valueOf(request.getParent()));
                      return params.build();
                    })
                .build();
    GrpcCallSettings<ArchiveCustomMetricRequest, Empty> archiveCustomMetricTransportSettings =
        GrpcCallSettings.<ArchiveCustomMetricRequest, Empty>newBuilder()
            .setMethodDescriptor(archiveCustomMetricMethodDescriptor)
            .setParamsExtractor(
                request -> {
                  ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                  params.put("name", String.valueOf(request.getName()));
                  return params.build();
                })
            .build();
    GrpcCallSettings<GetCustomMetricRequest, CustomMetric> getCustomMetricTransportSettings =
        GrpcCallSettings.<GetCustomMetricRequest, CustomMetric>newBuilder()
            .setMethodDescriptor(getCustomMetricMethodDescriptor)
            .setParamsExtractor(
                request -> {
                  ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                  params.put("name", String.valueOf(request.getName()));
                  return params.build();
                })
            .build();

    this.getAccountCallable =
        callableFactory.createUnaryCallable(
            getAccountTransportSettings, settings.getAccountSettings(), clientContext);
    this.listAccountsCallable =
        callableFactory.createUnaryCallable(
            listAccountsTransportSettings, settings.listAccountsSettings(), clientContext);
    this.listAccountsPagedCallable =
        callableFactory.createPagedCallable(
            listAccountsTransportSettings, settings.listAccountsSettings(), clientContext);
    this.deleteAccountCallable =
        callableFactory.createUnaryCallable(
            deleteAccountTransportSettings, settings.deleteAccountSettings(), clientContext);
    this.updateAccountCallable =
        callableFactory.createUnaryCallable(
            updateAccountTransportSettings, settings.updateAccountSettings(), clientContext);
    this.provisionAccountTicketCallable =
        callableFactory.createUnaryCallable(
            provisionAccountTicketTransportSettings,
            settings.provisionAccountTicketSettings(),
            clientContext);
    this.listAccountSummariesCallable =
        callableFactory.createUnaryCallable(
            listAccountSummariesTransportSettings,
            settings.listAccountSummariesSettings(),
            clientContext);
    this.listAccountSummariesPagedCallable =
        callableFactory.createPagedCallable(
            listAccountSummariesTransportSettings,
            settings.listAccountSummariesSettings(),
            clientContext);
    this.getPropertyCallable =
        callableFactory.createUnaryCallable(
            getPropertyTransportSettings, settings.getPropertySettings(), clientContext);
    this.listPropertiesCallable =
        callableFactory.createUnaryCallable(
            listPropertiesTransportSettings, settings.listPropertiesSettings(), clientContext);
    this.listPropertiesPagedCallable =
        callableFactory.createPagedCallable(
            listPropertiesTransportSettings, settings.listPropertiesSettings(), clientContext);
    this.createPropertyCallable =
        callableFactory.createUnaryCallable(
            createPropertyTransportSettings, settings.createPropertySettings(), clientContext);
    this.deletePropertyCallable =
        callableFactory.createUnaryCallable(
            deletePropertyTransportSettings, settings.deletePropertySettings(), clientContext);
    this.updatePropertyCallable =
        callableFactory.createUnaryCallable(
            updatePropertyTransportSettings, settings.updatePropertySettings(), clientContext);
    this.getUserLinkCallable =
        callableFactory.createUnaryCallable(
            getUserLinkTransportSettings, settings.getUserLinkSettings(), clientContext);
    this.batchGetUserLinksCallable =
        callableFactory.createUnaryCallable(
            batchGetUserLinksTransportSettings,
            settings.batchGetUserLinksSettings(),
            clientContext);
    this.listUserLinksCallable =
        callableFactory.createUnaryCallable(
            listUserLinksTransportSettings, settings.listUserLinksSettings(), clientContext);
    this.listUserLinksPagedCallable =
        callableFactory.createPagedCallable(
            listUserLinksTransportSettings, settings.listUserLinksSettings(), clientContext);
    this.auditUserLinksCallable =
        callableFactory.createUnaryCallable(
            auditUserLinksTransportSettings, settings.auditUserLinksSettings(), clientContext);
    this.auditUserLinksPagedCallable =
        callableFactory.createPagedCallable(
            auditUserLinksTransportSettings, settings.auditUserLinksSettings(), clientContext);
    this.createUserLinkCallable =
        callableFactory.createUnaryCallable(
            createUserLinkTransportSettings, settings.createUserLinkSettings(), clientContext);
    this.batchCreateUserLinksCallable =
        callableFactory.createUnaryCallable(
            batchCreateUserLinksTransportSettings,
            settings.batchCreateUserLinksSettings(),
            clientContext);
    this.updateUserLinkCallable =
        callableFactory.createUnaryCallable(
            updateUserLinkTransportSettings, settings.updateUserLinkSettings(), clientContext);
    this.batchUpdateUserLinksCallable =
        callableFactory.createUnaryCallable(
            batchUpdateUserLinksTransportSettings,
            settings.batchUpdateUserLinksSettings(),
            clientContext);
    this.deleteUserLinkCallable =
        callableFactory.createUnaryCallable(
            deleteUserLinkTransportSettings, settings.deleteUserLinkSettings(), clientContext);
    this.batchDeleteUserLinksCallable =
        callableFactory.createUnaryCallable(
            batchDeleteUserLinksTransportSettings,
            settings.batchDeleteUserLinksSettings(),
            clientContext);
    this.getWebDataStreamCallable =
        callableFactory.createUnaryCallable(
            getWebDataStreamTransportSettings, settings.getWebDataStreamSettings(), clientContext);
    this.deleteWebDataStreamCallable =
        callableFactory.createUnaryCallable(
            deleteWebDataStreamTransportSettings,
            settings.deleteWebDataStreamSettings(),
            clientContext);
    this.updateWebDataStreamCallable =
        callableFactory.createUnaryCallable(
            updateWebDataStreamTransportSettings,
            settings.updateWebDataStreamSettings(),
            clientContext);
    this.createWebDataStreamCallable =
        callableFactory.createUnaryCallable(
            createWebDataStreamTransportSettings,
            settings.createWebDataStreamSettings(),
            clientContext);
    this.listWebDataStreamsCallable =
        callableFactory.createUnaryCallable(
            listWebDataStreamsTransportSettings,
            settings.listWebDataStreamsSettings(),
            clientContext);
    this.listWebDataStreamsPagedCallable =
        callableFactory.createPagedCallable(
            listWebDataStreamsTransportSettings,
            settings.listWebDataStreamsSettings(),
            clientContext);
    this.getIosAppDataStreamCallable =
        callableFactory.createUnaryCallable(
            getIosAppDataStreamTransportSettings,
            settings.getIosAppDataStreamSettings(),
            clientContext);
    this.deleteIosAppDataStreamCallable =
        callableFactory.createUnaryCallable(
            deleteIosAppDataStreamTransportSettings,
            settings.deleteIosAppDataStreamSettings(),
            clientContext);
    this.updateIosAppDataStreamCallable =
        callableFactory.createUnaryCallable(
            updateIosAppDataStreamTransportSettings,
            settings.updateIosAppDataStreamSettings(),
            clientContext);
    this.listIosAppDataStreamsCallable =
        callableFactory.createUnaryCallable(
            listIosAppDataStreamsTransportSettings,
            settings.listIosAppDataStreamsSettings(),
            clientContext);
    this.listIosAppDataStreamsPagedCallable =
        callableFactory.createPagedCallable(
            listIosAppDataStreamsTransportSettings,
            settings.listIosAppDataStreamsSettings(),
            clientContext);
    this.getAndroidAppDataStreamCallable =
        callableFactory.createUnaryCallable(
            getAndroidAppDataStreamTransportSettings,
            settings.getAndroidAppDataStreamSettings(),
            clientContext);
    this.deleteAndroidAppDataStreamCallable =
        callableFactory.createUnaryCallable(
            deleteAndroidAppDataStreamTransportSettings,
            settings.deleteAndroidAppDataStreamSettings(),
            clientContext);
    this.updateAndroidAppDataStreamCallable =
        callableFactory.createUnaryCallable(
            updateAndroidAppDataStreamTransportSettings,
            settings.updateAndroidAppDataStreamSettings(),
            clientContext);
    this.listAndroidAppDataStreamsCallable =
        callableFactory.createUnaryCallable(
            listAndroidAppDataStreamsTransportSettings,
            settings.listAndroidAppDataStreamsSettings(),
            clientContext);
    this.listAndroidAppDataStreamsPagedCallable =
        callableFactory.createPagedCallable(
            listAndroidAppDataStreamsTransportSettings,
            settings.listAndroidAppDataStreamsSettings(),
            clientContext);
    this.getEnhancedMeasurementSettingsCallable =
        callableFactory.createUnaryCallable(
            getEnhancedMeasurementSettingsTransportSettings,
            settings.getEnhancedMeasurementSettingsSettings(),
            clientContext);
    this.updateEnhancedMeasurementSettingsCallable =
        callableFactory.createUnaryCallable(
            updateEnhancedMeasurementSettingsTransportSettings,
            settings.updateEnhancedMeasurementSettingsSettings(),
            clientContext);
    this.createFirebaseLinkCallable =
        callableFactory.createUnaryCallable(
            createFirebaseLinkTransportSettings,
            settings.createFirebaseLinkSettings(),
            clientContext);
    this.updateFirebaseLinkCallable =
        callableFactory.createUnaryCallable(
            updateFirebaseLinkTransportSettings,
            settings.updateFirebaseLinkSettings(),
            clientContext);
    this.deleteFirebaseLinkCallable =
        callableFactory.createUnaryCallable(
            deleteFirebaseLinkTransportSettings,
            settings.deleteFirebaseLinkSettings(),
            clientContext);
    this.listFirebaseLinksCallable =
        callableFactory.createUnaryCallable(
            listFirebaseLinksTransportSettings,
            settings.listFirebaseLinksSettings(),
            clientContext);
    this.listFirebaseLinksPagedCallable =
        callableFactory.createPagedCallable(
            listFirebaseLinksTransportSettings,
            settings.listFirebaseLinksSettings(),
            clientContext);
    this.getGlobalSiteTagCallable =
        callableFactory.createUnaryCallable(
            getGlobalSiteTagTransportSettings, settings.getGlobalSiteTagSettings(), clientContext);
    this.createGoogleAdsLinkCallable =
        callableFactory.createUnaryCallable(
            createGoogleAdsLinkTransportSettings,
            settings.createGoogleAdsLinkSettings(),
            clientContext);
    this.updateGoogleAdsLinkCallable =
        callableFactory.createUnaryCallable(
            updateGoogleAdsLinkTransportSettings,
            settings.updateGoogleAdsLinkSettings(),
            clientContext);
    this.deleteGoogleAdsLinkCallable =
        callableFactory.createUnaryCallable(
            deleteGoogleAdsLinkTransportSettings,
            settings.deleteGoogleAdsLinkSettings(),
            clientContext);
    this.listGoogleAdsLinksCallable =
        callableFactory.createUnaryCallable(
            listGoogleAdsLinksTransportSettings,
            settings.listGoogleAdsLinksSettings(),
            clientContext);
    this.listGoogleAdsLinksPagedCallable =
        callableFactory.createPagedCallable(
            listGoogleAdsLinksTransportSettings,
            settings.listGoogleAdsLinksSettings(),
            clientContext);
    this.getDataSharingSettingsCallable =
        callableFactory.createUnaryCallable(
            getDataSharingSettingsTransportSettings,
            settings.getDataSharingSettingsSettings(),
            clientContext);
    this.getMeasurementProtocolSecretCallable =
        callableFactory.createUnaryCallable(
            getMeasurementProtocolSecretTransportSettings,
            settings.getMeasurementProtocolSecretSettings(),
            clientContext);
    this.listMeasurementProtocolSecretsCallable =
        callableFactory.createUnaryCallable(
            listMeasurementProtocolSecretsTransportSettings,
            settings.listMeasurementProtocolSecretsSettings(),
            clientContext);
    this.listMeasurementProtocolSecretsPagedCallable =
        callableFactory.createPagedCallable(
            listMeasurementProtocolSecretsTransportSettings,
            settings.listMeasurementProtocolSecretsSettings(),
            clientContext);
    this.createMeasurementProtocolSecretCallable =
        callableFactory.createUnaryCallable(
            createMeasurementProtocolSecretTransportSettings,
            settings.createMeasurementProtocolSecretSettings(),
            clientContext);
    this.deleteMeasurementProtocolSecretCallable =
        callableFactory.createUnaryCallable(
            deleteMeasurementProtocolSecretTransportSettings,
            settings.deleteMeasurementProtocolSecretSettings(),
            clientContext);
    this.updateMeasurementProtocolSecretCallable =
        callableFactory.createUnaryCallable(
            updateMeasurementProtocolSecretTransportSettings,
            settings.updateMeasurementProtocolSecretSettings(),
            clientContext);
    this.searchChangeHistoryEventsCallable =
        callableFactory.createUnaryCallable(
            searchChangeHistoryEventsTransportSettings,
            settings.searchChangeHistoryEventsSettings(),
            clientContext);
    this.searchChangeHistoryEventsPagedCallable =
        callableFactory.createPagedCallable(
            searchChangeHistoryEventsTransportSettings,
            settings.searchChangeHistoryEventsSettings(),
            clientContext);
    this.getGoogleSignalsSettingsCallable =
        callableFactory.createUnaryCallable(
            getGoogleSignalsSettingsTransportSettings,
            settings.getGoogleSignalsSettingsSettings(),
            clientContext);
    this.updateGoogleSignalsSettingsCallable =
        callableFactory.createUnaryCallable(
            updateGoogleSignalsSettingsTransportSettings,
            settings.updateGoogleSignalsSettingsSettings(),
            clientContext);
    this.createConversionEventCallable =
        callableFactory.createUnaryCallable(
            createConversionEventTransportSettings,
            settings.createConversionEventSettings(),
            clientContext);
    this.getConversionEventCallable =
        callableFactory.createUnaryCallable(
            getConversionEventTransportSettings,
            settings.getConversionEventSettings(),
            clientContext);
    this.deleteConversionEventCallable =
        callableFactory.createUnaryCallable(
            deleteConversionEventTransportSettings,
            settings.deleteConversionEventSettings(),
            clientContext);
    this.listConversionEventsCallable =
        callableFactory.createUnaryCallable(
            listConversionEventsTransportSettings,
            settings.listConversionEventsSettings(),
            clientContext);
    this.listConversionEventsPagedCallable =
        callableFactory.createPagedCallable(
            listConversionEventsTransportSettings,
            settings.listConversionEventsSettings(),
            clientContext);
    this.createCustomDimensionCallable =
        callableFactory.createUnaryCallable(
            createCustomDimensionTransportSettings,
            settings.createCustomDimensionSettings(),
            clientContext);
    this.updateCustomDimensionCallable =
        callableFactory.createUnaryCallable(
            updateCustomDimensionTransportSettings,
            settings.updateCustomDimensionSettings(),
            clientContext);
    this.listCustomDimensionsCallable =
        callableFactory.createUnaryCallable(
            listCustomDimensionsTransportSettings,
            settings.listCustomDimensionsSettings(),
            clientContext);
    this.listCustomDimensionsPagedCallable =
        callableFactory.createPagedCallable(
            listCustomDimensionsTransportSettings,
            settings.listCustomDimensionsSettings(),
            clientContext);
    this.archiveCustomDimensionCallable =
        callableFactory.createUnaryCallable(
            archiveCustomDimensionTransportSettings,
            settings.archiveCustomDimensionSettings(),
            clientContext);
    this.getCustomDimensionCallable =
        callableFactory.createUnaryCallable(
            getCustomDimensionTransportSettings,
            settings.getCustomDimensionSettings(),
            clientContext);
    this.createCustomMetricCallable =
        callableFactory.createUnaryCallable(
            createCustomMetricTransportSettings,
            settings.createCustomMetricSettings(),
            clientContext);
    this.updateCustomMetricCallable =
        callableFactory.createUnaryCallable(
            updateCustomMetricTransportSettings,
            settings.updateCustomMetricSettings(),
            clientContext);
    this.listCustomMetricsCallable =
        callableFactory.createUnaryCallable(
            listCustomMetricsTransportSettings,
            settings.listCustomMetricsSettings(),
            clientContext);
    this.listCustomMetricsPagedCallable =
        callableFactory.createPagedCallable(
            listCustomMetricsTransportSettings,
            settings.listCustomMetricsSettings(),
            clientContext);
    this.archiveCustomMetricCallable =
        callableFactory.createUnaryCallable(
            archiveCustomMetricTransportSettings,
            settings.archiveCustomMetricSettings(),
            clientContext);
    this.getCustomMetricCallable =
        callableFactory.createUnaryCallable(
            getCustomMetricTransportSettings, settings.getCustomMetricSettings(), clientContext);

    this.backgroundResources =
        new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  public GrpcOperationsStub getOperationsStub() {
    return operationsStub;
  }

  @Override
  public UnaryCallable<GetAccountRequest, Account> getAccountCallable() {
    return getAccountCallable;
  }

  @Override
  public UnaryCallable<ListAccountsRequest, ListAccountsResponse> listAccountsCallable() {
    return listAccountsCallable;
  }

  @Override
  public UnaryCallable<ListAccountsRequest, ListAccountsPagedResponse> listAccountsPagedCallable() {
    return listAccountsPagedCallable;
  }

  @Override
  public UnaryCallable<DeleteAccountRequest, Empty> deleteAccountCallable() {
    return deleteAccountCallable;
  }

  @Override
  public UnaryCallable<UpdateAccountRequest, Account> updateAccountCallable() {
    return updateAccountCallable;
  }

  @Override
  public UnaryCallable<ProvisionAccountTicketRequest, ProvisionAccountTicketResponse>
      provisionAccountTicketCallable() {
    return provisionAccountTicketCallable;
  }

  @Override
  public UnaryCallable<ListAccountSummariesRequest, ListAccountSummariesResponse>
      listAccountSummariesCallable() {
    return listAccountSummariesCallable;
  }

  @Override
  public UnaryCallable<ListAccountSummariesRequest, ListAccountSummariesPagedResponse>
      listAccountSummariesPagedCallable() {
    return listAccountSummariesPagedCallable;
  }

  @Override
  public UnaryCallable<GetPropertyRequest, Property> getPropertyCallable() {
    return getPropertyCallable;
  }

  @Override
  public UnaryCallable<ListPropertiesRequest, ListPropertiesResponse> listPropertiesCallable() {
    return listPropertiesCallable;
  }

  @Override
  public UnaryCallable<ListPropertiesRequest, ListPropertiesPagedResponse>
      listPropertiesPagedCallable() {
    return listPropertiesPagedCallable;
  }

  @Override
  public UnaryCallable<CreatePropertyRequest, Property> createPropertyCallable() {
    return createPropertyCallable;
  }

  @Override
  public UnaryCallable<DeletePropertyRequest, Property> deletePropertyCallable() {
    return deletePropertyCallable;
  }

  @Override
  public UnaryCallable<UpdatePropertyRequest, Property> updatePropertyCallable() {
    return updatePropertyCallable;
  }

  @Override
  public UnaryCallable<GetUserLinkRequest, UserLink> getUserLinkCallable() {
    return getUserLinkCallable;
  }

  @Override
  public UnaryCallable<BatchGetUserLinksRequest, BatchGetUserLinksResponse>
      batchGetUserLinksCallable() {
    return batchGetUserLinksCallable;
  }

  @Override
  public UnaryCallable<ListUserLinksRequest, ListUserLinksResponse> listUserLinksCallable() {
    return listUserLinksCallable;
  }

  @Override
  public UnaryCallable<ListUserLinksRequest, ListUserLinksPagedResponse>
      listUserLinksPagedCallable() {
    return listUserLinksPagedCallable;
  }

  @Override
  public UnaryCallable<AuditUserLinksRequest, AuditUserLinksResponse> auditUserLinksCallable() {
    return auditUserLinksCallable;
  }

  @Override
  public UnaryCallable<AuditUserLinksRequest, AuditUserLinksPagedResponse>
      auditUserLinksPagedCallable() {
    return auditUserLinksPagedCallable;
  }

  @Override
  public UnaryCallable<CreateUserLinkRequest, UserLink> createUserLinkCallable() {
    return createUserLinkCallable;
  }

  @Override
  public UnaryCallable<BatchCreateUserLinksRequest, BatchCreateUserLinksResponse>
      batchCreateUserLinksCallable() {
    return batchCreateUserLinksCallable;
  }

  @Override
  public UnaryCallable<UpdateUserLinkRequest, UserLink> updateUserLinkCallable() {
    return updateUserLinkCallable;
  }

  @Override
  public UnaryCallable<BatchUpdateUserLinksRequest, BatchUpdateUserLinksResponse>
      batchUpdateUserLinksCallable() {
    return batchUpdateUserLinksCallable;
  }

  @Override
  public UnaryCallable<DeleteUserLinkRequest, Empty> deleteUserLinkCallable() {
    return deleteUserLinkCallable;
  }

  @Override
  public UnaryCallable<BatchDeleteUserLinksRequest, Empty> batchDeleteUserLinksCallable() {
    return batchDeleteUserLinksCallable;
  }

  @Override
  public UnaryCallable<GetWebDataStreamRequest, WebDataStream> getWebDataStreamCallable() {
    return getWebDataStreamCallable;
  }

  @Override
  public UnaryCallable<DeleteWebDataStreamRequest, Empty> deleteWebDataStreamCallable() {
    return deleteWebDataStreamCallable;
  }

  @Override
  public UnaryCallable<UpdateWebDataStreamRequest, WebDataStream> updateWebDataStreamCallable() {
    return updateWebDataStreamCallable;
  }

  @Override
  public UnaryCallable<CreateWebDataStreamRequest, WebDataStream> createWebDataStreamCallable() {
    return createWebDataStreamCallable;
  }

  @Override
  public UnaryCallable<ListWebDataStreamsRequest, ListWebDataStreamsResponse>
      listWebDataStreamsCallable() {
    return listWebDataStreamsCallable;
  }

  @Override
  public UnaryCallable<ListWebDataStreamsRequest, ListWebDataStreamsPagedResponse>
      listWebDataStreamsPagedCallable() {
    return listWebDataStreamsPagedCallable;
  }

  @Override
  public UnaryCallable<GetIosAppDataStreamRequest, IosAppDataStream> getIosAppDataStreamCallable() {
    return getIosAppDataStreamCallable;
  }

  @Override
  public UnaryCallable<DeleteIosAppDataStreamRequest, Empty> deleteIosAppDataStreamCallable() {
    return deleteIosAppDataStreamCallable;
  }

  @Override
  public UnaryCallable<UpdateIosAppDataStreamRequest, IosAppDataStream>
      updateIosAppDataStreamCallable() {
    return updateIosAppDataStreamCallable;
  }

  @Override
  public UnaryCallable<ListIosAppDataStreamsRequest, ListIosAppDataStreamsResponse>
      listIosAppDataStreamsCallable() {
    return listIosAppDataStreamsCallable;
  }

  @Override
  public UnaryCallable<ListIosAppDataStreamsRequest, ListIosAppDataStreamsPagedResponse>
      listIosAppDataStreamsPagedCallable() {
    return listIosAppDataStreamsPagedCallable;
  }

  @Override
  public UnaryCallable<GetAndroidAppDataStreamRequest, AndroidAppDataStream>
      getAndroidAppDataStreamCallable() {
    return getAndroidAppDataStreamCallable;
  }

  @Override
  public UnaryCallable<DeleteAndroidAppDataStreamRequest, Empty>
      deleteAndroidAppDataStreamCallable() {
    return deleteAndroidAppDataStreamCallable;
  }

  @Override
  public UnaryCallable<UpdateAndroidAppDataStreamRequest, AndroidAppDataStream>
      updateAndroidAppDataStreamCallable() {
    return updateAndroidAppDataStreamCallable;
  }

  @Override
  public UnaryCallable<ListAndroidAppDataStreamsRequest, ListAndroidAppDataStreamsResponse>
      listAndroidAppDataStreamsCallable() {
    return listAndroidAppDataStreamsCallable;
  }

  @Override
  public UnaryCallable<ListAndroidAppDataStreamsRequest, ListAndroidAppDataStreamsPagedResponse>
      listAndroidAppDataStreamsPagedCallable() {
    return listAndroidAppDataStreamsPagedCallable;
  }

  @Override
  public UnaryCallable<GetEnhancedMeasurementSettingsRequest, EnhancedMeasurementSettings>
      getEnhancedMeasurementSettingsCallable() {
    return getEnhancedMeasurementSettingsCallable;
  }

  @Override
  public UnaryCallable<UpdateEnhancedMeasurementSettingsRequest, EnhancedMeasurementSettings>
      updateEnhancedMeasurementSettingsCallable() {
    return updateEnhancedMeasurementSettingsCallable;
  }

  @Override
  public UnaryCallable<CreateFirebaseLinkRequest, FirebaseLink> createFirebaseLinkCallable() {
    return createFirebaseLinkCallable;
  }

  @Override
  public UnaryCallable<UpdateFirebaseLinkRequest, FirebaseLink> updateFirebaseLinkCallable() {
    return updateFirebaseLinkCallable;
  }

  @Override
  public UnaryCallable<DeleteFirebaseLinkRequest, Empty> deleteFirebaseLinkCallable() {
    return deleteFirebaseLinkCallable;
  }

  @Override
  public UnaryCallable<ListFirebaseLinksRequest, ListFirebaseLinksResponse>
      listFirebaseLinksCallable() {
    return listFirebaseLinksCallable;
  }

  @Override
  public UnaryCallable<ListFirebaseLinksRequest, ListFirebaseLinksPagedResponse>
      listFirebaseLinksPagedCallable() {
    return listFirebaseLinksPagedCallable;
  }

  @Override
  public UnaryCallable<GetGlobalSiteTagRequest, GlobalSiteTag> getGlobalSiteTagCallable() {
    return getGlobalSiteTagCallable;
  }

  @Override
  public UnaryCallable<CreateGoogleAdsLinkRequest, GoogleAdsLink> createGoogleAdsLinkCallable() {
    return createGoogleAdsLinkCallable;
  }

  @Override
  public UnaryCallable<UpdateGoogleAdsLinkRequest, GoogleAdsLink> updateGoogleAdsLinkCallable() {
    return updateGoogleAdsLinkCallable;
  }

  @Override
  public UnaryCallable<DeleteGoogleAdsLinkRequest, Empty> deleteGoogleAdsLinkCallable() {
    return deleteGoogleAdsLinkCallable;
  }

  @Override
  public UnaryCallable<ListGoogleAdsLinksRequest, ListGoogleAdsLinksResponse>
      listGoogleAdsLinksCallable() {
    return listGoogleAdsLinksCallable;
  }

  @Override
  public UnaryCallable<ListGoogleAdsLinksRequest, ListGoogleAdsLinksPagedResponse>
      listGoogleAdsLinksPagedCallable() {
    return listGoogleAdsLinksPagedCallable;
  }

  @Override
  public UnaryCallable<GetDataSharingSettingsRequest, DataSharingSettings>
      getDataSharingSettingsCallable() {
    return getDataSharingSettingsCallable;
  }

  @Override
  public UnaryCallable<GetMeasurementProtocolSecretRequest, MeasurementProtocolSecret>
      getMeasurementProtocolSecretCallable() {
    return getMeasurementProtocolSecretCallable;
  }

  @Override
  public UnaryCallable<
          ListMeasurementProtocolSecretsRequest, ListMeasurementProtocolSecretsResponse>
      listMeasurementProtocolSecretsCallable() {
    return listMeasurementProtocolSecretsCallable;
  }

  @Override
  public UnaryCallable<
          ListMeasurementProtocolSecretsRequest, ListMeasurementProtocolSecretsPagedResponse>
      listMeasurementProtocolSecretsPagedCallable() {
    return listMeasurementProtocolSecretsPagedCallable;
  }

  @Override
  public UnaryCallable<CreateMeasurementProtocolSecretRequest, MeasurementProtocolSecret>
      createMeasurementProtocolSecretCallable() {
    return createMeasurementProtocolSecretCallable;
  }

  @Override
  public UnaryCallable<DeleteMeasurementProtocolSecretRequest, Empty>
      deleteMeasurementProtocolSecretCallable() {
    return deleteMeasurementProtocolSecretCallable;
  }

  @Override
  public UnaryCallable<UpdateMeasurementProtocolSecretRequest, MeasurementProtocolSecret>
      updateMeasurementProtocolSecretCallable() {
    return updateMeasurementProtocolSecretCallable;
  }

  @Override
  public UnaryCallable<SearchChangeHistoryEventsRequest, SearchChangeHistoryEventsResponse>
      searchChangeHistoryEventsCallable() {
    return searchChangeHistoryEventsCallable;
  }

  @Override
  public UnaryCallable<SearchChangeHistoryEventsRequest, SearchChangeHistoryEventsPagedResponse>
      searchChangeHistoryEventsPagedCallable() {
    return searchChangeHistoryEventsPagedCallable;
  }

  @Override
  public UnaryCallable<GetGoogleSignalsSettingsRequest, GoogleSignalsSettings>
      getGoogleSignalsSettingsCallable() {
    return getGoogleSignalsSettingsCallable;
  }

  @Override
  public UnaryCallable<UpdateGoogleSignalsSettingsRequest, GoogleSignalsSettings>
      updateGoogleSignalsSettingsCallable() {
    return updateGoogleSignalsSettingsCallable;
  }

  @Override
  public UnaryCallable<CreateConversionEventRequest, ConversionEvent>
      createConversionEventCallable() {
    return createConversionEventCallable;
  }

  @Override
  public UnaryCallable<GetConversionEventRequest, ConversionEvent> getConversionEventCallable() {
    return getConversionEventCallable;
  }

  @Override
  public UnaryCallable<DeleteConversionEventRequest, Empty> deleteConversionEventCallable() {
    return deleteConversionEventCallable;
  }

  @Override
  public UnaryCallable<ListConversionEventsRequest, ListConversionEventsResponse>
      listConversionEventsCallable() {
    return listConversionEventsCallable;
  }

  @Override
  public UnaryCallable<ListConversionEventsRequest, ListConversionEventsPagedResponse>
      listConversionEventsPagedCallable() {
    return listConversionEventsPagedCallable;
  }

  @Override
  public UnaryCallable<CreateCustomDimensionRequest, CustomDimension>
      createCustomDimensionCallable() {
    return createCustomDimensionCallable;
  }

  @Override
  public UnaryCallable<UpdateCustomDimensionRequest, CustomDimension>
      updateCustomDimensionCallable() {
    return updateCustomDimensionCallable;
  }

  @Override
  public UnaryCallable<ListCustomDimensionsRequest, ListCustomDimensionsResponse>
      listCustomDimensionsCallable() {
    return listCustomDimensionsCallable;
  }

  @Override
  public UnaryCallable<ListCustomDimensionsRequest, ListCustomDimensionsPagedResponse>
      listCustomDimensionsPagedCallable() {
    return listCustomDimensionsPagedCallable;
  }

  @Override
  public UnaryCallable<ArchiveCustomDimensionRequest, Empty> archiveCustomDimensionCallable() {
    return archiveCustomDimensionCallable;
  }

  @Override
  public UnaryCallable<GetCustomDimensionRequest, CustomDimension> getCustomDimensionCallable() {
    return getCustomDimensionCallable;
  }

  @Override
  public UnaryCallable<CreateCustomMetricRequest, CustomMetric> createCustomMetricCallable() {
    return createCustomMetricCallable;
  }

  @Override
  public UnaryCallable<UpdateCustomMetricRequest, CustomMetric> updateCustomMetricCallable() {
    return updateCustomMetricCallable;
  }

  @Override
  public UnaryCallable<ListCustomMetricsRequest, ListCustomMetricsResponse>
      listCustomMetricsCallable() {
    return listCustomMetricsCallable;
  }

  @Override
  public UnaryCallable<ListCustomMetricsRequest, ListCustomMetricsPagedResponse>
      listCustomMetricsPagedCallable() {
    return listCustomMetricsPagedCallable;
  }

  @Override
  public UnaryCallable<ArchiveCustomMetricRequest, Empty> archiveCustomMetricCallable() {
    return archiveCustomMetricCallable;
  }

  @Override
  public UnaryCallable<GetCustomMetricRequest, CustomMetric> getCustomMetricCallable() {
    return getCustomMetricCallable;
  }

  @Override
  public final void close() {
    try {
      backgroundResources.close();
    } catch (RuntimeException e) {
      throw e;
    } catch (Exception e) {
      throw new IllegalStateException("Failed to close resource", e);
    }
  }

  @Override
  public void shutdown() {
    backgroundResources.shutdown();
  }

  @Override
  public boolean isShutdown() {
    return backgroundResources.isShutdown();
  }

  @Override
  public boolean isTerminated() {
    return backgroundResources.isTerminated();
  }

  @Override
  public void shutdownNow() {
    backgroundResources.shutdownNow();
  }

  @Override
  public boolean awaitTermination(long duration, TimeUnit unit) throws InterruptedException {
    return backgroundResources.awaitTermination(duration, unit);
  }
}
