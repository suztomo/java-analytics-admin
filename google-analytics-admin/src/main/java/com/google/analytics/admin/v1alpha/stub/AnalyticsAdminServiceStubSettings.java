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
import com.google.analytics.admin.v1alpha.AccountSummary;
import com.google.analytics.admin.v1alpha.AndroidAppDataStream;
import com.google.analytics.admin.v1alpha.ArchiveCustomDimensionRequest;
import com.google.analytics.admin.v1alpha.ArchiveCustomMetricRequest;
import com.google.analytics.admin.v1alpha.AuditUserLink;
import com.google.analytics.admin.v1alpha.AuditUserLinksRequest;
import com.google.analytics.admin.v1alpha.AuditUserLinksResponse;
import com.google.analytics.admin.v1alpha.BatchCreateUserLinksRequest;
import com.google.analytics.admin.v1alpha.BatchCreateUserLinksResponse;
import com.google.analytics.admin.v1alpha.BatchDeleteUserLinksRequest;
import com.google.analytics.admin.v1alpha.BatchGetUserLinksRequest;
import com.google.analytics.admin.v1alpha.BatchGetUserLinksResponse;
import com.google.analytics.admin.v1alpha.BatchUpdateUserLinksRequest;
import com.google.analytics.admin.v1alpha.BatchUpdateUserLinksResponse;
import com.google.analytics.admin.v1alpha.ChangeHistoryEvent;
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
import com.google.api.core.ApiFunction;
import com.google.api.core.ApiFuture;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.GaxProperties;
import com.google.api.gax.core.GoogleCredentialsProvider;
import com.google.api.gax.core.InstantiatingExecutorProvider;
import com.google.api.gax.grpc.GaxGrpcProperties;
import com.google.api.gax.grpc.GrpcTransportChannel;
import com.google.api.gax.grpc.InstantiatingGrpcChannelProvider;
import com.google.api.gax.retrying.RetrySettings;
import com.google.api.gax.rpc.ApiCallContext;
import com.google.api.gax.rpc.ApiClientHeaderProvider;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.PageContext;
import com.google.api.gax.rpc.PagedCallSettings;
import com.google.api.gax.rpc.PagedListDescriptor;
import com.google.api.gax.rpc.PagedListResponseFactory;
import com.google.api.gax.rpc.StatusCode;
import com.google.api.gax.rpc.StubSettings;
import com.google.api.gax.rpc.TransportChannelProvider;
import com.google.api.gax.rpc.UnaryCallSettings;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import com.google.protobuf.Empty;
import java.io.IOException;
import java.util.List;
import javax.annotation.Generated;
import org.threeten.bp.Duration;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Settings class to configure an instance of {@link AnalyticsAdminServiceStub}.
 *
 * <p>The default instance has everything set to sensible defaults:
 *
 * <ul>
 *   <li>The default service address (analyticsadmin.googleapis.com) and default port (443) are
 *       used.
 *   <li>Credentials are acquired automatically through Application Default Credentials.
 *   <li>Retries are configured for idempotent methods but not for non-idempotent methods.
 * </ul>
 *
 * <p>The builder of this class is recursive, so contained classes are themselves builders. When
 * build() is called, the tree of builders is called to create the complete settings object.
 *
 * <p>For example, to set the total timeout of getAccount to 30 seconds:
 *
 * <pre>{@code
 * AnalyticsAdminServiceStubSettings.Builder analyticsAdminServiceSettingsBuilder =
 *     AnalyticsAdminServiceStubSettings.newBuilder();
 * analyticsAdminServiceSettingsBuilder
 *     .getAccountSettings()
 *     .setRetrySettings(
 *         analyticsAdminServiceSettingsBuilder
 *             .getAccountSettings()
 *             .getRetrySettings()
 *             .toBuilder()
 *             .setTotalTimeout(Duration.ofSeconds(30))
 *             .build());
 * AnalyticsAdminServiceStubSettings analyticsAdminServiceSettings =
 *     analyticsAdminServiceSettingsBuilder.build();
 * }</pre>
 */
@BetaApi
@Generated("by gapic-generator-java")
public class AnalyticsAdminServiceStubSettings
    extends StubSettings<AnalyticsAdminServiceStubSettings> {
  /** The default scopes of the service. */
  private static final ImmutableList<String> DEFAULT_SERVICE_SCOPES =
      ImmutableList.<String>builder()
          .add("https://www.googleapis.com/auth/analytics.edit")
          .add("https://www.googleapis.com/auth/analytics.manage.users")
          .add("https://www.googleapis.com/auth/analytics.manage.users.readonly")
          .add("https://www.googleapis.com/auth/analytics.readonly")
          .build();

  private final UnaryCallSettings<GetAccountRequest, Account> getAccountSettings;
  private final PagedCallSettings<
          ListAccountsRequest, ListAccountsResponse, ListAccountsPagedResponse>
      listAccountsSettings;
  private final UnaryCallSettings<DeleteAccountRequest, Empty> deleteAccountSettings;
  private final UnaryCallSettings<UpdateAccountRequest, Account> updateAccountSettings;
  private final UnaryCallSettings<ProvisionAccountTicketRequest, ProvisionAccountTicketResponse>
      provisionAccountTicketSettings;
  private final PagedCallSettings<
          ListAccountSummariesRequest,
          ListAccountSummariesResponse,
          ListAccountSummariesPagedResponse>
      listAccountSummariesSettings;
  private final UnaryCallSettings<GetPropertyRequest, Property> getPropertySettings;
  private final PagedCallSettings<
          ListPropertiesRequest, ListPropertiesResponse, ListPropertiesPagedResponse>
      listPropertiesSettings;
  private final UnaryCallSettings<CreatePropertyRequest, Property> createPropertySettings;
  private final UnaryCallSettings<DeletePropertyRequest, Property> deletePropertySettings;
  private final UnaryCallSettings<UpdatePropertyRequest, Property> updatePropertySettings;
  private final UnaryCallSettings<GetUserLinkRequest, UserLink> getUserLinkSettings;
  private final UnaryCallSettings<BatchGetUserLinksRequest, BatchGetUserLinksResponse>
      batchGetUserLinksSettings;
  private final PagedCallSettings<
          ListUserLinksRequest, ListUserLinksResponse, ListUserLinksPagedResponse>
      listUserLinksSettings;
  private final PagedCallSettings<
          AuditUserLinksRequest, AuditUserLinksResponse, AuditUserLinksPagedResponse>
      auditUserLinksSettings;
  private final UnaryCallSettings<CreateUserLinkRequest, UserLink> createUserLinkSettings;
  private final UnaryCallSettings<BatchCreateUserLinksRequest, BatchCreateUserLinksResponse>
      batchCreateUserLinksSettings;
  private final UnaryCallSettings<UpdateUserLinkRequest, UserLink> updateUserLinkSettings;
  private final UnaryCallSettings<BatchUpdateUserLinksRequest, BatchUpdateUserLinksResponse>
      batchUpdateUserLinksSettings;
  private final UnaryCallSettings<DeleteUserLinkRequest, Empty> deleteUserLinkSettings;
  private final UnaryCallSettings<BatchDeleteUserLinksRequest, Empty> batchDeleteUserLinksSettings;
  private final UnaryCallSettings<GetWebDataStreamRequest, WebDataStream> getWebDataStreamSettings;
  private final UnaryCallSettings<DeleteWebDataStreamRequest, Empty> deleteWebDataStreamSettings;
  private final UnaryCallSettings<UpdateWebDataStreamRequest, WebDataStream>
      updateWebDataStreamSettings;
  private final UnaryCallSettings<CreateWebDataStreamRequest, WebDataStream>
      createWebDataStreamSettings;
  private final PagedCallSettings<
          ListWebDataStreamsRequest, ListWebDataStreamsResponse, ListWebDataStreamsPagedResponse>
      listWebDataStreamsSettings;
  private final UnaryCallSettings<GetIosAppDataStreamRequest, IosAppDataStream>
      getIosAppDataStreamSettings;
  private final UnaryCallSettings<DeleteIosAppDataStreamRequest, Empty>
      deleteIosAppDataStreamSettings;
  private final UnaryCallSettings<UpdateIosAppDataStreamRequest, IosAppDataStream>
      updateIosAppDataStreamSettings;
  private final PagedCallSettings<
          ListIosAppDataStreamsRequest,
          ListIosAppDataStreamsResponse,
          ListIosAppDataStreamsPagedResponse>
      listIosAppDataStreamsSettings;
  private final UnaryCallSettings<GetAndroidAppDataStreamRequest, AndroidAppDataStream>
      getAndroidAppDataStreamSettings;
  private final UnaryCallSettings<DeleteAndroidAppDataStreamRequest, Empty>
      deleteAndroidAppDataStreamSettings;
  private final UnaryCallSettings<UpdateAndroidAppDataStreamRequest, AndroidAppDataStream>
      updateAndroidAppDataStreamSettings;
  private final PagedCallSettings<
          ListAndroidAppDataStreamsRequest,
          ListAndroidAppDataStreamsResponse,
          ListAndroidAppDataStreamsPagedResponse>
      listAndroidAppDataStreamsSettings;
  private final UnaryCallSettings<
          GetEnhancedMeasurementSettingsRequest, EnhancedMeasurementSettings>
      getEnhancedMeasurementSettingsSettings;
  private final UnaryCallSettings<
          UpdateEnhancedMeasurementSettingsRequest, EnhancedMeasurementSettings>
      updateEnhancedMeasurementSettingsSettings;
  private final UnaryCallSettings<CreateFirebaseLinkRequest, FirebaseLink>
      createFirebaseLinkSettings;
  private final UnaryCallSettings<UpdateFirebaseLinkRequest, FirebaseLink>
      updateFirebaseLinkSettings;
  private final UnaryCallSettings<DeleteFirebaseLinkRequest, Empty> deleteFirebaseLinkSettings;
  private final PagedCallSettings<
          ListFirebaseLinksRequest, ListFirebaseLinksResponse, ListFirebaseLinksPagedResponse>
      listFirebaseLinksSettings;
  private final UnaryCallSettings<GetGlobalSiteTagRequest, GlobalSiteTag> getGlobalSiteTagSettings;
  private final UnaryCallSettings<CreateGoogleAdsLinkRequest, GoogleAdsLink>
      createGoogleAdsLinkSettings;
  private final UnaryCallSettings<UpdateGoogleAdsLinkRequest, GoogleAdsLink>
      updateGoogleAdsLinkSettings;
  private final UnaryCallSettings<DeleteGoogleAdsLinkRequest, Empty> deleteGoogleAdsLinkSettings;
  private final PagedCallSettings<
          ListGoogleAdsLinksRequest, ListGoogleAdsLinksResponse, ListGoogleAdsLinksPagedResponse>
      listGoogleAdsLinksSettings;
  private final UnaryCallSettings<GetDataSharingSettingsRequest, DataSharingSettings>
      getDataSharingSettingsSettings;
  private final UnaryCallSettings<GetMeasurementProtocolSecretRequest, MeasurementProtocolSecret>
      getMeasurementProtocolSecretSettings;
  private final PagedCallSettings<
          ListMeasurementProtocolSecretsRequest,
          ListMeasurementProtocolSecretsResponse,
          ListMeasurementProtocolSecretsPagedResponse>
      listMeasurementProtocolSecretsSettings;
  private final UnaryCallSettings<CreateMeasurementProtocolSecretRequest, MeasurementProtocolSecret>
      createMeasurementProtocolSecretSettings;
  private final UnaryCallSettings<DeleteMeasurementProtocolSecretRequest, Empty>
      deleteMeasurementProtocolSecretSettings;
  private final UnaryCallSettings<UpdateMeasurementProtocolSecretRequest, MeasurementProtocolSecret>
      updateMeasurementProtocolSecretSettings;
  private final PagedCallSettings<
          SearchChangeHistoryEventsRequest,
          SearchChangeHistoryEventsResponse,
          SearchChangeHistoryEventsPagedResponse>
      searchChangeHistoryEventsSettings;
  private final UnaryCallSettings<GetGoogleSignalsSettingsRequest, GoogleSignalsSettings>
      getGoogleSignalsSettingsSettings;
  private final UnaryCallSettings<UpdateGoogleSignalsSettingsRequest, GoogleSignalsSettings>
      updateGoogleSignalsSettingsSettings;
  private final UnaryCallSettings<CreateConversionEventRequest, ConversionEvent>
      createConversionEventSettings;
  private final UnaryCallSettings<GetConversionEventRequest, ConversionEvent>
      getConversionEventSettings;
  private final UnaryCallSettings<DeleteConversionEventRequest, Empty>
      deleteConversionEventSettings;
  private final PagedCallSettings<
          ListConversionEventsRequest,
          ListConversionEventsResponse,
          ListConversionEventsPagedResponse>
      listConversionEventsSettings;
  private final UnaryCallSettings<CreateCustomDimensionRequest, CustomDimension>
      createCustomDimensionSettings;
  private final UnaryCallSettings<UpdateCustomDimensionRequest, CustomDimension>
      updateCustomDimensionSettings;
  private final PagedCallSettings<
          ListCustomDimensionsRequest,
          ListCustomDimensionsResponse,
          ListCustomDimensionsPagedResponse>
      listCustomDimensionsSettings;
  private final UnaryCallSettings<ArchiveCustomDimensionRequest, Empty>
      archiveCustomDimensionSettings;
  private final UnaryCallSettings<GetCustomDimensionRequest, CustomDimension>
      getCustomDimensionSettings;
  private final UnaryCallSettings<CreateCustomMetricRequest, CustomMetric>
      createCustomMetricSettings;
  private final UnaryCallSettings<UpdateCustomMetricRequest, CustomMetric>
      updateCustomMetricSettings;
  private final PagedCallSettings<
          ListCustomMetricsRequest, ListCustomMetricsResponse, ListCustomMetricsPagedResponse>
      listCustomMetricsSettings;
  private final UnaryCallSettings<ArchiveCustomMetricRequest, Empty> archiveCustomMetricSettings;
  private final UnaryCallSettings<GetCustomMetricRequest, CustomMetric> getCustomMetricSettings;

  private static final PagedListDescriptor<ListAccountsRequest, ListAccountsResponse, Account>
      LIST_ACCOUNTS_PAGE_STR_DESC =
          new PagedListDescriptor<ListAccountsRequest, ListAccountsResponse, Account>() {
            @Override
            public String emptyToken() {
              return "";
            }

            @Override
            public ListAccountsRequest injectToken(ListAccountsRequest payload, String token) {
              return ListAccountsRequest.newBuilder(payload).setPageToken(token).build();
            }

            @Override
            public ListAccountsRequest injectPageSize(ListAccountsRequest payload, int pageSize) {
              return ListAccountsRequest.newBuilder(payload).setPageSize(pageSize).build();
            }

            @Override
            public Integer extractPageSize(ListAccountsRequest payload) {
              return payload.getPageSize();
            }

            @Override
            public String extractNextToken(ListAccountsResponse payload) {
              return payload.getNextPageToken();
            }

            @Override
            public Iterable<Account> extractResources(ListAccountsResponse payload) {
              return payload.getAccountsList() == null
                  ? ImmutableList.<Account>of()
                  : payload.getAccountsList();
            }
          };

  private static final PagedListDescriptor<
          ListAccountSummariesRequest, ListAccountSummariesResponse, AccountSummary>
      LIST_ACCOUNT_SUMMARIES_PAGE_STR_DESC =
          new PagedListDescriptor<
              ListAccountSummariesRequest, ListAccountSummariesResponse, AccountSummary>() {
            @Override
            public String emptyToken() {
              return "";
            }

            @Override
            public ListAccountSummariesRequest injectToken(
                ListAccountSummariesRequest payload, String token) {
              return ListAccountSummariesRequest.newBuilder(payload).setPageToken(token).build();
            }

            @Override
            public ListAccountSummariesRequest injectPageSize(
                ListAccountSummariesRequest payload, int pageSize) {
              return ListAccountSummariesRequest.newBuilder(payload).setPageSize(pageSize).build();
            }

            @Override
            public Integer extractPageSize(ListAccountSummariesRequest payload) {
              return payload.getPageSize();
            }

            @Override
            public String extractNextToken(ListAccountSummariesResponse payload) {
              return payload.getNextPageToken();
            }

            @Override
            public Iterable<AccountSummary> extractResources(ListAccountSummariesResponse payload) {
              return payload.getAccountSummariesList() == null
                  ? ImmutableList.<AccountSummary>of()
                  : payload.getAccountSummariesList();
            }
          };

  private static final PagedListDescriptor<ListPropertiesRequest, ListPropertiesResponse, Property>
      LIST_PROPERTIES_PAGE_STR_DESC =
          new PagedListDescriptor<ListPropertiesRequest, ListPropertiesResponse, Property>() {
            @Override
            public String emptyToken() {
              return "";
            }

            @Override
            public ListPropertiesRequest injectToken(ListPropertiesRequest payload, String token) {
              return ListPropertiesRequest.newBuilder(payload).setPageToken(token).build();
            }

            @Override
            public ListPropertiesRequest injectPageSize(
                ListPropertiesRequest payload, int pageSize) {
              return ListPropertiesRequest.newBuilder(payload).setPageSize(pageSize).build();
            }

            @Override
            public Integer extractPageSize(ListPropertiesRequest payload) {
              return payload.getPageSize();
            }

            @Override
            public String extractNextToken(ListPropertiesResponse payload) {
              return payload.getNextPageToken();
            }

            @Override
            public Iterable<Property> extractResources(ListPropertiesResponse payload) {
              return payload.getPropertiesList() == null
                  ? ImmutableList.<Property>of()
                  : payload.getPropertiesList();
            }
          };

  private static final PagedListDescriptor<ListUserLinksRequest, ListUserLinksResponse, UserLink>
      LIST_USER_LINKS_PAGE_STR_DESC =
          new PagedListDescriptor<ListUserLinksRequest, ListUserLinksResponse, UserLink>() {
            @Override
            public String emptyToken() {
              return "";
            }

            @Override
            public ListUserLinksRequest injectToken(ListUserLinksRequest payload, String token) {
              return ListUserLinksRequest.newBuilder(payload).setPageToken(token).build();
            }

            @Override
            public ListUserLinksRequest injectPageSize(ListUserLinksRequest payload, int pageSize) {
              return ListUserLinksRequest.newBuilder(payload).setPageSize(pageSize).build();
            }

            @Override
            public Integer extractPageSize(ListUserLinksRequest payload) {
              return payload.getPageSize();
            }

            @Override
            public String extractNextToken(ListUserLinksResponse payload) {
              return payload.getNextPageToken();
            }

            @Override
            public Iterable<UserLink> extractResources(ListUserLinksResponse payload) {
              return payload.getUserLinksList() == null
                  ? ImmutableList.<UserLink>of()
                  : payload.getUserLinksList();
            }
          };

  private static final PagedListDescriptor<
          AuditUserLinksRequest, AuditUserLinksResponse, AuditUserLink>
      AUDIT_USER_LINKS_PAGE_STR_DESC =
          new PagedListDescriptor<AuditUserLinksRequest, AuditUserLinksResponse, AuditUserLink>() {
            @Override
            public String emptyToken() {
              return "";
            }

            @Override
            public AuditUserLinksRequest injectToken(AuditUserLinksRequest payload, String token) {
              return AuditUserLinksRequest.newBuilder(payload).setPageToken(token).build();
            }

            @Override
            public AuditUserLinksRequest injectPageSize(
                AuditUserLinksRequest payload, int pageSize) {
              return AuditUserLinksRequest.newBuilder(payload).setPageSize(pageSize).build();
            }

            @Override
            public Integer extractPageSize(AuditUserLinksRequest payload) {
              return payload.getPageSize();
            }

            @Override
            public String extractNextToken(AuditUserLinksResponse payload) {
              return payload.getNextPageToken();
            }

            @Override
            public Iterable<AuditUserLink> extractResources(AuditUserLinksResponse payload) {
              return payload.getUserLinksList() == null
                  ? ImmutableList.<AuditUserLink>of()
                  : payload.getUserLinksList();
            }
          };

  private static final PagedListDescriptor<
          ListWebDataStreamsRequest, ListWebDataStreamsResponse, WebDataStream>
      LIST_WEB_DATA_STREAMS_PAGE_STR_DESC =
          new PagedListDescriptor<
              ListWebDataStreamsRequest, ListWebDataStreamsResponse, WebDataStream>() {
            @Override
            public String emptyToken() {
              return "";
            }

            @Override
            public ListWebDataStreamsRequest injectToken(
                ListWebDataStreamsRequest payload, String token) {
              return ListWebDataStreamsRequest.newBuilder(payload).setPageToken(token).build();
            }

            @Override
            public ListWebDataStreamsRequest injectPageSize(
                ListWebDataStreamsRequest payload, int pageSize) {
              return ListWebDataStreamsRequest.newBuilder(payload).setPageSize(pageSize).build();
            }

            @Override
            public Integer extractPageSize(ListWebDataStreamsRequest payload) {
              return payload.getPageSize();
            }

            @Override
            public String extractNextToken(ListWebDataStreamsResponse payload) {
              return payload.getNextPageToken();
            }

            @Override
            public Iterable<WebDataStream> extractResources(ListWebDataStreamsResponse payload) {
              return payload.getWebDataStreamsList() == null
                  ? ImmutableList.<WebDataStream>of()
                  : payload.getWebDataStreamsList();
            }
          };

  private static final PagedListDescriptor<
          ListIosAppDataStreamsRequest, ListIosAppDataStreamsResponse, IosAppDataStream>
      LIST_IOS_APP_DATA_STREAMS_PAGE_STR_DESC =
          new PagedListDescriptor<
              ListIosAppDataStreamsRequest, ListIosAppDataStreamsResponse, IosAppDataStream>() {
            @Override
            public String emptyToken() {
              return "";
            }

            @Override
            public ListIosAppDataStreamsRequest injectToken(
                ListIosAppDataStreamsRequest payload, String token) {
              return ListIosAppDataStreamsRequest.newBuilder(payload).setPageToken(token).build();
            }

            @Override
            public ListIosAppDataStreamsRequest injectPageSize(
                ListIosAppDataStreamsRequest payload, int pageSize) {
              return ListIosAppDataStreamsRequest.newBuilder(payload).setPageSize(pageSize).build();
            }

            @Override
            public Integer extractPageSize(ListIosAppDataStreamsRequest payload) {
              return payload.getPageSize();
            }

            @Override
            public String extractNextToken(ListIosAppDataStreamsResponse payload) {
              return payload.getNextPageToken();
            }

            @Override
            public Iterable<IosAppDataStream> extractResources(
                ListIosAppDataStreamsResponse payload) {
              return payload.getIosAppDataStreamsList() == null
                  ? ImmutableList.<IosAppDataStream>of()
                  : payload.getIosAppDataStreamsList();
            }
          };

  private static final PagedListDescriptor<
          ListAndroidAppDataStreamsRequest, ListAndroidAppDataStreamsResponse, AndroidAppDataStream>
      LIST_ANDROID_APP_DATA_STREAMS_PAGE_STR_DESC =
          new PagedListDescriptor<
              ListAndroidAppDataStreamsRequest,
              ListAndroidAppDataStreamsResponse,
              AndroidAppDataStream>() {
            @Override
            public String emptyToken() {
              return "";
            }

            @Override
            public ListAndroidAppDataStreamsRequest injectToken(
                ListAndroidAppDataStreamsRequest payload, String token) {
              return ListAndroidAppDataStreamsRequest.newBuilder(payload)
                  .setPageToken(token)
                  .build();
            }

            @Override
            public ListAndroidAppDataStreamsRequest injectPageSize(
                ListAndroidAppDataStreamsRequest payload, int pageSize) {
              return ListAndroidAppDataStreamsRequest.newBuilder(payload)
                  .setPageSize(pageSize)
                  .build();
            }

            @Override
            public Integer extractPageSize(ListAndroidAppDataStreamsRequest payload) {
              return payload.getPageSize();
            }

            @Override
            public String extractNextToken(ListAndroidAppDataStreamsResponse payload) {
              return payload.getNextPageToken();
            }

            @Override
            public Iterable<AndroidAppDataStream> extractResources(
                ListAndroidAppDataStreamsResponse payload) {
              return payload.getAndroidAppDataStreamsList() == null
                  ? ImmutableList.<AndroidAppDataStream>of()
                  : payload.getAndroidAppDataStreamsList();
            }
          };

  private static final PagedListDescriptor<
          ListFirebaseLinksRequest, ListFirebaseLinksResponse, FirebaseLink>
      LIST_FIREBASE_LINKS_PAGE_STR_DESC =
          new PagedListDescriptor<
              ListFirebaseLinksRequest, ListFirebaseLinksResponse, FirebaseLink>() {
            @Override
            public String emptyToken() {
              return "";
            }

            @Override
            public ListFirebaseLinksRequest injectToken(
                ListFirebaseLinksRequest payload, String token) {
              return ListFirebaseLinksRequest.newBuilder(payload).setPageToken(token).build();
            }

            @Override
            public ListFirebaseLinksRequest injectPageSize(
                ListFirebaseLinksRequest payload, int pageSize) {
              return ListFirebaseLinksRequest.newBuilder(payload).setPageSize(pageSize).build();
            }

            @Override
            public Integer extractPageSize(ListFirebaseLinksRequest payload) {
              return payload.getPageSize();
            }

            @Override
            public String extractNextToken(ListFirebaseLinksResponse payload) {
              return payload.getNextPageToken();
            }

            @Override
            public Iterable<FirebaseLink> extractResources(ListFirebaseLinksResponse payload) {
              return payload.getFirebaseLinksList() == null
                  ? ImmutableList.<FirebaseLink>of()
                  : payload.getFirebaseLinksList();
            }
          };

  private static final PagedListDescriptor<
          ListGoogleAdsLinksRequest, ListGoogleAdsLinksResponse, GoogleAdsLink>
      LIST_GOOGLE_ADS_LINKS_PAGE_STR_DESC =
          new PagedListDescriptor<
              ListGoogleAdsLinksRequest, ListGoogleAdsLinksResponse, GoogleAdsLink>() {
            @Override
            public String emptyToken() {
              return "";
            }

            @Override
            public ListGoogleAdsLinksRequest injectToken(
                ListGoogleAdsLinksRequest payload, String token) {
              return ListGoogleAdsLinksRequest.newBuilder(payload).setPageToken(token).build();
            }

            @Override
            public ListGoogleAdsLinksRequest injectPageSize(
                ListGoogleAdsLinksRequest payload, int pageSize) {
              return ListGoogleAdsLinksRequest.newBuilder(payload).setPageSize(pageSize).build();
            }

            @Override
            public Integer extractPageSize(ListGoogleAdsLinksRequest payload) {
              return payload.getPageSize();
            }

            @Override
            public String extractNextToken(ListGoogleAdsLinksResponse payload) {
              return payload.getNextPageToken();
            }

            @Override
            public Iterable<GoogleAdsLink> extractResources(ListGoogleAdsLinksResponse payload) {
              return payload.getGoogleAdsLinksList() == null
                  ? ImmutableList.<GoogleAdsLink>of()
                  : payload.getGoogleAdsLinksList();
            }
          };

  private static final PagedListDescriptor<
          ListMeasurementProtocolSecretsRequest,
          ListMeasurementProtocolSecretsResponse,
          MeasurementProtocolSecret>
      LIST_MEASUREMENT_PROTOCOL_SECRETS_PAGE_STR_DESC =
          new PagedListDescriptor<
              ListMeasurementProtocolSecretsRequest,
              ListMeasurementProtocolSecretsResponse,
              MeasurementProtocolSecret>() {
            @Override
            public String emptyToken() {
              return "";
            }

            @Override
            public ListMeasurementProtocolSecretsRequest injectToken(
                ListMeasurementProtocolSecretsRequest payload, String token) {
              return ListMeasurementProtocolSecretsRequest.newBuilder(payload)
                  .setPageToken(token)
                  .build();
            }

            @Override
            public ListMeasurementProtocolSecretsRequest injectPageSize(
                ListMeasurementProtocolSecretsRequest payload, int pageSize) {
              return ListMeasurementProtocolSecretsRequest.newBuilder(payload)
                  .setPageSize(pageSize)
                  .build();
            }

            @Override
            public Integer extractPageSize(ListMeasurementProtocolSecretsRequest payload) {
              return payload.getPageSize();
            }

            @Override
            public String extractNextToken(ListMeasurementProtocolSecretsResponse payload) {
              return payload.getNextPageToken();
            }

            @Override
            public Iterable<MeasurementProtocolSecret> extractResources(
                ListMeasurementProtocolSecretsResponse payload) {
              return payload.getMeasurementProtocolSecretsList() == null
                  ? ImmutableList.<MeasurementProtocolSecret>of()
                  : payload.getMeasurementProtocolSecretsList();
            }
          };

  private static final PagedListDescriptor<
          SearchChangeHistoryEventsRequest, SearchChangeHistoryEventsResponse, ChangeHistoryEvent>
      SEARCH_CHANGE_HISTORY_EVENTS_PAGE_STR_DESC =
          new PagedListDescriptor<
              SearchChangeHistoryEventsRequest,
              SearchChangeHistoryEventsResponse,
              ChangeHistoryEvent>() {
            @Override
            public String emptyToken() {
              return "";
            }

            @Override
            public SearchChangeHistoryEventsRequest injectToken(
                SearchChangeHistoryEventsRequest payload, String token) {
              return SearchChangeHistoryEventsRequest.newBuilder(payload)
                  .setPageToken(token)
                  .build();
            }

            @Override
            public SearchChangeHistoryEventsRequest injectPageSize(
                SearchChangeHistoryEventsRequest payload, int pageSize) {
              return SearchChangeHistoryEventsRequest.newBuilder(payload)
                  .setPageSize(pageSize)
                  .build();
            }

            @Override
            public Integer extractPageSize(SearchChangeHistoryEventsRequest payload) {
              return payload.getPageSize();
            }

            @Override
            public String extractNextToken(SearchChangeHistoryEventsResponse payload) {
              return payload.getNextPageToken();
            }

            @Override
            public Iterable<ChangeHistoryEvent> extractResources(
                SearchChangeHistoryEventsResponse payload) {
              return payload.getChangeHistoryEventsList() == null
                  ? ImmutableList.<ChangeHistoryEvent>of()
                  : payload.getChangeHistoryEventsList();
            }
          };

  private static final PagedListDescriptor<
          ListConversionEventsRequest, ListConversionEventsResponse, ConversionEvent>
      LIST_CONVERSION_EVENTS_PAGE_STR_DESC =
          new PagedListDescriptor<
              ListConversionEventsRequest, ListConversionEventsResponse, ConversionEvent>() {
            @Override
            public String emptyToken() {
              return "";
            }

            @Override
            public ListConversionEventsRequest injectToken(
                ListConversionEventsRequest payload, String token) {
              return ListConversionEventsRequest.newBuilder(payload).setPageToken(token).build();
            }

            @Override
            public ListConversionEventsRequest injectPageSize(
                ListConversionEventsRequest payload, int pageSize) {
              return ListConversionEventsRequest.newBuilder(payload).setPageSize(pageSize).build();
            }

            @Override
            public Integer extractPageSize(ListConversionEventsRequest payload) {
              return payload.getPageSize();
            }

            @Override
            public String extractNextToken(ListConversionEventsResponse payload) {
              return payload.getNextPageToken();
            }

            @Override
            public Iterable<ConversionEvent> extractResources(
                ListConversionEventsResponse payload) {
              return payload.getConversionEventsList() == null
                  ? ImmutableList.<ConversionEvent>of()
                  : payload.getConversionEventsList();
            }
          };

  private static final PagedListDescriptor<
          ListCustomDimensionsRequest, ListCustomDimensionsResponse, CustomDimension>
      LIST_CUSTOM_DIMENSIONS_PAGE_STR_DESC =
          new PagedListDescriptor<
              ListCustomDimensionsRequest, ListCustomDimensionsResponse, CustomDimension>() {
            @Override
            public String emptyToken() {
              return "";
            }

            @Override
            public ListCustomDimensionsRequest injectToken(
                ListCustomDimensionsRequest payload, String token) {
              return ListCustomDimensionsRequest.newBuilder(payload).setPageToken(token).build();
            }

            @Override
            public ListCustomDimensionsRequest injectPageSize(
                ListCustomDimensionsRequest payload, int pageSize) {
              return ListCustomDimensionsRequest.newBuilder(payload).setPageSize(pageSize).build();
            }

            @Override
            public Integer extractPageSize(ListCustomDimensionsRequest payload) {
              return payload.getPageSize();
            }

            @Override
            public String extractNextToken(ListCustomDimensionsResponse payload) {
              return payload.getNextPageToken();
            }

            @Override
            public Iterable<CustomDimension> extractResources(
                ListCustomDimensionsResponse payload) {
              return payload.getCustomDimensionsList() == null
                  ? ImmutableList.<CustomDimension>of()
                  : payload.getCustomDimensionsList();
            }
          };

  private static final PagedListDescriptor<
          ListCustomMetricsRequest, ListCustomMetricsResponse, CustomMetric>
      LIST_CUSTOM_METRICS_PAGE_STR_DESC =
          new PagedListDescriptor<
              ListCustomMetricsRequest, ListCustomMetricsResponse, CustomMetric>() {
            @Override
            public String emptyToken() {
              return "";
            }

            @Override
            public ListCustomMetricsRequest injectToken(
                ListCustomMetricsRequest payload, String token) {
              return ListCustomMetricsRequest.newBuilder(payload).setPageToken(token).build();
            }

            @Override
            public ListCustomMetricsRequest injectPageSize(
                ListCustomMetricsRequest payload, int pageSize) {
              return ListCustomMetricsRequest.newBuilder(payload).setPageSize(pageSize).build();
            }

            @Override
            public Integer extractPageSize(ListCustomMetricsRequest payload) {
              return payload.getPageSize();
            }

            @Override
            public String extractNextToken(ListCustomMetricsResponse payload) {
              return payload.getNextPageToken();
            }

            @Override
            public Iterable<CustomMetric> extractResources(ListCustomMetricsResponse payload) {
              return payload.getCustomMetricsList() == null
                  ? ImmutableList.<CustomMetric>of()
                  : payload.getCustomMetricsList();
            }
          };

  private static final PagedListResponseFactory<
          ListAccountsRequest, ListAccountsResponse, ListAccountsPagedResponse>
      LIST_ACCOUNTS_PAGE_STR_FACT =
          new PagedListResponseFactory<
              ListAccountsRequest, ListAccountsResponse, ListAccountsPagedResponse>() {
            @Override
            public ApiFuture<ListAccountsPagedResponse> getFuturePagedResponse(
                UnaryCallable<ListAccountsRequest, ListAccountsResponse> callable,
                ListAccountsRequest request,
                ApiCallContext context,
                ApiFuture<ListAccountsResponse> futureResponse) {
              PageContext<ListAccountsRequest, ListAccountsResponse, Account> pageContext =
                  PageContext.create(callable, LIST_ACCOUNTS_PAGE_STR_DESC, request, context);
              return ListAccountsPagedResponse.createAsync(pageContext, futureResponse);
            }
          };

  private static final PagedListResponseFactory<
          ListAccountSummariesRequest,
          ListAccountSummariesResponse,
          ListAccountSummariesPagedResponse>
      LIST_ACCOUNT_SUMMARIES_PAGE_STR_FACT =
          new PagedListResponseFactory<
              ListAccountSummariesRequest,
              ListAccountSummariesResponse,
              ListAccountSummariesPagedResponse>() {
            @Override
            public ApiFuture<ListAccountSummariesPagedResponse> getFuturePagedResponse(
                UnaryCallable<ListAccountSummariesRequest, ListAccountSummariesResponse> callable,
                ListAccountSummariesRequest request,
                ApiCallContext context,
                ApiFuture<ListAccountSummariesResponse> futureResponse) {
              PageContext<ListAccountSummariesRequest, ListAccountSummariesResponse, AccountSummary>
                  pageContext =
                      PageContext.create(
                          callable, LIST_ACCOUNT_SUMMARIES_PAGE_STR_DESC, request, context);
              return ListAccountSummariesPagedResponse.createAsync(pageContext, futureResponse);
            }
          };

  private static final PagedListResponseFactory<
          ListPropertiesRequest, ListPropertiesResponse, ListPropertiesPagedResponse>
      LIST_PROPERTIES_PAGE_STR_FACT =
          new PagedListResponseFactory<
              ListPropertiesRequest, ListPropertiesResponse, ListPropertiesPagedResponse>() {
            @Override
            public ApiFuture<ListPropertiesPagedResponse> getFuturePagedResponse(
                UnaryCallable<ListPropertiesRequest, ListPropertiesResponse> callable,
                ListPropertiesRequest request,
                ApiCallContext context,
                ApiFuture<ListPropertiesResponse> futureResponse) {
              PageContext<ListPropertiesRequest, ListPropertiesResponse, Property> pageContext =
                  PageContext.create(callable, LIST_PROPERTIES_PAGE_STR_DESC, request, context);
              return ListPropertiesPagedResponse.createAsync(pageContext, futureResponse);
            }
          };

  private static final PagedListResponseFactory<
          ListUserLinksRequest, ListUserLinksResponse, ListUserLinksPagedResponse>
      LIST_USER_LINKS_PAGE_STR_FACT =
          new PagedListResponseFactory<
              ListUserLinksRequest, ListUserLinksResponse, ListUserLinksPagedResponse>() {
            @Override
            public ApiFuture<ListUserLinksPagedResponse> getFuturePagedResponse(
                UnaryCallable<ListUserLinksRequest, ListUserLinksResponse> callable,
                ListUserLinksRequest request,
                ApiCallContext context,
                ApiFuture<ListUserLinksResponse> futureResponse) {
              PageContext<ListUserLinksRequest, ListUserLinksResponse, UserLink> pageContext =
                  PageContext.create(callable, LIST_USER_LINKS_PAGE_STR_DESC, request, context);
              return ListUserLinksPagedResponse.createAsync(pageContext, futureResponse);
            }
          };

  private static final PagedListResponseFactory<
          AuditUserLinksRequest, AuditUserLinksResponse, AuditUserLinksPagedResponse>
      AUDIT_USER_LINKS_PAGE_STR_FACT =
          new PagedListResponseFactory<
              AuditUserLinksRequest, AuditUserLinksResponse, AuditUserLinksPagedResponse>() {
            @Override
            public ApiFuture<AuditUserLinksPagedResponse> getFuturePagedResponse(
                UnaryCallable<AuditUserLinksRequest, AuditUserLinksResponse> callable,
                AuditUserLinksRequest request,
                ApiCallContext context,
                ApiFuture<AuditUserLinksResponse> futureResponse) {
              PageContext<AuditUserLinksRequest, AuditUserLinksResponse, AuditUserLink>
                  pageContext =
                      PageContext.create(
                          callable, AUDIT_USER_LINKS_PAGE_STR_DESC, request, context);
              return AuditUserLinksPagedResponse.createAsync(pageContext, futureResponse);
            }
          };

  private static final PagedListResponseFactory<
          ListWebDataStreamsRequest, ListWebDataStreamsResponse, ListWebDataStreamsPagedResponse>
      LIST_WEB_DATA_STREAMS_PAGE_STR_FACT =
          new PagedListResponseFactory<
              ListWebDataStreamsRequest,
              ListWebDataStreamsResponse,
              ListWebDataStreamsPagedResponse>() {
            @Override
            public ApiFuture<ListWebDataStreamsPagedResponse> getFuturePagedResponse(
                UnaryCallable<ListWebDataStreamsRequest, ListWebDataStreamsResponse> callable,
                ListWebDataStreamsRequest request,
                ApiCallContext context,
                ApiFuture<ListWebDataStreamsResponse> futureResponse) {
              PageContext<ListWebDataStreamsRequest, ListWebDataStreamsResponse, WebDataStream>
                  pageContext =
                      PageContext.create(
                          callable, LIST_WEB_DATA_STREAMS_PAGE_STR_DESC, request, context);
              return ListWebDataStreamsPagedResponse.createAsync(pageContext, futureResponse);
            }
          };

  private static final PagedListResponseFactory<
          ListIosAppDataStreamsRequest,
          ListIosAppDataStreamsResponse,
          ListIosAppDataStreamsPagedResponse>
      LIST_IOS_APP_DATA_STREAMS_PAGE_STR_FACT =
          new PagedListResponseFactory<
              ListIosAppDataStreamsRequest,
              ListIosAppDataStreamsResponse,
              ListIosAppDataStreamsPagedResponse>() {
            @Override
            public ApiFuture<ListIosAppDataStreamsPagedResponse> getFuturePagedResponse(
                UnaryCallable<ListIosAppDataStreamsRequest, ListIosAppDataStreamsResponse> callable,
                ListIosAppDataStreamsRequest request,
                ApiCallContext context,
                ApiFuture<ListIosAppDataStreamsResponse> futureResponse) {
              PageContext<
                      ListIosAppDataStreamsRequest, ListIosAppDataStreamsResponse, IosAppDataStream>
                  pageContext =
                      PageContext.create(
                          callable, LIST_IOS_APP_DATA_STREAMS_PAGE_STR_DESC, request, context);
              return ListIosAppDataStreamsPagedResponse.createAsync(pageContext, futureResponse);
            }
          };

  private static final PagedListResponseFactory<
          ListAndroidAppDataStreamsRequest,
          ListAndroidAppDataStreamsResponse,
          ListAndroidAppDataStreamsPagedResponse>
      LIST_ANDROID_APP_DATA_STREAMS_PAGE_STR_FACT =
          new PagedListResponseFactory<
              ListAndroidAppDataStreamsRequest,
              ListAndroidAppDataStreamsResponse,
              ListAndroidAppDataStreamsPagedResponse>() {
            @Override
            public ApiFuture<ListAndroidAppDataStreamsPagedResponse> getFuturePagedResponse(
                UnaryCallable<ListAndroidAppDataStreamsRequest, ListAndroidAppDataStreamsResponse>
                    callable,
                ListAndroidAppDataStreamsRequest request,
                ApiCallContext context,
                ApiFuture<ListAndroidAppDataStreamsResponse> futureResponse) {
              PageContext<
                      ListAndroidAppDataStreamsRequest,
                      ListAndroidAppDataStreamsResponse,
                      AndroidAppDataStream>
                  pageContext =
                      PageContext.create(
                          callable, LIST_ANDROID_APP_DATA_STREAMS_PAGE_STR_DESC, request, context);
              return ListAndroidAppDataStreamsPagedResponse.createAsync(
                  pageContext, futureResponse);
            }
          };

  private static final PagedListResponseFactory<
          ListFirebaseLinksRequest, ListFirebaseLinksResponse, ListFirebaseLinksPagedResponse>
      LIST_FIREBASE_LINKS_PAGE_STR_FACT =
          new PagedListResponseFactory<
              ListFirebaseLinksRequest,
              ListFirebaseLinksResponse,
              ListFirebaseLinksPagedResponse>() {
            @Override
            public ApiFuture<ListFirebaseLinksPagedResponse> getFuturePagedResponse(
                UnaryCallable<ListFirebaseLinksRequest, ListFirebaseLinksResponse> callable,
                ListFirebaseLinksRequest request,
                ApiCallContext context,
                ApiFuture<ListFirebaseLinksResponse> futureResponse) {
              PageContext<ListFirebaseLinksRequest, ListFirebaseLinksResponse, FirebaseLink>
                  pageContext =
                      PageContext.create(
                          callable, LIST_FIREBASE_LINKS_PAGE_STR_DESC, request, context);
              return ListFirebaseLinksPagedResponse.createAsync(pageContext, futureResponse);
            }
          };

  private static final PagedListResponseFactory<
          ListGoogleAdsLinksRequest, ListGoogleAdsLinksResponse, ListGoogleAdsLinksPagedResponse>
      LIST_GOOGLE_ADS_LINKS_PAGE_STR_FACT =
          new PagedListResponseFactory<
              ListGoogleAdsLinksRequest,
              ListGoogleAdsLinksResponse,
              ListGoogleAdsLinksPagedResponse>() {
            @Override
            public ApiFuture<ListGoogleAdsLinksPagedResponse> getFuturePagedResponse(
                UnaryCallable<ListGoogleAdsLinksRequest, ListGoogleAdsLinksResponse> callable,
                ListGoogleAdsLinksRequest request,
                ApiCallContext context,
                ApiFuture<ListGoogleAdsLinksResponse> futureResponse) {
              PageContext<ListGoogleAdsLinksRequest, ListGoogleAdsLinksResponse, GoogleAdsLink>
                  pageContext =
                      PageContext.create(
                          callable, LIST_GOOGLE_ADS_LINKS_PAGE_STR_DESC, request, context);
              return ListGoogleAdsLinksPagedResponse.createAsync(pageContext, futureResponse);
            }
          };

  private static final PagedListResponseFactory<
          ListMeasurementProtocolSecretsRequest,
          ListMeasurementProtocolSecretsResponse,
          ListMeasurementProtocolSecretsPagedResponse>
      LIST_MEASUREMENT_PROTOCOL_SECRETS_PAGE_STR_FACT =
          new PagedListResponseFactory<
              ListMeasurementProtocolSecretsRequest,
              ListMeasurementProtocolSecretsResponse,
              ListMeasurementProtocolSecretsPagedResponse>() {
            @Override
            public ApiFuture<ListMeasurementProtocolSecretsPagedResponse> getFuturePagedResponse(
                UnaryCallable<
                        ListMeasurementProtocolSecretsRequest,
                        ListMeasurementProtocolSecretsResponse>
                    callable,
                ListMeasurementProtocolSecretsRequest request,
                ApiCallContext context,
                ApiFuture<ListMeasurementProtocolSecretsResponse> futureResponse) {
              PageContext<
                      ListMeasurementProtocolSecretsRequest,
                      ListMeasurementProtocolSecretsResponse,
                      MeasurementProtocolSecret>
                  pageContext =
                      PageContext.create(
                          callable,
                          LIST_MEASUREMENT_PROTOCOL_SECRETS_PAGE_STR_DESC,
                          request,
                          context);
              return ListMeasurementProtocolSecretsPagedResponse.createAsync(
                  pageContext, futureResponse);
            }
          };

  private static final PagedListResponseFactory<
          SearchChangeHistoryEventsRequest,
          SearchChangeHistoryEventsResponse,
          SearchChangeHistoryEventsPagedResponse>
      SEARCH_CHANGE_HISTORY_EVENTS_PAGE_STR_FACT =
          new PagedListResponseFactory<
              SearchChangeHistoryEventsRequest,
              SearchChangeHistoryEventsResponse,
              SearchChangeHistoryEventsPagedResponse>() {
            @Override
            public ApiFuture<SearchChangeHistoryEventsPagedResponse> getFuturePagedResponse(
                UnaryCallable<SearchChangeHistoryEventsRequest, SearchChangeHistoryEventsResponse>
                    callable,
                SearchChangeHistoryEventsRequest request,
                ApiCallContext context,
                ApiFuture<SearchChangeHistoryEventsResponse> futureResponse) {
              PageContext<
                      SearchChangeHistoryEventsRequest,
                      SearchChangeHistoryEventsResponse,
                      ChangeHistoryEvent>
                  pageContext =
                      PageContext.create(
                          callable, SEARCH_CHANGE_HISTORY_EVENTS_PAGE_STR_DESC, request, context);
              return SearchChangeHistoryEventsPagedResponse.createAsync(
                  pageContext, futureResponse);
            }
          };

  private static final PagedListResponseFactory<
          ListConversionEventsRequest,
          ListConversionEventsResponse,
          ListConversionEventsPagedResponse>
      LIST_CONVERSION_EVENTS_PAGE_STR_FACT =
          new PagedListResponseFactory<
              ListConversionEventsRequest,
              ListConversionEventsResponse,
              ListConversionEventsPagedResponse>() {
            @Override
            public ApiFuture<ListConversionEventsPagedResponse> getFuturePagedResponse(
                UnaryCallable<ListConversionEventsRequest, ListConversionEventsResponse> callable,
                ListConversionEventsRequest request,
                ApiCallContext context,
                ApiFuture<ListConversionEventsResponse> futureResponse) {
              PageContext<
                      ListConversionEventsRequest, ListConversionEventsResponse, ConversionEvent>
                  pageContext =
                      PageContext.create(
                          callable, LIST_CONVERSION_EVENTS_PAGE_STR_DESC, request, context);
              return ListConversionEventsPagedResponse.createAsync(pageContext, futureResponse);
            }
          };

  private static final PagedListResponseFactory<
          ListCustomDimensionsRequest,
          ListCustomDimensionsResponse,
          ListCustomDimensionsPagedResponse>
      LIST_CUSTOM_DIMENSIONS_PAGE_STR_FACT =
          new PagedListResponseFactory<
              ListCustomDimensionsRequest,
              ListCustomDimensionsResponse,
              ListCustomDimensionsPagedResponse>() {
            @Override
            public ApiFuture<ListCustomDimensionsPagedResponse> getFuturePagedResponse(
                UnaryCallable<ListCustomDimensionsRequest, ListCustomDimensionsResponse> callable,
                ListCustomDimensionsRequest request,
                ApiCallContext context,
                ApiFuture<ListCustomDimensionsResponse> futureResponse) {
              PageContext<
                      ListCustomDimensionsRequest, ListCustomDimensionsResponse, CustomDimension>
                  pageContext =
                      PageContext.create(
                          callable, LIST_CUSTOM_DIMENSIONS_PAGE_STR_DESC, request, context);
              return ListCustomDimensionsPagedResponse.createAsync(pageContext, futureResponse);
            }
          };

  private static final PagedListResponseFactory<
          ListCustomMetricsRequest, ListCustomMetricsResponse, ListCustomMetricsPagedResponse>
      LIST_CUSTOM_METRICS_PAGE_STR_FACT =
          new PagedListResponseFactory<
              ListCustomMetricsRequest,
              ListCustomMetricsResponse,
              ListCustomMetricsPagedResponse>() {
            @Override
            public ApiFuture<ListCustomMetricsPagedResponse> getFuturePagedResponse(
                UnaryCallable<ListCustomMetricsRequest, ListCustomMetricsResponse> callable,
                ListCustomMetricsRequest request,
                ApiCallContext context,
                ApiFuture<ListCustomMetricsResponse> futureResponse) {
              PageContext<ListCustomMetricsRequest, ListCustomMetricsResponse, CustomMetric>
                  pageContext =
                      PageContext.create(
                          callable, LIST_CUSTOM_METRICS_PAGE_STR_DESC, request, context);
              return ListCustomMetricsPagedResponse.createAsync(pageContext, futureResponse);
            }
          };

  /** Returns the object with the settings used for calls to getAccount. */
  public UnaryCallSettings<GetAccountRequest, Account> getAccountSettings() {
    return getAccountSettings;
  }

  /** Returns the object with the settings used for calls to listAccounts. */
  public PagedCallSettings<ListAccountsRequest, ListAccountsResponse, ListAccountsPagedResponse>
      listAccountsSettings() {
    return listAccountsSettings;
  }

  /** Returns the object with the settings used for calls to deleteAccount. */
  public UnaryCallSettings<DeleteAccountRequest, Empty> deleteAccountSettings() {
    return deleteAccountSettings;
  }

  /** Returns the object with the settings used for calls to updateAccount. */
  public UnaryCallSettings<UpdateAccountRequest, Account> updateAccountSettings() {
    return updateAccountSettings;
  }

  /** Returns the object with the settings used for calls to provisionAccountTicket. */
  public UnaryCallSettings<ProvisionAccountTicketRequest, ProvisionAccountTicketResponse>
      provisionAccountTicketSettings() {
    return provisionAccountTicketSettings;
  }

  /** Returns the object with the settings used for calls to listAccountSummaries. */
  public PagedCallSettings<
          ListAccountSummariesRequest,
          ListAccountSummariesResponse,
          ListAccountSummariesPagedResponse>
      listAccountSummariesSettings() {
    return listAccountSummariesSettings;
  }

  /** Returns the object with the settings used for calls to getProperty. */
  public UnaryCallSettings<GetPropertyRequest, Property> getPropertySettings() {
    return getPropertySettings;
  }

  /** Returns the object with the settings used for calls to listProperties. */
  public PagedCallSettings<
          ListPropertiesRequest, ListPropertiesResponse, ListPropertiesPagedResponse>
      listPropertiesSettings() {
    return listPropertiesSettings;
  }

  /** Returns the object with the settings used for calls to createProperty. */
  public UnaryCallSettings<CreatePropertyRequest, Property> createPropertySettings() {
    return createPropertySettings;
  }

  /** Returns the object with the settings used for calls to deleteProperty. */
  public UnaryCallSettings<DeletePropertyRequest, Property> deletePropertySettings() {
    return deletePropertySettings;
  }

  /** Returns the object with the settings used for calls to updateProperty. */
  public UnaryCallSettings<UpdatePropertyRequest, Property> updatePropertySettings() {
    return updatePropertySettings;
  }

  /** Returns the object with the settings used for calls to getUserLink. */
  public UnaryCallSettings<GetUserLinkRequest, UserLink> getUserLinkSettings() {
    return getUserLinkSettings;
  }

  /** Returns the object with the settings used for calls to batchGetUserLinks. */
  public UnaryCallSettings<BatchGetUserLinksRequest, BatchGetUserLinksResponse>
      batchGetUserLinksSettings() {
    return batchGetUserLinksSettings;
  }

  /** Returns the object with the settings used for calls to listUserLinks. */
  public PagedCallSettings<ListUserLinksRequest, ListUserLinksResponse, ListUserLinksPagedResponse>
      listUserLinksSettings() {
    return listUserLinksSettings;
  }

  /** Returns the object with the settings used for calls to auditUserLinks. */
  public PagedCallSettings<
          AuditUserLinksRequest, AuditUserLinksResponse, AuditUserLinksPagedResponse>
      auditUserLinksSettings() {
    return auditUserLinksSettings;
  }

  /** Returns the object with the settings used for calls to createUserLink. */
  public UnaryCallSettings<CreateUserLinkRequest, UserLink> createUserLinkSettings() {
    return createUserLinkSettings;
  }

  /** Returns the object with the settings used for calls to batchCreateUserLinks. */
  public UnaryCallSettings<BatchCreateUserLinksRequest, BatchCreateUserLinksResponse>
      batchCreateUserLinksSettings() {
    return batchCreateUserLinksSettings;
  }

  /** Returns the object with the settings used for calls to updateUserLink. */
  public UnaryCallSettings<UpdateUserLinkRequest, UserLink> updateUserLinkSettings() {
    return updateUserLinkSettings;
  }

  /** Returns the object with the settings used for calls to batchUpdateUserLinks. */
  public UnaryCallSettings<BatchUpdateUserLinksRequest, BatchUpdateUserLinksResponse>
      batchUpdateUserLinksSettings() {
    return batchUpdateUserLinksSettings;
  }

  /** Returns the object with the settings used for calls to deleteUserLink. */
  public UnaryCallSettings<DeleteUserLinkRequest, Empty> deleteUserLinkSettings() {
    return deleteUserLinkSettings;
  }

  /** Returns the object with the settings used for calls to batchDeleteUserLinks. */
  public UnaryCallSettings<BatchDeleteUserLinksRequest, Empty> batchDeleteUserLinksSettings() {
    return batchDeleteUserLinksSettings;
  }

  /** Returns the object with the settings used for calls to getWebDataStream. */
  public UnaryCallSettings<GetWebDataStreamRequest, WebDataStream> getWebDataStreamSettings() {
    return getWebDataStreamSettings;
  }

  /** Returns the object with the settings used for calls to deleteWebDataStream. */
  public UnaryCallSettings<DeleteWebDataStreamRequest, Empty> deleteWebDataStreamSettings() {
    return deleteWebDataStreamSettings;
  }

  /** Returns the object with the settings used for calls to updateWebDataStream. */
  public UnaryCallSettings<UpdateWebDataStreamRequest, WebDataStream>
      updateWebDataStreamSettings() {
    return updateWebDataStreamSettings;
  }

  /** Returns the object with the settings used for calls to createWebDataStream. */
  public UnaryCallSettings<CreateWebDataStreamRequest, WebDataStream>
      createWebDataStreamSettings() {
    return createWebDataStreamSettings;
  }

  /** Returns the object with the settings used for calls to listWebDataStreams. */
  public PagedCallSettings<
          ListWebDataStreamsRequest, ListWebDataStreamsResponse, ListWebDataStreamsPagedResponse>
      listWebDataStreamsSettings() {
    return listWebDataStreamsSettings;
  }

  /** Returns the object with the settings used for calls to getIosAppDataStream. */
  public UnaryCallSettings<GetIosAppDataStreamRequest, IosAppDataStream>
      getIosAppDataStreamSettings() {
    return getIosAppDataStreamSettings;
  }

  /** Returns the object with the settings used for calls to deleteIosAppDataStream. */
  public UnaryCallSettings<DeleteIosAppDataStreamRequest, Empty> deleteIosAppDataStreamSettings() {
    return deleteIosAppDataStreamSettings;
  }

  /** Returns the object with the settings used for calls to updateIosAppDataStream. */
  public UnaryCallSettings<UpdateIosAppDataStreamRequest, IosAppDataStream>
      updateIosAppDataStreamSettings() {
    return updateIosAppDataStreamSettings;
  }

  /** Returns the object with the settings used for calls to listIosAppDataStreams. */
  public PagedCallSettings<
          ListIosAppDataStreamsRequest,
          ListIosAppDataStreamsResponse,
          ListIosAppDataStreamsPagedResponse>
      listIosAppDataStreamsSettings() {
    return listIosAppDataStreamsSettings;
  }

  /** Returns the object with the settings used for calls to getAndroidAppDataStream. */
  public UnaryCallSettings<GetAndroidAppDataStreamRequest, AndroidAppDataStream>
      getAndroidAppDataStreamSettings() {
    return getAndroidAppDataStreamSettings;
  }

  /** Returns the object with the settings used for calls to deleteAndroidAppDataStream. */
  public UnaryCallSettings<DeleteAndroidAppDataStreamRequest, Empty>
      deleteAndroidAppDataStreamSettings() {
    return deleteAndroidAppDataStreamSettings;
  }

  /** Returns the object with the settings used for calls to updateAndroidAppDataStream. */
  public UnaryCallSettings<UpdateAndroidAppDataStreamRequest, AndroidAppDataStream>
      updateAndroidAppDataStreamSettings() {
    return updateAndroidAppDataStreamSettings;
  }

  /** Returns the object with the settings used for calls to listAndroidAppDataStreams. */
  public PagedCallSettings<
          ListAndroidAppDataStreamsRequest,
          ListAndroidAppDataStreamsResponse,
          ListAndroidAppDataStreamsPagedResponse>
      listAndroidAppDataStreamsSettings() {
    return listAndroidAppDataStreamsSettings;
  }

  /** Returns the object with the settings used for calls to getEnhancedMeasurementSettings. */
  public UnaryCallSettings<GetEnhancedMeasurementSettingsRequest, EnhancedMeasurementSettings>
      getEnhancedMeasurementSettingsSettings() {
    return getEnhancedMeasurementSettingsSettings;
  }

  /** Returns the object with the settings used for calls to updateEnhancedMeasurementSettings. */
  public UnaryCallSettings<UpdateEnhancedMeasurementSettingsRequest, EnhancedMeasurementSettings>
      updateEnhancedMeasurementSettingsSettings() {
    return updateEnhancedMeasurementSettingsSettings;
  }

  /** Returns the object with the settings used for calls to createFirebaseLink. */
  public UnaryCallSettings<CreateFirebaseLinkRequest, FirebaseLink> createFirebaseLinkSettings() {
    return createFirebaseLinkSettings;
  }

  /** Returns the object with the settings used for calls to updateFirebaseLink. */
  public UnaryCallSettings<UpdateFirebaseLinkRequest, FirebaseLink> updateFirebaseLinkSettings() {
    return updateFirebaseLinkSettings;
  }

  /** Returns the object with the settings used for calls to deleteFirebaseLink. */
  public UnaryCallSettings<DeleteFirebaseLinkRequest, Empty> deleteFirebaseLinkSettings() {
    return deleteFirebaseLinkSettings;
  }

  /** Returns the object with the settings used for calls to listFirebaseLinks. */
  public PagedCallSettings<
          ListFirebaseLinksRequest, ListFirebaseLinksResponse, ListFirebaseLinksPagedResponse>
      listFirebaseLinksSettings() {
    return listFirebaseLinksSettings;
  }

  /** Returns the object with the settings used for calls to getGlobalSiteTag. */
  public UnaryCallSettings<GetGlobalSiteTagRequest, GlobalSiteTag> getGlobalSiteTagSettings() {
    return getGlobalSiteTagSettings;
  }

  /** Returns the object with the settings used for calls to createGoogleAdsLink. */
  public UnaryCallSettings<CreateGoogleAdsLinkRequest, GoogleAdsLink>
      createGoogleAdsLinkSettings() {
    return createGoogleAdsLinkSettings;
  }

  /** Returns the object with the settings used for calls to updateGoogleAdsLink. */
  public UnaryCallSettings<UpdateGoogleAdsLinkRequest, GoogleAdsLink>
      updateGoogleAdsLinkSettings() {
    return updateGoogleAdsLinkSettings;
  }

  /** Returns the object with the settings used for calls to deleteGoogleAdsLink. */
  public UnaryCallSettings<DeleteGoogleAdsLinkRequest, Empty> deleteGoogleAdsLinkSettings() {
    return deleteGoogleAdsLinkSettings;
  }

  /** Returns the object with the settings used for calls to listGoogleAdsLinks. */
  public PagedCallSettings<
          ListGoogleAdsLinksRequest, ListGoogleAdsLinksResponse, ListGoogleAdsLinksPagedResponse>
      listGoogleAdsLinksSettings() {
    return listGoogleAdsLinksSettings;
  }

  /** Returns the object with the settings used for calls to getDataSharingSettings. */
  public UnaryCallSettings<GetDataSharingSettingsRequest, DataSharingSettings>
      getDataSharingSettingsSettings() {
    return getDataSharingSettingsSettings;
  }

  /** Returns the object with the settings used for calls to getMeasurementProtocolSecret. */
  public UnaryCallSettings<GetMeasurementProtocolSecretRequest, MeasurementProtocolSecret>
      getMeasurementProtocolSecretSettings() {
    return getMeasurementProtocolSecretSettings;
  }

  /** Returns the object with the settings used for calls to listMeasurementProtocolSecrets. */
  public PagedCallSettings<
          ListMeasurementProtocolSecretsRequest,
          ListMeasurementProtocolSecretsResponse,
          ListMeasurementProtocolSecretsPagedResponse>
      listMeasurementProtocolSecretsSettings() {
    return listMeasurementProtocolSecretsSettings;
  }

  /** Returns the object with the settings used for calls to createMeasurementProtocolSecret. */
  public UnaryCallSettings<CreateMeasurementProtocolSecretRequest, MeasurementProtocolSecret>
      createMeasurementProtocolSecretSettings() {
    return createMeasurementProtocolSecretSettings;
  }

  /** Returns the object with the settings used for calls to deleteMeasurementProtocolSecret. */
  public UnaryCallSettings<DeleteMeasurementProtocolSecretRequest, Empty>
      deleteMeasurementProtocolSecretSettings() {
    return deleteMeasurementProtocolSecretSettings;
  }

  /** Returns the object with the settings used for calls to updateMeasurementProtocolSecret. */
  public UnaryCallSettings<UpdateMeasurementProtocolSecretRequest, MeasurementProtocolSecret>
      updateMeasurementProtocolSecretSettings() {
    return updateMeasurementProtocolSecretSettings;
  }

  /** Returns the object with the settings used for calls to searchChangeHistoryEvents. */
  public PagedCallSettings<
          SearchChangeHistoryEventsRequest,
          SearchChangeHistoryEventsResponse,
          SearchChangeHistoryEventsPagedResponse>
      searchChangeHistoryEventsSettings() {
    return searchChangeHistoryEventsSettings;
  }

  /** Returns the object with the settings used for calls to getGoogleSignalsSettings. */
  public UnaryCallSettings<GetGoogleSignalsSettingsRequest, GoogleSignalsSettings>
      getGoogleSignalsSettingsSettings() {
    return getGoogleSignalsSettingsSettings;
  }

  /** Returns the object with the settings used for calls to updateGoogleSignalsSettings. */
  public UnaryCallSettings<UpdateGoogleSignalsSettingsRequest, GoogleSignalsSettings>
      updateGoogleSignalsSettingsSettings() {
    return updateGoogleSignalsSettingsSettings;
  }

  /** Returns the object with the settings used for calls to createConversionEvent. */
  public UnaryCallSettings<CreateConversionEventRequest, ConversionEvent>
      createConversionEventSettings() {
    return createConversionEventSettings;
  }

  /** Returns the object with the settings used for calls to getConversionEvent. */
  public UnaryCallSettings<GetConversionEventRequest, ConversionEvent>
      getConversionEventSettings() {
    return getConversionEventSettings;
  }

  /** Returns the object with the settings used for calls to deleteConversionEvent. */
  public UnaryCallSettings<DeleteConversionEventRequest, Empty> deleteConversionEventSettings() {
    return deleteConversionEventSettings;
  }

  /** Returns the object with the settings used for calls to listConversionEvents. */
  public PagedCallSettings<
          ListConversionEventsRequest,
          ListConversionEventsResponse,
          ListConversionEventsPagedResponse>
      listConversionEventsSettings() {
    return listConversionEventsSettings;
  }

  /** Returns the object with the settings used for calls to createCustomDimension. */
  public UnaryCallSettings<CreateCustomDimensionRequest, CustomDimension>
      createCustomDimensionSettings() {
    return createCustomDimensionSettings;
  }

  /** Returns the object with the settings used for calls to updateCustomDimension. */
  public UnaryCallSettings<UpdateCustomDimensionRequest, CustomDimension>
      updateCustomDimensionSettings() {
    return updateCustomDimensionSettings;
  }

  /** Returns the object with the settings used for calls to listCustomDimensions. */
  public PagedCallSettings<
          ListCustomDimensionsRequest,
          ListCustomDimensionsResponse,
          ListCustomDimensionsPagedResponse>
      listCustomDimensionsSettings() {
    return listCustomDimensionsSettings;
  }

  /** Returns the object with the settings used for calls to archiveCustomDimension. */
  public UnaryCallSettings<ArchiveCustomDimensionRequest, Empty> archiveCustomDimensionSettings() {
    return archiveCustomDimensionSettings;
  }

  /** Returns the object with the settings used for calls to getCustomDimension. */
  public UnaryCallSettings<GetCustomDimensionRequest, CustomDimension>
      getCustomDimensionSettings() {
    return getCustomDimensionSettings;
  }

  /** Returns the object with the settings used for calls to createCustomMetric. */
  public UnaryCallSettings<CreateCustomMetricRequest, CustomMetric> createCustomMetricSettings() {
    return createCustomMetricSettings;
  }

  /** Returns the object with the settings used for calls to updateCustomMetric. */
  public UnaryCallSettings<UpdateCustomMetricRequest, CustomMetric> updateCustomMetricSettings() {
    return updateCustomMetricSettings;
  }

  /** Returns the object with the settings used for calls to listCustomMetrics. */
  public PagedCallSettings<
          ListCustomMetricsRequest, ListCustomMetricsResponse, ListCustomMetricsPagedResponse>
      listCustomMetricsSettings() {
    return listCustomMetricsSettings;
  }

  /** Returns the object with the settings used for calls to archiveCustomMetric. */
  public UnaryCallSettings<ArchiveCustomMetricRequest, Empty> archiveCustomMetricSettings() {
    return archiveCustomMetricSettings;
  }

  /** Returns the object with the settings used for calls to getCustomMetric. */
  public UnaryCallSettings<GetCustomMetricRequest, CustomMetric> getCustomMetricSettings() {
    return getCustomMetricSettings;
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public AnalyticsAdminServiceStub createStub() throws IOException {
    if (getTransportChannelProvider()
        .getTransportName()
        .equals(GrpcTransportChannel.getGrpcTransportName())) {
      return GrpcAnalyticsAdminServiceStub.create(this);
    }
    throw new UnsupportedOperationException(
        String.format(
            "Transport not supported: %s", getTransportChannelProvider().getTransportName()));
  }

  /** Returns a builder for the default ExecutorProvider for this service. */
  public static InstantiatingExecutorProvider.Builder defaultExecutorProviderBuilder() {
    return InstantiatingExecutorProvider.newBuilder();
  }

  /** Returns the default service endpoint. */
  public static String getDefaultEndpoint() {
    return "analyticsadmin.googleapis.com:443";
  }

  /** Returns the default mTLS service endpoint. */
  public static String getDefaultMtlsEndpoint() {
    return "analyticsadmin.mtls.googleapis.com:443";
  }

  /** Returns the default service scopes. */
  public static List<String> getDefaultServiceScopes() {
    return DEFAULT_SERVICE_SCOPES;
  }

  /** Returns a builder for the default credentials for this service. */
  public static GoogleCredentialsProvider.Builder defaultCredentialsProviderBuilder() {
    return GoogleCredentialsProvider.newBuilder().setScopesToApply(DEFAULT_SERVICE_SCOPES);
  }

  /** Returns a builder for the default ChannelProvider for this service. */
  public static InstantiatingGrpcChannelProvider.Builder defaultGrpcTransportProviderBuilder() {
    return InstantiatingGrpcChannelProvider.newBuilder()
        .setMaxInboundMessageSize(Integer.MAX_VALUE);
  }

  public static TransportChannelProvider defaultTransportChannelProvider() {
    return defaultGrpcTransportProviderBuilder().build();
  }

  @BetaApi("The surface for customizing headers is not stable yet and may change in the future.")
  public static ApiClientHeaderProvider.Builder defaultApiClientHeaderProviderBuilder() {
    return ApiClientHeaderProvider.newBuilder()
        .setGeneratedLibToken(
            "gapic", GaxProperties.getLibraryVersion(AnalyticsAdminServiceStubSettings.class))
        .setTransportToken(
            GaxGrpcProperties.getGrpcTokenName(), GaxGrpcProperties.getGrpcVersion());
  }

  /** Returns a new builder for this class. */
  public static Builder newBuilder() {
    return Builder.createDefault();
  }

  /** Returns a new builder for this class. */
  public static Builder newBuilder(ClientContext clientContext) {
    return new Builder(clientContext);
  }

  /** Returns a builder containing all the values of this settings class. */
  public Builder toBuilder() {
    return new Builder(this);
  }

  protected AnalyticsAdminServiceStubSettings(Builder settingsBuilder) throws IOException {
    super(settingsBuilder);

    getAccountSettings = settingsBuilder.getAccountSettings().build();
    listAccountsSettings = settingsBuilder.listAccountsSettings().build();
    deleteAccountSettings = settingsBuilder.deleteAccountSettings().build();
    updateAccountSettings = settingsBuilder.updateAccountSettings().build();
    provisionAccountTicketSettings = settingsBuilder.provisionAccountTicketSettings().build();
    listAccountSummariesSettings = settingsBuilder.listAccountSummariesSettings().build();
    getPropertySettings = settingsBuilder.getPropertySettings().build();
    listPropertiesSettings = settingsBuilder.listPropertiesSettings().build();
    createPropertySettings = settingsBuilder.createPropertySettings().build();
    deletePropertySettings = settingsBuilder.deletePropertySettings().build();
    updatePropertySettings = settingsBuilder.updatePropertySettings().build();
    getUserLinkSettings = settingsBuilder.getUserLinkSettings().build();
    batchGetUserLinksSettings = settingsBuilder.batchGetUserLinksSettings().build();
    listUserLinksSettings = settingsBuilder.listUserLinksSettings().build();
    auditUserLinksSettings = settingsBuilder.auditUserLinksSettings().build();
    createUserLinkSettings = settingsBuilder.createUserLinkSettings().build();
    batchCreateUserLinksSettings = settingsBuilder.batchCreateUserLinksSettings().build();
    updateUserLinkSettings = settingsBuilder.updateUserLinkSettings().build();
    batchUpdateUserLinksSettings = settingsBuilder.batchUpdateUserLinksSettings().build();
    deleteUserLinkSettings = settingsBuilder.deleteUserLinkSettings().build();
    batchDeleteUserLinksSettings = settingsBuilder.batchDeleteUserLinksSettings().build();
    getWebDataStreamSettings = settingsBuilder.getWebDataStreamSettings().build();
    deleteWebDataStreamSettings = settingsBuilder.deleteWebDataStreamSettings().build();
    updateWebDataStreamSettings = settingsBuilder.updateWebDataStreamSettings().build();
    createWebDataStreamSettings = settingsBuilder.createWebDataStreamSettings().build();
    listWebDataStreamsSettings = settingsBuilder.listWebDataStreamsSettings().build();
    getIosAppDataStreamSettings = settingsBuilder.getIosAppDataStreamSettings().build();
    deleteIosAppDataStreamSettings = settingsBuilder.deleteIosAppDataStreamSettings().build();
    updateIosAppDataStreamSettings = settingsBuilder.updateIosAppDataStreamSettings().build();
    listIosAppDataStreamsSettings = settingsBuilder.listIosAppDataStreamsSettings().build();
    getAndroidAppDataStreamSettings = settingsBuilder.getAndroidAppDataStreamSettings().build();
    deleteAndroidAppDataStreamSettings =
        settingsBuilder.deleteAndroidAppDataStreamSettings().build();
    updateAndroidAppDataStreamSettings =
        settingsBuilder.updateAndroidAppDataStreamSettings().build();
    listAndroidAppDataStreamsSettings = settingsBuilder.listAndroidAppDataStreamsSettings().build();
    getEnhancedMeasurementSettingsSettings =
        settingsBuilder.getEnhancedMeasurementSettingsSettings().build();
    updateEnhancedMeasurementSettingsSettings =
        settingsBuilder.updateEnhancedMeasurementSettingsSettings().build();
    createFirebaseLinkSettings = settingsBuilder.createFirebaseLinkSettings().build();
    updateFirebaseLinkSettings = settingsBuilder.updateFirebaseLinkSettings().build();
    deleteFirebaseLinkSettings = settingsBuilder.deleteFirebaseLinkSettings().build();
    listFirebaseLinksSettings = settingsBuilder.listFirebaseLinksSettings().build();
    getGlobalSiteTagSettings = settingsBuilder.getGlobalSiteTagSettings().build();
    createGoogleAdsLinkSettings = settingsBuilder.createGoogleAdsLinkSettings().build();
    updateGoogleAdsLinkSettings = settingsBuilder.updateGoogleAdsLinkSettings().build();
    deleteGoogleAdsLinkSettings = settingsBuilder.deleteGoogleAdsLinkSettings().build();
    listGoogleAdsLinksSettings = settingsBuilder.listGoogleAdsLinksSettings().build();
    getDataSharingSettingsSettings = settingsBuilder.getDataSharingSettingsSettings().build();
    getMeasurementProtocolSecretSettings =
        settingsBuilder.getMeasurementProtocolSecretSettings().build();
    listMeasurementProtocolSecretsSettings =
        settingsBuilder.listMeasurementProtocolSecretsSettings().build();
    createMeasurementProtocolSecretSettings =
        settingsBuilder.createMeasurementProtocolSecretSettings().build();
    deleteMeasurementProtocolSecretSettings =
        settingsBuilder.deleteMeasurementProtocolSecretSettings().build();
    updateMeasurementProtocolSecretSettings =
        settingsBuilder.updateMeasurementProtocolSecretSettings().build();
    searchChangeHistoryEventsSettings = settingsBuilder.searchChangeHistoryEventsSettings().build();
    getGoogleSignalsSettingsSettings = settingsBuilder.getGoogleSignalsSettingsSettings().build();
    updateGoogleSignalsSettingsSettings =
        settingsBuilder.updateGoogleSignalsSettingsSettings().build();
    createConversionEventSettings = settingsBuilder.createConversionEventSettings().build();
    getConversionEventSettings = settingsBuilder.getConversionEventSettings().build();
    deleteConversionEventSettings = settingsBuilder.deleteConversionEventSettings().build();
    listConversionEventsSettings = settingsBuilder.listConversionEventsSettings().build();
    createCustomDimensionSettings = settingsBuilder.createCustomDimensionSettings().build();
    updateCustomDimensionSettings = settingsBuilder.updateCustomDimensionSettings().build();
    listCustomDimensionsSettings = settingsBuilder.listCustomDimensionsSettings().build();
    archiveCustomDimensionSettings = settingsBuilder.archiveCustomDimensionSettings().build();
    getCustomDimensionSettings = settingsBuilder.getCustomDimensionSettings().build();
    createCustomMetricSettings = settingsBuilder.createCustomMetricSettings().build();
    updateCustomMetricSettings = settingsBuilder.updateCustomMetricSettings().build();
    listCustomMetricsSettings = settingsBuilder.listCustomMetricsSettings().build();
    archiveCustomMetricSettings = settingsBuilder.archiveCustomMetricSettings().build();
    getCustomMetricSettings = settingsBuilder.getCustomMetricSettings().build();
  }

  /** Builder for AnalyticsAdminServiceStubSettings. */
  public static class Builder
      extends StubSettings.Builder<AnalyticsAdminServiceStubSettings, Builder> {
    private final ImmutableList<UnaryCallSettings.Builder<?, ?>> unaryMethodSettingsBuilders;
    private final UnaryCallSettings.Builder<GetAccountRequest, Account> getAccountSettings;
    private final PagedCallSettings.Builder<
            ListAccountsRequest, ListAccountsResponse, ListAccountsPagedResponse>
        listAccountsSettings;
    private final UnaryCallSettings.Builder<DeleteAccountRequest, Empty> deleteAccountSettings;
    private final UnaryCallSettings.Builder<UpdateAccountRequest, Account> updateAccountSettings;
    private final UnaryCallSettings.Builder<
            ProvisionAccountTicketRequest, ProvisionAccountTicketResponse>
        provisionAccountTicketSettings;
    private final PagedCallSettings.Builder<
            ListAccountSummariesRequest,
            ListAccountSummariesResponse,
            ListAccountSummariesPagedResponse>
        listAccountSummariesSettings;
    private final UnaryCallSettings.Builder<GetPropertyRequest, Property> getPropertySettings;
    private final PagedCallSettings.Builder<
            ListPropertiesRequest, ListPropertiesResponse, ListPropertiesPagedResponse>
        listPropertiesSettings;
    private final UnaryCallSettings.Builder<CreatePropertyRequest, Property> createPropertySettings;
    private final UnaryCallSettings.Builder<DeletePropertyRequest, Property> deletePropertySettings;
    private final UnaryCallSettings.Builder<UpdatePropertyRequest, Property> updatePropertySettings;
    private final UnaryCallSettings.Builder<GetUserLinkRequest, UserLink> getUserLinkSettings;
    private final UnaryCallSettings.Builder<BatchGetUserLinksRequest, BatchGetUserLinksResponse>
        batchGetUserLinksSettings;
    private final PagedCallSettings.Builder<
            ListUserLinksRequest, ListUserLinksResponse, ListUserLinksPagedResponse>
        listUserLinksSettings;
    private final PagedCallSettings.Builder<
            AuditUserLinksRequest, AuditUserLinksResponse, AuditUserLinksPagedResponse>
        auditUserLinksSettings;
    private final UnaryCallSettings.Builder<CreateUserLinkRequest, UserLink> createUserLinkSettings;
    private final UnaryCallSettings.Builder<
            BatchCreateUserLinksRequest, BatchCreateUserLinksResponse>
        batchCreateUserLinksSettings;
    private final UnaryCallSettings.Builder<UpdateUserLinkRequest, UserLink> updateUserLinkSettings;
    private final UnaryCallSettings.Builder<
            BatchUpdateUserLinksRequest, BatchUpdateUserLinksResponse>
        batchUpdateUserLinksSettings;
    private final UnaryCallSettings.Builder<DeleteUserLinkRequest, Empty> deleteUserLinkSettings;
    private final UnaryCallSettings.Builder<BatchDeleteUserLinksRequest, Empty>
        batchDeleteUserLinksSettings;
    private final UnaryCallSettings.Builder<GetWebDataStreamRequest, WebDataStream>
        getWebDataStreamSettings;
    private final UnaryCallSettings.Builder<DeleteWebDataStreamRequest, Empty>
        deleteWebDataStreamSettings;
    private final UnaryCallSettings.Builder<UpdateWebDataStreamRequest, WebDataStream>
        updateWebDataStreamSettings;
    private final UnaryCallSettings.Builder<CreateWebDataStreamRequest, WebDataStream>
        createWebDataStreamSettings;
    private final PagedCallSettings.Builder<
            ListWebDataStreamsRequest, ListWebDataStreamsResponse, ListWebDataStreamsPagedResponse>
        listWebDataStreamsSettings;
    private final UnaryCallSettings.Builder<GetIosAppDataStreamRequest, IosAppDataStream>
        getIosAppDataStreamSettings;
    private final UnaryCallSettings.Builder<DeleteIosAppDataStreamRequest, Empty>
        deleteIosAppDataStreamSettings;
    private final UnaryCallSettings.Builder<UpdateIosAppDataStreamRequest, IosAppDataStream>
        updateIosAppDataStreamSettings;
    private final PagedCallSettings.Builder<
            ListIosAppDataStreamsRequest,
            ListIosAppDataStreamsResponse,
            ListIosAppDataStreamsPagedResponse>
        listIosAppDataStreamsSettings;
    private final UnaryCallSettings.Builder<GetAndroidAppDataStreamRequest, AndroidAppDataStream>
        getAndroidAppDataStreamSettings;
    private final UnaryCallSettings.Builder<DeleteAndroidAppDataStreamRequest, Empty>
        deleteAndroidAppDataStreamSettings;
    private final UnaryCallSettings.Builder<UpdateAndroidAppDataStreamRequest, AndroidAppDataStream>
        updateAndroidAppDataStreamSettings;
    private final PagedCallSettings.Builder<
            ListAndroidAppDataStreamsRequest,
            ListAndroidAppDataStreamsResponse,
            ListAndroidAppDataStreamsPagedResponse>
        listAndroidAppDataStreamsSettings;
    private final UnaryCallSettings.Builder<
            GetEnhancedMeasurementSettingsRequest, EnhancedMeasurementSettings>
        getEnhancedMeasurementSettingsSettings;
    private final UnaryCallSettings.Builder<
            UpdateEnhancedMeasurementSettingsRequest, EnhancedMeasurementSettings>
        updateEnhancedMeasurementSettingsSettings;
    private final UnaryCallSettings.Builder<CreateFirebaseLinkRequest, FirebaseLink>
        createFirebaseLinkSettings;
    private final UnaryCallSettings.Builder<UpdateFirebaseLinkRequest, FirebaseLink>
        updateFirebaseLinkSettings;
    private final UnaryCallSettings.Builder<DeleteFirebaseLinkRequest, Empty>
        deleteFirebaseLinkSettings;
    private final PagedCallSettings.Builder<
            ListFirebaseLinksRequest, ListFirebaseLinksResponse, ListFirebaseLinksPagedResponse>
        listFirebaseLinksSettings;
    private final UnaryCallSettings.Builder<GetGlobalSiteTagRequest, GlobalSiteTag>
        getGlobalSiteTagSettings;
    private final UnaryCallSettings.Builder<CreateGoogleAdsLinkRequest, GoogleAdsLink>
        createGoogleAdsLinkSettings;
    private final UnaryCallSettings.Builder<UpdateGoogleAdsLinkRequest, GoogleAdsLink>
        updateGoogleAdsLinkSettings;
    private final UnaryCallSettings.Builder<DeleteGoogleAdsLinkRequest, Empty>
        deleteGoogleAdsLinkSettings;
    private final PagedCallSettings.Builder<
            ListGoogleAdsLinksRequest, ListGoogleAdsLinksResponse, ListGoogleAdsLinksPagedResponse>
        listGoogleAdsLinksSettings;
    private final UnaryCallSettings.Builder<GetDataSharingSettingsRequest, DataSharingSettings>
        getDataSharingSettingsSettings;
    private final UnaryCallSettings.Builder<
            GetMeasurementProtocolSecretRequest, MeasurementProtocolSecret>
        getMeasurementProtocolSecretSettings;
    private final PagedCallSettings.Builder<
            ListMeasurementProtocolSecretsRequest,
            ListMeasurementProtocolSecretsResponse,
            ListMeasurementProtocolSecretsPagedResponse>
        listMeasurementProtocolSecretsSettings;
    private final UnaryCallSettings.Builder<
            CreateMeasurementProtocolSecretRequest, MeasurementProtocolSecret>
        createMeasurementProtocolSecretSettings;
    private final UnaryCallSettings.Builder<DeleteMeasurementProtocolSecretRequest, Empty>
        deleteMeasurementProtocolSecretSettings;
    private final UnaryCallSettings.Builder<
            UpdateMeasurementProtocolSecretRequest, MeasurementProtocolSecret>
        updateMeasurementProtocolSecretSettings;
    private final PagedCallSettings.Builder<
            SearchChangeHistoryEventsRequest,
            SearchChangeHistoryEventsResponse,
            SearchChangeHistoryEventsPagedResponse>
        searchChangeHistoryEventsSettings;
    private final UnaryCallSettings.Builder<GetGoogleSignalsSettingsRequest, GoogleSignalsSettings>
        getGoogleSignalsSettingsSettings;
    private final UnaryCallSettings.Builder<
            UpdateGoogleSignalsSettingsRequest, GoogleSignalsSettings>
        updateGoogleSignalsSettingsSettings;
    private final UnaryCallSettings.Builder<CreateConversionEventRequest, ConversionEvent>
        createConversionEventSettings;
    private final UnaryCallSettings.Builder<GetConversionEventRequest, ConversionEvent>
        getConversionEventSettings;
    private final UnaryCallSettings.Builder<DeleteConversionEventRequest, Empty>
        deleteConversionEventSettings;
    private final PagedCallSettings.Builder<
            ListConversionEventsRequest,
            ListConversionEventsResponse,
            ListConversionEventsPagedResponse>
        listConversionEventsSettings;
    private final UnaryCallSettings.Builder<CreateCustomDimensionRequest, CustomDimension>
        createCustomDimensionSettings;
    private final UnaryCallSettings.Builder<UpdateCustomDimensionRequest, CustomDimension>
        updateCustomDimensionSettings;
    private final PagedCallSettings.Builder<
            ListCustomDimensionsRequest,
            ListCustomDimensionsResponse,
            ListCustomDimensionsPagedResponse>
        listCustomDimensionsSettings;
    private final UnaryCallSettings.Builder<ArchiveCustomDimensionRequest, Empty>
        archiveCustomDimensionSettings;
    private final UnaryCallSettings.Builder<GetCustomDimensionRequest, CustomDimension>
        getCustomDimensionSettings;
    private final UnaryCallSettings.Builder<CreateCustomMetricRequest, CustomMetric>
        createCustomMetricSettings;
    private final UnaryCallSettings.Builder<UpdateCustomMetricRequest, CustomMetric>
        updateCustomMetricSettings;
    private final PagedCallSettings.Builder<
            ListCustomMetricsRequest, ListCustomMetricsResponse, ListCustomMetricsPagedResponse>
        listCustomMetricsSettings;
    private final UnaryCallSettings.Builder<ArchiveCustomMetricRequest, Empty>
        archiveCustomMetricSettings;
    private final UnaryCallSettings.Builder<GetCustomMetricRequest, CustomMetric>
        getCustomMetricSettings;
    private static final ImmutableMap<String, ImmutableSet<StatusCode.Code>>
        RETRYABLE_CODE_DEFINITIONS;

    static {
      ImmutableMap.Builder<String, ImmutableSet<StatusCode.Code>> definitions =
          ImmutableMap.builder();
      definitions.put(
          "no_retry_1_codes", ImmutableSet.copyOf(Lists.<StatusCode.Code>newArrayList()));
      definitions.put(
          "retry_policy_0_codes",
          ImmutableSet.copyOf(
              Lists.<StatusCode.Code>newArrayList(
                  StatusCode.Code.UNAVAILABLE, StatusCode.Code.UNKNOWN)));
      RETRYABLE_CODE_DEFINITIONS = definitions.build();
    }

    private static final ImmutableMap<String, RetrySettings> RETRY_PARAM_DEFINITIONS;

    static {
      ImmutableMap.Builder<String, RetrySettings> definitions = ImmutableMap.builder();
      RetrySettings settings = null;
      settings =
          RetrySettings.newBuilder()
              .setInitialRpcTimeout(Duration.ofMillis(60000L))
              .setRpcTimeoutMultiplier(1.0)
              .setMaxRpcTimeout(Duration.ofMillis(60000L))
              .setTotalTimeout(Duration.ofMillis(60000L))
              .build();
      definitions.put("no_retry_1_params", settings);
      settings =
          RetrySettings.newBuilder()
              .setInitialRetryDelay(Duration.ofMillis(1000L))
              .setRetryDelayMultiplier(1.3)
              .setMaxRetryDelay(Duration.ofMillis(60000L))
              .setInitialRpcTimeout(Duration.ofMillis(60000L))
              .setRpcTimeoutMultiplier(1.0)
              .setMaxRpcTimeout(Duration.ofMillis(60000L))
              .setTotalTimeout(Duration.ofMillis(60000L))
              .build();
      definitions.put("retry_policy_0_params", settings);
      RETRY_PARAM_DEFINITIONS = definitions.build();
    }

    protected Builder() {
      this(((ClientContext) null));
    }

    protected Builder(ClientContext clientContext) {
      super(clientContext);

      getAccountSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      listAccountsSettings = PagedCallSettings.newBuilder(LIST_ACCOUNTS_PAGE_STR_FACT);
      deleteAccountSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      updateAccountSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      provisionAccountTicketSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      listAccountSummariesSettings =
          PagedCallSettings.newBuilder(LIST_ACCOUNT_SUMMARIES_PAGE_STR_FACT);
      getPropertySettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      listPropertiesSettings = PagedCallSettings.newBuilder(LIST_PROPERTIES_PAGE_STR_FACT);
      createPropertySettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      deletePropertySettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      updatePropertySettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      getUserLinkSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      batchGetUserLinksSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      listUserLinksSettings = PagedCallSettings.newBuilder(LIST_USER_LINKS_PAGE_STR_FACT);
      auditUserLinksSettings = PagedCallSettings.newBuilder(AUDIT_USER_LINKS_PAGE_STR_FACT);
      createUserLinkSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      batchCreateUserLinksSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      updateUserLinkSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      batchUpdateUserLinksSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      deleteUserLinkSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      batchDeleteUserLinksSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      getWebDataStreamSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      deleteWebDataStreamSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      updateWebDataStreamSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      createWebDataStreamSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      listWebDataStreamsSettings =
          PagedCallSettings.newBuilder(LIST_WEB_DATA_STREAMS_PAGE_STR_FACT);
      getIosAppDataStreamSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      deleteIosAppDataStreamSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      updateIosAppDataStreamSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      listIosAppDataStreamsSettings =
          PagedCallSettings.newBuilder(LIST_IOS_APP_DATA_STREAMS_PAGE_STR_FACT);
      getAndroidAppDataStreamSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      deleteAndroidAppDataStreamSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      updateAndroidAppDataStreamSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      listAndroidAppDataStreamsSettings =
          PagedCallSettings.newBuilder(LIST_ANDROID_APP_DATA_STREAMS_PAGE_STR_FACT);
      getEnhancedMeasurementSettingsSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      updateEnhancedMeasurementSettingsSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      createFirebaseLinkSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      updateFirebaseLinkSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      deleteFirebaseLinkSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      listFirebaseLinksSettings = PagedCallSettings.newBuilder(LIST_FIREBASE_LINKS_PAGE_STR_FACT);
      getGlobalSiteTagSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      createGoogleAdsLinkSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      updateGoogleAdsLinkSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      deleteGoogleAdsLinkSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      listGoogleAdsLinksSettings =
          PagedCallSettings.newBuilder(LIST_GOOGLE_ADS_LINKS_PAGE_STR_FACT);
      getDataSharingSettingsSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      getMeasurementProtocolSecretSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      listMeasurementProtocolSecretsSettings =
          PagedCallSettings.newBuilder(LIST_MEASUREMENT_PROTOCOL_SECRETS_PAGE_STR_FACT);
      createMeasurementProtocolSecretSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      deleteMeasurementProtocolSecretSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      updateMeasurementProtocolSecretSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      searchChangeHistoryEventsSettings =
          PagedCallSettings.newBuilder(SEARCH_CHANGE_HISTORY_EVENTS_PAGE_STR_FACT);
      getGoogleSignalsSettingsSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      updateGoogleSignalsSettingsSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      createConversionEventSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      getConversionEventSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      deleteConversionEventSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      listConversionEventsSettings =
          PagedCallSettings.newBuilder(LIST_CONVERSION_EVENTS_PAGE_STR_FACT);
      createCustomDimensionSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      updateCustomDimensionSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      listCustomDimensionsSettings =
          PagedCallSettings.newBuilder(LIST_CUSTOM_DIMENSIONS_PAGE_STR_FACT);
      archiveCustomDimensionSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      getCustomDimensionSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      createCustomMetricSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      updateCustomMetricSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      listCustomMetricsSettings = PagedCallSettings.newBuilder(LIST_CUSTOM_METRICS_PAGE_STR_FACT);
      archiveCustomMetricSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      getCustomMetricSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      unaryMethodSettingsBuilders =
          ImmutableList.<UnaryCallSettings.Builder<?, ?>>of(
              getAccountSettings,
              listAccountsSettings,
              deleteAccountSettings,
              updateAccountSettings,
              provisionAccountTicketSettings,
              listAccountSummariesSettings,
              getPropertySettings,
              listPropertiesSettings,
              createPropertySettings,
              deletePropertySettings,
              updatePropertySettings,
              getUserLinkSettings,
              batchGetUserLinksSettings,
              listUserLinksSettings,
              auditUserLinksSettings,
              createUserLinkSettings,
              batchCreateUserLinksSettings,
              updateUserLinkSettings,
              batchUpdateUserLinksSettings,
              deleteUserLinkSettings,
              batchDeleteUserLinksSettings,
              getWebDataStreamSettings,
              deleteWebDataStreamSettings,
              updateWebDataStreamSettings,
              createWebDataStreamSettings,
              listWebDataStreamsSettings,
              getIosAppDataStreamSettings,
              deleteIosAppDataStreamSettings,
              updateIosAppDataStreamSettings,
              listIosAppDataStreamsSettings,
              getAndroidAppDataStreamSettings,
              deleteAndroidAppDataStreamSettings,
              updateAndroidAppDataStreamSettings,
              listAndroidAppDataStreamsSettings,
              getEnhancedMeasurementSettingsSettings,
              updateEnhancedMeasurementSettingsSettings,
              createFirebaseLinkSettings,
              updateFirebaseLinkSettings,
              deleteFirebaseLinkSettings,
              listFirebaseLinksSettings,
              getGlobalSiteTagSettings,
              createGoogleAdsLinkSettings,
              updateGoogleAdsLinkSettings,
              deleteGoogleAdsLinkSettings,
              listGoogleAdsLinksSettings,
              getDataSharingSettingsSettings,
              getMeasurementProtocolSecretSettings,
              listMeasurementProtocolSecretsSettings,
              createMeasurementProtocolSecretSettings,
              deleteMeasurementProtocolSecretSettings,
              updateMeasurementProtocolSecretSettings,
              searchChangeHistoryEventsSettings,
              getGoogleSignalsSettingsSettings,
              updateGoogleSignalsSettingsSettings,
              createConversionEventSettings,
              getConversionEventSettings,
              deleteConversionEventSettings,
              listConversionEventsSettings,
              createCustomDimensionSettings,
              updateCustomDimensionSettings,
              listCustomDimensionsSettings,
              archiveCustomDimensionSettings,
              getCustomDimensionSettings,
              createCustomMetricSettings,
              updateCustomMetricSettings,
              listCustomMetricsSettings,
              archiveCustomMetricSettings,
              getCustomMetricSettings);
      initDefaults(this);
    }

    protected Builder(AnalyticsAdminServiceStubSettings settings) {
      super(settings);

      getAccountSettings = settings.getAccountSettings.toBuilder();
      listAccountsSettings = settings.listAccountsSettings.toBuilder();
      deleteAccountSettings = settings.deleteAccountSettings.toBuilder();
      updateAccountSettings = settings.updateAccountSettings.toBuilder();
      provisionAccountTicketSettings = settings.provisionAccountTicketSettings.toBuilder();
      listAccountSummariesSettings = settings.listAccountSummariesSettings.toBuilder();
      getPropertySettings = settings.getPropertySettings.toBuilder();
      listPropertiesSettings = settings.listPropertiesSettings.toBuilder();
      createPropertySettings = settings.createPropertySettings.toBuilder();
      deletePropertySettings = settings.deletePropertySettings.toBuilder();
      updatePropertySettings = settings.updatePropertySettings.toBuilder();
      getUserLinkSettings = settings.getUserLinkSettings.toBuilder();
      batchGetUserLinksSettings = settings.batchGetUserLinksSettings.toBuilder();
      listUserLinksSettings = settings.listUserLinksSettings.toBuilder();
      auditUserLinksSettings = settings.auditUserLinksSettings.toBuilder();
      createUserLinkSettings = settings.createUserLinkSettings.toBuilder();
      batchCreateUserLinksSettings = settings.batchCreateUserLinksSettings.toBuilder();
      updateUserLinkSettings = settings.updateUserLinkSettings.toBuilder();
      batchUpdateUserLinksSettings = settings.batchUpdateUserLinksSettings.toBuilder();
      deleteUserLinkSettings = settings.deleteUserLinkSettings.toBuilder();
      batchDeleteUserLinksSettings = settings.batchDeleteUserLinksSettings.toBuilder();
      getWebDataStreamSettings = settings.getWebDataStreamSettings.toBuilder();
      deleteWebDataStreamSettings = settings.deleteWebDataStreamSettings.toBuilder();
      updateWebDataStreamSettings = settings.updateWebDataStreamSettings.toBuilder();
      createWebDataStreamSettings = settings.createWebDataStreamSettings.toBuilder();
      listWebDataStreamsSettings = settings.listWebDataStreamsSettings.toBuilder();
      getIosAppDataStreamSettings = settings.getIosAppDataStreamSettings.toBuilder();
      deleteIosAppDataStreamSettings = settings.deleteIosAppDataStreamSettings.toBuilder();
      updateIosAppDataStreamSettings = settings.updateIosAppDataStreamSettings.toBuilder();
      listIosAppDataStreamsSettings = settings.listIosAppDataStreamsSettings.toBuilder();
      getAndroidAppDataStreamSettings = settings.getAndroidAppDataStreamSettings.toBuilder();
      deleteAndroidAppDataStreamSettings = settings.deleteAndroidAppDataStreamSettings.toBuilder();
      updateAndroidAppDataStreamSettings = settings.updateAndroidAppDataStreamSettings.toBuilder();
      listAndroidAppDataStreamsSettings = settings.listAndroidAppDataStreamsSettings.toBuilder();
      getEnhancedMeasurementSettingsSettings =
          settings.getEnhancedMeasurementSettingsSettings.toBuilder();
      updateEnhancedMeasurementSettingsSettings =
          settings.updateEnhancedMeasurementSettingsSettings.toBuilder();
      createFirebaseLinkSettings = settings.createFirebaseLinkSettings.toBuilder();
      updateFirebaseLinkSettings = settings.updateFirebaseLinkSettings.toBuilder();
      deleteFirebaseLinkSettings = settings.deleteFirebaseLinkSettings.toBuilder();
      listFirebaseLinksSettings = settings.listFirebaseLinksSettings.toBuilder();
      getGlobalSiteTagSettings = settings.getGlobalSiteTagSettings.toBuilder();
      createGoogleAdsLinkSettings = settings.createGoogleAdsLinkSettings.toBuilder();
      updateGoogleAdsLinkSettings = settings.updateGoogleAdsLinkSettings.toBuilder();
      deleteGoogleAdsLinkSettings = settings.deleteGoogleAdsLinkSettings.toBuilder();
      listGoogleAdsLinksSettings = settings.listGoogleAdsLinksSettings.toBuilder();
      getDataSharingSettingsSettings = settings.getDataSharingSettingsSettings.toBuilder();
      getMeasurementProtocolSecretSettings =
          settings.getMeasurementProtocolSecretSettings.toBuilder();
      listMeasurementProtocolSecretsSettings =
          settings.listMeasurementProtocolSecretsSettings.toBuilder();
      createMeasurementProtocolSecretSettings =
          settings.createMeasurementProtocolSecretSettings.toBuilder();
      deleteMeasurementProtocolSecretSettings =
          settings.deleteMeasurementProtocolSecretSettings.toBuilder();
      updateMeasurementProtocolSecretSettings =
          settings.updateMeasurementProtocolSecretSettings.toBuilder();
      searchChangeHistoryEventsSettings = settings.searchChangeHistoryEventsSettings.toBuilder();
      getGoogleSignalsSettingsSettings = settings.getGoogleSignalsSettingsSettings.toBuilder();
      updateGoogleSignalsSettingsSettings =
          settings.updateGoogleSignalsSettingsSettings.toBuilder();
      createConversionEventSettings = settings.createConversionEventSettings.toBuilder();
      getConversionEventSettings = settings.getConversionEventSettings.toBuilder();
      deleteConversionEventSettings = settings.deleteConversionEventSettings.toBuilder();
      listConversionEventsSettings = settings.listConversionEventsSettings.toBuilder();
      createCustomDimensionSettings = settings.createCustomDimensionSettings.toBuilder();
      updateCustomDimensionSettings = settings.updateCustomDimensionSettings.toBuilder();
      listCustomDimensionsSettings = settings.listCustomDimensionsSettings.toBuilder();
      archiveCustomDimensionSettings = settings.archiveCustomDimensionSettings.toBuilder();
      getCustomDimensionSettings = settings.getCustomDimensionSettings.toBuilder();
      createCustomMetricSettings = settings.createCustomMetricSettings.toBuilder();
      updateCustomMetricSettings = settings.updateCustomMetricSettings.toBuilder();
      listCustomMetricsSettings = settings.listCustomMetricsSettings.toBuilder();
      archiveCustomMetricSettings = settings.archiveCustomMetricSettings.toBuilder();
      getCustomMetricSettings = settings.getCustomMetricSettings.toBuilder();

      unaryMethodSettingsBuilders =
          ImmutableList.<UnaryCallSettings.Builder<?, ?>>of(
              getAccountSettings,
              listAccountsSettings,
              deleteAccountSettings,
              updateAccountSettings,
              provisionAccountTicketSettings,
              listAccountSummariesSettings,
              getPropertySettings,
              listPropertiesSettings,
              createPropertySettings,
              deletePropertySettings,
              updatePropertySettings,
              getUserLinkSettings,
              batchGetUserLinksSettings,
              listUserLinksSettings,
              auditUserLinksSettings,
              createUserLinkSettings,
              batchCreateUserLinksSettings,
              updateUserLinkSettings,
              batchUpdateUserLinksSettings,
              deleteUserLinkSettings,
              batchDeleteUserLinksSettings,
              getWebDataStreamSettings,
              deleteWebDataStreamSettings,
              updateWebDataStreamSettings,
              createWebDataStreamSettings,
              listWebDataStreamsSettings,
              getIosAppDataStreamSettings,
              deleteIosAppDataStreamSettings,
              updateIosAppDataStreamSettings,
              listIosAppDataStreamsSettings,
              getAndroidAppDataStreamSettings,
              deleteAndroidAppDataStreamSettings,
              updateAndroidAppDataStreamSettings,
              listAndroidAppDataStreamsSettings,
              getEnhancedMeasurementSettingsSettings,
              updateEnhancedMeasurementSettingsSettings,
              createFirebaseLinkSettings,
              updateFirebaseLinkSettings,
              deleteFirebaseLinkSettings,
              listFirebaseLinksSettings,
              getGlobalSiteTagSettings,
              createGoogleAdsLinkSettings,
              updateGoogleAdsLinkSettings,
              deleteGoogleAdsLinkSettings,
              listGoogleAdsLinksSettings,
              getDataSharingSettingsSettings,
              getMeasurementProtocolSecretSettings,
              listMeasurementProtocolSecretsSettings,
              createMeasurementProtocolSecretSettings,
              deleteMeasurementProtocolSecretSettings,
              updateMeasurementProtocolSecretSettings,
              searchChangeHistoryEventsSettings,
              getGoogleSignalsSettingsSettings,
              updateGoogleSignalsSettingsSettings,
              createConversionEventSettings,
              getConversionEventSettings,
              deleteConversionEventSettings,
              listConversionEventsSettings,
              createCustomDimensionSettings,
              updateCustomDimensionSettings,
              listCustomDimensionsSettings,
              archiveCustomDimensionSettings,
              getCustomDimensionSettings,
              createCustomMetricSettings,
              updateCustomMetricSettings,
              listCustomMetricsSettings,
              archiveCustomMetricSettings,
              getCustomMetricSettings);
    }

    private static Builder createDefault() {
      Builder builder = new Builder(((ClientContext) null));

      builder.setTransportChannelProvider(defaultTransportChannelProvider());
      builder.setCredentialsProvider(defaultCredentialsProviderBuilder().build());
      builder.setInternalHeaderProvider(defaultApiClientHeaderProviderBuilder().build());
      builder.setEndpoint(getDefaultEndpoint());
      builder.setMtlsEndpoint(getDefaultMtlsEndpoint());
      builder.setSwitchToMtlsEndpointAllowed(true);

      return initDefaults(builder);
    }

    private static Builder initDefaults(Builder builder) {
      builder
          .getAccountSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_1_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_1_params"));

      builder
          .listAccountsSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_1_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_1_params"));

      builder
          .deleteAccountSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_1_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_1_params"));

      builder
          .updateAccountSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_1_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_1_params"));

      builder
          .provisionAccountTicketSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_1_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_1_params"));

      builder
          .listAccountSummariesSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .getPropertySettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_1_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_1_params"));

      builder
          .listPropertiesSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_1_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_1_params"));

      builder
          .createPropertySettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_1_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_1_params"));

      builder
          .deletePropertySettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_1_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_1_params"));

      builder
          .updatePropertySettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_1_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_1_params"));

      builder
          .getUserLinkSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_1_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_1_params"));

      builder
          .batchGetUserLinksSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_1_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_1_params"));

      builder
          .listUserLinksSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_1_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_1_params"));

      builder
          .auditUserLinksSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_1_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_1_params"));

      builder
          .createUserLinkSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_1_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_1_params"));

      builder
          .batchCreateUserLinksSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_1_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_1_params"));

      builder
          .updateUserLinkSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_1_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_1_params"));

      builder
          .batchUpdateUserLinksSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_1_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_1_params"));

      builder
          .deleteUserLinkSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_1_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_1_params"));

      builder
          .batchDeleteUserLinksSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_1_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_1_params"));

      builder
          .getWebDataStreamSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_1_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_1_params"));

      builder
          .deleteWebDataStreamSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .updateWebDataStreamSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_1_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_1_params"));

      builder
          .createWebDataStreamSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_1_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_1_params"));

      builder
          .listWebDataStreamsSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_1_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_1_params"));

      builder
          .getIosAppDataStreamSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_1_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_1_params"));

      builder
          .deleteIosAppDataStreamSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_1_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_1_params"));

      builder
          .updateIosAppDataStreamSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_1_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_1_params"));

      builder
          .listIosAppDataStreamsSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_1_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_1_params"));

      builder
          .getAndroidAppDataStreamSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_1_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_1_params"));

      builder
          .deleteAndroidAppDataStreamSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_1_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_1_params"));

      builder
          .updateAndroidAppDataStreamSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_1_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_1_params"));

      builder
          .listAndroidAppDataStreamsSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_1_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_1_params"));

      builder
          .getEnhancedMeasurementSettingsSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_1_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_1_params"));

      builder
          .updateEnhancedMeasurementSettingsSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_1_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_1_params"));

      builder
          .createFirebaseLinkSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_1_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_1_params"));

      builder
          .updateFirebaseLinkSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_1_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_1_params"));

      builder
          .deleteFirebaseLinkSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_1_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_1_params"));

      builder
          .listFirebaseLinksSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_1_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_1_params"));

      builder
          .getGlobalSiteTagSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_1_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_1_params"));

      builder
          .createGoogleAdsLinkSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_1_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_1_params"));

      builder
          .updateGoogleAdsLinkSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_1_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_1_params"));

      builder
          .deleteGoogleAdsLinkSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_1_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_1_params"));

      builder
          .listGoogleAdsLinksSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_1_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_1_params"));

      builder
          .getDataSharingSettingsSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .getMeasurementProtocolSecretSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .listMeasurementProtocolSecretsSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .createMeasurementProtocolSecretSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .deleteMeasurementProtocolSecretSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .updateMeasurementProtocolSecretSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .searchChangeHistoryEventsSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .getGoogleSignalsSettingsSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .updateGoogleSignalsSettingsSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .createConversionEventSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .getConversionEventSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .deleteConversionEventSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .listConversionEventsSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .createCustomDimensionSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .updateCustomDimensionSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .listCustomDimensionsSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .archiveCustomDimensionSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .getCustomDimensionSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .createCustomMetricSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .updateCustomMetricSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .listCustomMetricsSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .archiveCustomMetricSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      builder
          .getCustomMetricSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_0_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_0_params"));

      return builder;
    }

    /**
     * Applies the given settings updater function to all of the unary API methods in this service.
     *
     * <p>Note: This method does not support applying settings to streaming methods.
     */
    public Builder applyToAllUnaryMethods(
        ApiFunction<UnaryCallSettings.Builder<?, ?>, Void> settingsUpdater) {
      super.applyToAllUnaryMethods(unaryMethodSettingsBuilders, settingsUpdater);
      return this;
    }

    public ImmutableList<UnaryCallSettings.Builder<?, ?>> unaryMethodSettingsBuilders() {
      return unaryMethodSettingsBuilders;
    }

    /** Returns the builder for the settings used for calls to getAccount. */
    public UnaryCallSettings.Builder<GetAccountRequest, Account> getAccountSettings() {
      return getAccountSettings;
    }

    /** Returns the builder for the settings used for calls to listAccounts. */
    public PagedCallSettings.Builder<
            ListAccountsRequest, ListAccountsResponse, ListAccountsPagedResponse>
        listAccountsSettings() {
      return listAccountsSettings;
    }

    /** Returns the builder for the settings used for calls to deleteAccount. */
    public UnaryCallSettings.Builder<DeleteAccountRequest, Empty> deleteAccountSettings() {
      return deleteAccountSettings;
    }

    /** Returns the builder for the settings used for calls to updateAccount. */
    public UnaryCallSettings.Builder<UpdateAccountRequest, Account> updateAccountSettings() {
      return updateAccountSettings;
    }

    /** Returns the builder for the settings used for calls to provisionAccountTicket. */
    public UnaryCallSettings.Builder<ProvisionAccountTicketRequest, ProvisionAccountTicketResponse>
        provisionAccountTicketSettings() {
      return provisionAccountTicketSettings;
    }

    /** Returns the builder for the settings used for calls to listAccountSummaries. */
    public PagedCallSettings.Builder<
            ListAccountSummariesRequest,
            ListAccountSummariesResponse,
            ListAccountSummariesPagedResponse>
        listAccountSummariesSettings() {
      return listAccountSummariesSettings;
    }

    /** Returns the builder for the settings used for calls to getProperty. */
    public UnaryCallSettings.Builder<GetPropertyRequest, Property> getPropertySettings() {
      return getPropertySettings;
    }

    /** Returns the builder for the settings used for calls to listProperties. */
    public PagedCallSettings.Builder<
            ListPropertiesRequest, ListPropertiesResponse, ListPropertiesPagedResponse>
        listPropertiesSettings() {
      return listPropertiesSettings;
    }

    /** Returns the builder for the settings used for calls to createProperty. */
    public UnaryCallSettings.Builder<CreatePropertyRequest, Property> createPropertySettings() {
      return createPropertySettings;
    }

    /** Returns the builder for the settings used for calls to deleteProperty. */
    public UnaryCallSettings.Builder<DeletePropertyRequest, Property> deletePropertySettings() {
      return deletePropertySettings;
    }

    /** Returns the builder for the settings used for calls to updateProperty. */
    public UnaryCallSettings.Builder<UpdatePropertyRequest, Property> updatePropertySettings() {
      return updatePropertySettings;
    }

    /** Returns the builder for the settings used for calls to getUserLink. */
    public UnaryCallSettings.Builder<GetUserLinkRequest, UserLink> getUserLinkSettings() {
      return getUserLinkSettings;
    }

    /** Returns the builder for the settings used for calls to batchGetUserLinks. */
    public UnaryCallSettings.Builder<BatchGetUserLinksRequest, BatchGetUserLinksResponse>
        batchGetUserLinksSettings() {
      return batchGetUserLinksSettings;
    }

    /** Returns the builder for the settings used for calls to listUserLinks. */
    public PagedCallSettings.Builder<
            ListUserLinksRequest, ListUserLinksResponse, ListUserLinksPagedResponse>
        listUserLinksSettings() {
      return listUserLinksSettings;
    }

    /** Returns the builder for the settings used for calls to auditUserLinks. */
    public PagedCallSettings.Builder<
            AuditUserLinksRequest, AuditUserLinksResponse, AuditUserLinksPagedResponse>
        auditUserLinksSettings() {
      return auditUserLinksSettings;
    }

    /** Returns the builder for the settings used for calls to createUserLink. */
    public UnaryCallSettings.Builder<CreateUserLinkRequest, UserLink> createUserLinkSettings() {
      return createUserLinkSettings;
    }

    /** Returns the builder for the settings used for calls to batchCreateUserLinks. */
    public UnaryCallSettings.Builder<BatchCreateUserLinksRequest, BatchCreateUserLinksResponse>
        batchCreateUserLinksSettings() {
      return batchCreateUserLinksSettings;
    }

    /** Returns the builder for the settings used for calls to updateUserLink. */
    public UnaryCallSettings.Builder<UpdateUserLinkRequest, UserLink> updateUserLinkSettings() {
      return updateUserLinkSettings;
    }

    /** Returns the builder for the settings used for calls to batchUpdateUserLinks. */
    public UnaryCallSettings.Builder<BatchUpdateUserLinksRequest, BatchUpdateUserLinksResponse>
        batchUpdateUserLinksSettings() {
      return batchUpdateUserLinksSettings;
    }

    /** Returns the builder for the settings used for calls to deleteUserLink. */
    public UnaryCallSettings.Builder<DeleteUserLinkRequest, Empty> deleteUserLinkSettings() {
      return deleteUserLinkSettings;
    }

    /** Returns the builder for the settings used for calls to batchDeleteUserLinks. */
    public UnaryCallSettings.Builder<BatchDeleteUserLinksRequest, Empty>
        batchDeleteUserLinksSettings() {
      return batchDeleteUserLinksSettings;
    }

    /** Returns the builder for the settings used for calls to getWebDataStream. */
    public UnaryCallSettings.Builder<GetWebDataStreamRequest, WebDataStream>
        getWebDataStreamSettings() {
      return getWebDataStreamSettings;
    }

    /** Returns the builder for the settings used for calls to deleteWebDataStream. */
    public UnaryCallSettings.Builder<DeleteWebDataStreamRequest, Empty>
        deleteWebDataStreamSettings() {
      return deleteWebDataStreamSettings;
    }

    /** Returns the builder for the settings used for calls to updateWebDataStream. */
    public UnaryCallSettings.Builder<UpdateWebDataStreamRequest, WebDataStream>
        updateWebDataStreamSettings() {
      return updateWebDataStreamSettings;
    }

    /** Returns the builder for the settings used for calls to createWebDataStream. */
    public UnaryCallSettings.Builder<CreateWebDataStreamRequest, WebDataStream>
        createWebDataStreamSettings() {
      return createWebDataStreamSettings;
    }

    /** Returns the builder for the settings used for calls to listWebDataStreams. */
    public PagedCallSettings.Builder<
            ListWebDataStreamsRequest, ListWebDataStreamsResponse, ListWebDataStreamsPagedResponse>
        listWebDataStreamsSettings() {
      return listWebDataStreamsSettings;
    }

    /** Returns the builder for the settings used for calls to getIosAppDataStream. */
    public UnaryCallSettings.Builder<GetIosAppDataStreamRequest, IosAppDataStream>
        getIosAppDataStreamSettings() {
      return getIosAppDataStreamSettings;
    }

    /** Returns the builder for the settings used for calls to deleteIosAppDataStream. */
    public UnaryCallSettings.Builder<DeleteIosAppDataStreamRequest, Empty>
        deleteIosAppDataStreamSettings() {
      return deleteIosAppDataStreamSettings;
    }

    /** Returns the builder for the settings used for calls to updateIosAppDataStream. */
    public UnaryCallSettings.Builder<UpdateIosAppDataStreamRequest, IosAppDataStream>
        updateIosAppDataStreamSettings() {
      return updateIosAppDataStreamSettings;
    }

    /** Returns the builder for the settings used for calls to listIosAppDataStreams. */
    public PagedCallSettings.Builder<
            ListIosAppDataStreamsRequest,
            ListIosAppDataStreamsResponse,
            ListIosAppDataStreamsPagedResponse>
        listIosAppDataStreamsSettings() {
      return listIosAppDataStreamsSettings;
    }

    /** Returns the builder for the settings used for calls to getAndroidAppDataStream. */
    public UnaryCallSettings.Builder<GetAndroidAppDataStreamRequest, AndroidAppDataStream>
        getAndroidAppDataStreamSettings() {
      return getAndroidAppDataStreamSettings;
    }

    /** Returns the builder for the settings used for calls to deleteAndroidAppDataStream. */
    public UnaryCallSettings.Builder<DeleteAndroidAppDataStreamRequest, Empty>
        deleteAndroidAppDataStreamSettings() {
      return deleteAndroidAppDataStreamSettings;
    }

    /** Returns the builder for the settings used for calls to updateAndroidAppDataStream. */
    public UnaryCallSettings.Builder<UpdateAndroidAppDataStreamRequest, AndroidAppDataStream>
        updateAndroidAppDataStreamSettings() {
      return updateAndroidAppDataStreamSettings;
    }

    /** Returns the builder for the settings used for calls to listAndroidAppDataStreams. */
    public PagedCallSettings.Builder<
            ListAndroidAppDataStreamsRequest,
            ListAndroidAppDataStreamsResponse,
            ListAndroidAppDataStreamsPagedResponse>
        listAndroidAppDataStreamsSettings() {
      return listAndroidAppDataStreamsSettings;
    }

    /** Returns the builder for the settings used for calls to getEnhancedMeasurementSettings. */
    public UnaryCallSettings.Builder<
            GetEnhancedMeasurementSettingsRequest, EnhancedMeasurementSettings>
        getEnhancedMeasurementSettingsSettings() {
      return getEnhancedMeasurementSettingsSettings;
    }

    /** Returns the builder for the settings used for calls to updateEnhancedMeasurementSettings. */
    public UnaryCallSettings.Builder<
            UpdateEnhancedMeasurementSettingsRequest, EnhancedMeasurementSettings>
        updateEnhancedMeasurementSettingsSettings() {
      return updateEnhancedMeasurementSettingsSettings;
    }

    /** Returns the builder for the settings used for calls to createFirebaseLink. */
    public UnaryCallSettings.Builder<CreateFirebaseLinkRequest, FirebaseLink>
        createFirebaseLinkSettings() {
      return createFirebaseLinkSettings;
    }

    /** Returns the builder for the settings used for calls to updateFirebaseLink. */
    public UnaryCallSettings.Builder<UpdateFirebaseLinkRequest, FirebaseLink>
        updateFirebaseLinkSettings() {
      return updateFirebaseLinkSettings;
    }

    /** Returns the builder for the settings used for calls to deleteFirebaseLink. */
    public UnaryCallSettings.Builder<DeleteFirebaseLinkRequest, Empty>
        deleteFirebaseLinkSettings() {
      return deleteFirebaseLinkSettings;
    }

    /** Returns the builder for the settings used for calls to listFirebaseLinks. */
    public PagedCallSettings.Builder<
            ListFirebaseLinksRequest, ListFirebaseLinksResponse, ListFirebaseLinksPagedResponse>
        listFirebaseLinksSettings() {
      return listFirebaseLinksSettings;
    }

    /** Returns the builder for the settings used for calls to getGlobalSiteTag. */
    public UnaryCallSettings.Builder<GetGlobalSiteTagRequest, GlobalSiteTag>
        getGlobalSiteTagSettings() {
      return getGlobalSiteTagSettings;
    }

    /** Returns the builder for the settings used for calls to createGoogleAdsLink. */
    public UnaryCallSettings.Builder<CreateGoogleAdsLinkRequest, GoogleAdsLink>
        createGoogleAdsLinkSettings() {
      return createGoogleAdsLinkSettings;
    }

    /** Returns the builder for the settings used for calls to updateGoogleAdsLink. */
    public UnaryCallSettings.Builder<UpdateGoogleAdsLinkRequest, GoogleAdsLink>
        updateGoogleAdsLinkSettings() {
      return updateGoogleAdsLinkSettings;
    }

    /** Returns the builder for the settings used for calls to deleteGoogleAdsLink. */
    public UnaryCallSettings.Builder<DeleteGoogleAdsLinkRequest, Empty>
        deleteGoogleAdsLinkSettings() {
      return deleteGoogleAdsLinkSettings;
    }

    /** Returns the builder for the settings used for calls to listGoogleAdsLinks. */
    public PagedCallSettings.Builder<
            ListGoogleAdsLinksRequest, ListGoogleAdsLinksResponse, ListGoogleAdsLinksPagedResponse>
        listGoogleAdsLinksSettings() {
      return listGoogleAdsLinksSettings;
    }

    /** Returns the builder for the settings used for calls to getDataSharingSettings. */
    public UnaryCallSettings.Builder<GetDataSharingSettingsRequest, DataSharingSettings>
        getDataSharingSettingsSettings() {
      return getDataSharingSettingsSettings;
    }

    /** Returns the builder for the settings used for calls to getMeasurementProtocolSecret. */
    public UnaryCallSettings.Builder<GetMeasurementProtocolSecretRequest, MeasurementProtocolSecret>
        getMeasurementProtocolSecretSettings() {
      return getMeasurementProtocolSecretSettings;
    }

    /** Returns the builder for the settings used for calls to listMeasurementProtocolSecrets. */
    public PagedCallSettings.Builder<
            ListMeasurementProtocolSecretsRequest,
            ListMeasurementProtocolSecretsResponse,
            ListMeasurementProtocolSecretsPagedResponse>
        listMeasurementProtocolSecretsSettings() {
      return listMeasurementProtocolSecretsSettings;
    }

    /** Returns the builder for the settings used for calls to createMeasurementProtocolSecret. */
    public UnaryCallSettings.Builder<
            CreateMeasurementProtocolSecretRequest, MeasurementProtocolSecret>
        createMeasurementProtocolSecretSettings() {
      return createMeasurementProtocolSecretSettings;
    }

    /** Returns the builder for the settings used for calls to deleteMeasurementProtocolSecret. */
    public UnaryCallSettings.Builder<DeleteMeasurementProtocolSecretRequest, Empty>
        deleteMeasurementProtocolSecretSettings() {
      return deleteMeasurementProtocolSecretSettings;
    }

    /** Returns the builder for the settings used for calls to updateMeasurementProtocolSecret. */
    public UnaryCallSettings.Builder<
            UpdateMeasurementProtocolSecretRequest, MeasurementProtocolSecret>
        updateMeasurementProtocolSecretSettings() {
      return updateMeasurementProtocolSecretSettings;
    }

    /** Returns the builder for the settings used for calls to searchChangeHistoryEvents. */
    public PagedCallSettings.Builder<
            SearchChangeHistoryEventsRequest,
            SearchChangeHistoryEventsResponse,
            SearchChangeHistoryEventsPagedResponse>
        searchChangeHistoryEventsSettings() {
      return searchChangeHistoryEventsSettings;
    }

    /** Returns the builder for the settings used for calls to getGoogleSignalsSettings. */
    public UnaryCallSettings.Builder<GetGoogleSignalsSettingsRequest, GoogleSignalsSettings>
        getGoogleSignalsSettingsSettings() {
      return getGoogleSignalsSettingsSettings;
    }

    /** Returns the builder for the settings used for calls to updateGoogleSignalsSettings. */
    public UnaryCallSettings.Builder<UpdateGoogleSignalsSettingsRequest, GoogleSignalsSettings>
        updateGoogleSignalsSettingsSettings() {
      return updateGoogleSignalsSettingsSettings;
    }

    /** Returns the builder for the settings used for calls to createConversionEvent. */
    public UnaryCallSettings.Builder<CreateConversionEventRequest, ConversionEvent>
        createConversionEventSettings() {
      return createConversionEventSettings;
    }

    /** Returns the builder for the settings used for calls to getConversionEvent. */
    public UnaryCallSettings.Builder<GetConversionEventRequest, ConversionEvent>
        getConversionEventSettings() {
      return getConversionEventSettings;
    }

    /** Returns the builder for the settings used for calls to deleteConversionEvent. */
    public UnaryCallSettings.Builder<DeleteConversionEventRequest, Empty>
        deleteConversionEventSettings() {
      return deleteConversionEventSettings;
    }

    /** Returns the builder for the settings used for calls to listConversionEvents. */
    public PagedCallSettings.Builder<
            ListConversionEventsRequest,
            ListConversionEventsResponse,
            ListConversionEventsPagedResponse>
        listConversionEventsSettings() {
      return listConversionEventsSettings;
    }

    /** Returns the builder for the settings used for calls to createCustomDimension. */
    public UnaryCallSettings.Builder<CreateCustomDimensionRequest, CustomDimension>
        createCustomDimensionSettings() {
      return createCustomDimensionSettings;
    }

    /** Returns the builder for the settings used for calls to updateCustomDimension. */
    public UnaryCallSettings.Builder<UpdateCustomDimensionRequest, CustomDimension>
        updateCustomDimensionSettings() {
      return updateCustomDimensionSettings;
    }

    /** Returns the builder for the settings used for calls to listCustomDimensions. */
    public PagedCallSettings.Builder<
            ListCustomDimensionsRequest,
            ListCustomDimensionsResponse,
            ListCustomDimensionsPagedResponse>
        listCustomDimensionsSettings() {
      return listCustomDimensionsSettings;
    }

    /** Returns the builder for the settings used for calls to archiveCustomDimension. */
    public UnaryCallSettings.Builder<ArchiveCustomDimensionRequest, Empty>
        archiveCustomDimensionSettings() {
      return archiveCustomDimensionSettings;
    }

    /** Returns the builder for the settings used for calls to getCustomDimension. */
    public UnaryCallSettings.Builder<GetCustomDimensionRequest, CustomDimension>
        getCustomDimensionSettings() {
      return getCustomDimensionSettings;
    }

    /** Returns the builder for the settings used for calls to createCustomMetric. */
    public UnaryCallSettings.Builder<CreateCustomMetricRequest, CustomMetric>
        createCustomMetricSettings() {
      return createCustomMetricSettings;
    }

    /** Returns the builder for the settings used for calls to updateCustomMetric. */
    public UnaryCallSettings.Builder<UpdateCustomMetricRequest, CustomMetric>
        updateCustomMetricSettings() {
      return updateCustomMetricSettings;
    }

    /** Returns the builder for the settings used for calls to listCustomMetrics. */
    public PagedCallSettings.Builder<
            ListCustomMetricsRequest, ListCustomMetricsResponse, ListCustomMetricsPagedResponse>
        listCustomMetricsSettings() {
      return listCustomMetricsSettings;
    }

    /** Returns the builder for the settings used for calls to archiveCustomMetric. */
    public UnaryCallSettings.Builder<ArchiveCustomMetricRequest, Empty>
        archiveCustomMetricSettings() {
      return archiveCustomMetricSettings;
    }

    /** Returns the builder for the settings used for calls to getCustomMetric. */
    public UnaryCallSettings.Builder<GetCustomMetricRequest, CustomMetric>
        getCustomMetricSettings() {
      return getCustomMetricSettings;
    }

    @Override
    public AnalyticsAdminServiceStubSettings build() throws IOException {
      return new AnalyticsAdminServiceStubSettings(this);
    }
  }
}
