package com.facebook.rp.platform.metaai.rsys;

import X.AbstractC07127nr;
import X.C10543Hqv;
import X.C3UX;
import X.C8j3;
import X.C9586GQf;
import X.EnumC10452Hio;
import X.G0V;
import X.GQX;
import X.GSV;
import X.GXO;
import X.HtJ;
import com.facebook.aura.partners.wearables.linking.MC;
import com.facebook.rp.platform.metaai.rsys.voicestate.MetaAiVoiceStateProxyImpl;
import com.facebook.rsys.call.datamessage.gen.DataMessage;
import com.facebook.rsys.outgoingcallconfig.gen.StateSyncMessage;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.rp.platform.metaai.rsys.MetaAiRsysSdk$startSession$3$7", f = "MetaAiRsysSdk.kt", l = {MC.android_lobster_wearables_v2.__CONFIG__}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
public final class MetaAiRsysSdk$startSession$3$7 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ GXO $audioProxy;
    public final /* synthetic */ GSV $audioStateManager;
    public final /* synthetic */ EnumC10452Hio $generatedVideoProfile;
    public final /* synthetic */ C10543Hqv<List<DataMessage>> $initialDataMessages;
    public final /* synthetic */ StateSyncMessage $initialStateSyncMessage;
    public final /* synthetic */ boolean $isSilentStartBypass;
    public final /* synthetic */ String $localCallId;
    public final /* synthetic */ GQX $mediaConfig;
    public final /* synthetic */ C9586GQf $params;
    public final /* synthetic */ MetaAiRsysSdkRealTimeSession $session;
    public final /* synthetic */ MetaAiVoiceStateProxyImpl $voiceStateProxy;
    public int I$0;
    public int I$1;
    public int I$2;
    public int I$3;
    public int I$4;
    public int I$5;
    public int I$6;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public Object L$5;
    public Object L$6;
    public Object L$7;
    public int label;
    public final /* synthetic */ MetaAiRsysSdk this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (LX/GQf;LX/Hio;Lcom/facebook/rp/platform/metaai/rsys/MetaAiRsysSdk;LX/GQX;Lcom/facebook/rp/platform/metaai/rsys/MetaAiRsysSdkRealTimeSession;LX/Hqv<Ljava/util/List<Lcom/facebook/rsys/call/datamessage/gen/DataMessage;>;>;LX/GSV;Lcom/facebook/rsys/outgoingcallconfig/gen/StateSyncMessage;ZLjava/lang/String;Lcom/facebook/rp/platform/metaai/rsys/voicestate/MetaAiVoiceStateProxyImpl;LX/GXO;LX/HtJ<-Lcom/facebook/rp/platform/metaai/rsys/MetaAiRsysSdk$startSession$3$7;>;)V */
    public MetaAiRsysSdk$startSession$3$7(GSV gsv, GQX gqx, C9586GQf c9586GQf, MetaAiRsysSdk metaAiRsysSdk, MetaAiRsysSdkRealTimeSession metaAiRsysSdkRealTimeSession, MetaAiVoiceStateProxyImpl metaAiVoiceStateProxyImpl, EnumC10452Hio enumC10452Hio, GXO gxo, StateSyncMessage stateSyncMessage, String str, HtJ htJ, C10543Hqv c10543Hqv, boolean z) {
        super(2, htJ);
        this.$params = c9586GQf;
        this.$generatedVideoProfile = enumC10452Hio;
        this.this$0 = metaAiRsysSdk;
        this.$mediaConfig = gqx;
        this.$session = metaAiRsysSdkRealTimeSession;
        this.$initialDataMessages = c10543Hqv;
        this.$audioStateManager = gsv;
        this.$initialStateSyncMessage = stateSyncMessage;
        this.$isSilentStartBypass = z;
        this.$localCallId = str;
        this.$voiceStateProxy = metaAiVoiceStateProxyImpl;
        this.$audioProxy = gxo;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        C9586GQf c9586GQf = this.$params;
        EnumC10452Hio enumC10452Hio = this.$generatedVideoProfile;
        MetaAiRsysSdk metaAiRsysSdk = this.this$0;
        GQX gqx = this.$mediaConfig;
        MetaAiRsysSdkRealTimeSession metaAiRsysSdkRealTimeSession = this.$session;
        C10543Hqv<List<DataMessage>> c10543Hqv = this.$initialDataMessages;
        GSV gsv = this.$audioStateManager;
        StateSyncMessage stateSyncMessage = this.$initialStateSyncMessage;
        boolean z = this.$isSilentStartBypass;
        return new MetaAiRsysSdk$startSession$3$7(gsv, gqx, c9586GQf, metaAiRsysSdk, metaAiRsysSdkRealTimeSession, this.$voiceStateProxy, enumC10452Hio, this.$audioProxy, stateSyncMessage, this.$localCallId, htJ, c10543Hqv, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0366 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0097 A[Catch: CancellationException -> 0x0379, TryCatch #1 {CancellationException -> 0x0379, blocks: (B:5:0x0012, B:133:0x0369, B:9:0x001f, B:11:0x0027, B:12:0x002d, B:14:0x0035, B:16:0x003f, B:20:0x004b, B:22:0x004f, B:24:0x005d, B:26:0x006b, B:32:0x0083, B:38:0x0097, B:40:0x00a0, B:42:0x00a6, B:45:0x00ac, B:47:0x00b2, B:51:0x00bb, B:67:0x0101, B:68:0x010c, B:78:0x0123, B:80:0x0159, B:83:0x0163, B:86:0x0169, B:90:0x017c, B:91:0x0180, B:93:0x01a5, B:94:0x01b1, B:96:0x022a, B:98:0x0230, B:100:0x0236, B:102:0x0271, B:103:0x0281, B:105:0x0285, B:106:0x0295, B:108:0x02ac, B:111:0x02b4, B:113:0x02be, B:118:0x02cb, B:119:0x02cf, B:121:0x02d3, B:122:0x02d7, B:124:0x02db, B:129:0x02e9, B:74:0x011b, B:75:0x011f, B:53:0x00c5, B:55:0x00cd, B:57:0x00d5, B:59:0x00dd, B:63:0x00e6, B:64:0x00ee, B:65:0x00f8), top: B:151:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b2 A[Catch: CancellationException -> 0x0379, TryCatch #1 {CancellationException -> 0x0379, blocks: (B:5:0x0012, B:133:0x0369, B:9:0x001f, B:11:0x0027, B:12:0x002d, B:14:0x0035, B:16:0x003f, B:20:0x004b, B:22:0x004f, B:24:0x005d, B:26:0x006b, B:32:0x0083, B:38:0x0097, B:40:0x00a0, B:42:0x00a6, B:45:0x00ac, B:47:0x00b2, B:51:0x00bb, B:67:0x0101, B:68:0x010c, B:78:0x0123, B:80:0x0159, B:83:0x0163, B:86:0x0169, B:90:0x017c, B:91:0x0180, B:93:0x01a5, B:94:0x01b1, B:96:0x022a, B:98:0x0230, B:100:0x0236, B:102:0x0271, B:103:0x0281, B:105:0x0285, B:106:0x0295, B:108:0x02ac, B:111:0x02b4, B:113:0x02be, B:118:0x02cb, B:119:0x02cf, B:121:0x02d3, B:122:0x02d7, B:124:0x02db, B:129:0x02e9, B:74:0x011b, B:75:0x011f, B:53:0x00c5, B:55:0x00cd, B:57:0x00d5, B:59:0x00dd, B:63:0x00e6, B:64:0x00ee, B:65:0x00f8), top: B:151:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00e6 A[Catch: CancellationException -> 0x0379, TryCatch #1 {CancellationException -> 0x0379, blocks: (B:5:0x0012, B:133:0x0369, B:9:0x001f, B:11:0x0027, B:12:0x002d, B:14:0x0035, B:16:0x003f, B:20:0x004b, B:22:0x004f, B:24:0x005d, B:26:0x006b, B:32:0x0083, B:38:0x0097, B:40:0x00a0, B:42:0x00a6, B:45:0x00ac, B:47:0x00b2, B:51:0x00bb, B:67:0x0101, B:68:0x010c, B:78:0x0123, B:80:0x0159, B:83:0x0163, B:86:0x0169, B:90:0x017c, B:91:0x0180, B:93:0x01a5, B:94:0x01b1, B:96:0x022a, B:98:0x0230, B:100:0x0236, B:102:0x0271, B:103:0x0281, B:105:0x0285, B:106:0x0295, B:108:0x02ac, B:111:0x02b4, B:113:0x02be, B:118:0x02cb, B:119:0x02cf, B:121:0x02d3, B:122:0x02d7, B:124:0x02db, B:129:0x02e9, B:74:0x011b, B:75:0x011f, B:53:0x00c5, B:55:0x00cd, B:57:0x00d5, B:59:0x00dd, B:63:0x00e6, B:64:0x00ee, B:65:0x00f8), top: B:151:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ee A[Catch: CancellationException -> 0x0379, TryCatch #1 {CancellationException -> 0x0379, blocks: (B:5:0x0012, B:133:0x0369, B:9:0x001f, B:11:0x0027, B:12:0x002d, B:14:0x0035, B:16:0x003f, B:20:0x004b, B:22:0x004f, B:24:0x005d, B:26:0x006b, B:32:0x0083, B:38:0x0097, B:40:0x00a0, B:42:0x00a6, B:45:0x00ac, B:47:0x00b2, B:51:0x00bb, B:67:0x0101, B:68:0x010c, B:78:0x0123, B:80:0x0159, B:83:0x0163, B:86:0x0169, B:90:0x017c, B:91:0x0180, B:93:0x01a5, B:94:0x01b1, B:96:0x022a, B:98:0x0230, B:100:0x0236, B:102:0x0271, B:103:0x0281, B:105:0x0285, B:106:0x0295, B:108:0x02ac, B:111:0x02b4, B:113:0x02be, B:118:0x02cb, B:119:0x02cf, B:121:0x02d3, B:122:0x02d7, B:124:0x02db, B:129:0x02e9, B:74:0x011b, B:75:0x011f, B:53:0x00c5, B:55:0x00cd, B:57:0x00d5, B:59:0x00dd, B:63:0x00e6, B:64:0x00ee, B:65:0x00f8), top: B:151:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0101 A[Catch: CancellationException -> 0x0379, TryCatch #1 {CancellationException -> 0x0379, blocks: (B:5:0x0012, B:133:0x0369, B:9:0x001f, B:11:0x0027, B:12:0x002d, B:14:0x0035, B:16:0x003f, B:20:0x004b, B:22:0x004f, B:24:0x005d, B:26:0x006b, B:32:0x0083, B:38:0x0097, B:40:0x00a0, B:42:0x00a6, B:45:0x00ac, B:47:0x00b2, B:51:0x00bb, B:67:0x0101, B:68:0x010c, B:78:0x0123, B:80:0x0159, B:83:0x0163, B:86:0x0169, B:90:0x017c, B:91:0x0180, B:93:0x01a5, B:94:0x01b1, B:96:0x022a, B:98:0x0230, B:100:0x0236, B:102:0x0271, B:103:0x0281, B:105:0x0285, B:106:0x0295, B:108:0x02ac, B:111:0x02b4, B:113:0x02be, B:118:0x02cb, B:119:0x02cf, B:121:0x02d3, B:122:0x02d7, B:124:0x02db, B:129:0x02e9, B:74:0x011b, B:75:0x011f, B:53:0x00c5, B:55:0x00cd, B:57:0x00d5, B:59:0x00dd, B:63:0x00e6, B:64:0x00ee, B:65:0x00f8), top: B:151:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0163 A[Catch: CancellationException -> 0x0379, TRY_ENTER, TryCatch #1 {CancellationException -> 0x0379, blocks: (B:5:0x0012, B:133:0x0369, B:9:0x001f, B:11:0x0027, B:12:0x002d, B:14:0x0035, B:16:0x003f, B:20:0x004b, B:22:0x004f, B:24:0x005d, B:26:0x006b, B:32:0x0083, B:38:0x0097, B:40:0x00a0, B:42:0x00a6, B:45:0x00ac, B:47:0x00b2, B:51:0x00bb, B:67:0x0101, B:68:0x010c, B:78:0x0123, B:80:0x0159, B:83:0x0163, B:86:0x0169, B:90:0x017c, B:91:0x0180, B:93:0x01a5, B:94:0x01b1, B:96:0x022a, B:98:0x0230, B:100:0x0236, B:102:0x0271, B:103:0x0281, B:105:0x0285, B:106:0x0295, B:108:0x02ac, B:111:0x02b4, B:113:0x02be, B:118:0x02cb, B:119:0x02cf, B:121:0x02d3, B:122:0x02d7, B:124:0x02db, B:129:0x02e9, B:74:0x011b, B:75:0x011f, B:53:0x00c5, B:55:0x00cd, B:57:0x00d5, B:59:0x00dd, B:63:0x00e6, B:64:0x00ee, B:65:0x00f8), top: B:151:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0168  */
    @Override // X.AbstractC8884Fsp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r44) {
        /*
            Method dump skipped, instructions count: 937
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.rp.platform.metaai.rsys.MetaAiRsysSdk$startSession$3$7.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.G0V
    public final /* bridge */ /* synthetic */ Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((MetaAiRsysSdk$startSession$3$7) C8j3.A1E(htJ, c3ux, this)).invokeSuspend(Unit.INSTANCE);
    }
}
