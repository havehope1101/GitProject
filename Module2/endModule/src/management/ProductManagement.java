package management;


import fileIO.FileIO;

import model.Product;

import java.io.IOException;
import java.util.Comparator;
import java.util.List;

public class ProductManagement implements Management<Product> {
    private List<Product> productList = null;
    private fileIO.FileIO FileIO = new FileIO();

    public ProductManagement() {
        try {
            this.productList = FileIO.readFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void add(Product product) {
        try {
            this.productList = FileIO.readFile();

            this.productList.add(product);
            this.FileIO.writeFile(this.productList);

            System.out.println("Thêm Sản Phẩm Thành Công !!!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void edit(String id, Product product) {
        try {
            this.productList = this.FileIO.readFile();

            int index = findIndexById(id);
            if (index != -1) {
                this.productList.set(index, product);
                this.FileIO.writeFile(this.productList);

                System.out.println("Sửa Sản Phẩm Thành Công !!!");
            } else {
                System.out.println("Không Tìm Được Sản Phẩm Với Mã Sản Phẩm Trên !!!");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delete(String id) {
        try {
            this.productList = this.FileIO.readFile();

            int index = findIndexById(id);
            if (index != -1) {
                this.productList.remove(index);
                this.FileIO.writeFile(this.productList);

                System.out.println("Xóa Sản Phẩm Thành Công !!!");
            } else {
                System.out.println("Không Tìm Được Sản Phẩm Với Mã Sản Phẩm Trên !!!");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public int findIndexById(String id) {
        try {
            this.productList = this.FileIO.readFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < this.productList.size(); i++) {
            if (id.equalsIgnoreCase(this.productList.get(i).getProductId())) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public List<Product> getAll() {
        try {
            return this.productList = this.FileIO.readFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public List<Product> sortAscProduct() {
        try {
            this.productList = this.FileIO.readFile();
            this.productList.sort(Comparator.comparingDouble(Product::getPrice));
            return this.productList;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public List<Product> sortDecProduct() {
        try {
            this.productList = this.FileIO.readFile();
            this.productList.sort(Comparator.comparingDouble(Product::getPrice).reversed());
            return this.productList;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
