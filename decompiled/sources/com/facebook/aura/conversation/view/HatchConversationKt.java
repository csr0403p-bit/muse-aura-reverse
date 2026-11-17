package com.facebook.aura.conversation.view;

import X.AaC;
import X.C1BO;
import X.C7384Etj;
import X.C7BY;
import X.G0V;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import java.util.Set;
import kotlin.Unit;

/* loaded from: classes.dex */
public abstract class HatchConversationKt {
    public static final long BOTTOM_SETTLE_CURSOR_MS = 350;
    public static final long BOTTOM_SETTLE_INITIAL_MS = 450;
    public static final long BOTTOM_SETTLE_NEW_MESSAGE_MS = 350;
    public static final String NODE_INVOKE_URL_PREFIX = "hatch://devices/invoke/";
    public static final long POST_STREAM_FOLLOW_MS = 800;
    public static final float PaginationSpinnerTopOffset = AuraDimensKt.SpacingXsmall;

    public static final String subscriptionCtaAction(String str) {
        C7384Etj.A0Y(str, 0);
        String strA0K = C7BY.A0K("hatch://devices/invoke/", str);
        return C7BY.A0S(strA0K, strA0K, '?');
    }

    public static final void HatchConversation_80_EzA0$lambda$30(MutableState<Float> mutableState, float f) {
        mutableState.Af8(Float.valueOf(f));
    }

    public static final G0V<String, String, Unit> HatchConversation_80_EzA0$lambda$54(C1BO<? extends G0V<? super String, ? super String, Unit>> c1bo) {
        return (G0V) c1bo.getValue();
    }

    public static final /* synthetic */ G0V access$HatchConversation_80_EzA0$lambda$54(C1BO c1bo) {
        return (G0V) c1bo.getValue();
    }

    public static final /* synthetic */ AaC access$HatchConversation_80_EzA0$lambda$67(MutableState mutableState) {
        return (AaC) mutableState.getValue();
    }

    public static final /* synthetic */ Set access$HatchConversation_80_EzA0$lambda$91(MutableState mutableState) {
        return (Set) mutableState.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0373  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x03b3  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x03ed  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x03fe  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0410  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x041e  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x042c  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x043a  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0455  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0466  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0487  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x04a8  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x04c0  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x04d6  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x04fc  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0508  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x050f  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x0611  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x0777  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x07ba  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x07ca  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x07e1  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x07ed  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x07f3  */
    /* JADX WARN: Removed duplicated region for block: B:368:0x080d  */
    /* JADX WARN: Removed duplicated region for block: B:372:0x082d  */
    /* JADX WARN: Removed duplicated region for block: B:375:0x0846  */
    /* JADX WARN: Removed duplicated region for block: B:391:0x089a  */
    /* JADX WARN: Removed duplicated region for block: B:394:0x08a9  */
    /* JADX WARN: Removed duplicated region for block: B:397:0x08d4  */
    /* JADX WARN: Removed duplicated region for block: B:400:0x08e2  */
    /* JADX WARN: Removed duplicated region for block: B:403:0x08f2  */
    /* JADX WARN: Removed duplicated region for block: B:406:0x0902  */
    /* JADX WARN: Removed duplicated region for block: B:409:0x0913  */
    /* JADX WARN: Removed duplicated region for block: B:412:0x0924  */
    /* JADX WARN: Removed duplicated region for block: B:415:0x0934  */
    /* JADX WARN: Removed duplicated region for block: B:418:0x0944  */
    /* JADX WARN: Removed duplicated region for block: B:421:0x0954  */
    /* JADX WARN: Removed duplicated region for block: B:424:0x0962  */
    /* JADX WARN: Removed duplicated region for block: B:428:0x0978  */
    /* JADX WARN: Removed duplicated region for block: B:432:0x0994  */
    /* JADX WARN: Removed duplicated region for block: B:436:0x09b2  */
    /* JADX WARN: Removed duplicated region for block: B:439:0x09c8  */
    /* JADX WARN: Removed duplicated region for block: B:443:0x09dd  */
    /* JADX WARN: Removed duplicated region for block: B:447:0x09f6  */
    /* JADX WARN: Removed duplicated region for block: B:450:0x0a09  */
    /* JADX WARN: Removed duplicated region for block: B:454:0x0a23  */
    /* JADX WARN: Removed duplicated region for block: B:458:0x0a4a  */
    /* JADX WARN: Removed duplicated region for block: B:461:0x0a5b  */
    /* JADX WARN: Removed duplicated region for block: B:465:0x0b0b  */
    /* JADX WARN: Removed duplicated region for block: B:472:0x0b76  */
    /* JADX WARN: Removed duplicated region for block: B:476:0x0bde  */
    /* JADX WARN: Removed duplicated region for block: B:480:0x0c3a  */
    /* JADX WARN: Removed duplicated region for block: B:484:0x0c6c  */
    /* JADX WARN: Removed duplicated region for block: B:491:0x0ca3  */
    /* JADX WARN: Removed duplicated region for block: B:498:0x0cb9  */
    /* JADX WARN: Removed duplicated region for block: B:502:0x0ccc  */
    /* JADX WARN: Removed duplicated region for block: B:506:0x0cef  */
    /* JADX WARN: Removed duplicated region for block: B:509:0x0d03 A[LOOP:2: B:507:0x0cfd->B:509:0x0d03, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:512:0x0d15  */
    /* JADX WARN: Removed duplicated region for block: B:515:0x0d1a  */
    /* JADX WARN: Removed duplicated region for block: B:516:0x0d20  */
    /* JADX WARN: Removed duplicated region for block: B:517:0x0d24  */
    /* JADX WARN: Removed duplicated region for block: B:519:0x0d2b  */
    /* JADX WARN: Removed duplicated region for block: B:520:0x0d2f  */
    /* JADX WARN: Removed duplicated region for block: B:583:0x0e63  */
    /* JADX WARN: Removed duplicated region for block: B:592:0x0e8c  */
    /* JADX WARN: Removed duplicated region for block: B:600:0x0f37  */
    /* JADX WARN: Removed duplicated region for block: B:610:0x1030  */
    /* JADX WARN: Removed duplicated region for block: B:613:0x0d32 A[SYNTHETIC] */
    /* renamed from: HatchConversation-80_EzA0, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m557HatchConversation80_EzA0(com.facebook.aura.conversation.viewmodel.HatchConversationUiState r168, X.AHD<? extends com.facebook.aura.conversation.viewmodel.HatchConversationListItem> r169, java.lang.String r170, float r171, float r172, float r173, long r174, long r176, kotlin.jvm.functions.Function0<kotlin.Unit> r178, com.facebook.aura.qpl.startup.StartupRenderCallback r179, X.G0U<? super com.facebook.aura.file.view.api.ContentItem, kotlin.Unit> r180, boolean r181, X.BRg r182, kotlin.jvm.functions.Function0<kotlin.Unit> r183, kotlin.jvm.functions.Function0<kotlin.Unit> r184, kotlin.jvm.functions.Function0<kotlin.Unit> r185, com.facebook.aura.conversation.view.HighlightRequest r186, kotlin.jvm.functions.Function0<kotlin.Unit> r187, kotlin.jvm.functions.Function0<kotlin.Unit> r188, X.G0U<? super com.facebook.aura.model.HatchContentViewModelData, kotlin.Unit> r189, X.G0U<? super java.lang.String, kotlin.Unit> r190, X.G0U<? super java.lang.String, kotlin.Unit> r191, X.G0U<? super X.G0U<? super java.lang.String, kotlin.Unit>, kotlin.Unit> r192, X.G0V<? super java.lang.String, ? super java.lang.String, kotlin.Unit> r193, kotlin.jvm.functions.Function0<kotlin.Unit> r194, X.G0U<? super java.lang.String, kotlin.Unit> r195, X.G0U<? super java.lang.String, kotlin.Unit> r196, X.G0U<? super com.facebook.aura.model.HatchSendMessage, kotlin.Unit> r197, X.G0W<? super java.lang.String, ? super java.lang.String, ? super java.lang.String, kotlin.Unit> r198, kotlin.jvm.functions.Function0<kotlin.Unit> r199, X.G0U<? super java.lang.String, java.lang.Integer> r200, X.G0V<? super java.lang.String, ? super java.lang.Integer, kotlin.Unit> r201, X.G0U<? super com.facebook.aura.conversation.viewmodel.HatchMessageUiModel, kotlin.Unit> r202, X.C20Q<kotlin.Unit> r203, X.C20Q<kotlin.Unit> r204, java.lang.String r205, X.BFM r206, int r207, int r208, int r209, int r210, int r211, int r212) {
        /*
            Method dump skipped, instructions count: 4156
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.view.HatchConversationKt.m557HatchConversation80_EzA0(com.facebook.aura.conversation.viewmodel.HatchConversationUiState, X.AHD, java.lang.String, float, float, float, long, long, kotlin.jvm.functions.Function0, com.facebook.aura.qpl.startup.StartupRenderCallback, X.G0U, boolean, X.BRg, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, com.facebook.aura.conversation.view.HighlightRequest, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, X.G0U, X.G0U, X.G0U, X.G0U, X.G0V, kotlin.jvm.functions.Function0, X.G0U, X.G0U, X.G0U, X.G0W, kotlin.jvm.functions.Function0, X.G0U, X.G0V, X.G0U, X.20Q, X.20Q, java.lang.String, X.BFM, int, int, int, int, int, int):void");
    }
}
