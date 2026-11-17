package com.facebook.aura.partners.voice.ui;

import X.AbstractC7559F3s;
import X.AnonymousClass002;
import X.AnonymousClass006;
import X.B1T;
import X.C1BO;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;
import X.G0U;
import X.InterfaceC2178B0w;
import android.graphics.Bitmap;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.partners.voice.intf.VoiceEmbodimentMedia;
import com.facebook.aura.partners.voice.intf.VoiceStillHandoffEvent;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class HatchEmbodimentMediaKt$HatchEmbodimentMedia$39$2$3$1 extends AbstractC7559F3s implements G0U<Bitmap, Unit> {
    public final /* synthetic */ long $callGeneration;
    public final /* synthetic */ C1BO<G0U<VoiceEmbodimentMedia.StaticAvatar, Unit>> $currentOnStillAvatarRendered$delegate;
    public final /* synthetic */ C1BO<G0U<VoiceStillHandoffEvent, Unit>> $currentOnStillHandoffEvent$delegate;
    public final /* synthetic */ MutableState<Map<String, InterfaceC2178B0w>> $decodedStills$delegate;
    public final /* synthetic */ String $imageKey;
    public final /* synthetic */ String $incomingKey;
    public final /* synthetic */ VoiceEmbodimentMedia.StaticAvatar $still;
    public final /* synthetic */ String $stillKey;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Bitmap bitmap) {
        C7384Etj.A0Y(bitmap, 0);
        MutableState<Map<String, InterfaceC2178B0w>> mutableState = this.$decodedStills$delegate;
        Map<String, InterfaceC2178B0w> value = mutableState.getValue();
        String str = this.$stillKey;
        LinkedHashMap linkedHashMapA0j = C3cG.A0j();
        Iterator itA0n = AnonymousClass002.A0n(value);
        while (itA0n.hasNext()) {
            Map.Entry entryA0l = C3cH.A0l(itA0n);
            if (C7384Etj.areEqual(entryA0l.getKey(), str)) {
                AnonymousClass006.A1R(linkedHashMapA0j, entryA0l);
            }
        }
        mutableState.Af8(AnonymousClass006.A11(this.$imageKey, new B1T(bitmap), linkedHashMapA0j));
        if (C7384Etj.areEqual(this.$imageKey, this.$incomingKey)) {
            C1BO.A0B(this.$currentOnStillHandoffEvent$delegate).invoke(new VoiceStillHandoffEvent.Decoded(this.$callGeneration, this.$imageKey));
        } else if (!C7384Etj.areEqual(this.$imageKey, this.$stillKey)) {
            return;
        }
        C1BO.A0B(this.$currentOnStillAvatarRendered$delegate).invoke(this.$still);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchEmbodimentMediaKt$HatchEmbodimentMedia$39$2$3$1(String str, String str2, long j, VoiceEmbodimentMedia.StaticAvatar staticAvatar, String str3, MutableState<Map<String, InterfaceC2178B0w>> mutableState, C1BO<? extends G0U<? super VoiceStillHandoffEvent, Unit>> c1bo, C1BO<? extends G0U<? super VoiceEmbodimentMedia.StaticAvatar, Unit>> c1bo2) {
        super(1);
        this.$imageKey = str;
        this.$incomingKey = str2;
        this.$callGeneration = j;
        this.$still = staticAvatar;
        this.$stillKey = str3;
        this.$decodedStills$delegate = mutableState;
        this.$currentOnStillHandoffEvent$delegate = c1bo;
        this.$currentOnStillAvatarRendered$delegate = c1bo2;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(Bitmap bitmap) {
        invoke2(bitmap);
        return Unit.INSTANCE;
    }
}
