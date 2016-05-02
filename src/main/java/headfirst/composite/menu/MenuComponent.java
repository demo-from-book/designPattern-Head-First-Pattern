package headfirst.composite.menu;

import java.util.*;

/**
 * ���ģʽ�� �˵��Ͳ˵�������ϳ�������ǿ�Ƴ���
 * ��Ϊ�˵��Ͳ˵����в�ͬ����Ϊ���ǲ�ͬ�ĸ��
 * ������Ϊ�Ƕ��߶��еģ�ȫ���趨Ϊ��֧�ֵ���Ϊ�����á�
 * 
 * @author Ethan.D Chen ����10:48:19
 */
public abstract class MenuComponent {

    /**
     * support only by menu.
     * @param menuComponent
     * @author Ethan.D Chen ����10:50:26
     * TODO CDLUndesigned
     * TODO CDLUnimplemented
     * TODO CDLUntested
     */
    public void add(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }

    /**
     * support only by menu.
     * @param menuComponent
     * @author Ethan.D Chen ����10:50:26
     * TODO CDLUndesigned
     * TODO CDLUnimplemented
     * TODO CDLUntested
     */
    public void remove(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }

    /**
     * support only by menu.
     * @param menuComponent
     * @author Ethan.D Chen ����10:50:26
     * TODO CDLUndesigned
     * TODO CDLUnimplemented
     * TODO CDLUntested
     */
    public MenuComponent getChild(int i) {
        throw new UnsupportedOperationException();
    }

    public String getName() {
        throw new UnsupportedOperationException();
    }

    public String getDescription() {
        throw new UnsupportedOperationException();
    }

    public double getPrice() {
        throw new UnsupportedOperationException();
    }

    public boolean isVegetarian() {
        throw new UnsupportedOperationException();
    }

    public void print() {
        throw new UnsupportedOperationException();
    }
}
