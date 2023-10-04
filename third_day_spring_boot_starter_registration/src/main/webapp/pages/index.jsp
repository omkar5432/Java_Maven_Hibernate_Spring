<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.4.1/dist/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.4.1/dist/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
<style>

}
</style>
</head>
<body>
<form action="next" method="post">
<section class="vh-100 gradient-custom">
  <div class="container py-5 h-100">
    <div class="row d-flex justify-content-center align-items-center h-100">
      <div class="col-12 col-md-8 col-lg-6 col-xl-5">
        <div class="card bg-dark text-white" style="border-radius: 1rem;">
          <div class="card-body p-5 text-center">

            <div class="mb-md-5 mt-md-4 pb-5">

              <h2 class="fw-bold mb-2 text-uppercase">Registration</h2>
              <p class="text-white-50 mb-5">Please enter college information</p>

              <div class="form-outline form-white mb-4">
                <input type="text" name="fname" "typeEmailX" class="form-control form-control-lg" />
                <label class="form-label" for="typeEmailX">First Name</label>
              </div>

              <div class="form-outline form-white mb-4">
                <input type="text" name="lname" "typePasswordX" class="form-control form-control-lg" />
                <label class="form-label" for="typePasswordX">Last Name</label>
              </div>
              
              <div class="form-outline form-white mb-4">
                <input type="text" name="email" "typePasswordX" class="form-control form-control-lg" />
                <label class="form-label" for="typePasswordX">Email</label>
              </div>
              
              <div class="form-outline form-white mb-4">
                <input type="text" name="rollnum" "typePasswordX" class="form-control form-control-lg" />
                <label class="form-label" for="typePasswordX">Roll Number</label>
              </div>
              
              <div class="form-outline form-white mb-4">
                <input type="text" name="college" "typePasswordX" class="form-control form-control-lg" />
                <label class="form-label" for="typePasswordX">College Name</label>
              </div>
              
              <div class="form-outline form-white mb-4">
                <input type="text" name="branch" "typePasswordX" class="form-control form-control-lg" />
                <label class="form-label" for="typePasswordX">Branch Name</label>
              </div>
              
              <div class="form-outline form-white mb-4">
                <input type="text" name="address" "typePasswordX" class="form-control form-control-lg" />
                <label class="form-label" for="typePasswordX">College Address</label>
              </div>

              <p class="small mb-5 pb-lg-2"><a class="text-white-50" href="#!">Forgot password?</a></p>

              <button class="btn btn-outline-light btn-lg px-5" type="submit" value="submit">Login</button>

              <div class="d-flex justify-content-center text-center mt-4 pt-1">
                <a href="#!" class="text-white"><i class="fab fa-facebook-f fa-lg"></i></a>
                <a href="#!" class="text-white"><i class="fab fa-twitter fa-lg mx-4 px-2"></i></a>
                <a href="#!" class="text-white"><i class="fab fa-google fa-lg"></i></a>
              </div>

            </div>

            <div>
              <p class="mb-0">Don't have an account? <a href="#!" class="text-white-50 fw-bold">Sign Up</a>
              </p>
            </div>

          </div>
        </div>
      </div>
    </div>
  </div>
</section>
</form>
</body>
</html>