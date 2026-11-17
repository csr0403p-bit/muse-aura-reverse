package com.facebook.aura.nodes;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.EnumC10460Hji;
import X.G0U;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.commands.core.HatchPermissionResolver;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.maplibre.android.R;

@DebugMetadata(c = "com.facebook.aura.nodes.NodePermissionPrompt$request$outcome$1", f = "NodePermissionPrompt.kt", l = {R.styleable.maplibre_MapView_maplibre_uiCompassMarginTop}, m = "invokeSuspend", v = 2)
/* loaded from: classes3.dex */
public final class NodePermissionPrompt$request$outcome$1 extends AbstractC07127nr implements G0U<HtJ<? super Boolean>, Object> {
    public final /* synthetic */ String $healthTrigger;
    public final /* synthetic */ List<String> $promptedTokens;
    public int label;
    public final /* synthetic */ NodePermissionPrompt this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NodePermissionPrompt$request$outcome$1(NodePermissionPrompt nodePermissionPrompt, String str, List<String> list, HtJ<? super NodePermissionPrompt$request$outcome$1> htJ) {
        super(1, htJ);
        this.this$0 = nodePermissionPrompt;
        this.$healthTrigger = str;
        this.$promptedTokens = list;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(HtJ<?> htJ) {
        return new NodePermissionPrompt$request$outcome$1(this.this$0, this.$healthTrigger, this.$promptedTokens, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) throws Exception {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            HatchPermissionResolver hatchPermissionResolver = new HatchPermissionResolver(this.this$0.context, this.$healthTrigger, true);
            List<String> list = this.$promptedTokens;
            this.label = 1;
            obj = hatchPermissionResolver.requestPermissions(list, this);
            if (obj == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        return obj;
    }

    @Override // X.G0U
    public final Object invoke(HtJ<? super Boolean> htJ) {
        return ((NodePermissionPrompt$request$outcome$1) create(htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
