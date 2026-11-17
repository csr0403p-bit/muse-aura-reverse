package com.hatch.browser.protocol;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.BV4;
import X.C06H;
import X.C3cI;
import X.C3cJ;
import X.C7384Etj;
import java.util.List;

/* loaded from: classes6.dex */
public final class SdkIdentity {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public String artifactId;
    public String bindingVersion;
    public List<String> features;
    public SdkLimits limits;
    public int policyRevision;
    public int semanticApiVersion;
    public String sourceRevision;
    public String target;

    public SdkIdentity(String str, int i, String str2, String str3, String str4, List<String> list, int i2, SdkLimits sdkLimits) {
        C7384Etj.A0Y(str, 0);
        AnonymousClass005.A16(str2, str3, str4, list, 2);
        C7384Etj.A0Y(sdkLimits, 7);
        this.sourceRevision = str;
        this.semanticApiVersion = i;
        this.bindingVersion = str2;
        this.artifactId = str3;
        this.target = str4;
        this.features = list;
        this.policyRevision = i2;
        this.limits = sdkLimits;
    }

    /* renamed from: copy-T25jWNU, reason: not valid java name */
    public final SdkIdentity m3733copyT25jWNU(String str, int i, String str2, String str3, String str4, List<String> list, int i2, SdkLimits sdkLimits) {
        C7384Etj.A0Y(str, 0);
        AnonymousClass005.A16(str2, str3, str4, list, 2);
        C7384Etj.A0Y(sdkLimits, 7);
        return new SdkIdentity(str, i, str2, str3, str4, list, i2, sdkLimits);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SdkIdentity) {
                SdkIdentity sdkIdentity = (SdkIdentity) obj;
                if (!C7384Etj.areEqual(this.sourceRevision, sdkIdentity.sourceRevision) || this.semanticApiVersion != sdkIdentity.semanticApiVersion || !C7384Etj.areEqual(this.bindingVersion, sdkIdentity.bindingVersion) || !C7384Etj.areEqual(this.artifactId, sdkIdentity.artifactId) || !C7384Etj.areEqual(this.target, sdkIdentity.target) || !C7384Etj.areEqual(this.features, sdkIdentity.features) || this.policyRevision != sdkIdentity.policyRevision || !C7384Etj.areEqual(this.limits, sdkIdentity.limits)) {
                }
            }
            return false;
        }
        return true;
    }

    public final void setArtifactId(String str) {
        C7384Etj.A0Y(str, 0);
        this.artifactId = str;
    }

    public final void setBindingVersion(String str) {
        C7384Etj.A0Y(str, 0);
        this.bindingVersion = str;
    }

    public final void setFeatures(List<String> list) {
        C7384Etj.A0Y(list, 0);
        this.features = list;
    }

    public final void setLimits(SdkLimits sdkLimits) {
        C7384Etj.A0Y(sdkLimits, 0);
        this.limits = sdkLimits;
    }

    public final void setSourceRevision(String str) {
        C7384Etj.A0Y(str, 0);
        this.sourceRevision = str;
    }

    public final void setTarget(String str) {
        C7384Etj.A0Y(str, 0);
        this.target = str;
    }

    public final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: copy-T25jWNU$default, reason: not valid java name */
    public static /* synthetic */ SdkIdentity m3730copyT25jWNU$default(SdkIdentity sdkIdentity, String str, int i, String str2, String str3, String str4, List list, int i2, SdkLimits sdkLimits, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = sdkIdentity.sourceRevision;
        }
        if ((i3 & 2) != 0) {
            i = sdkIdentity.semanticApiVersion;
        }
        if ((i3 & 4) != 0) {
            str2 = sdkIdentity.bindingVersion;
        }
        if ((i3 & 8) != 0) {
            str3 = sdkIdentity.artifactId;
        }
        if ((i3 & 16) != 0) {
            str4 = sdkIdentity.target;
        }
        if ((i3 & 32) != 0) {
            list = sdkIdentity.features;
        }
        if ((i3 & 64) != 0) {
            i2 = sdkIdentity.policyRevision;
        }
        if ((i3 & 128) != 0) {
            sdkLimits = sdkIdentity.limits;
        }
        return sdkIdentity.m3733copyT25jWNU(str, i, str2, str3, str4, list, i2, sdkLimits);
    }

    public final String component1() {
        return this.sourceRevision;
    }

    /* renamed from: component2-pVg5ArA, reason: not valid java name */
    public final int m3731component2pVg5ArA() {
        return this.semanticApiVersion;
    }

    public final String component3() {
        return this.bindingVersion;
    }

    public final String component4() {
        return this.artifactId;
    }

    public final String component5() {
        return this.target;
    }

    public final List<String> component6() {
        return this.features;
    }

    /* renamed from: component7-pVg5ArA, reason: not valid java name */
    public final int m3732component7pVg5ArA() {
        return this.policyRevision;
    }

    public final SdkLimits component8() {
        return this.limits;
    }

    public final String getArtifactId() {
        return this.artifactId;
    }

    public final String getBindingVersion() {
        return this.bindingVersion;
    }

    public final List<String> getFeatures() {
        return this.features;
    }

    public final SdkLimits getLimits() {
        return this.limits;
    }

    /* renamed from: getPolicyRevision-pVg5ArA, reason: not valid java name */
    public final int m3734getPolicyRevisionpVg5ArA() {
        return this.policyRevision;
    }

    /* renamed from: getSemanticApiVersion-pVg5ArA, reason: not valid java name */
    public final int m3735getSemanticApiVersionpVg5ArA() {
        return this.semanticApiVersion;
    }

    public final String getSourceRevision() {
        return this.sourceRevision;
    }

    public final String getTarget() {
        return this.target;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.limits, (AnonymousClass005.A0F(this.features, AnonymousClass005.A0I(this.target, AnonymousClass005.A0I(this.artifactId, AnonymousClass005.A0I(this.bindingVersion, (AnonymousClass001.A0G(this.sourceRevision) + this.semanticApiVersion) * 31)))) + this.policyRevision) * 31);
    }

    /* renamed from: setPolicyRevision-WZ4Q5Ns, reason: not valid java name */
    public final void m3736setPolicyRevisionWZ4Q5Ns(int i) {
        this.policyRevision = i;
    }

    /* renamed from: setSemanticApiVersion-WZ4Q5Ns, reason: not valid java name */
    public final void m3737setSemanticApiVersionWZ4Q5Ns(int i) {
        this.semanticApiVersion = i;
    }

    public String toString() {
        String str = this.sourceRevision;
        String strValueOf = String.valueOf(BV4.A03(this.semanticApiVersion));
        String str2 = this.bindingVersion;
        String str3 = this.artifactId;
        String str4 = this.target;
        List<String> list = this.features;
        String strValueOf2 = String.valueOf(BV4.A03(this.policyRevision));
        SdkLimits sdkLimits = this.limits;
        StringBuilder sbA0x = C3cI.A0x("SdkIdentity(sourceRevision=", str);
        sbA0x.append(", semanticApiVersion=");
        sbA0x.append(strValueOf);
        sbA0x.append(", bindingVersion=");
        sbA0x.append(str2);
        sbA0x.append(", artifactId=");
        sbA0x.append(str3);
        sbA0x.append(", target=");
        sbA0x.append(str4);
        sbA0x.append(", features=");
        sbA0x.append(list);
        sbA0x.append(", policyRevision=");
        sbA0x.append(strValueOf2);
        return C3cJ.A0L(sdkLimits, ", limits=", sbA0x);
    }

    public /* synthetic */ SdkIdentity(String str, int i, String str2, String str3, String str4, List list, int i2, SdkLimits sdkLimits, C06H c06h) {
        this(str, i, str2, str3, str4, list, i2, sdkLimits);
    }
}
