package com.facebook.aura.conversation.view.richcontent;

import X.AGI;
import X.AHD;
import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.BO6;
import X.C3UX;
import X.C3cG;
import X.C7384Etj;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import X.Hxb;
import android.content.Context;
import android.graphics.Bitmap;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.markdown.render.inline.InlineMathEntity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.conversation.view.richcontent.HatchAuraMarkdownProvidersKt$rememberHatchInlineMathContent$1$1", f = "HatchAuraMarkdownProviders.kt", l = {521}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class HatchAuraMarkdownProvidersKt$rememberHatchInlineMathContent$1$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ MutableState<BO6<String, Bitmap>> $bitmaps$delegate;
    public final /* synthetic */ Context $context;
    public final /* synthetic */ AHD<InlineMathEntity> $entities;
    public final /* synthetic */ int $fontSizeSp;
    public final /* synthetic */ BO6<String, Bitmap> $initialBitmaps;
    public final /* synthetic */ boolean $isRenderingEnabled;
    public final /* synthetic */ String $textColorHex;
    public Object L$0;
    public Object L$1;
    public int label;

    @DebugMetadata(c = "com.facebook.aura.conversation.view.richcontent.HatchAuraMarkdownProvidersKt$rememberHatchInlineMathContent$1$1$1", f = "HatchAuraMarkdownProviders.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.conversation.view.richcontent.HatchAuraMarkdownProvidersKt$rememberHatchInlineMathContent$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ Context $context;
        public final /* synthetic */ int $fontSizeSp;
        public final /* synthetic */ Map<String, Bitmap> $rendered;
        public final /* synthetic */ String $textColorHex;
        public final /* synthetic */ List<InlineMathEntity> $toRender;
        public /* synthetic */ Object L$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(List<InlineMathEntity> list, Context context, String str, int i, Map<String, Bitmap> map, HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
            this.$toRender = list;
            this.$context = context;
            this.$textColorHex = str;
            this.$fontSizeSp = i;
            this.$rendered = map;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$toRender, this.$context, this.$textColorHex, this.$fontSizeSp, this.$rendered, htJ);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            C3UX c3ux = (C3UX) this.L$0;
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            List<InlineMathEntity> list = this.$toRender;
            Context context = this.$context;
            String str = this.$textColorHex;
            int i = this.$fontSizeSp;
            Map<String, Bitmap> map = this.$rendered;
            Iterator<InlineMathEntity> it = list.iterator();
            while (it.hasNext()) {
                AnonymousClass001.A1J(new HatchAuraMarkdownProvidersKt$rememberHatchInlineMathContent$1$1$1$1$1(context, it.next(), str, i, map, null), c3ux);
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchAuraMarkdownProvidersKt$rememberHatchInlineMathContent$1$1(boolean z, AHD<InlineMathEntity> ahd, BO6<String, Bitmap> bo6, Context context, String str, int i, MutableState<BO6<String, Bitmap>> mutableState, HtJ<? super HatchAuraMarkdownProvidersKt$rememberHatchInlineMathContent$1$1> htJ) {
        super(2, htJ);
        this.$isRenderingEnabled = z;
        this.$entities = ahd;
        this.$initialBitmaps = bo6;
        this.$context = context;
        this.$textColorHex = str;
        this.$fontSizeSp = i;
        this.$bitmaps$delegate = mutableState;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchAuraMarkdownProvidersKt$rememberHatchInlineMathContent$1$1(this.$isRenderingEnabled, this.$entities, this.$initialBitmaps, this.$context, this.$textColorHex, this.$fontSizeSp, this.$bitmaps$delegate, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        Map mapA0j;
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            if (this.$isRenderingEnabled) {
                AHD<InlineMathEntity> ahd = this.$entities;
                BO6<String, Bitmap> bo6 = this.$initialBitmaps;
                ArrayList arrayListA0h = C3cG.A0h();
                for (Object obj2 : ahd) {
                    if (!bo6.containsKey(((InlineMathEntity) obj2).key)) {
                        arrayListA0h.add(obj2);
                    }
                }
                if (!arrayListA0h.isEmpty()) {
                    mapA0j = C3cG.A0j();
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(arrayListA0h, this.$context, this.$textColorHex, this.$fontSizeSp, mapA0j, null);
                    this.L$0 = null;
                    this.L$1 = mapA0j;
                    this.label = 1;
                    if (Hxb.A00(anonymousClass1, this) == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                }
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            throw AnonymousClass001.A0n();
        }
        mapA0j = (Map) this.L$1;
        Hwg.A00(obj);
        if (!mapA0j.isEmpty()) {
            MutableState<BO6<String, Bitmap>> mutableState = this.$bitmaps$delegate;
            BO6<String, Bitmap> value = mutableState.getValue();
            C7384Etj.A0Y(value, 0);
            LinkedHashMap linkedHashMap = new LinkedHashMap(value);
            linkedHashMap.putAll(mapA0j);
            mutableState.Af8(AGI.A08(linkedHashMap));
        }
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((HatchAuraMarkdownProvidersKt$rememberHatchInlineMathContent$1$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
