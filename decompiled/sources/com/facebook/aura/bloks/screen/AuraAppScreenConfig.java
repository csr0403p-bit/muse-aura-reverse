package com.facebook.aura.bloks.screen;

import X.C06H;
import X.C7384Etj;
import X.FMd;
import X.HsN;
import X.InterfaceC7962FMs;
import com.facebook.aura.bloks.data.AuraAppDataConfig;
import com.instagram.common.bloks.BloksParseResult;

/* loaded from: classes6.dex */
public final class AuraAppScreenConfig extends AuraAppDataConfig implements InterfaceC7962FMs<AuraAppDataConfig> {
    public static final Companion Companion = new Companion();
    public final Builder builder;

    public final class Builder {
        public BloksParseResult actionLoadingScreen;
        public FMd cdsOpenScreenConfig = FMd.A00(FMd.A0U, 16542);

        public final Builder setCdsOpenScreenConfig(FMd fMd) {
            C7384Etj.A0Y(fMd, 0);
            this.cdsOpenScreenConfig = fMd;
            return this;
        }

        public final void setCdsOpenScreenConfig$fbandroid_express_aura_java_com_facebook_aura_bloks_screen_screen(FMd fMd) {
            C7384Etj.A0Y(fMd, 0);
            this.cdsOpenScreenConfig = fMd;
        }

        public final AuraAppScreenConfig build() {
            return new AuraAppScreenConfig(this);
        }

        public final BloksParseResult getActionLoadingScreen$fbandroid_express_aura_java_com_facebook_aura_bloks_screen_screen() {
            return this.actionLoadingScreen;
        }

        public final FMd getCdsOpenScreenConfig$fbandroid_express_aura_java_com_facebook_aura_bloks_screen_screen() {
            return this.cdsOpenScreenConfig;
        }

        public final Builder setActionLoadingScreen(BloksParseResult bloksParseResult) {
            this.actionLoadingScreen = bloksParseResult;
            return this;
        }

        public final void setActionLoadingScreen$fbandroid_express_aura_java_com_facebook_aura_bloks_screen_screen(BloksParseResult bloksParseResult) {
            this.actionLoadingScreen = bloksParseResult;
        }
    }

    public final class Companion {
        public final Builder builder() {
            return new Builder();
        }

        public Companion() {
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    public AuraAppScreenConfig(Builder builder) {
        C7384Etj.A0Y(builder, 0);
        this.builder = builder;
    }

    public final BloksParseResult getActionLoadingScreen() {
        return this.builder.actionLoadingScreen;
    }

    public /* bridge */ /* synthetic */ HsN getAppDataConfig() {
        return this;
    }

    public final FMd getCdsOpenScreenConfig() {
        return this.builder.cdsOpenScreenConfig;
    }

    /* renamed from: getAppDataConfig, reason: collision with other method in class */
    public AuraAppDataConfig m291getAppDataConfig() {
        return this;
    }
}
