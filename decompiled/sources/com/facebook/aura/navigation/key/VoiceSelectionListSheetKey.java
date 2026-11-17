package com.facebook.aura.navigation.key;

import X.AbstractC5321DgF;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C0881AGi;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C3cI;
import X.C7384Etj;
import X.C79;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F0C;
import X.F60;
import com.facebook.aura.analytics.hatch.HatchOrigin;
import com.facebook.aura.navigation.AuraBottomSheetNavKey;
import java.util.List;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class VoiceSelectionListSheetKey extends C06G implements AuraBottomSheetNavKey {
    public static final F0C<C9hr<Object>>[] $childSerializers;
    public static final Companion Companion = new Companion();
    public final String contentKey;
    public final VoiceEntryPoint entryPoint;
    public final HatchOrigin origin;
    public final String replyToMessageId;
    public final String sourceHostMessageId;
    public final String sourceWidgetId;
    public final List<String> suggestedVoiceIds;
    public final String threadId;

    public final class Companion {
        public final C9hr<VoiceSelectionListSheetKey> serializer() {
            return VoiceSelectionListSheetKey$$serializer.INSTANCE;
        }

        public static /* synthetic */ VoiceSelectionListSheetKey invoke$default(Companion companion, List list, HatchOrigin hatchOrigin, String str, String str2, String str3, String str4, VoiceEntryPoint voiceEntryPoint, String str5, int i, Object obj) {
            List<String> listA10 = C3cI.A10(list, i);
            if ((i & 4) != 0) {
                str = null;
            }
            if ((i & 8) != 0) {
                str2 = null;
            }
            if ((i & 128) != 0) {
                str5 = AnonymousClass002.A0k();
            }
            return companion.invoke(listA10, hatchOrigin, str, str2, str3, str4, voiceEntryPoint, str5);
        }

        public final VoiceSelectionListSheetKey invoke(List<String> list, HatchOrigin hatchOrigin, String str, String str2, String str3, String str4, VoiceEntryPoint voiceEntryPoint, String str5) {
            AnonymousClass003.A0u(list, hatchOrigin);
            AnonymousClass003.A10(voiceEntryPoint, str5);
            return new VoiceSelectionListSheetKey(list, hatchOrigin, str, str2, str3, str4, voiceEntryPoint, str5);
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    static {
        Integer num = C79.A01;
        $childSerializers = new F0C[]{AbstractC5321DgF.A02(num, VoiceSelectionListSheetKey$Companion$$childSerializers$1.INSTANCE), AbstractC5321DgF.A02(num, VoiceSelectionListSheetKey$Companion$$childSerializers$2.INSTANCE), null, null, null, null, AbstractC5321DgF.A02(num, VoiceSelectionListSheetKey$Companion$$childSerializers$3.INSTANCE), null};
    }

    public static /* synthetic */ VoiceSelectionListSheetKey copy$default(VoiceSelectionListSheetKey voiceSelectionListSheetKey, List list, HatchOrigin hatchOrigin, String str, String str2, String str3, String str4, VoiceEntryPoint voiceEntryPoint, String str5, int i, Object obj) {
        List list2 = list;
        HatchOrigin hatchOrigin2 = hatchOrigin;
        String str6 = str;
        String str7 = str2;
        String str8 = str3;
        String str9 = str4;
        VoiceEntryPoint voiceEntryPoint2 = voiceEntryPoint;
        String str10 = str5;
        if ((i & 1) != 0) {
            list2 = voiceSelectionListSheetKey.suggestedVoiceIds;
        }
        if ((i & 2) != 0) {
            hatchOrigin2 = voiceSelectionListSheetKey.origin;
        }
        if ((i & 4) != 0) {
            str6 = voiceSelectionListSheetKey.threadId;
        }
        if ((i & 8) != 0) {
            str7 = voiceSelectionListSheetKey.replyToMessageId;
        }
        if ((i & 16) != 0) {
            str8 = voiceSelectionListSheetKey.sourceWidgetId;
        }
        if ((i & 32) != 0) {
            str9 = voiceSelectionListSheetKey.sourceHostMessageId;
        }
        if ((i & 64) != 0) {
            voiceEntryPoint2 = voiceSelectionListSheetKey.entryPoint;
        }
        if ((i & 128) != 0) {
            str10 = voiceSelectionListSheetKey.contentKey;
        }
        return new VoiceSelectionListSheetKey(list2, hatchOrigin2, str6, str7, str8, str9, voiceEntryPoint2, str10);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof VoiceSelectionListSheetKey) {
                VoiceSelectionListSheetKey voiceSelectionListSheetKey = (VoiceSelectionListSheetKey) obj;
                if (!C7384Etj.areEqual(this.suggestedVoiceIds, voiceSelectionListSheetKey.suggestedVoiceIds) || this.origin != voiceSelectionListSheetKey.origin || !C7384Etj.areEqual(this.threadId, voiceSelectionListSheetKey.threadId) || !C7384Etj.areEqual(this.replyToMessageId, voiceSelectionListSheetKey.replyToMessageId) || !C7384Etj.areEqual(this.sourceWidgetId, voiceSelectionListSheetKey.sourceWidgetId) || !C7384Etj.areEqual(this.sourceHostMessageId, voiceSelectionListSheetKey.sourceHostMessageId) || this.entryPoint != voiceSelectionListSheetKey.entryPoint || !C7384Etj.areEqual(this.contentKey, voiceSelectionListSheetKey.contentKey)) {
                }
            }
            return false;
        }
        return true;
    }

    private final VoiceSelectionListSheetKey copy(List<String> list, HatchOrigin hatchOrigin, String str, String str2, String str3, String str4, VoiceEntryPoint voiceEntryPoint, String str5) {
        return new VoiceSelectionListSheetKey(list, hatchOrigin, str, str2, str3, str4, voiceEntryPoint, str5);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_navigation_key_key(VoiceSelectionListSheetKey voiceSelectionListSheetKey, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        boolean zAfR = c9j5.AfR();
        if (zAfR || !C3cG.A1L(voiceSelectionListSheetKey.suggestedVoiceIds)) {
            c9j5.AAQ(voiceSelectionListSheetKey.suggestedVoiceIds, C3cH.A15(f0cArr, 0), c9iZ, 0);
        }
        c9j5.AAQ(voiceSelectionListSheetKey.origin, C3cH.A15(f0cArr, 1), c9iZ, 1);
        if (zAfR || voiceSelectionListSheetKey.threadId != null) {
            c9j5.AAP(voiceSelectionListSheetKey.threadId, C07779iq.A01, c9iZ, 2);
        }
        if (zAfR || voiceSelectionListSheetKey.replyToMessageId != null) {
            c9j5.AAP(voiceSelectionListSheetKey.replyToMessageId, C07779iq.A01, c9iZ, 3);
        }
        if (zAfR || voiceSelectionListSheetKey.sourceWidgetId != null) {
            c9j5.AAP(voiceSelectionListSheetKey.sourceWidgetId, C07779iq.A01, c9iZ, 4);
        }
        if (zAfR || voiceSelectionListSheetKey.sourceHostMessageId != null) {
            c9j5.AAP(voiceSelectionListSheetKey.sourceHostMessageId, C07779iq.A01, c9iZ, 5);
        }
        if (zAfR || voiceSelectionListSheetKey.entryPoint != VoiceEntryPoint.VOICE_WIDGET) {
            c9j5.AAQ(voiceSelectionListSheetKey.entryPoint, C3cH.A15(f0cArr, 6), c9iZ, 6);
        }
        if (!zAfR) {
            if (AnonymousClass002.A0k().equals(voiceSelectionListSheetKey.contentKey)) {
                return;
            }
        }
        c9j5.AAV(voiceSelectionListSheetKey.contentKey, c9iZ, 7);
    }

    public final List<String> component1() {
        return this.suggestedVoiceIds;
    }

    public final HatchOrigin component2() {
        return this.origin;
    }

    public final String component3() {
        return this.threadId;
    }

    public final String component4() {
        return this.replyToMessageId;
    }

    public final String component5() {
        return this.sourceWidgetId;
    }

    public final String component6() {
        return this.sourceHostMessageId;
    }

    public final VoiceEntryPoint component7() {
        return this.entryPoint;
    }

    public final String component8() {
        return this.contentKey;
    }

    public final String getContentKey() {
        return this.contentKey;
    }

    public final VoiceEntryPoint getEntryPoint() {
        return this.entryPoint;
    }

    public final HatchOrigin getOrigin() {
        return this.origin;
    }

    public final String getReplyToMessageId() {
        return this.replyToMessageId;
    }

    public final String getSourceHostMessageId() {
        return this.sourceHostMessageId;
    }

    public final String getSourceWidgetId() {
        return this.sourceWidgetId;
    }

    public final List<String> getSuggestedVoiceIds() {
        return this.suggestedVoiceIds;
    }

    public final String getThreadId() {
        return this.threadId;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.contentKey, AnonymousClass005.A0F(this.entryPoint, (((((((AnonymousClass005.A0F(this.origin, AnonymousClass005.A0E(this.suggestedVoiceIds)) + AnonymousClass006.A0G(this.threadId)) * 31) + AnonymousClass006.A0G(this.replyToMessageId)) * 31) + AnonymousClass006.A0G(this.sourceWidgetId)) * 31) + AnonymousClass005.A0H(this.sourceHostMessageId)) * 31));
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ VoiceSelectionListSheetKey(List list, HatchOrigin hatchOrigin, String str, String str2, String str3, String str4, VoiceEntryPoint voiceEntryPoint, String str5, C06H c06h) {
        this(list, hatchOrigin, str, str2, str3, str4, voiceEntryPoint, str5);
    }

    public /* synthetic */ VoiceSelectionListSheetKey(List list, HatchOrigin hatchOrigin, String str, String str2, String str3, String str4, VoiceEntryPoint voiceEntryPoint, String str5, int i, C06H c06h) {
        this(C3cI.A10(list, i), hatchOrigin, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? VoiceEntryPoint.VOICE_WIDGET : voiceEntryPoint, (i & 128) != 0 ? AnonymousClass002.A0k() : str5);
    }

    public /* synthetic */ VoiceSelectionListSheetKey(int i, List list, HatchOrigin hatchOrigin, String str, String str2, String str3, String str4, VoiceEntryPoint voiceEntryPoint, String str5, C2hx c2hx) {
        if (2 != (i & 2)) {
            C9iI.A00(VoiceSelectionListSheetKey$$serializer.descriptor, i, 2);
            throw F60.createAndThrow();
        }
        this.suggestedVoiceIds = (i & 1) == 0 ? C0881AGi.A00 : list;
        this.origin = hatchOrigin;
        if ((i & 4) == 0) {
            this.threadId = null;
        } else {
            this.threadId = str;
        }
        if ((i & 8) == 0) {
            this.replyToMessageId = null;
        } else {
            this.replyToMessageId = str2;
        }
        if ((i & 16) == 0) {
            this.sourceWidgetId = null;
        } else {
            this.sourceWidgetId = str3;
        }
        if ((i & 32) == 0) {
            this.sourceHostMessageId = null;
        } else {
            this.sourceHostMessageId = str4;
        }
        if ((i & 64) == 0) {
            this.entryPoint = VoiceEntryPoint.VOICE_WIDGET;
        } else {
            this.entryPoint = voiceEntryPoint;
        }
        if ((i & 128) == 0) {
            this.contentKey = AnonymousClass002.A0k();
        } else {
            this.contentKey = str5;
        }
    }

    public VoiceSelectionListSheetKey(List<String> list, HatchOrigin hatchOrigin, String str, String str2, String str3, String str4, VoiceEntryPoint voiceEntryPoint, String str5) {
        this.suggestedVoiceIds = list;
        this.origin = hatchOrigin;
        this.threadId = str;
        this.replyToMessageId = str2;
        this.sourceWidgetId = str3;
        this.sourceHostMessageId = str4;
        this.entryPoint = voiceEntryPoint;
        this.contentKey = str5;
    }
}
