package com.facebook.aura.bloks.plugins.core.cdspopbottomsheet;

import X.AbstractC7559F3s;
import X.FBB;
import X.G0W;
import X.Hj6;
import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.facebook.aura.bloks.extensions.cds.AuraCDSExtensions;
import com.facebook.aura.bloks.host.AuraBloksHost;
import kotlin.Unit;

/* loaded from: classes6.dex */
public final class MWABloksCdsPopBottomSheetImplementation$evaluate$operation$1 extends AbstractC7559F3s implements G0W<Context, FBB, Integer, Unit> {
    public final /* synthetic */ Hj6 $arguments;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MWABloksCdsPopBottomSheetImplementation$evaluate$operation$1(Hj6 hj6) {
        super(3);
        this.$arguments = hj6;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Context context, FBB fbb, Integer num) throws Exception {
        AuraBloksHost auraBloksHost;
        FragmentActivity fragmentActivity;
        if (fbb == null || (auraBloksHost = (AuraBloksHost) fbb.A02) == null || (fragmentActivity = auraBloksHost.mFragmentActivity) == null) {
            return;
        }
        AuraCDSExtensions.INSTANCE.popBottomSheet(fragmentActivity, this.$arguments);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(Context context, FBB fbb, Integer num) throws Exception {
        invoke2(context, fbb, num);
        return Unit.INSTANCE;
    }
}
