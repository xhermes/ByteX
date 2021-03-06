package com.ss.android.ugc.bytex.transformer;

/**
 * Created by yangzhiqian on 2020/9/22<br/>
 */
public class TransformOptions {
    private final boolean isPluginIncremental;
    private final boolean shouldSaveCache;
    private final boolean useRawCache;
    private final boolean useFixedTimestamp;
    private final boolean forbidUseLenientMutationDuringGetArtifact;

    private TransformOptions(Builder builder) {
        this.isPluginIncremental = builder.isPluginIncremental;
        this.shouldSaveCache = builder.shouldSaveCache;
        this.useRawCache = builder.useRawCache;
        this.useFixedTimestamp = builder.useFixedTimestamp;
        this.forbidUseLenientMutationDuringGetArtifact = builder.forbidUseLenientMutationDuringGetArtifact;
    }

    public boolean isPluginIncremental() {
        return isPluginIncremental;
    }

    public boolean isShouldSaveCache() {
        return shouldSaveCache;
    }

    public boolean isUseRawCache() {
        return useRawCache;
    }

    public boolean isUseFixedTimestamp() {
        return useFixedTimestamp;
    }

    public boolean isForbidUseLenientMutationDuringGetArtifact() {
        return forbidUseLenientMutationDuringGetArtifact;
    }

    public static class Builder {
        private boolean isPluginIncremental = true;
        private boolean shouldSaveCache = true;
        private boolean useRawCache = true;
        private boolean useFixedTimestamp = false;
        private boolean forbidUseLenientMutationDuringGetArtifact = false;

        public Builder setPluginIncremental(boolean pluginIncremental) {
            isPluginIncremental = pluginIncremental;
            return this;
        }

        public Builder setShouldSaveCache(boolean shouldSaveCache) {
            this.shouldSaveCache = shouldSaveCache;
            return this;
        }

        public Builder setUseRawCache(boolean useRawCache) {
            this.useRawCache = useRawCache;
            return this;
        }

        public Builder setUseFixedTimestamp(boolean useFixedTimestamp) {
            this.useFixedTimestamp = useFixedTimestamp;
            return this;
        }


        public Builder setForbidUseLenientMutationDuringGetArtifact(boolean forbidUseLenientMutationDuringGetArtifact) {
            this.forbidUseLenientMutationDuringGetArtifact = forbidUseLenientMutationDuringGetArtifact;
            return this;
        }

        public TransformOptions build() {
            return new TransformOptions(this);
        }
    }
}
