package X;

import android.content.ContentResolver;
import android.content.ContentValues;
import com.facebook.aura.commands.calendar.CalendarEventsUpdateHandler;
import com.facebook.aura.commands.calendar.CalendarRepository;
import com.facebook.aura.commands.calendar.CalendarRepositoryKt;
import com.facebook.aura.commands.calendar.CalendarSearchHandler;
import com.facebook.aura.commands.calllogs.CallLogSearchHandler;
import com.facebook.aura.commands.notifications.NotificationsActionHandler;
import com.facebook.aura.commands.photos.PhotoUploadState;
import com.facebook.aura.commands.photos.PhotosSearchHandler;
import com.facebook.aura.commands.photos.PhotosUploadStatusHandler;
import com.facebook.aura.commands.sms.MessageSearchHandler;
import com.facebook.aura.commands.sms.MessageSendHandler;
import com.facebook.aura.feed.model.FeedViewModel;
import com.facebook.aura.nodes.core.NodeCommandResponse;
import com.facebook.aura.nodes.core.NodeExecutionContext;
import com.facebook.aura.nodes.core.NodeExecutionKt;
import com.facebook.aura.pairs.ConnectionsRuleEditorUiState;
import com.facebook.aura.skills.viewmodel.SkillAccountsUiState;

/* renamed from: X.7nr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC07127nr extends HzP implements BM4 {
    public final int arity;

    public AbstractC07127nr(int i) {
        this(i, null);
    }

    public static NodeCommandResponse A01(boolean z) {
        return new NodeCommandResponse(z, null, null, null, null);
    }

    public static Object A02(NodeExecutionContext nodeExecutionContext, String str, HtJ htJ) {
        return NodeExecutionKt.sendError(nodeExecutionContext, str, "invalid_params", AGH.A0E(), null, htJ);
    }

    public static Object A03(NodeExecutionContext nodeExecutionContext, String str, HtJ htJ) {
        return NodeExecutionKt.sendError(nodeExecutionContext, str, null, AGH.A0E(), null, htJ);
    }

    public static String A04(CalendarSearchHandler.AnonymousClass2 anonymousClass2) {
        anonymousClass2.L$0 = null;
        anonymousClass2.L$1 = null;
        anonymousClass2.L$2 = null;
        return null;
    }

    public static void A0B(CalendarEventsUpdateHandler.AnonymousClass2 anonymousClass2) {
        anonymousClass2.L$0 = null;
        anonymousClass2.L$1 = null;
        anonymousClass2.L$2 = null;
        anonymousClass2.L$3 = null;
        anonymousClass2.L$4 = null;
        anonymousClass2.L$5 = null;
        anonymousClass2.L$6 = null;
    }

    public static void A0C(CallLogSearchHandler.AnonymousClass2 anonymousClass2) {
        anonymousClass2.L$0 = null;
        anonymousClass2.L$1 = null;
        anonymousClass2.L$2 = null;
        anonymousClass2.L$3 = null;
        anonymousClass2.L$4 = null;
    }

    public static void A0D(NotificationsActionHandler.AnonymousClass2 anonymousClass2) {
        anonymousClass2.L$0 = null;
        anonymousClass2.L$1 = null;
        anonymousClass2.L$2 = null;
        anonymousClass2.L$3 = null;
        anonymousClass2.L$4 = null;
    }

    public static void A0E(PhotosSearchHandler.AnonymousClass2 anonymousClass2) {
        anonymousClass2.L$0 = null;
        anonymousClass2.L$1 = null;
        anonymousClass2.L$2 = null;
        anonymousClass2.L$3 = null;
        anonymousClass2.L$4 = null;
        anonymousClass2.L$5 = null;
    }

    public static void A0F(MessageSearchHandler.AnonymousClass2 anonymousClass2) {
        anonymousClass2.L$0 = null;
        anonymousClass2.L$1 = null;
        anonymousClass2.L$2 = null;
        anonymousClass2.L$3 = null;
    }

    public static void A0G(MessageSendHandler.AnonymousClass2 anonymousClass2) {
        anonymousClass2.L$0 = null;
        anonymousClass2.L$1 = null;
        anonymousClass2.L$2 = null;
        anonymousClass2.L$3 = null;
    }

    public static ContentResolver A00(CalendarRepository calendarRepository) {
        String[] strArr = CalendarRepository.CALENDAR_PROJECTION;
        return calendarRepository.context.getContentResolver();
    }

    public static HtJ A09(Object obj, Object obj2, AbstractC8884Fsp abstractC8884Fsp) {
        return abstractC8884Fsp.create(obj2, (HtJ) obj);
    }

    public static void A0A(ContentValues contentValues, String str, int i) {
        contentValues.put(str, new Integer(i));
    }

    public static void A0I(C2nw c2nw, long j, String str) {
        C7qW.A05(new Long(j), str, c2nw);
    }

    public static boolean A0L(BLG blg) {
        Object value = blg.getValue();
        return blg.A6e(value, SkillAccountsUiState.copy$default((SkillAccountsUiState) value, false, false, null, null, null, null, false, false, false, null, null, null, false, 8189, null));
    }

    @Override // X.BM4
    public int getArity() {
        return this.arity;
    }

    @Override // X.AbstractC8884Fsp
    public String toString() {
        if (this.completion != null) {
            return super.toString();
        }
        String strA00 = F39.A00(this);
        C7384Etj.A0U(strA00);
        return strA00;
    }

    public static String A05(PhotoUploadState photoUploadState, PhotosUploadStatusHandler.AnonymousClass2 anonymousClass2, Object obj, Object obj2, int i) {
        String wireValue = photoUploadState.getWireValue();
        anonymousClass2.L$0 = null;
        anonymousClass2.L$1 = obj;
        anonymousClass2.L$2 = obj2;
        anonymousClass2.I$0 = i;
        return wireValue;
    }

    public static String A06(String str, String str2, Throwable th) {
        CFK.A08(str, str2, th);
        String message = th.getMessage();
        return message == null ? "Unknown error" : message;
    }

    public static String A07(Throwable th) {
        String message = th.getMessage();
        return message == null ? "" : message;
    }

    public static String A08(Throwable th) {
        String message = th.getMessage();
        return message == null ? "Unknown error" : message;
    }

    public static void A0H(String str, String str2) {
        CFK.A04(CalendarRepositoryKt.TAG, FGI.A0M(str, str2));
    }

    public static boolean A0J(FeedViewModel.FeedUiState feedUiState, Object obj, String str, BLG blg) {
        return blg.A6e(obj, FeedViewModel.FeedUiState.copy$default(feedUiState, null, null, null, false, false, false, false, false, false, false, false, null, false, str, null, 0, null, 0, false, 516095, null));
    }

    public static boolean A0K(BLG blg) {
        Object value = blg.getValue();
        return blg.A6e(value, ConnectionsRuleEditorUiState.copy$default((ConnectionsRuleEditorUiState) value, null, false, null, null, null, null, false, false, false, null, 895, null));
    }

    public AbstractC07127nr(int i, HtJ<Object> htJ) {
        super(htJ);
        this.arity = i;
    }
}
