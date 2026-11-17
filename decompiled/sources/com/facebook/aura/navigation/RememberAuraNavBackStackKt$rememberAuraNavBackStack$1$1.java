package com.facebook.aura.navigation;

import X.AMl;
import X.AbstractC7559F3s;
import X.BFI;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.navigation3.runtime.NavBackStack;
import java.util.Arrays;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class RememberAuraNavBackStackKt$rememberAuraNavBackStack$1$1 extends AbstractC7559F3s implements Function0<NavBackStack<AuraNavKey>> {
    public final /* synthetic */ AuraNavKey[] $initialKeys;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RememberAuraNavBackStackKt$rememberAuraNavBackStack$1$1(AuraNavKey[] auraNavKeyArr) {
        super(0);
        this.$initialKeys = auraNavKeyArr;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final NavBackStack<AuraNavKey> invoke() {
        AuraNavKey[] auraNavKeyArr = this.$initialKeys;
        AMl[] aMlArr = (AMl[]) Arrays.copyOf(auraNavKeyArr, auraNavKeyArr.length);
        Object[] objArrCopyOf = Arrays.copyOf(aMlArr, aMlArr.length);
        SnapshotStateList snapshotStateList = new SnapshotStateList();
        snapshotStateList.addAll(BFI.A0G(objArrCopyOf));
        return new NavBackStack(snapshotStateList);
    }
}
