package com.facebook.aura.navigation.key;

import X.AbstractC5321DgF;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C0881AGi;
import X.C0KA;
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
import com.facebook.aura.navigation.AuraFullScreenNavKey;
import java.util.List;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class VoiceSelectionListScreenKey extends C06G implements AuraFullScreenNavKey {
    public static final F0C<C9hr<Object>>[] $childSerializers;
    public static final Companion Companion = new Companion();
    public final String contentKey;
    public final VoiceEntryPoint entryPoint;
    public final HatchOrigin origin;
    public final boolean startCallOnExit;
    public final List<String> suggestedVoiceIds;
    public final String threadId;

    public final class Companion {
        public final VoiceSelectionListScreenKey invoke(boolean z, List<String> list, String str, HatchOrigin hatchOrigin, VoiceEntryPoint voiceEntryPoint, String str2) {
            AnonymousClass005.A16(list, hatchOrigin, voiceEntryPoint, str2, 1);
            return new VoiceSelectionListScreenKey(z, list, str, hatchOrigin, voiceEntryPoint, str2);
        }

        public final C9hr<VoiceSelectionListScreenKey> serializer() {
            return VoiceSelectionListScreenKey$$serializer.INSTANCE;
        }

        public static /* synthetic */ VoiceSelectionListScreenKey invoke$default(Companion companion, boolean z, List list, String str, HatchOrigin hatchOrigin, VoiceEntryPoint voiceEntryPoint, String str2, int i, Object obj) {
            boolean zA1P = AnonymousClass001.A1P(i, z);
            List<String> listA11 = C3cI.A11(list, i);
            String strA0t = AnonymousClass006.A0t(i, str);
            if ((i & 32) != 0) {
                str2 = AnonymousClass002.A0k();
            }
            return companion.invoke(zA1P, listA11, strA0t, hatchOrigin, voiceEntryPoint, str2);
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    static {
        Integer num = C79.A01;
        $childSerializers = new F0C[]{null, AbstractC5321DgF.A02(num, VoiceSelectionListScreenKey$Companion$$childSerializers$1.INSTANCE), null, AbstractC5321DgF.A02(num, VoiceSelectionListScreenKey$Companion$$childSerializers$2.INSTANCE), AbstractC5321DgF.A02(num, VoiceSelectionListScreenKey$Companion$$childSerializers$3.INSTANCE), null};
    }

    public static /* synthetic */ VoiceSelectionListScreenKey copy$default(VoiceSelectionListScreenKey voiceSelectionListScreenKey, boolean z, List list, String str, HatchOrigin hatchOrigin, VoiceEntryPoint voiceEntryPoint, String str2, int i, Object obj) {
        boolean z2 = z;
        List list2 = list;
        String str3 = str;
        HatchOrigin hatchOrigin2 = hatchOrigin;
        VoiceEntryPoint voiceEntryPoint2 = voiceEntryPoint;
        String str4 = str2;
        if ((i & 1) != 0) {
            z2 = voiceSelectionListScreenKey.startCallOnExit;
        }
        if ((i & 2) != 0) {
            list2 = voiceSelectionListScreenKey.suggestedVoiceIds;
        }
        if ((i & 4) != 0) {
            str3 = voiceSelectionListScreenKey.threadId;
        }
        if ((i & 8) != 0) {
            hatchOrigin2 = voiceSelectionListScreenKey.origin;
        }
        if ((i & 16) != 0) {
            voiceEntryPoint2 = voiceSelectionListScreenKey.entryPoint;
        }
        if ((i & 32) != 0) {
            str4 = voiceSelectionListScreenKey.contentKey;
        }
        return new VoiceSelectionListScreenKey(z2, list2, str3, hatchOrigin2, voiceEntryPoint2, str4);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof VoiceSelectionListScreenKey) {
                VoiceSelectionListScreenKey voiceSelectionListScreenKey = (VoiceSelectionListScreenKey) obj;
                if (this.startCallOnExit != voiceSelectionListScreenKey.startCallOnExit || !C7384Etj.areEqual(this.suggestedVoiceIds, voiceSelectionListScreenKey.suggestedVoiceIds) || !C7384Etj.areEqual(this.threadId, voiceSelectionListScreenKey.threadId) || this.origin != voiceSelectionListScreenKey.origin || this.entryPoint != voiceSelectionListScreenKey.entryPoint || !C7384Etj.areEqual(this.contentKey, voiceSelectionListScreenKey.contentKey)) {
                }
            }
            return false;
        }
        return true;
    }

    private final VoiceSelectionListScreenKey copy(boolean z, List<String> list, String str, HatchOrigin hatchOrigin, VoiceEntryPoint voiceEntryPoint, String str2) {
        return new VoiceSelectionListScreenKey(z, list, str, hatchOrigin, voiceEntryPoint, str2);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_navigation_key_key(VoiceSelectionListScreenKey voiceSelectionListScreenKey, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        boolean zAfR = c9j5.AfR();
        if (zAfR || voiceSelectionListScreenKey.startCallOnExit) {
            c9j5.AA7(c9iZ, 0, voiceSelectionListScreenKey.startCallOnExit);
        }
        if (zAfR || !C3cG.A1L(voiceSelectionListScreenKey.suggestedVoiceIds)) {
            c9j5.AAQ(voiceSelectionListScreenKey.suggestedVoiceIds, C3cH.A15(f0cArr, 1), c9iZ, 1);
        }
        if (zAfR || voiceSelectionListScreenKey.threadId != null) {
            c9j5.AAP(voiceSelectionListScreenKey.threadId, C07779iq.A01, c9iZ, 2);
        }
        c9j5.AAQ(voiceSelectionListScreenKey.origin, C3cH.A15(f0cArr, 3), c9iZ, 3);
        if (zAfR || voiceSelectionListScreenKey.entryPoint != VoiceEntryPoint.SETTINGS) {
            c9j5.AAQ(voiceSelectionListScreenKey.entryPoint, C3cH.A15(f0cArr, 4), c9iZ, 4);
        }
        if (!zAfR) {
            if (AnonymousClass002.A0k().equals(voiceSelectionListScreenKey.contentKey)) {
                return;
            }
        }
        c9j5.AAV(voiceSelectionListScreenKey.contentKey, c9iZ, 5);
    }

    public final boolean component1() {
        return this.startCallOnExit;
    }

    public final List<String> component2() {
        return this.suggestedVoiceIds;
    }

    public final String component3() {
        return this.threadId;
    }

    public final HatchOrigin component4() {
        return this.origin;
    }

    public final VoiceEntryPoint component5() {
        return this.entryPoint;
    }

    public final String component6() {
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

    public final boolean getStartCallOnExit() {
        return this.startCallOnExit;
    }

    public final List<String> getSuggestedVoiceIds() {
        return this.suggestedVoiceIds;
    }

    public final String getThreadId() {
        return this.threadId;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.contentKey, AnonymousClass005.A0F(this.entryPoint, AnonymousClass005.A0F(this.origin, (AnonymousClass005.A0F(this.suggestedVoiceIds, C0KA.A02(this.startCallOnExit)) + AnonymousClass006.A0G(this.threadId)) * 31)));
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ VoiceSelectionListScreenKey(boolean z, List list, String str, HatchOrigin hatchOrigin, VoiceEntryPoint voiceEntryPoint, String str2, C06H c06h) {
        this(z, list, str, hatchOrigin, voiceEntryPoint, str2);
    }

    public VoiceSelectionListScreenKey(boolean z, List<String> list, String str, HatchOrigin hatchOrigin, VoiceEntryPoint voiceEntryPoint, String str2) {
        this.startCallOnExit = z;
        this.suggestedVoiceIds = list;
        this.threadId = str;
        this.origin = hatchOrigin;
        this.entryPoint = voiceEntryPoint;
        this.contentKey = str2;
    }

    public /* synthetic */ VoiceSelectionListScreenKey(boolean z, List list, String str, HatchOrigin hatchOrigin, VoiceEntryPoint voiceEntryPoint, String str2, int i, C06H c06h) {
        this(AnonymousClass001.A1P(i, z), C3cI.A11(list, i), AnonymousClass006.A0t(i, str), hatchOrigin, (i & 16) != 0 ? VoiceEntryPoint.SETTINGS : voiceEntryPoint, (i & 32) != 0 ? AnonymousClass002.A0k() : str2);
    }

    public /* synthetic */ VoiceSelectionListScreenKey(int i, boolean z, List list, String str, HatchOrigin hatchOrigin, VoiceEntryPoint voiceEntryPoint, String str2, C2hx c2hx) {
        if (8 != (i & 8)) {
            C9iI.A00(VoiceSelectionListScreenKey$$serializer.descriptor, i, 8);
            throw F60.createAndThrow();
        }
        this.startCallOnExit = (i & 1) == 0 ? false : z;
        if ((i & 2) == 0) {
            this.suggestedVoiceIds = C0881AGi.A00;
        } else {
            this.suggestedVoiceIds = list;
        }
        if ((i & 4) == 0) {
            this.threadId = null;
        } else {
            this.threadId = str;
        }
        this.origin = hatchOrigin;
        if ((i & 16) == 0) {
            this.entryPoint = VoiceEntryPoint.SETTINGS;
        } else {
            this.entryPoint = voiceEntryPoint;
        }
        if ((i & 32) == 0) {
            this.contentKey = AnonymousClass002.A0k();
        } else {
            this.contentKey = str2;
        }
    }
}
