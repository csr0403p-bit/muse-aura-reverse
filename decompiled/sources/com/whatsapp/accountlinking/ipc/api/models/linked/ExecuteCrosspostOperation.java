package com.whatsapp.accountlinking.ipc.api.models.linked;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06H;
import X.C07729ii;
import X.C07779iq;
import X.C0KA;
import X.C2277BSd;
import X.C2hx;
import X.C3cH;
import X.C3cI;
import X.C7384Etj;
import X.C79;
import X.C8j4;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.C9oQ;
import X.F0C;
import X.F60;
import com.whatsapp.accountlinking.ipc.api.models.LinkedOperation;
import java.util.ArrayList;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class ExecuteCrosspostOperation extends LinkedOperation {
    public static final F0C<C9hr<Object>>[] $childSerializers;
    public static final Companion Companion = new Companion();
    public final String backgroundColor;
    public final String colorGradientBottom;
    public final String colorGradientTop;
    public final String crosspostRequestId;
    public final CrosspostShareType crosspostShareType;
    public final String entryPoint;
    public final String flowType;
    public final String foregroundMedia;
    public final boolean isAutoXpost;
    public final String mediaAttributionUrl;
    public final Integer mediaDuration;
    public final ArrayList<String> musicAttributions;
    public final SourceApp sourceApp;
    public final String statusMediaUri;
    public final String storyUniqueId;
    public final ArrayList<String> tappableAreas;
    public final int version;

    public final class Companion {
        public final C9hr<ExecuteCrosspostOperation> serializer() {
            return C9oQ.A00;
        }
    }

    static {
        Integer num = C79.A01;
        $childSerializers = new F0C[]{null, null, null, null, null, null, null, C2277BSd.A00(num, 8), C2277BSd.A00(num, 9), null, null, null, null, null, null, null, null};
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ExecuteCrosspostOperation) {
                ExecuteCrosspostOperation executeCrosspostOperation = (ExecuteCrosspostOperation) obj;
                if (!C7384Etj.areEqual(this.statusMediaUri, executeCrosspostOperation.statusMediaUri) || !C7384Etj.areEqual(this.mediaAttributionUrl, executeCrosspostOperation.mediaAttributionUrl) || !C7384Etj.areEqual(this.storyUniqueId, executeCrosspostOperation.storyUniqueId) || !C7384Etj.areEqual(this.crosspostRequestId, executeCrosspostOperation.crosspostRequestId) || this.sourceApp != executeCrosspostOperation.sourceApp || this.crosspostShareType != executeCrosspostOperation.crosspostShareType || !C7384Etj.areEqual(this.mediaDuration, executeCrosspostOperation.mediaDuration) || !C7384Etj.areEqual(this.tappableAreas, executeCrosspostOperation.tappableAreas) || !C7384Etj.areEqual(this.musicAttributions, executeCrosspostOperation.musicAttributions) || !C7384Etj.areEqual(this.foregroundMedia, executeCrosspostOperation.foregroundMedia) || !C7384Etj.areEqual(this.backgroundColor, executeCrosspostOperation.backgroundColor) || !C7384Etj.areEqual(this.colorGradientTop, executeCrosspostOperation.colorGradientTop) || !C7384Etj.areEqual(this.colorGradientBottom, executeCrosspostOperation.colorGradientBottom) || !C7384Etj.areEqual(this.entryPoint, executeCrosspostOperation.entryPoint) || !C7384Etj.areEqual(this.flowType, executeCrosspostOperation.flowType) || this.isAutoXpost != executeCrosspostOperation.isAutoXpost || this.version != executeCrosspostOperation.version) {
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ ExecuteCrosspostOperation(String str, String str2, String str3, String str4, SourceApp sourceApp, CrosspostShareType crosspostShareType, Integer num, ArrayList arrayList, ArrayList arrayList2, String str5, String str6, String str7, String str8, String str9, String str10, boolean z, int i, int i2, C06H c06h) {
        this(str, str2, str3, str4, sourceApp, crosspostShareType, num, arrayList, arrayList2, str5, str6, str7, str8, (i2 & 8192) != 0 ? null : str9, (i2 & 16384) != 0 ? null : str10, C3cH.A1L(32768, i2, z), (i2 & 65536) != 0 ? 1 : i);
    }

    public static /* synthetic */ ExecuteCrosspostOperation copy$default(ExecuteCrosspostOperation executeCrosspostOperation, String str, String str2, String str3, String str4, SourceApp sourceApp, CrosspostShareType crosspostShareType, Integer num, ArrayList arrayList, ArrayList arrayList2, String str5, String str6, String str7, String str8, String str9, String str10, boolean z, int i, int i2, Object obj) {
        String str11 = str;
        String str12 = str2;
        String str13 = str3;
        String str14 = str4;
        SourceApp sourceApp2 = sourceApp;
        CrosspostShareType crosspostShareType2 = crosspostShareType;
        Integer num2 = num;
        ArrayList arrayList3 = arrayList;
        ArrayList arrayList4 = arrayList2;
        String str15 = str5;
        String str16 = str6;
        String str17 = str7;
        String str18 = str8;
        String str19 = str9;
        String str20 = str10;
        boolean z2 = z;
        int i3 = i;
        if ((i2 & 1) != 0) {
            str11 = executeCrosspostOperation.statusMediaUri;
        }
        if ((i2 & 2) != 0) {
            str12 = executeCrosspostOperation.mediaAttributionUrl;
        }
        if ((i2 & 4) != 0) {
            str13 = executeCrosspostOperation.storyUniqueId;
        }
        if ((i2 & 8) != 0) {
            str14 = executeCrosspostOperation.crosspostRequestId;
        }
        if ((i2 & 16) != 0) {
            sourceApp2 = executeCrosspostOperation.sourceApp;
        }
        if ((i2 & 32) != 0) {
            crosspostShareType2 = executeCrosspostOperation.crosspostShareType;
        }
        if ((i2 & 64) != 0) {
            num2 = executeCrosspostOperation.mediaDuration;
        }
        if ((i2 & 128) != 0) {
            arrayList3 = executeCrosspostOperation.tappableAreas;
        }
        if ((i2 & 256) != 0) {
            arrayList4 = executeCrosspostOperation.musicAttributions;
        }
        if ((i2 & 512) != 0) {
            str15 = executeCrosspostOperation.foregroundMedia;
        }
        if ((i2 & 1024) != 0) {
            str16 = executeCrosspostOperation.backgroundColor;
        }
        if ((i2 & 2048) != 0) {
            str17 = executeCrosspostOperation.colorGradientTop;
        }
        if ((i2 & 4096) != 0) {
            str18 = executeCrosspostOperation.colorGradientBottom;
        }
        if ((i2 & 8192) != 0) {
            str19 = executeCrosspostOperation.entryPoint;
        }
        if ((i2 & 16384) != 0) {
            str20 = executeCrosspostOperation.flowType;
        }
        if ((i2 & 32768) != 0) {
            z2 = executeCrosspostOperation.isAutoXpost;
        }
        if ((i2 & 65536) != 0) {
            i3 = executeCrosspostOperation.version;
        }
        SourceApp sourceApp3 = sourceApp2;
        return executeCrosspostOperation.copy(str11, str12, str13, str14, sourceApp3, crosspostShareType2, num2, arrayList3, arrayList4, str15, str16, str17, str18, str19, str20, z2, i3);
    }

    public static /* synthetic */ void getBackgroundColor$annotations() {
    }

    public static /* synthetic */ void getColorGradientBottom$annotations() {
    }

    public static /* synthetic */ void getColorGradientTop$annotations() {
    }

    public static /* synthetic */ void getCrosspostRequestId$annotations() {
    }

    @Serializable(with = CrosspostShareTypeSerializer.class)
    public static /* synthetic */ void getCrosspostShareType$annotations() {
    }

    public static /* synthetic */ void getEntryPoint$annotations() {
    }

    public static /* synthetic */ void getFlowType$annotations() {
    }

    public static /* synthetic */ void getForegroundMedia$annotations() {
    }

    public static /* synthetic */ void getMediaAttributionUrl$annotations() {
    }

    public static /* synthetic */ void getMediaDuration$annotations() {
    }

    public static /* synthetic */ void getMusicAttributions$annotations() {
    }

    @Serializable(with = SourceAppSerializer.class)
    public static /* synthetic */ void getSourceApp$annotations() {
    }

    public static /* synthetic */ void getStatusMediaUri$annotations() {
    }

    public static /* synthetic */ void getStoryUniqueId$annotations() {
    }

    public static /* synthetic */ void getTappableAreas$annotations() {
    }

    public static /* synthetic */ void getVersion$annotations() {
    }

    public static /* synthetic */ void isAutoXpost$annotations() {
    }

    public static final /* synthetic */ void write$Self$java_com_whatsapp_accountlinking_ipc_api_api(ExecuteCrosspostOperation executeCrosspostOperation, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        c9j5.AAV(executeCrosspostOperation.statusMediaUri, c9iZ, 0);
        c9j5.AAV(executeCrosspostOperation.mediaAttributionUrl, c9iZ, 1);
        c9j5.AAV(executeCrosspostOperation.storyUniqueId, c9iZ, 2);
        c9j5.AAV(executeCrosspostOperation.crosspostRequestId, c9iZ, 3);
        c9j5.AAQ(executeCrosspostOperation.sourceApp, SourceAppSerializer.A00, c9iZ, 4);
        c9j5.AAQ(executeCrosspostOperation.crosspostShareType, CrosspostShareTypeSerializer.A00, c9iZ, 5);
        c9j5.AAP(executeCrosspostOperation.mediaDuration, C07729ii.A00, c9iZ, 6);
        c9j5.AAP(executeCrosspostOperation.tappableAreas, C3cH.A15(f0cArr, 7), c9iZ, 7);
        c9j5.AAP(executeCrosspostOperation.musicAttributions, C3cH.A15(f0cArr, 8), c9iZ, 8);
        C07779iq c07779iq = C07779iq.A01;
        c9j5.AAP(executeCrosspostOperation.foregroundMedia, c07779iq, c9iZ, 9);
        c9j5.AAP(executeCrosspostOperation.backgroundColor, c07779iq, c9iZ, 10);
        c9j5.AAP(executeCrosspostOperation.colorGradientTop, c07779iq, c9iZ, 11);
        c9j5.AAP(executeCrosspostOperation.colorGradientBottom, c07779iq, c9iZ, 12);
        boolean zAfR = c9j5.AfR();
        if (zAfR || executeCrosspostOperation.entryPoint != null) {
            c9j5.AAP(executeCrosspostOperation.entryPoint, c07779iq, c9iZ, 13);
        }
        String str = executeCrosspostOperation.flowType;
        if (str != null) {
            c9j5.AAP(str, c07779iq, c9iZ, 14);
        }
        if (zAfR || executeCrosspostOperation.isAutoXpost) {
            c9j5.AA7(c9iZ, 15, executeCrosspostOperation.isAutoXpost);
        }
        if (zAfR || executeCrosspostOperation.version != 1) {
            c9j5.AAK(c9iZ, 16, executeCrosspostOperation.version);
        }
    }

    public final String component1() {
        return this.statusMediaUri;
    }

    public final String component10() {
        return this.foregroundMedia;
    }

    public final String component11() {
        return this.backgroundColor;
    }

    public final String component12() {
        return this.colorGradientTop;
    }

    public final String component13() {
        return this.colorGradientBottom;
    }

    public final String component14() {
        return this.entryPoint;
    }

    public final String component15() {
        return this.flowType;
    }

    public final boolean component16() {
        return this.isAutoXpost;
    }

    public final int component17() {
        return this.version;
    }

    public final String component2() {
        return this.mediaAttributionUrl;
    }

    public final String component3() {
        return this.storyUniqueId;
    }

    public final String component4() {
        return this.crosspostRequestId;
    }

    public final SourceApp component5() {
        return this.sourceApp;
    }

    public final CrosspostShareType component6() {
        return this.crosspostShareType;
    }

    public final Integer component7() {
        return this.mediaDuration;
    }

    public final ArrayList<String> component8() {
        return this.tappableAreas;
    }

    public final ArrayList<String> component9() {
        return this.musicAttributions;
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final String getColorGradientBottom() {
        return this.colorGradientBottom;
    }

    public final String getColorGradientTop() {
        return this.colorGradientTop;
    }

    public final String getCrosspostRequestId() {
        return this.crosspostRequestId;
    }

    public final CrosspostShareType getCrosspostShareType() {
        return this.crosspostShareType;
    }

    public final String getEntryPoint() {
        return this.entryPoint;
    }

    public final String getFlowType() {
        return this.flowType;
    }

    public final String getForegroundMedia() {
        return this.foregroundMedia;
    }

    public final String getMediaAttributionUrl() {
        return this.mediaAttributionUrl;
    }

    public final Integer getMediaDuration() {
        return this.mediaDuration;
    }

    public final ArrayList<String> getMusicAttributions() {
        return this.musicAttributions;
    }

    public final SourceApp getSourceApp() {
        return this.sourceApp;
    }

    public final String getStatusMediaUri() {
        return this.statusMediaUri;
    }

    public final String getStoryUniqueId() {
        return this.storyUniqueId;
    }

    public final ArrayList<String> getTappableAreas() {
        return this.tappableAreas;
    }

    @Override // com.whatsapp.accountlinking.ipc.api.models.Operation
    public int getVersion() {
        return this.version;
    }

    public int hashCode() {
        return C0KA.A01((((((((((((((((((AnonymousClass005.A0F(this.crosspostShareType, AnonymousClass005.A0F(this.sourceApp, AnonymousClass005.A0I(this.crosspostRequestId, AnonymousClass005.A0I(this.storyUniqueId, AnonymousClass005.A0I(this.mediaAttributionUrl, AnonymousClass001.A0G(this.statusMediaUri)))))) + AnonymousClass006.A0D(this.mediaDuration)) * 31) + AnonymousClass006.A0D(this.tappableAreas)) * 31) + AnonymousClass006.A0D(this.musicAttributions)) * 31) + AnonymousClass006.A0G(this.foregroundMedia)) * 31) + AnonymousClass006.A0G(this.backgroundColor)) * 31) + AnonymousClass006.A0G(this.colorGradientTop)) * 31) + AnonymousClass006.A0G(this.colorGradientBottom)) * 31) + AnonymousClass006.A0G(this.entryPoint)) * 31) + AnonymousClass005.A0H(this.flowType)) * 31, this.isAutoXpost) + this.version;
    }

    public final boolean isAutoXpost() {
        return this.isAutoXpost;
    }

    public String toString() {
        String str = this.statusMediaUri;
        String str2 = this.mediaAttributionUrl;
        String str3 = this.storyUniqueId;
        String str4 = this.crosspostRequestId;
        SourceApp sourceApp = this.sourceApp;
        CrosspostShareType crosspostShareType = this.crosspostShareType;
        Integer num = this.mediaDuration;
        ArrayList<String> arrayList = this.tappableAreas;
        ArrayList<String> arrayList2 = this.musicAttributions;
        String str5 = this.foregroundMedia;
        String str6 = this.backgroundColor;
        String str7 = this.colorGradientTop;
        String str8 = this.colorGradientBottom;
        String str9 = this.entryPoint;
        String str10 = this.flowType;
        boolean z = this.isAutoXpost;
        int i = this.version;
        StringBuilder sbA0x = C3cI.A0x("ExecuteCrosspostOperation(statusMediaUri=", str);
        sbA0x.append(", mediaAttributionUrl=");
        sbA0x.append(str2);
        sbA0x.append(", storyUniqueId=");
        sbA0x.append(str3);
        sbA0x.append(", crosspostRequestId=");
        sbA0x.append(str4);
        sbA0x.append(", sourceApp=");
        sbA0x.append(sourceApp);
        sbA0x.append(", crosspostShareType=");
        sbA0x.append(crosspostShareType);
        sbA0x.append(", mediaDuration=");
        sbA0x.append(num);
        sbA0x.append(", tappableAreas=");
        sbA0x.append(arrayList);
        sbA0x.append(", musicAttributions=");
        sbA0x.append(arrayList2);
        sbA0x.append(", foregroundMedia=");
        sbA0x.append(str5);
        sbA0x.append(", backgroundColor=");
        sbA0x.append(str6);
        sbA0x.append(", colorGradientTop=");
        sbA0x.append(str7);
        sbA0x.append(", colorGradientBottom=");
        sbA0x.append(str8);
        sbA0x.append(", entryPoint=");
        sbA0x.append(str9);
        sbA0x.append(", flowType=");
        sbA0x.append(str10);
        sbA0x.append(", isAutoXpost=");
        sbA0x.append(z);
        C8j4.A1Q(sbA0x, i);
        return AnonymousClass001.A0v(")", sbA0x);
    }

    public final ExecuteCrosspostOperation copy(String str, String str2, String str3, String str4, SourceApp sourceApp, CrosspostShareType crosspostShareType, Integer num, ArrayList<String> arrayList, ArrayList<String> arrayList2, String str5, String str6, String str7, String str8, String str9, String str10, boolean z, int i) {
        AnonymousClass005.A17(str, str2, str3, str4, sourceApp);
        C7384Etj.A0Y(crosspostShareType, 5);
        return new ExecuteCrosspostOperation(str, str2, str3, str4, sourceApp, crosspostShareType, num, arrayList, arrayList2, str5, str6, str7, str8, str9, str10, z, i);
    }

    public /* synthetic */ ExecuteCrosspostOperation(int i, String str, String str2, String str3, String str4, SourceApp sourceApp, CrosspostShareType crosspostShareType, Integer num, ArrayList arrayList, ArrayList arrayList2, String str5, String str6, String str7, String str8, String str9, String str10, boolean z, int i2, C2hx c2hx) {
        boolean z2 = z;
        int i3 = i2;
        if (8191 != (i & 8191)) {
            C9iI.A00(C9oQ.A01, i, 8191);
            throw F60.createAndThrow();
        }
        this.statusMediaUri = str;
        this.mediaAttributionUrl = str2;
        this.storyUniqueId = str3;
        this.crosspostRequestId = str4;
        this.sourceApp = sourceApp;
        this.crosspostShareType = crosspostShareType;
        this.mediaDuration = num;
        this.tappableAreas = arrayList;
        this.musicAttributions = arrayList2;
        this.foregroundMedia = str5;
        this.backgroundColor = str6;
        this.colorGradientTop = str7;
        this.colorGradientBottom = str8;
        if ((i & 8192) == 0) {
            this.entryPoint = null;
        } else {
            this.entryPoint = str9;
        }
        if ((i & 16384) == 0) {
            this.flowType = null;
        } else {
            this.flowType = str10;
        }
        this.isAutoXpost = (32768 & i) == 0 ? false : z2;
        this.version = (i & 65536) == 0 ? 1 : i3;
    }

    public ExecuteCrosspostOperation(String str, String str2, String str3, String str4, SourceApp sourceApp, CrosspostShareType crosspostShareType, Integer num, ArrayList<String> arrayList, ArrayList<String> arrayList2, String str5, String str6, String str7, String str8, String str9, String str10, boolean z, int i) {
        AnonymousClass005.A17(str, str2, str3, str4, sourceApp);
        C7384Etj.A0Y(crosspostShareType, 5);
        this.statusMediaUri = str;
        this.mediaAttributionUrl = str2;
        this.storyUniqueId = str3;
        this.crosspostRequestId = str4;
        this.sourceApp = sourceApp;
        this.crosspostShareType = crosspostShareType;
        this.mediaDuration = num;
        this.tappableAreas = arrayList;
        this.musicAttributions = arrayList2;
        this.foregroundMedia = str5;
        this.backgroundColor = str6;
        this.colorGradientTop = str7;
        this.colorGradientBottom = str8;
        this.entryPoint = str9;
        this.flowType = str10;
        this.isAutoXpost = z;
        this.version = i;
    }
}
