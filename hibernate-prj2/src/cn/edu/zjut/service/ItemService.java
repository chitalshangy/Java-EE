package cn.edu.zjut.service;
import java.util.List;
import java.util.ArrayList;
import cn.edu.zjut.dao.ItemDAO;

public class ItemService {
    private List items = new ArrayList();
    public List findByHql() {
        ItemDAO dao = new ItemDAO();
        String hql = "from Item order by cost desc";
        List list = dao.findByHql(hql);
        dao.getSession().close();
        return list;
    }
}
