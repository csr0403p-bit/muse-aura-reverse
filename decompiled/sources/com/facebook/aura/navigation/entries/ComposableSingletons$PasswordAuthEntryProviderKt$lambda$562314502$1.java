package com.facebook.aura.navigation.entries;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass006;
import X.BFM;
import X.G0W;
import com.facebook.aura.navigation.key.PasswordAuthSheetKey;
import com.facebook.aura.skills.connect.PasswordAuthScreenKt;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class ComposableSingletons$PasswordAuthEntryProviderKt$lambda$562314502$1 extends AbstractC7559F3s implements G0W<PasswordAuthSheetKey, BFM, Integer, Unit> {
    public static final ComposableSingletons$PasswordAuthEntryProviderKt$lambda$562314502$1 INSTANCE = new ComposableSingletons$PasswordAuthEntryProviderKt$lambda$562314502$1();

    public ComposableSingletons$PasswordAuthEntryProviderKt$lambda$562314502$1() {
        super(3);
    }

    public final void invoke(PasswordAuthSheetKey passwordAuthSheetKey, BFM bfm, int i) {
        PasswordAuthScreenKt.PasswordAuthScreen(passwordAuthSheetKey, bfm, AnonymousClass006.A0E(passwordAuthSheetKey, i));
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(PasswordAuthSheetKey passwordAuthSheetKey, BFM bfm, Integer num) {
        invoke(passwordAuthSheetKey, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
