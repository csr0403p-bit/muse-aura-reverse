package com.facebook.aura.vds.compose.input;

import X.AbstractC7559F3s;
import X.AbstractC8407FdO;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.AnonymousClass007;
import X.BFM;
import X.G0V;
import android.content.res.Resources;
import com.facebook.aura.R;
import com.facebook.aura.vds.compose.icons.AuraIconSize;
import java.io.IOException;
import kotlin.Unit;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public final class ComposableSingletons$AuraTextInputKt$lambda$46741381$1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public static final ComposableSingletons$AuraTextInputKt$lambda$46741381$1 INSTANCE = new ComposableSingletons$AuraTextInputKt$lambda$46741381$1();

    public ComposableSingletons$AuraTextInputKt$lambda$46741381$1() {
        super(2);
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) throws XmlPullParserException, Resources.NotFoundException, IOException {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) throws XmlPullParserException, Resources.NotFoundException, IOException {
        if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
            AnonymousClass007.A0y(bfm, AbstractC8407FdO.A00(bfm, R.drawable.circle_alert_wght400_outline_24), AuraIconSize.TINY, AnonymousClass002.A0c(bfm).error);
            return;
        }
        bfm.Afo();
    }
}
