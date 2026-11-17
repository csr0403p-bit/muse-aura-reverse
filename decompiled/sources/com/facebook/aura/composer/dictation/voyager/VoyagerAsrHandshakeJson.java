package com.facebook.aura.composer.dictation.voyager;

import X.AbstractC5321DgF;
import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C2hx;
import X.C3cH;
import X.C7384Etj;
import X.C79;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F0C;
import X.F60;
import java.util.List;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class VoyagerAsrHandshakeJson extends C06G {
    public final String audioEncoding;
    public final VoyagerAsrAuthorizationJson authorization;
    public final List<String> languageBias;
    public final String mode;
    public final String model;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = {null, null, null, null, AbstractC5321DgF.A02(C79.A01, VoyagerAsrHandshakeJson$Companion$$childSerializers$1.INSTANCE)};

    public final class Companion {
        public final C9hr<VoyagerAsrHandshakeJson> serializer() {
            return VoyagerAsrHandshakeJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof VoyagerAsrHandshakeJson) {
                VoyagerAsrHandshakeJson voyagerAsrHandshakeJson = (VoyagerAsrHandshakeJson) obj;
                if (!C7384Etj.areEqual(this.mode, voyagerAsrHandshakeJson.mode) || !C7384Etj.areEqual(this.authorization, voyagerAsrHandshakeJson.authorization) || !C7384Etj.areEqual(this.audioEncoding, voyagerAsrHandshakeJson.audioEncoding) || !C7384Etj.areEqual(this.model, voyagerAsrHandshakeJson.model) || !C7384Etj.areEqual(this.languageBias, voyagerAsrHandshakeJson.languageBias)) {
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ VoyagerAsrHandshakeJson(int i, String str, VoyagerAsrAuthorizationJson voyagerAsrAuthorizationJson, String str2, String str3, List list, C2hx c2hx) {
        if (31 != (i & 31)) {
            C9iI.A00(VoyagerAsrHandshakeJson$$serializer.descriptor, i, 31);
            throw F60.createAndThrow();
        }
        this.mode = str;
        this.authorization = voyagerAsrAuthorizationJson;
        this.audioEncoding = str2;
        this.model = str3;
        this.languageBias = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VoyagerAsrHandshakeJson copy$default(VoyagerAsrHandshakeJson voyagerAsrHandshakeJson, String str, VoyagerAsrAuthorizationJson voyagerAsrAuthorizationJson, String str2, String str3, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = voyagerAsrHandshakeJson.mode;
        }
        if ((i & 2) != 0) {
            voyagerAsrAuthorizationJson = voyagerAsrHandshakeJson.authorization;
        }
        if ((i & 4) != 0) {
            str2 = voyagerAsrHandshakeJson.audioEncoding;
        }
        if ((i & 8) != 0) {
            str3 = voyagerAsrHandshakeJson.model;
        }
        if ((i & 16) != 0) {
            list = voyagerAsrHandshakeJson.languageBias;
        }
        return voyagerAsrHandshakeJson.copy(str, voyagerAsrAuthorizationJson, str2, str3, list);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_composer_dictation_voyager_voyager(VoyagerAsrHandshakeJson voyagerAsrHandshakeJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        c9j5.AAV(voyagerAsrHandshakeJson.mode, c9iZ, 0);
        c9j5.AAQ(voyagerAsrHandshakeJson.authorization, VoyagerAsrAuthorizationJson$$serializer.INSTANCE, c9iZ, 1);
        c9j5.AAV(voyagerAsrHandshakeJson.audioEncoding, c9iZ, 2);
        c9j5.AAV(voyagerAsrHandshakeJson.model, c9iZ, 3);
        c9j5.AAP(voyagerAsrHandshakeJson.languageBias, C3cH.A15(f0cArr, 4), c9iZ, 4);
    }

    public final String component1() {
        return this.mode;
    }

    public final VoyagerAsrAuthorizationJson component2() {
        return this.authorization;
    }

    public final String component3() {
        return this.audioEncoding;
    }

    public final String component4() {
        return this.model;
    }

    public final List<String> component5() {
        return this.languageBias;
    }

    public final String getAudioEncoding() {
        return this.audioEncoding;
    }

    public final VoyagerAsrAuthorizationJson getAuthorization() {
        return this.authorization;
    }

    public final List<String> getLanguageBias() {
        return this.languageBias;
    }

    public final String getMode() {
        return this.mode;
    }

    public final String getModel() {
        return this.model;
    }

    public int hashCode() {
        return AnonymousClass005.A0I(this.model, AnonymousClass005.A0I(this.audioEncoding, AnonymousClass005.A0F(this.authorization, AnonymousClass001.A0G(this.mode)))) + AnonymousClass006.A0D(this.languageBias);
    }

    public final VoyagerAsrHandshakeJson copy(String str, VoyagerAsrAuthorizationJson voyagerAsrAuthorizationJson, String str2, String str3, List<String> list) {
        AnonymousClass005.A14(str, voyagerAsrAuthorizationJson, str2, str3);
        return new VoyagerAsrHandshakeJson(str, voyagerAsrAuthorizationJson, str2, str3, list);
    }

    public String toString() {
        return super.toString();
    }

    public VoyagerAsrHandshakeJson(String str, VoyagerAsrAuthorizationJson voyagerAsrAuthorizationJson, String str2, String str3, List<String> list) {
        AnonymousClass005.A14(str, voyagerAsrAuthorizationJson, str2, str3);
        this.mode = str;
        this.authorization = voyagerAsrAuthorizationJson;
        this.audioEncoding = str2;
        this.model = str3;
        this.languageBias = list;
    }
}
