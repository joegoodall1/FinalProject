/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://code.google.com/p/google-apis-client-generator/
 * (build: 2015-08-03 17:34:38 UTC)
 * on 2015-11-05 at 20:54:42 UTC 
 * Modify at your own risk.
 */

package com.example.joe.myapplication.backend.myClassApi;

/**
 * Service definition for MyClassApi (v1).
 *
 * <p>
 * This is an API
 * </p>
 *
 * <p>
 * For more information about this service, see the
 * <a href="" target="_blank">API Documentation</a>
 * </p>
 *
 * <p>
 * This service uses {@link MyClassApiRequestInitializer} to initialize global parameters via its
 * {@link Builder}.
 * </p>
 *
 * @since 1.3
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public class MyClassApi extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient {

  // Note: Leave this static initializer at the top of the file.
  static {
    com.google.api.client.util.Preconditions.checkState(
        com.google.api.client.googleapis.GoogleUtils.MAJOR_VERSION == 1 &&
        com.google.api.client.googleapis.GoogleUtils.MINOR_VERSION >= 15,
        "You are currently running with version %s of google-api-client. " +
        "You need at least version 1.15 of google-api-client to run version " +
        "1.20.0 of the myClassApi library.", com.google.api.client.googleapis.GoogleUtils.VERSION);
  }

  /**
   * The default encoded root URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_ROOT_URL = "https://hale-function-111301.appspot.com/_ah/api/";

  /**
   * The default encoded service path of the service. This is determined when the library is
   * generated and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_SERVICE_PATH = "myClassApi/v1/";

  /**
   * The default encoded base URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   */
  public static final String DEFAULT_BASE_URL = DEFAULT_ROOT_URL + DEFAULT_SERVICE_PATH;

  /**
   * Constructor.
   *
   * <p>
   * Use {@link Builder} if you need to specify any of the optional parameters.
   * </p>
   *
   * @param transport HTTP transport, which should normally be:
   *        <ul>
   *        <li>Google App Engine:
   *        {@code com.google.api.client.extensions.appengine.http.UrlFetchTransport}</li>
   *        <li>Android: {@code newCompatibleTransport} from
   *        {@code com.google.api.client.extensions.android.http.AndroidHttp}</li>
   *        <li>Java: {@link com.google.api.client.googleapis.javanet.GoogleNetHttpTransport#newTrustedTransport()}
   *        </li>
   *        </ul>
   * @param jsonFactory JSON factory, which may be:
   *        <ul>
   *        <li>Jackson: {@code com.google.api.client.json.jackson2.JacksonFactory}</li>
   *        <li>Google GSON: {@code com.google.api.client.json.gson.GsonFactory}</li>
   *        <li>Android Honeycomb or higher:
   *        {@code com.google.api.client.extensions.android.json.AndroidJsonFactory}</li>
   *        </ul>
   * @param httpRequestInitializer HTTP request initializer or {@code null} for none
   * @since 1.7
   */
  public MyClassApi(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
      com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
    this(new Builder(transport, jsonFactory, httpRequestInitializer));
  }

  /**
   * @param builder builder
   */
  MyClassApi(Builder builder) {
    super(builder);
  }

  @Override
  protected void initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest<?> httpClientRequest) throws java.io.IOException {
    super.initialize(httpClientRequest);
  }

  /**
   * Create a request for the method "getMyClass".
   *
   * This request holds the parameters needed by the myClassApi server.  After setting any optional
   * parameters, call the {@link GetMyClass#execute()} method to invoke the remote operation.
   *
   * @param id
   * @return the request
   */
  public GetMyClass getMyClass(java.lang.Long id) throws java.io.IOException {
    GetMyClass result = new GetMyClass(id);
    initialize(result);
    return result;
  }

  public class GetMyClass extends MyClassApiRequest<com.example.joe.myapplication.backend.myClassApi.model.MyClass> {

    private static final String REST_PATH = "myclass/{id}";

    /**
     * Create a request for the method "getMyClass".
     *
     * This request holds the parameters needed by the the myClassApi server.  After setting any
     * optional parameters, call the {@link GetMyClass#execute()} method to invoke the remote
     * operation. <p> {@link
     * GetMyClass#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
     * must be called to initialize this instance immediately after invoking the constructor. </p>
     *
     * @param id
     * @since 1.13
     */
    protected GetMyClass(java.lang.Long id) {
      super(MyClassApi.this, "GET", REST_PATH, null, com.example.joe.myapplication.backend.myClassApi.model.MyClass.class);
      this.id = com.google.api.client.util.Preconditions.checkNotNull(id, "Required parameter id must be specified.");
    }

    @Override
    public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException {
      return super.executeUsingHead();
    }

    @Override
    public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException {
      return super.buildHttpRequestUsingHead();
    }

    @Override
    public GetMyClass setAlt(java.lang.String alt) {
      return (GetMyClass) super.setAlt(alt);
    }

    @Override
    public GetMyClass setFields(java.lang.String fields) {
      return (GetMyClass) super.setFields(fields);
    }

    @Override
    public GetMyClass setKey(java.lang.String key) {
      return (GetMyClass) super.setKey(key);
    }

    @Override
    public GetMyClass setOauthToken(java.lang.String oauthToken) {
      return (GetMyClass) super.setOauthToken(oauthToken);
    }

    @Override
    public GetMyClass setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (GetMyClass) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public GetMyClass setQuotaUser(java.lang.String quotaUser) {
      return (GetMyClass) super.setQuotaUser(quotaUser);
    }

    @Override
    public GetMyClass setUserIp(java.lang.String userIp) {
      return (GetMyClass) super.setUserIp(userIp);
    }

    @com.google.api.client.util.Key
    private java.lang.Long id;

    /**

     */
    public java.lang.Long getId() {
      return id;
    }

    public GetMyClass setId(java.lang.Long id) {
      this.id = id;
      return this;
    }

    @Override
    public GetMyClass set(String parameterName, Object value) {
      return (GetMyClass) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "insertMyClass".
   *
   * This request holds the parameters needed by the myClassApi server.  After setting any optional
   * parameters, call the {@link InsertMyClass#execute()} method to invoke the remote operation.
   *
   * @param content the {@link com.example.joe.myapplication.backend.myClassApi.model.MyClass}
   * @return the request
   */
  public InsertMyClass insertMyClass(com.example.joe.myapplication.backend.myClassApi.model.MyClass content) throws java.io.IOException {
    InsertMyClass result = new InsertMyClass(content);
    initialize(result);
    return result;
  }

  public class InsertMyClass extends MyClassApiRequest<com.example.joe.myapplication.backend.myClassApi.model.MyClass> {

    private static final String REST_PATH = "myclass";

    /**
     * Create a request for the method "insertMyClass".
     *
     * This request holds the parameters needed by the the myClassApi server.  After setting any
     * optional parameters, call the {@link InsertMyClass#execute()} method to invoke the remote
     * operation. <p> {@link InsertMyClass#initialize(com.google.api.client.googleapis.services.Abstra
     * ctGoogleClientRequest)} must be called to initialize this instance immediately after invoking
     * the constructor. </p>
     *
     * @param content the {@link com.example.joe.myapplication.backend.myClassApi.model.MyClass}
     * @since 1.13
     */
    protected InsertMyClass(com.example.joe.myapplication.backend.myClassApi.model.MyClass content) {
      super(MyClassApi.this, "POST", REST_PATH, content, com.example.joe.myapplication.backend.myClassApi.model.MyClass.class);
    }

    @Override
    public InsertMyClass setAlt(java.lang.String alt) {
      return (InsertMyClass) super.setAlt(alt);
    }

    @Override
    public InsertMyClass setFields(java.lang.String fields) {
      return (InsertMyClass) super.setFields(fields);
    }

    @Override
    public InsertMyClass setKey(java.lang.String key) {
      return (InsertMyClass) super.setKey(key);
    }

    @Override
    public InsertMyClass setOauthToken(java.lang.String oauthToken) {
      return (InsertMyClass) super.setOauthToken(oauthToken);
    }

    @Override
    public InsertMyClass setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (InsertMyClass) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public InsertMyClass setQuotaUser(java.lang.String quotaUser) {
      return (InsertMyClass) super.setQuotaUser(quotaUser);
    }

    @Override
    public InsertMyClass setUserIp(java.lang.String userIp) {
      return (InsertMyClass) super.setUserIp(userIp);
    }

    @Override
    public InsertMyClass set(String parameterName, Object value) {
      return (InsertMyClass) super.set(parameterName, value);
    }
  }

  /**
   * Builder for {@link MyClassApi}.
   *
   * <p>
   * Implementation is not thread-safe.
   * </p>
   *
   * @since 1.3.0
   */
  public static final class Builder extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient.Builder {

    /**
     * Returns an instance of a new builder.
     *
     * @param transport HTTP transport, which should normally be:
     *        <ul>
     *        <li>Google App Engine:
     *        {@code com.google.api.client.extensions.appengine.http.UrlFetchTransport}</li>
     *        <li>Android: {@code newCompatibleTransport} from
     *        {@code com.google.api.client.extensions.android.http.AndroidHttp}</li>
     *        <li>Java: {@link com.google.api.client.googleapis.javanet.GoogleNetHttpTransport#newTrustedTransport()}
     *        </li>
     *        </ul>
     * @param jsonFactory JSON factory, which may be:
     *        <ul>
     *        <li>Jackson: {@code com.google.api.client.json.jackson2.JacksonFactory}</li>
     *        <li>Google GSON: {@code com.google.api.client.json.gson.GsonFactory}</li>
     *        <li>Android Honeycomb or higher:
     *        {@code com.google.api.client.extensions.android.json.AndroidJsonFactory}</li>
     *        </ul>
     * @param httpRequestInitializer HTTP request initializer or {@code null} for none
     * @since 1.7
     */
    public Builder(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
        com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
      super(
          transport,
          jsonFactory,
          DEFAULT_ROOT_URL,
          DEFAULT_SERVICE_PATH,
          httpRequestInitializer,
          false);
    }

    /** Builds a new instance of {@link MyClassApi}. */
    @Override
    public MyClassApi build() {
      return new MyClassApi(this);
    }

    @Override
    public Builder setRootUrl(String rootUrl) {
      return (Builder) super.setRootUrl(rootUrl);
    }

    @Override
    public Builder setServicePath(String servicePath) {
      return (Builder) super.setServicePath(servicePath);
    }

    @Override
    public Builder setHttpRequestInitializer(com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
      return (Builder) super.setHttpRequestInitializer(httpRequestInitializer);
    }

    @Override
    public Builder setApplicationName(String applicationName) {
      return (Builder) super.setApplicationName(applicationName);
    }

    @Override
    public Builder setSuppressPatternChecks(boolean suppressPatternChecks) {
      return (Builder) super.setSuppressPatternChecks(suppressPatternChecks);
    }

    @Override
    public Builder setSuppressRequiredParameterChecks(boolean suppressRequiredParameterChecks) {
      return (Builder) super.setSuppressRequiredParameterChecks(suppressRequiredParameterChecks);
    }

    @Override
    public Builder setSuppressAllChecks(boolean suppressAllChecks) {
      return (Builder) super.setSuppressAllChecks(suppressAllChecks);
    }

    /**
     * Set the {@link MyClassApiRequestInitializer}.
     *
     * @since 1.12
     */
    public Builder setMyClassApiRequestInitializer(
        MyClassApiRequestInitializer myclassapiRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(myclassapiRequestInitializer);
    }

    @Override
    public Builder setGoogleClientRequestInitializer(
        com.google.api.client.googleapis.services.GoogleClientRequestInitializer googleClientRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(googleClientRequestInitializer);
    }
  }
}
