package com.facebook.aura.vmbrowser.runtime;

import X.AGH;
import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.BFI;
import X.C06H;
import X.C10571Hud;
import X.C3UX;
import X.C3cG;
import X.C7384Etj;
import X.C7BY;
import X.C9jH;
import X.CFK;
import X.EnumC10460Hji;
import X.G0V;
import X.GAo;
import X.HsJ;
import X.HtJ;
import X.Hwg;
import X.HxE;
import com.facebook.aura.browsertask.control.BrowserTaskControlTransportKt;
import com.facebook.aura.common.video.HatchTransportHttpDataSourceKt;
import com.facebook.aura.json.NetworkException;
import com.facebook.aura.network.http.HatchHttpApi;
import com.facebook.aura.network.http.RequestType;
import com.facebook.aura.vmbrowser.runtime.BrowserDeviceCopyResult;
import com.facebook.aura.vmbrowser.runtime.VmBrowserJarvisPath;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes2.dex */
public final class BrowserDeviceClipboard {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();

    @Deprecated
    public static final long REQUEST_TIMEOUT_SECONDS = 10;

    @Deprecated
    public static final String TAG = "BrowserDeviceClipboard";
    public final AbstractC3358CGz userSession;

    @DebugMetadata(c = "com.facebook.aura.vmbrowser.runtime.BrowserDeviceClipboard$copy$2", f = "BrowserDeviceClipboard.kt", l = {HatchTransportHttpDataSourceKt.HTTP_PARTIAL_CONTENT}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.vmbrowser.runtime.BrowserDeviceClipboard$copy$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super BrowserDeviceCopyResult>, Object> {
        public final /* synthetic */ String $gatewayUrl;
        public final /* synthetic */ String $takeoverId;
        public final /* synthetic */ String $taskId;
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
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public Object L$7;
        public Object L$8;
        public Object L$9;
        public int label;
        public final /* synthetic */ BrowserDeviceClipboard this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str, String str2, String str3, BrowserDeviceClipboard browserDeviceClipboard, HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
            this.$taskId = str;
            this.$takeoverId = str2;
            this.$gatewayUrl = str3;
            this.this$0 = browserDeviceClipboard;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass2(this.$taskId, this.$takeoverId, this.$gatewayUrl, this.this$0, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            String strA0k;
            Object objM1599executeJarvisRequestWithFof5HsY;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            try {
                if (i == 0) {
                    Hwg.A00(obj);
                    if (C7BY.A0j(this.$taskId) || C7BY.A0j(this.$takeoverId) || C7BY.A0j(this.$gatewayUrl)) {
                        return new BrowserDeviceCopyResult.Unavailable(null, null);
                    }
                    strA0k = AnonymousClass002.A0k();
                    HatchHttpApi hatchHttpApi = HatchHttpApi.INSTANCE;
                    String str = this.$taskId;
                    VmBrowserJarvisPath.BrowserTaskClipboard.Action action = VmBrowserJarvisPath.BrowserTaskClipboard.Action.COPY;
                    String str2 = this.$gatewayUrl;
                    Set<Integer> setA18 = AnonymousClass004.A18();
                    C9jH c9jHA0E = AGH.A0E();
                    BrowserDeviceClipboard$copy$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$1 browserDeviceClipboard$copy$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$1 = BrowserDeviceClipboard$copy$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$1.INSTANCE;
                    BrowserDeviceClipboard$copy$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$2 browserDeviceClipboard$copy$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$2 = BrowserDeviceClipboard$copy$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$2.INSTANCE;
                    this.L$0 = strA0k;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.L$5 = null;
                    this.L$6 = null;
                    this.L$7 = null;
                    this.L$8 = null;
                    this.L$9 = null;
                    this.L$10 = null;
                    this.I$0 = 1;
                    this.I$1 = 0;
                    this.I$2 = 1;
                    this.I$3 = 0;
                    this.I$4 = 1;
                    this.I$5 = 0;
                    this.I$6 = 0;
                    this.label = 1;
                    objM1599executeJarvisRequestWithFof5HsY = hatchHttpApi.m1599executeJarvisRequestWithFof5HsY(browserDeviceClipboard$copy$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$1, browserDeviceClipboard$copy$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$2, false, new VmBrowserJarvisPath.BrowserTaskClipboard(BrowserTaskControlTransportKt.encodeBrowserTaskId(str), action), new BrowserClipboardCopyRequestJson(strA0k, this.$takeoverId), RequestType.POST, this.this$0.userSession, C3cG.A0S(10L), null, new HxE[0], setA18, true, false, c9jHA0E, str2, true, false, true, false, null, false, this);
                    if (objM1599executeJarvisRequestWithFof5HsY == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                } else {
                    if (i != 1) {
                        throw AnonymousClass001.A0n();
                    }
                    strA0k = (String) this.L$0;
                    objM1599executeJarvisRequestWithFof5HsY = AnonymousClass002.A0j(obj);
                }
                Object obj2 = objM1599executeJarvisRequestWithFof5HsY;
                if (objM1599executeJarvisRequestWithFof5HsY instanceof C10571Hud) {
                    obj2 = null;
                }
                BrowserClipboardCopyReceiptJson browserClipboardCopyReceiptJson = (BrowserClipboardCopyReceiptJson) obj2;
                return browserClipboardCopyReceiptJson == null ? this.this$0.definitelyUnavailable(HsJ.A00(objM1599executeJarvisRequestWithFof5HsY)) ? new BrowserDeviceCopyResult.Unavailable(null, BrowserClipboardReasonDetail.TRANSPORT_ERROR) : BrowserDeviceCopyResult.OutcomeUnknown.INSTANCE : BrowserDeviceClipboardKt.decodeBrowserClipboardCopyReceipt(strA0k, browserClipboardCopyReceiptJson);
            } catch (CancellationException e) {
                throw e;
            } catch (Exception e2) {
                CFK.A0A(BrowserDeviceClipboard.TAG, "Device clipboard copy failed", e2);
                return BrowserDeviceCopyResult.OutcomeUnknown.INSTANCE;
            }
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super BrowserDeviceCopyResult> htJ) {
            return ((AnonymousClass2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.vmbrowser.runtime.BrowserDeviceClipboard$paste$2", f = "BrowserDeviceClipboard.kt", l = {HatchTransportHttpDataSourceKt.HTTP_PARTIAL_CONTENT}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.vmbrowser.runtime.BrowserDeviceClipboard$paste$2, reason: invalid class name and case insensitive filesystem */
    public final class C143132 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super BrowserDevicePasteResult>, Object> {
        public final /* synthetic */ String $gatewayUrl;
        public final /* synthetic */ String $takeoverId;
        public final /* synthetic */ String $taskId;
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
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public Object L$7;
        public Object L$8;
        public Object L$9;
        public int label;
        public final /* synthetic */ BrowserDeviceClipboard this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C143132(String str, String str2, String str3, String str4, BrowserDeviceClipboard browserDeviceClipboard, HtJ<? super C143132> htJ) {
            super(2, htJ);
            this.$taskId = str;
            this.$takeoverId = str2;
            this.$gatewayUrl = str3;
            this.$text = str4;
            this.this$0 = browserDeviceClipboard;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new C143132(this.$taskId, this.$takeoverId, this.$gatewayUrl, this.$text, this.this$0, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            Object objM1599executeJarvisRequestWithFof5HsY;
            Object obj2;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            try {
                if (i == 0) {
                    Hwg.A00(obj);
                    if (C7BY.A0j(this.$taskId) || C7BY.A0j(this.$takeoverId) || C7BY.A0j(this.$gatewayUrl) || BrowserDeviceClipboardFeedbackKt.browserClipboardTextError(this.$text) != null) {
                        return BrowserDevicePasteResult.UNAVAILABLE;
                    }
                    String strA0k = AnonymousClass002.A0k();
                    HatchHttpApi hatchHttpApi = HatchHttpApi.INSTANCE;
                    String str = this.$taskId;
                    VmBrowserJarvisPath.BrowserTaskClipboard.Action action = VmBrowserJarvisPath.BrowserTaskClipboard.Action.PASTE;
                    String str2 = this.$gatewayUrl;
                    Set<Integer> setA18 = AnonymousClass004.A18();
                    C9jH c9jHA0E = AGH.A0E();
                    BrowserDeviceClipboard$paste$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$1 browserDeviceClipboard$paste$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$1 = BrowserDeviceClipboard$paste$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$1.INSTANCE;
                    BrowserDeviceClipboard$paste$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$2 browserDeviceClipboard$paste$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$2 = BrowserDeviceClipboard$paste$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$2.INSTANCE;
                    this.L$0 = strA0k;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.L$5 = null;
                    this.L$6 = null;
                    this.L$7 = null;
                    this.L$8 = null;
                    this.L$9 = null;
                    this.L$10 = null;
                    this.I$0 = 1;
                    this.I$1 = 0;
                    this.I$2 = 1;
                    this.I$3 = 0;
                    this.I$4 = 1;
                    this.I$5 = 0;
                    this.I$6 = 0;
                    this.label = 1;
                    objM1599executeJarvisRequestWithFof5HsY = hatchHttpApi.m1599executeJarvisRequestWithFof5HsY(browserDeviceClipboard$paste$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$1, browserDeviceClipboard$paste$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$2, false, new VmBrowserJarvisPath.BrowserTaskClipboard(BrowserTaskControlTransportKt.encodeBrowserTaskId(str), action), new BrowserClipboardPasteRequestJson(strA0k, this.$takeoverId, this.$text), RequestType.POST, this.this$0.userSession, C3cG.A0S(10L), null, new HxE[0], setA18, true, false, c9jHA0E, str2, true, false, true, false, null, false, this);
                    obj2 = strA0k;
                    if (objM1599executeJarvisRequestWithFof5HsY == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                } else {
                    if (i != 1) {
                        throw AnonymousClass001.A0n();
                    }
                    Object obj3 = this.L$0;
                    objM1599executeJarvisRequestWithFof5HsY = AnonymousClass002.A0j(obj);
                    obj2 = obj3;
                }
                if (objM1599executeJarvisRequestWithFof5HsY instanceof C10571Hud) {
                    objM1599executeJarvisRequestWithFof5HsY = null;
                }
                BrowserClipboardPasteReceiptJson browserClipboardPasteReceiptJson = (BrowserClipboardPasteReceiptJson) objM1599executeJarvisRequestWithFof5HsY;
                if (browserClipboardPasteReceiptJson == null) {
                    return BrowserDevicePasteResult.OUTCOME_UNKNOWN;
                }
                if (!C7384Etj.areEqual(browserClipboardPasteReceiptJson.operation_id, obj2)) {
                    return BrowserDevicePasteResult.OUTCOME_UNKNOWN;
                }
                String str3 = browserClipboardPasteReceiptJson.outcome;
                return "delivered".equals(str3) ? BrowserDevicePasteResult.DELIVERED : "unavailable".equals(str3) ? BrowserDevicePasteResult.UNAVAILABLE : BrowserDevicePasteResult.OUTCOME_UNKNOWN;
            } catch (CancellationException e) {
                throw e;
            } catch (Exception e2) {
                CFK.A0A(BrowserDeviceClipboard.TAG, "Device clipboard paste failed", e2);
                return BrowserDevicePasteResult.OUTCOME_UNKNOWN;
            }
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super BrowserDevicePasteResult> htJ) {
            return ((C143132) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public BrowserDeviceClipboard(AbstractC3358CGz abstractC3358CGz) {
        C7384Etj.A0Y(abstractC3358CGz, 0);
        this.userSession = abstractC3358CGz;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean definitelyUnavailable(Throwable th) {
        NetworkException networkException = th instanceof NetworkException ? (NetworkException) th : null;
        if (networkException != null) {
            if (BFI.A0H(new Integer[]{400, 401, 403, 404, 409, 410, 422}).contains(Integer.valueOf(networkException.httpResponseCode))) {
                return true;
            }
        }
        return false;
    }

    public final class Companion {
        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ VmBrowserJarvisPath.BrowserTaskClipboard access$path(BrowserDeviceClipboard browserDeviceClipboard, String str, VmBrowserJarvisPath.BrowserTaskClipboard.Action action) {
        return new VmBrowserJarvisPath.BrowserTaskClipboard(BrowserTaskControlTransportKt.encodeBrowserTaskId(str), action);
    }

    private final VmBrowserJarvisPath.BrowserTaskClipboard path(String str, VmBrowserJarvisPath.BrowserTaskClipboard.Action action) {
        return new VmBrowserJarvisPath.BrowserTaskClipboard(BrowserTaskControlTransportKt.encodeBrowserTaskId(str), action);
    }

    public final Object copy(String str, String str2, String str3, HtJ<? super BrowserDeviceCopyResult> htJ) {
        return GAo.A00(htJ, AnonymousClass001.A0y(), new AnonymousClass2(str, str2, str3, this, null));
    }

    public final Object paste(String str, String str2, String str3, String str4, HtJ<? super BrowserDevicePasteResult> htJ) {
        return GAo.A00(htJ, AnonymousClass001.A0y(), new C143132(str, str2, str3, str4, this, null));
    }
}
