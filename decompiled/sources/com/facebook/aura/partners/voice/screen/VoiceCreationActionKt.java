package com.facebook.aura.partners.voice.screen;

import X.AbstractC2271BQs;
import X.AbstractC3358CGz;
import X.Am0;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.BFM;
import X.BQN;
import X.C0861A6i;
import X.C0dx;
import X.C1er;
import X.C7384Etj;
import X.C78N;
import android.content.Context;
import androidx.activity.ComponentActivity;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.R;
import com.facebook.aura.conversation.viewmodel.HatchConversationViewModel;
import com.facebook.aura.navigation.AuraNavigator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class VoiceCreationActionKt {
    public static final Function0<Unit> rememberVoiceCreationAction(Function0<Unit> function0, BFM bfm, int i) {
        C7384Etj.A0Y(function0, 0);
        C0dx c0dx = (C0dx) bfm.A6v(Am0.A08);
        AuraNavigator auraNavigatorA0b = AnonymousClass003.A0b(bfm);
        AbstractC3358CGz abstractC3358CGzA0g = AnonymousClass002.A0g(bfm);
        Context applicationContext = AnonymousClass002.A0H(bfm).getApplicationContext();
        String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12102a);
        C7384Etj.A0X(applicationContext);
        HatchConversationViewModel.Factory factory = new HatchConversationViewModel.Factory(applicationContext, abstractC3358CGzA0g, "primary_session_id", false, false);
        ComponentActivity componentActivityA0y = AnonymousClass004.A0y(bfm);
        HatchConversationViewModel hatchConversationViewModel = (HatchConversationViewModel) BQN.A00(factory, componentActivityA0y, AnonymousClass003.A0Z(componentActivityA0y), "primary_session_id", new C0861A6i(HatchConversationViewModel.class));
        MutableState mutableStateA00 = C1er.A00(bfm, function0);
        boolean zA1T = AnonymousClass005.A1T(bfm, auraNavigatorA0b, hatchConversationViewModel, strA01, bfm.A65(c0dx));
        Object objAaT = bfm.AaT();
        if (zA1T || objAaT == C78N.A00) {
            objAaT = new VoiceCreationActionKt$rememberVoiceCreationAction$1$1(c0dx, hatchConversationViewModel, strA01, auraNavigatorA0b, mutableStateA00);
            bfm.Ai0(objAaT);
        }
        return (Function0) objAaT;
    }
}
