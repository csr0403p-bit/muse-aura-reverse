package com.facebook.aura.partners.voice.avatar;

import X.AbstractC7559F3s;
import X.G0U;

/* loaded from: classes2.dex */
public final class HatchVoiceAvatarStoreKt$avatarCacheKey$key$1 extends AbstractC7559F3s implements G0U<String, CharSequence> {
    public static final HatchVoiceAvatarStoreKt$avatarCacheKey$key$1 INSTANCE = new HatchVoiceAvatarStoreKt$avatarCacheKey$key$1();

    public HatchVoiceAvatarStoreKt$avatarCacheKey$key$1() {
        super(1);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final CharSequence invoke2(String str) {
        return str == null ? "" : str;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ CharSequence invoke(String str) {
        if (str == null) {
            return "";
        }
        return str;
    }
}
