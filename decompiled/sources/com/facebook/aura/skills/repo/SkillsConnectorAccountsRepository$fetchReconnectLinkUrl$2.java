package com.facebook.aura.skills.repo;

import X.AbstractC07127nr;
import X.C3UX;
import X.G0V;
import X.HsJ;
import X.HtJ;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.skills.repo.SkillsConnectorAccountsRepository$fetchReconnectLinkUrl$2", f = "SkillsConnectorAccountsRepository.kt", l = {178, 109}, m = "invokeSuspend", v = 2)
/* loaded from: classes3.dex */
public final class SkillsConnectorAccountsRepository$fetchReconnectLinkUrl$2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super HsJ<? extends String>>, Object> {
    public final /* synthetic */ String $accountId;
    public final /* synthetic */ String $connectorId;
    public final /* synthetic */ String $sourceSessionId;
    public int I$0;
    public int I$1;
    public int I$2;
    public int I$3;
    public int I$4;
    public int I$5;
    public int I$6;
    public int I$7;
    public long J$0;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public Object L$5;
    public Object L$6;
    public Object L$7;
    public Object L$8;
    public int label;
    public final /* synthetic */ SkillsConnectorAccountsRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SkillsConnectorAccountsRepository$fetchReconnectLinkUrl$2(String str, String str2, String str3, SkillsConnectorAccountsRepository skillsConnectorAccountsRepository, HtJ<? super SkillsConnectorAccountsRepository$fetchReconnectLinkUrl$2> htJ) {
        super(2, htJ);
        this.$accountId = str;
        this.$connectorId = str2;
        this.$sourceSessionId = str3;
        this.this$0 = skillsConnectorAccountsRepository;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new SkillsConnectorAccountsRepository$fetchReconnectLinkUrl$2(this.$accountId, this.$connectorId, this.$sourceSessionId, this.this$0, htJ);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00a8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ee A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00c7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x011c -> B:7:0x001a). Please report as a decompilation issue!!! */
    @Override // X.AbstractC8884Fsp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r31) throws java.io.UnsupportedEncodingException {
        /*
            Method dump skipped, instructions count: 323
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.skills.repo.SkillsConnectorAccountsRepository$fetchReconnectLinkUrl$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(C3UX c3ux, HtJ<? super HsJ<String>> htJ) {
        return ((SkillsConnectorAccountsRepository$fetchReconnectLinkUrl$2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Object invoke(C3UX c3ux, HtJ<? super HsJ<? extends String>> htJ) {
        return invoke2(c3ux, (HtJ<? super HsJ<String>>) htJ);
    }
}
