package com.facebook.aura.bloks.data;

import X.AbstractC7976FNr;
import X.AnonymousClass005;
import X.C06G;
import X.C06H;
import X.C3cG;
import X.C3cJ;
import X.C7384Etj;
import X.Dca;
import X.Huk;
import android.content.Context;
import java.util.Map;

/* loaded from: classes6.dex */
public final class AuraBloksDataEmitter extends AbstractC7976FNr<Huk, Config> {
    public static final Companion Companion = new Companion();
    public final Config config;
    public final AuraBloksDataFetcher dataFetcher;

    public final class Config extends C06G {
        public final String appId;
        public final Context context;
        public final Map<String, String> params;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Config) {
                    Config config = (Config) obj;
                    if (!C7384Etj.areEqual(this.context, config.context) || !C7384Etj.areEqual(this.appId, config.appId) || !C7384Etj.areEqual(this.params, config.params)) {
                    }
                }
                return false;
            }
            return true;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Config copy$default(Config config, Context context, String str, Map map, int i, Object obj) {
            if ((i & 1) != 0) {
                context = config.context;
            }
            if ((i & 2) != 0) {
                str = config.appId;
            }
            if ((i & 4) != 0) {
                map = config.params;
            }
            return config.copy(context, str, map);
        }

        public final Context component1() {
            return this.context;
        }

        public final String component2() {
            return this.appId;
        }

        public final Map<String, String> component3() {
            return this.params;
        }

        public final String getAppId() {
            return this.appId;
        }

        public final Context getContext() {
            return this.context;
        }

        public final Map<String, String> getParams() {
            return this.params;
        }

        public int hashCode() {
            return AnonymousClass005.A0G(this.params, AnonymousClass005.A0I(this.appId, AnonymousClass005.A0E(this.context)));
        }

        public String toString() {
            Context context = this.context;
            String str = this.appId;
            Map<String, String> map = this.params;
            StringBuilder sbA0f = C3cG.A0f(context, "Config(context=");
            sbA0f.append(", appId=");
            sbA0f.append(str);
            return C3cJ.A0L(map, ", params=", sbA0f);
        }

        public Config(Context context, String str, Map<String, String> map) {
            AnonymousClass005.A0x(context, str, map);
            this.context = context;
            this.appId = str;
            this.params = map;
        }

        public final Config copy(Context context, String str, Map<String, String> map) {
            AnonymousClass005.A0x(context, str, map);
            return new Config(context, str, map);
        }
    }

    public AuraBloksDataEmitter(Config config) {
        C7384Etj.A0Y(config, 0);
        this.config = config;
        this.dataFetcher = new AuraBloksDataFetcher();
    }

    public final class Companion {
        public final AuraBloksDataEmitter create(Config config) {
            C7384Etj.A0Y(config, 0);
            return new AuraBloksDataEmitter(config);
        }

        public Companion() {
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    public final Config getConfig() {
        return this.config;
    }

    @Override // X.AbstractC7976FNr
    public void onFetch(int i) {
        AuraBloksDataFetcher auraBloksDataFetcher = this.dataFetcher;
        Config config = this.config;
        auraBloksDataFetcher.fetch(config.context, config.appId, config.params, new AuraAppDataConfig(), new Dca() { // from class: com.facebook.aura.bloks.data.AuraBloksDataEmitter.onFetch.1
            @Override // X.Dca
            public void onResponse(Huk huk) {
                C7384Etj.A0Y(huk, 0);
                AuraBloksDataEmitter.this.emitResult(huk);
            }
        });
    }

    @Override // X.AbstractC7976FNr
    public void onStop() {
    }
}
