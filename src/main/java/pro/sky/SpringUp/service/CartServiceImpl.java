package pro.sky.SpringUp.service;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartServiceImpl implements CartService {
    private final Cart cart;

    public CartServiceImpl(Cart cart) {
        this.cart = cart;
    }


    @Override
    public void add(List<Integer> items) {
        items.forEach( item -> cart.add( item ) );

    }

    @Override
    public List<Integer> get() {
        return cart.get();
    }

    @Override
    public String text(String s) {
        return null;
    }
}
