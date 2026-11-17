package X;

import java.lang.reflect.InvocationTargetException;

/* renamed from: X.Ee0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6998Ee0 implements InterfaceC7006EeD {
    @Override // X.InterfaceC7006EeD
    public final InterfaceC7026EeX createImageTranscoder(C7003Ee6 c7003Ee6, boolean z) throws IllegalAccessException, InstantiationException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
        C7384Etj.A0Y(c7003Ee6, 0);
        try {
            Class<?> cls = Class.forName("com.facebook.imagepipeline.nativecode.NativeJpegTranscoderFactory");
            Class cls2 = Integer.TYPE;
            Class cls3 = Boolean.TYPE;
            Object objNewInstance = cls.getConstructor(cls2, cls3, cls3).newInstance(2048, false, true);
            C7384Etj.A0Z(objNewInstance, "null cannot be cast to non-null type com.facebook.imagepipeline.transcoder.ImageTranscoderFactory");
            InterfaceC7026EeX interfaceC7026EeXCreateImageTranscoder = ((InterfaceC7006EeD) objNewInstance).createImageTranscoder(c7003Ee6, z);
            return interfaceC7026EeXCreateImageTranscoder == null ? new C6989Edp(z) : interfaceC7026EeXCreateImageTranscoder;
        } catch (ClassNotFoundException e) {
            throw BV4.A0d("Dependency ':native-imagetranscoder' is needed to use the default native image transcoder.", e);
        } catch (IllegalAccessException e2) {
            throw BV4.A0d("Dependency ':native-imagetranscoder' is needed to use the default native image transcoder.", e2);
        } catch (IllegalArgumentException e3) {
            throw BV4.A0d("Dependency ':native-imagetranscoder' is needed to use the default native image transcoder.", e3);
        } catch (InstantiationException e4) {
            throw BV4.A0d("Dependency ':native-imagetranscoder' is needed to use the default native image transcoder.", e4);
        } catch (NoSuchMethodException e5) {
            throw BV4.A0d("Dependency ':native-imagetranscoder' is needed to use the default native image transcoder.", e5);
        } catch (SecurityException e6) {
            throw BV4.A0d("Dependency ':native-imagetranscoder' is needed to use the default native image transcoder.", e6);
        } catch (InvocationTargetException e7) {
            throw BV4.A0d("Dependency ':native-imagetranscoder' is needed to use the default native image transcoder.", e7);
        }
    }
}
