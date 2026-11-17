package com.facebook.aura.nodes;

import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.C06H;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import X.HzP;
import android.content.Context;
import com.facebook.aura.commands.core.HatchPermissionResolver;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.maplibre.android.R;

/* loaded from: classes3.dex */
public final class NodePermissionPrompt {
    public static final Companion Companion = new Companion();

    @Deprecated
    public static final String RESULT_DIRECT_PROMPT = "direct_prompt";

    @Deprecated
    public static final String RESULT_GRANTED_LATE = "granted_late";

    @Deprecated
    public static final String TAG = "NodePermissionPrompt";
    public final Context context;
    public final AbstractC3358CGz userSession;

    @DebugMetadata(c = "com.facebook.aura.nodes.NodePermissionPrompt", f = "NodePermissionPrompt.kt", l = {35, 42}, m = "request", v = 2)
    /* renamed from: com.facebook.aura.nodes.NodePermissionPrompt$request$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public long J$0;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public boolean Z$0;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return NodePermissionPrompt.this.request(null, null, 0L, null, null, false, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.nodes.NodePermissionPrompt$request$3", f = "NodePermissionPrompt.kt", l = {R.styleable.maplibre_MapView_maplibre_uiLogoGravity}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.nodes.NodePermissionPrompt$request$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Boolean>, Object> {
        public final /* synthetic */ String $healthTrigger;
        public final /* synthetic */ List<String> $promptedTokens;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(String str, List<String> list, HtJ<? super AnonymousClass3> htJ) {
            super(2, htJ);
            this.$healthTrigger = str;
            this.$promptedTokens = list;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return NodePermissionPrompt.this.new AnonymousClass3(this.$healthTrigger, this.$promptedTokens, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) throws Exception {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                HatchPermissionResolver hatchPermissionResolver = new HatchPermissionResolver(NodePermissionPrompt.this.context, this.$healthTrigger, false);
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

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Boolean> htJ) {
            return ((AnonymousClass3) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00fe  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object request(com.facebook.aura.nodes.snapshot.PermissionEntry r15, java.util.List<java.lang.String> r16, long r17, java.lang.String r19, java.lang.String r20, boolean r21, kotlin.jvm.functions.Function0<java.lang.Boolean> r22, X.HtJ<? super kotlin.Unit> r23) {
        /*
            Method dump skipped, instructions count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.nodes.NodePermissionPrompt.request(com.facebook.aura.nodes.snapshot.PermissionEntry, java.util.List, long, java.lang.String, java.lang.String, boolean, kotlin.jvm.functions.Function0, X.HtJ):java.lang.Object");
    }

    public final class Companion {
        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public NodePermissionPrompt(Context context, AbstractC3358CGz abstractC3358CGz) {
        AnonymousClass003.A0u(context, abstractC3358CGz);
        this.context = context;
        this.userSession = abstractC3358CGz;
    }
}
