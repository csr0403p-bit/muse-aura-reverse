package com.facebook.aura.pairs;

import X.AGH;
import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.C3UX;
import X.C3cG;
import X.C60P;
import X.C60Q;
import X.C9jH;
import X.EnumC10460Hji;
import X.G0V;
import X.HsJ;
import X.HtJ;
import X.Hwg;
import X.HxE;
import com.facebook.aura.json.HatchJsonKt;
import com.facebook.aura.network.api.JarvisPath;
import com.facebook.aura.network.http.HatchHttpApi;
import com.facebook.aura.network.http.RequestType;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;

@DebugMetadata(c = "com.facebook.aura.pairs.PairsRepository$saveGuidance$result$1", f = "PairsRepository.kt", l = {1928}, m = "invokeSuspend", v = 2)
/* loaded from: classes3.dex */
public final class PairsRepository$saveGuidance$result$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Boolean>, Object> {
    public final /* synthetic */ String $chatSessionId;
    public final /* synthetic */ PairsDiscretionDocument $document;
    public final /* synthetic */ String $text;
    public int I$0;
    public int I$1;
    public int I$2;
    public int I$3;
    public int I$4;
    public int I$5;
    public int I$6;
    public Object L$0;
    public Object L$1;
    public Object L$10;
    public Object L$11;
    public Object L$12;
    public Object L$13;
    public Object L$14;
    public Object L$15;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public Object L$5;
    public Object L$6;
    public Object L$7;
    public Object L$8;
    public Object L$9;
    public int label;
    public final /* synthetic */ PairsRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PairsRepository$saveGuidance$result$1(String str, PairsDiscretionDocument pairsDiscretionDocument, String str2, PairsRepository pairsRepository, HtJ<? super PairsRepository$saveGuidance$result$1> htJ) {
        super(2, htJ);
        this.$chatSessionId = str;
        this.$document = pairsDiscretionDocument;
        this.$text = str2;
        this.this$0 = pairsRepository;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new PairsRepository$saveGuidance$result$1(this.$chatSessionId, this.$document, this.$text, this.this$0, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) throws Throwable {
        String strProposedContent;
        Object objM1599executeJarvisRequestWithFof5HsY;
        Throwable thA00;
        JsonElement jsonElementA12;
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        boolean z = true;
        try {
            if (i == 0) {
                Hwg.A00(obj);
                String strPath = PairsDiscretionDocument.Companion.path(this.$chatSessionId);
                if (strPath == null || (strProposedContent = this.$document.proposedContent(this.$text)) == null) {
                    return false;
                }
                PairsRepository pairsRepository = this.this$0;
                JarvisPath.FsWrite fsWrite = JarvisPath.FsWrite.INSTANCE;
                PairsFsWriteRequestJson pairsFsWriteRequestJson = new PairsFsWriteRequestJson(strPath, strProposedContent, true, false, false);
                Long lA0S = C3cG.A0S(360L);
                RequestType requestType = RequestType.POST;
                Set<Integer> setA18 = AnonymousClass004.A18();
                C9jH c9jHA0E = AGH.A0E();
                PairsRepository$saveGuidance$result$1$invokeSuspend$$inlined$write$default$1 pairsRepository$saveGuidance$result$1$invokeSuspend$$inlined$write$default$1 = PairsRepository$saveGuidance$result$1$invokeSuspend$$inlined$write$default$1.INSTANCE;
                PairsRepository$write$$inlined$executeJarvisRequestZ6QaZII$default$2 pairsRepository$write$$inlined$executeJarvisRequestZ6QaZII$default$2 = PairsRepository$write$$inlined$executeJarvisRequestZ6QaZII$default$2.INSTANCE;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = pairsRepository;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = null;
                this.L$6 = null;
                this.L$7 = null;
                this.L$8 = null;
                this.L$9 = null;
                this.L$10 = null;
                this.L$11 = null;
                this.L$12 = null;
                this.L$13 = null;
                this.L$14 = null;
                this.L$15 = null;
                this.I$0 = 0;
                this.I$1 = 1;
                this.I$2 = 0;
                this.I$3 = 1;
                this.I$4 = 0;
                this.I$5 = 0;
                this.I$6 = 0;
                this.label = 1;
                objM1599executeJarvisRequestWithFof5HsY = HatchHttpApi.INSTANCE.m1599executeJarvisRequestWithFof5HsY(pairsRepository$saveGuidance$result$1$invokeSuspend$$inlined$write$default$1, pairsRepository$write$$inlined$executeJarvisRequestZ6QaZII$default$2, false, fsWrite, pairsFsWriteRequestJson, requestType, pairsRepository.userSession, lA0S, null, new HxE[0], setA18, false, true, c9jHA0E, null, false, true, false, false, null, false, this);
                if (objM1599executeJarvisRequestWithFof5HsY == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                objM1599executeJarvisRequestWithFof5HsY = AnonymousClass002.A0j(obj);
            }
            thA00 = HsJ.A00(objM1599executeJarvisRequestWithFof5HsY);
        } catch (PairsException unused) {
            z = false;
        }
        if (thA00 != null) {
            throw C60Q.A0p(thA00);
        }
        JsonObject jsonObject = (JsonObject) objM1599executeJarvisRequestWithFof5HsY;
        if (!C60P.A1Z(jsonObject) || (jsonElementA12 = C60Q.A12(jsonObject)) == null) {
            jsonElementA12 = jsonObject;
        }
        try {
            HatchJsonKt.HatchJson.A01(PairsFsWriteResponseJson$$serializer.INSTANCE, jsonElementA12);
            return Boolean.valueOf(z);
        } catch (IllegalArgumentException unused2) {
            throw new PairsException(PairsError.FAILED, false, null, null);
        }
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Boolean> htJ) {
        return ((PairsRepository$saveGuidance$result$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
