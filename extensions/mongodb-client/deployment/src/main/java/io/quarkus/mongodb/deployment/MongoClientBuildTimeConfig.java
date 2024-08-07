package io.quarkus.mongodb.deployment;

import io.quarkus.runtime.annotations.ConfigDocSection;
import io.quarkus.runtime.annotations.ConfigItem;
import io.quarkus.runtime.annotations.ConfigPhase;
import io.quarkus.runtime.annotations.ConfigRoot;

@ConfigRoot(name = "mongodb", phase = ConfigPhase.BUILD_TIME)
public class MongoClientBuildTimeConfig {
    /**
     * Whether a health check is published in case the smallrye-health extension is present.
     */
    @ConfigItem(name = "health.enabled", defaultValue = "true")
    public boolean healthEnabled;

    /**
     * Whether metrics are published in case a metrics extension is present.
     */
    @ConfigItem(name = "metrics.enabled")
    public boolean metricsEnabled;

    /**
     * If set to true, the default clients will always be created even if there are no injection points that use them
     */
    @ConfigItem(name = "force-default-clients")
    public boolean forceDefaultClients;

    /**
     * Whether or not tracing spans of driver commands are sent in case the quarkus-opentelemetry extension is present.
     */
    @ConfigItem(name = "tracing.enabled")
    public boolean tracingEnabled;

    /**
     * Dev Services.
     * <p>
     * Dev Services allows Quarkus to automatically start MongoDB in dev and test mode.
     */
    @ConfigItem
    @ConfigDocSection(generated = true)
    public DevServicesBuildTimeConfig devservices;
}
