package com.facebook.aura.navigation.key;

import X.AbstractC5321DgF;
import X.AnonymousClass005;
import X.C06G;
import X.C06H;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;
import X.C79;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F0C;
import X.F60;
import com.facebook.aura.navigation.AuraBottomSheetNavKey;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class VoiceCatalogFilterSheetKey extends C06G implements AuraBottomSheetNavKey {
    public static final F0C<C9hr<Object>>[] $childSerializers;
    public static final Companion Companion = new Companion();
    public final VoiceEntryPoint entryPoint;
    public final VoiceCatalogFilterKind kind;
    public final String parentContentKey;

    public final class Companion {
        public final C9hr<VoiceCatalogFilterSheetKey> serializer() {
            return VoiceCatalogFilterSheetKey$$serializer.INSTANCE;
        }

        public final VoiceCatalogFilterSheetKey invoke(VoiceCatalogFilterKind voiceCatalogFilterKind, String str, VoiceEntryPoint voiceEntryPoint) {
            AnonymousClass005.A0x(voiceCatalogFilterKind, str, voiceEntryPoint);
            return new VoiceCatalogFilterSheetKey(voiceCatalogFilterKind, str, voiceEntryPoint);
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    static {
        Integer num = C79.A01;
        $childSerializers = C3cG.A1V(num, AbstractC5321DgF.A02(num, VoiceCatalogFilterSheetKey$Companion$$childSerializers$1.INSTANCE), null, VoiceCatalogFilterSheetKey$Companion$$childSerializers$2.INSTANCE);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof VoiceCatalogFilterSheetKey) {
                VoiceCatalogFilterSheetKey voiceCatalogFilterSheetKey = (VoiceCatalogFilterSheetKey) obj;
                if (this.kind != voiceCatalogFilterSheetKey.kind || !C7384Etj.areEqual(this.parentContentKey, voiceCatalogFilterSheetKey.parentContentKey) || this.entryPoint != voiceCatalogFilterSheetKey.entryPoint) {
                }
            }
            return false;
        }
        return true;
    }

    private final VoiceCatalogFilterSheetKey copy(VoiceCatalogFilterKind voiceCatalogFilterKind, String str, VoiceEntryPoint voiceEntryPoint) {
        return new VoiceCatalogFilterSheetKey(voiceCatalogFilterKind, str, voiceEntryPoint);
    }

    public static /* synthetic */ VoiceCatalogFilterSheetKey copy$default(VoiceCatalogFilterSheetKey voiceCatalogFilterSheetKey, VoiceCatalogFilterKind voiceCatalogFilterKind, String str, VoiceEntryPoint voiceEntryPoint, int i, Object obj) {
        if ((i & 1) != 0) {
            voiceCatalogFilterKind = voiceCatalogFilterSheetKey.kind;
        }
        if ((i & 2) != 0) {
            str = voiceCatalogFilterSheetKey.parentContentKey;
        }
        if ((i & 4) != 0) {
            voiceEntryPoint = voiceCatalogFilterSheetKey.entryPoint;
        }
        return new VoiceCatalogFilterSheetKey(voiceCatalogFilterKind, str, voiceEntryPoint);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_navigation_key_key(VoiceCatalogFilterSheetKey voiceCatalogFilterSheetKey, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        c9j5.AAQ(voiceCatalogFilterSheetKey.kind, C3cH.A15(f0cArr, 0), c9iZ, 0);
        c9j5.AAV(voiceCatalogFilterSheetKey.parentContentKey, c9iZ, 1);
        if (c9j5.AfR() || voiceCatalogFilterSheetKey.entryPoint != VoiceEntryPoint.SETTINGS) {
            c9j5.AAQ(voiceCatalogFilterSheetKey.entryPoint, C3cH.A15(f0cArr, 2), c9iZ, 2);
        }
    }

    public final VoiceCatalogFilterKind component1() {
        return this.kind;
    }

    public final String component2() {
        return this.parentContentKey;
    }

    public final VoiceEntryPoint component3() {
        return this.entryPoint;
    }

    public final VoiceEntryPoint getEntryPoint() {
        return this.entryPoint;
    }

    public final VoiceCatalogFilterKind getKind() {
        return this.kind;
    }

    public final String getParentContentKey() {
        return this.parentContentKey;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.entryPoint, AnonymousClass005.A0I(this.parentContentKey, AnonymousClass005.A0E(this.kind)));
    }

    public VoiceCatalogFilterSheetKey(VoiceCatalogFilterKind voiceCatalogFilterKind, String str, VoiceEntryPoint voiceEntryPoint) {
        this.kind = voiceCatalogFilterKind;
        this.parentContentKey = str;
        this.entryPoint = voiceEntryPoint;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ VoiceCatalogFilterSheetKey(VoiceCatalogFilterKind voiceCatalogFilterKind, String str, VoiceEntryPoint voiceEntryPoint, C06H c06h) {
        this(voiceCatalogFilterKind, str, voiceEntryPoint);
    }

    public /* synthetic */ VoiceCatalogFilterSheetKey(int i, VoiceCatalogFilterKind voiceCatalogFilterKind, String str, VoiceEntryPoint voiceEntryPoint, C2hx c2hx) {
        if (3 != (i & 3)) {
            C9iI.A00(VoiceCatalogFilterSheetKey$$serializer.descriptor, i, 3);
            throw F60.createAndThrow();
        }
        this.kind = voiceCatalogFilterKind;
        this.parentContentKey = str;
        this.entryPoint = (i & 4) == 0 ? VoiceEntryPoint.SETTINGS : voiceEntryPoint;
    }

    public /* synthetic */ VoiceCatalogFilterSheetKey(VoiceCatalogFilterKind voiceCatalogFilterKind, String str, VoiceEntryPoint voiceEntryPoint, int i, C06H c06h) {
        this(voiceCatalogFilterKind, str, (i & 4) != 0 ? VoiceEntryPoint.SETTINGS : voiceEntryPoint);
    }
}
